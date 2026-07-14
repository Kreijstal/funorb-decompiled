/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class a extends kb {
    private String field_g;
    static String field_e;
    static String field_f;
    private String field_d;
    static int field_c;

    public static void b(boolean param0) {
        field_e = null;
        field_f = null;
        if (!param0) {
            Object var2 = null;
            a.a((byte) 42, (ng) null);
        }
    }

    final static boolean b(int param0, int param1) {
        try {
            if (!(param0 > ig.field_a.field_h)) {
                return true;
            }
            if (null == jc.field_b) {
                return false;
            }
            int var2_int = jc.field_b.d(param1 + -16791);
            if (param1 != 10343) {
                return false;
            }
            if (!((var2_int ^ -1) >= -1)) {
                if (param0 - ig.field_a.field_h < var2_int) {
                    var2_int = param0 + -ig.field_a.field_h;
                }
                jc.field_b.a(ig.field_a.field_j, (byte) -109, var2_int, ig.field_a.field_h);
                ta.field_e = rf.c(0);
                ig.field_a.field_h = ig.field_a.field_h + var2_int;
                if (param0 > ig.field_a.field_h) {
                    return false;
                }
                ig.field_a.field_h = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if ((var2_int ^ -1) <= -1) {
                    if (vl.b(-91) <= 30000L) {
                        return false;
                    }
                }
                ck.b((byte) -120);
            } catch (IOException iOException) {
                ck.b((byte) -86);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(int param0) {
        if (param0 != -1) {
            return null;
        }
        if (null == og.field_c) {
            return "";
        }
        return og.field_c;
    }

    final bj a(byte param0) {
        if (param0 != 45) {
            return null;
        }
        return jf.field_M;
    }

    final static int c(boolean param0) {
        if (!param0) {
            field_c = -69;
            return cg.field_l;
        }
        return cg.field_l;
    }

    final static void a(byte param0, ng param1) {
        int[] var2 = null;
        int var3 = 0;
        Object var4 = null;
        bd var4_ref = null;
        int var5 = 0;
        int[] var6 = null;
        int[] var7 = null;
        int[] var9 = null;
        var4 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        var6 = new int[param1.b(2)];
        var9 = var6;
        var7 = var9;
        var2 = var7;
        var3 = 0;
        if (param0 <= -88) {
          var4_ref = (bd) (Object) param1.a(true);
          L0: while (true) {
            if (var4_ref == null) {
              var3 = 0;
              dd.a(var9, -23588);
              var4_ref = (bd) (Object) param1.a(true);
              L1: while (true) {
                if (var4_ref == null) {
                  return;
                } else {
                  var3++;
                  var4_ref.field_h = var2[var3];
                  var4_ref = (bd) (Object) param1.f(2);
                  continue L1;
                }
              }
            } else {
              var3++;
              var6[var3] = var4_ref.field_h;
              var4_ref = (bd) (Object) param1.f(2);
              continue L0;
            }
          }
        } else {
          a.b(false);
          var4_ref = (bd) (Object) param1.a(true);
          L2: while (true) {
            if (var4_ref == null) {
              var3 = 0;
              dd.a(var9, -23588);
              var4_ref = (bd) (Object) param1.a(true);
              L3: while (true) {
                if (var4_ref == null) {
                  return;
                } else {
                  var3++;
                  var4_ref.field_h = var2[var3];
                  var4_ref = (bd) (Object) param1.f(2);
                  continue L3;
                }
              }
            } else {
              var3++;
              var6[var3] = var4_ref.field_h;
              var4_ref = (bd) (Object) param1.f(2);
              continue L2;
            }
          }
        }
    }

    a(String param0, String param1) {
        ((a) this).field_d = param0;
        ((a) this).field_g = param1;
    }

    final void a(wf param0, int param1) {
        param0.a((byte) -38, ((a) this).field_d);
        param0.a(0, ((a) this).field_g);
        if (param1 != 7895) {
            field_f = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Back";
        field_f = "Just play";
    }
}
