/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class s implements Iterator {
    private ah field_d;
    static boolean field_i;
    private ah field_h;
    static int field_b;
    static li field_f;
    static bd field_c;
    static va field_e;
    private bg field_a;
    static String field_g;

    public final boolean hasNext() {
        return ((s) this).field_h != ((s) this).field_a.field_b;
    }

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = stellarshard.field_B;
        if (param0 == null) {
          return cg.field_b;
        } else {
          L0: {
            var3 = param0.length();
            if (param2 == 3) {
              break L0;
            } else {
              s.a(true);
              break L0;
            }
          }
          L1: {
            if (1 > var3) {
              break L1;
            } else {
              if (var3 < -13) {
                break L1;
              } else {
                L2: {
                  var4 = nh.a(param0, false);
                  if (var4 == null) {
                    break L2;
                  } else {
                    if (-2 > var4.length()) {
                      break L2;
                    } else {
                      L3: {
                        if (sk.a(var4.charAt(0), -122)) {
                          break L3;
                        } else {
                          if (!sk.a(var4.charAt(-1 + var4.length()), -105)) {
                            var5 = 0;
                            var6 = 0;
                            L4: while (true) {
                              if (var6 >= param0.length()) {
                                if (var5 > 0) {
                                  return jb.field_h;
                                } else {
                                  return null;
                                }
                              } else {
                                L5: {
                                  var7 = param0.charAt(var6);
                                  if (sk.a((char) var7, -113)) {
                                    var5++;
                                    break L5;
                                  } else {
                                    var5 = 0;
                                    break L5;
                                  }
                                }
                                if ((var5 ^ -1) <= -3) {
                                  if (!param1) {
                                    return t.field_c;
                                  } else {
                                    var6++;
                                    continue L4;
                                  }
                                } else {
                                  var6++;
                                  continue L4;
                                }
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                      }
                      return jb.field_h;
                    }
                  }
                }
                return cg.field_b;
              }
            }
          }
          return cg.field_b;
        }
    }

    final static boolean a(int param0, char param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = stellarshard.field_B;
        if (Character.isISOControl(param1)) {
            return false;
        }
        if (od.a(param1, false)) {
            return true;
        }
        char[] var12 = nh.field_e;
        char[] var10 = var12;
        char[] var7 = var10;
        char[] var2 = var7;
        for (var3 = 0; var12.length > var3; var3++) {
            var4 = var12[var3];
            if (param1 == var4) {
                return true;
            }
        }
        char[] var13 = fe.field_g;
        char[] var11 = var13;
        char[] var8 = var11;
        var2 = var8;
        var3 = 9 % ((-57 - param0) / 61);
        int var9 = 0;
        var4 = var9;
        while (var9 < var13.length) {
            var5 = var13[var9];
            if (!(param1 != var5)) {
                return true;
            }
            var9++;
        }
        return false;
    }

    public final void remove() {
        if (null == ((s) this).field_d) {
            throw new IllegalStateException();
        }
        ((s) this).field_d.c((byte) 36);
        ((s) this).field_d = null;
    }

    public final Object next() {
        ah var1 = ((s) this).field_h;
        if (((s) this).field_a.field_b != var1) {
            ((s) this).field_h = var1.field_m;
        } else {
            ((s) this).field_h = null;
            var1 = null;
        }
        ((s) this).field_d = var1;
        return (Object) (Object) var1;
    }

    public static void a(boolean param0) {
        if (param0) {
            boolean discarded$0 = s.a(54, 'v');
        }
        field_e = null;
        field_g = null;
        field_f = null;
        field_c = null;
    }

    s(bg param0) {
        ((s) this).field_d = null;
        ((s) this).field_a = param0;
        ((s) this).field_d = null;
        ((s) this).field_h = ((s) this).field_a.field_b.field_m;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new li(13, 0, 1, 0);
        field_g = "Please check if address is correct";
    }
}
