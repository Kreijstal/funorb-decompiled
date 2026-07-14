/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class boa implements ntb {
    static no field_a;
    int[] field_c;
    static String field_b;

    public final void b(byte param0, tv param1) {
        boa var3 = null;
        var3 = (boa) (Object) param1;
        var3.field_c = dob.a(var3.field_c, (byte) -97, var3.field_c);
        if (param0 <= 54) {
          boolean discarded$2 = boa.a(-115, -119);
          return;
        } else {
          return;
        }
    }

    final int a(byte param0) {
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int[] stackIn_2_2 = null;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int[] stackIn_3_2 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int[] stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int[] stackOut_1_2 = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int[] stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int[] stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        if (param0 <= 113) {
          return 100;
        } else {
          L0: {
            stackOut_1_0 = -95;
            stackOut_1_1 = 8;
            stackOut_1_2 = ((boa) this).field_c;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (null == ((boa) this).field_c) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = (int[]) (Object) stackIn_3_2;
              stackOut_3_3 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L0;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = (int[]) (Object) stackIn_2_2;
              stackOut_2_3 = ((boa) this).field_c.length;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L0;
            }
          }
          return oab.a(stackIn_4_0, stackIn_4_1, stackIn_4_2, stackIn_4_3);
        }
    }

    public final void a(faa param0, boolean param1) {
        ((boa) this).field_c = wkb.a((byte) 37, ((boa) this).field_c, param0, 8);
        if (param1) {
            boolean discarded$0 = boa.a(-120, 56);
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            if (qga.field_b.field_e >= param0) {
                return true;
            }
            if (param1 != 30000) {
                boolean discarded$0 = boa.a(-32, -68);
            }
            if (null == ov.field_o) {
                return false;
            }
            int var2_int = ov.field_o.c(0);
            if ((var2_int ^ -1) < -1) {
                if (var2_int > -qga.field_b.field_e + param0) {
                    var2_int = param0 + -qga.field_b.field_e;
                }
                ov.field_o.a(param1 ^ -30026, qga.field_b.field_e, var2_int, qga.field_b.field_h);
                cbb.field_q = wt.a(false);
                qga.field_b.field_e = qga.field_b.field_e + var2_int;
                if (param0 > qga.field_b.field_e) {
                    return false;
                }
                qga.field_b.field_e = 0;
                return true;
            }
            try {
                if (false) throw (IOException) null;
                if (var2_int >= 0) {
                    if (30000L >= mw.e(0)) {
                        return false;
                    }
                }
                ifb.l(param1 ^ -30026);
            } catch (IOException iOException) {
                ifb.l(-126);
            }
            return false;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(tv param0, int param1) {
        boa var3 = null;
        int var4 = 0;
        var3 = (boa) (Object) param0;
        var4 = 0;
        if (param1 >= -19) {
          L0: {
            field_a = null;
            if (!ikb.a(var3.field_c, var3.field_c, false)) {
              break L0;
            } else {
              var4 = 1;
              System.out.println("int[] description has changed. ");
              break L0;
            }
          }
          L1: {
            if (var4 != 0) {
              System.out.println("This instance of ShipBlueprint has changed");
              break L1;
            } else {
              break L1;
            }
          }
          return;
        } else {
          L2: {
            if (!ikb.a(var3.field_c, var3.field_c, false)) {
              break L2;
            } else {
              var4 = 1;
              System.out.println("int[] description has changed. ");
              break L2;
            }
          }
          L3: {
            if (var4 != 0) {
              System.out.println("This instance of ShipBlueprint has changed");
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        boa var3 = (boa) (Object) param1;
        int var4 = -3 / ((param0 - 22) / 59);
        return wpb.a(var3.field_c, var3.field_c, (byte) 28);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    public final void b(faa param0, int param1) {
        Object var4 = null;
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = 8;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (null == ((boa) this).field_c) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = ((boa) this).field_c.length;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        pgb.a(stackIn_3_0, stackIn_3_1, 55, param0, ((boa) this).field_c);
        if (param1 > -109) {
          var4 = null;
          ((boa) this).b((faa) null, -93);
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Save your ship design";
    }
}
