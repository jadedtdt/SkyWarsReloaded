package me.gaagjescraft.network.team.skywarsreloaded.extension.utils;

public class CharSequenceUtils {
    private static final int NOT_FOUND = -1;

    public CharSequenceUtils() {
    }

    public static CharSequence subSequence(CharSequence var0, int var1) {
        return var0 == null ? null : var0.subSequence(var1, var0.length());
    }

    static int indexOf(CharSequence var0, int var1, int var2) {
        if (var0 instanceof String) {
            return ((String)var0).indexOf(var1, var2);
        } else {
            int var3 = var0.length();
            if (var2 < 0) {
                var2 = 0;
            }

            for(int var4 = var2; var4 < var3; ++var4) {
                if (var0.charAt(var4) == var1) {
                    return var4;
                }
            }

            return -1;
        }
    }

    static int indexOf(CharSequence var0, CharSequence var1, int var2) {
        return var0.toString().indexOf(var1.toString(), var2);
    }

    static int lastIndexOf(CharSequence var0, int var1, int var2) {
        if (var0 instanceof String) {
            return ((String)var0).lastIndexOf(var1, var2);
        } else {
            int var3 = var0.length();
            if (var2 < 0) {
                return -1;
            } else {
                if (var2 >= var3) {
                    var2 = var3 - 1;
                }

                for(int var4 = var2; var4 >= 0; --var4) {
                    if (var0.charAt(var4) == var1) {
                        return var4;
                    }
                }

                return -1;
            }
        }
    }

    static int lastIndexOf(CharSequence var0, CharSequence var1, int var2) {
        return var0.toString().lastIndexOf(var1.toString(), var2);
    }

    static char[] toCharArray(CharSequence var0) {
        if (var0 instanceof String) {
            return ((String)var0).toCharArray();
        } else {
            int var1 = var0.length();
            char[] var2 = new char[var0.length()];

            for(int var3 = 0; var3 < var1; ++var3) {
                var2[var3] = var0.charAt(var3);
            }

            return var2;
        }
    }

    static boolean regionMatches(CharSequence var0, boolean var1, int var2, CharSequence var3, int var4, int var5) {
        if (var0 instanceof String && var3 instanceof String) {
            return ((String)var0).regionMatches(var1, var2, (String)var3, var4, var5);
        } else {
            int var6 = var2;
            int var7 = var4;
            int var8 = var5;
            int var9 = var0.length() - var2;
            int var10 = var3.length() - var4;
            if (var2 >= 0 && var4 >= 0 && var5 >= 0) {
                if (var9 >= var5 && var10 >= var5) {
                    while(var8-- > 0) {
                        char var11 = var0.charAt(var6++);
                        char var12 = var3.charAt(var7++);
                        if (var11 != var12) {
                            if (!var1) {
                                return false;
                            }

                            if (Character.toUpperCase(var11) != Character.toUpperCase(var12) && Character.toLowerCase(var11) != Character.toLowerCase(var12)) {
                                return false;
                            }
                        }
                    }

                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}