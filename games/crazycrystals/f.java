/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class f {
    static jp field_d;
    private int field_a;
    private int field_b;
    static int[] field_c;
    static int[] field_g;
    static String[] field_h;
    static String field_f;
    static String field_e;

    void a(f[][] param0, int param1, int param2, int param3) {
        if (param3 >= -8) {
            Object var6 = null;
            f.a(-95, (hj) null, -94, (hj) null, -123, (byte) -100);
        }
    }

    final void a(byte param0, f param1) {
        if (param0 <= 51) {
            field_c = null;
        }
        if (!(param1 == null)) {
            ((f) this).a(param1.a(false), true, param1.b(-3445));
        }
    }

    void a(fq param0, int param1) {
        if (param1 < 126) {
            ((f) this).b(true, false);
        }
    }

    f c(int param0) {
        if (param0 != -1) {
            field_c = null;
        }
        return (f) this;
    }

    abstract int a(boolean param0, boolean param1);

    void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 >= -104) {
            field_e = null;
        }
    }

    f a(int param0, byte param1, int param2) {
        if (param1 != -110) {
            field_c = null;
        }
        return (f) this;
    }

    f a(int param0, ea param1, int param2, int param3, byte param4, int param5, f[][] param6) {
        if (param4 > -87) {
            return null;
        }
        param1.a((byte) 119, (f) this);
        return (f) this;
    }

    final static void a(byte param0, String[] param1, String param2, int param3) {
        String[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var5 = CrazyCrystals.field_B;
          sg.field_b = io.field_P;
          if (param3 == 255) {
            L1: {
              if (ro.field_n >= 13) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                break L1;
              } else {
                stackOut_6_0 = 1;
                stackIn_8_0 = stackOut_6_0;
                break L1;
              }
            }
            nn.field_a = oe.a(stackIn_8_0 != 0, (byte) 119);
            var6 = null;
            rk.a((String[]) null, 3928);
            break L0;
          } else {
            L2: {
              if (100 > param3) {
                break L2;
              } else {
                if (-106 > (param3 ^ -1)) {
                  break L2;
                } else {
                  var4 = param1;
                  rk.a(var4, 3928);
                  nn.field_a = en.a(param1, 169);
                  break L0;
                }
              }
            }
            nn.field_a = me.a(param2, 20, param3);
            break L0;
          }
        }
        L3: {
          if (param0 > 119) {
            break L3;
          } else {
            f.a(-123);
            break L3;
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_h = null;
        if (param0 != 100) {
            Object var2 = null;
            f.a(38, (hj) null, 75, (hj) null, -18, (byte) 62);
        }
        field_f = null;
        field_d = null;
        field_g = null;
        field_c = null;
    }

    int b(int param0) {
        if (param0 != -3445) {
            return 46;
        }
        return ((f) this).field_a;
    }

    f a(f param0, int param1, int param2, f[][] param3, dl[] param4, byte param5) {
        if (param5 != -87) {
            f discarded$0 = ((f) this).a(49, (f[][]) null, true, -64);
        }
        return (f) this;
    }

    void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        if (param4 != -35) {
            field_d = null;
        }
    }

    void b(int param0, int param1, f[][] param2, int param3) {
        if (param0 <= 24) {
            f discarded$0 = ((f) this).a(87, (ea) null, -85, 69, (byte) 5, 44, (f[][]) null);
        }
    }

    boolean a(byte param0, f[][] param1, int param2, int param3, int param4, fq param5, int param6) {
        if (param0 != -21) {
            f discarded$0 = ((f) this).c(7);
            return false;
        }
        return false;
    }

    int a(int param0, int param1, int param2, fq param3, int param4) {
        if (param0 != -9352) {
            Object var7 = null;
            f.a(38, (hj) null, 80, (hj) null, -43, (byte) -37);
        }
        return 0;
    }

    void a(f[][] param0, int param1, byte param2, int param3) {
        if (param2 != 40) {
            int discarded$0 = ((f) this).a(false);
        }
    }

    void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        if (param0 <= 92) {
            ((f) this).field_a = -55;
        }
    }

    void a(int param0, int param1, int param2, f[][] param3) {
        if (param0 != 393989) {
            f discarded$0 = ((f) this).a(44, (byte) 18, -111);
        }
    }

    protected Object clone() {
        try {
            CloneNotSupportedException var1 = null;
            Object stackIn_1_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_0_0 = null;
            try {
              stackOut_0_0 = super.clone();
              stackIn_1_0 = stackOut_0_0;
            } catch (java.lang.CloneNotSupportedException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_1_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    boolean b(byte param0) {
        if (param0 < 43) {
            field_f = null;
            return false;
        }
        return false;
    }

    nj a(int param0, nj param1) {
        if (param0 == 23525) {
            return null;
        }
        Object var4 = null;
        f.a((byte) 49, (String[]) null, (String) null, 47);
        return null;
    }

    final void a(int param0, boolean param1, int param2) {
        if (((f) this).field_a >= param2) {
            // if_icmpne L42
            ((f) this).field_b = ((f) this).field_b | param0;
        } else {
            ((f) this).field_b = param0;
            ((f) this).field_a = param2;
        }
        if (!param1) {
            Object discarded$0 = ((f) this).clone();
        }
    }

    int a(byte param0) {
        if (param0 >= -34) {
            return -14;
        }
        return -1;
    }

    f a(int param0, int param1, f[][] param2, int param3) {
        if (param0 < 106) {
            field_h = null;
        }
        return (f) this;
    }

    int a(boolean param0) {
        if (param0) {
            field_c = null;
        }
        return ((f) this).field_b;
    }

    abstract void a(int param0, int param1, int param2, boolean param3, int param4, int param5);

    f a(int param0, f[][] param1, boolean param2, int param3) {
        if (param2) {
            ((f) this).a(55, -78, -114, (f[][]) null, 74, 39, 101, 81);
        }
        return (f) this;
    }

    int d(int param0) {
        if (param0 >= -77) {
            ((f) this).a(-77, 99);
        }
        return -1;
    }

    void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        ((f) this).a(param3, 102, param5, param0, param1, param4);
        if (param2) {
            field_h = null;
        }
    }

    void a(int param0, int param1) {
        if (param1 < 61) {
            f discarded$0 = ((f) this).a(22, (ea) null, 62, 110, (byte) -119, -24, (f[][]) null);
        }
    }

    boolean a(int param0, f[][] param1, boolean param2, int param3, int param4, int param5, ea param6, int param7) {
        if (param0 != 16736352) {
            f discarded$0 = ((f) this).a((mj) null, (byte) -122, true, (f[][]) null);
            return false;
        }
        return false;
    }

    f() {
        ((f) this).field_b = 0;
        ((f) this).field_a = 0;
    }

    abstract void a(int param0, int param1, int param2);

    boolean a(boolean param0, f[][] param1, mj param2) {
        if (param0) {
            field_c = null;
            return false;
        }
        return false;
    }

    f a(mj param0, byte param1, boolean param2, f[][] param3) {
        if (param1 >= -74) {
            return null;
        }
        return (f) (Object) new ma(param0.b((byte) 84), (f) this, param0);
    }

    final static void a(int param0, hj param1, int param2, hj param3, int param4, byte param5) {
        int var6 = -80 % ((param5 - 59) / 44);
        bn.field_c = param4;
        qo.field_k = param3;
        qh.field_h = param1;
        a.field_a = param2;
        to.field_d = param0;
    }

    boolean e(int param0) {
        if (param0 != -4128) {
            return false;
        }
        return false;
    }

    void b(boolean param0, boolean param1) {
        if (!param0) {
            ((f) this).field_b = -80;
        }
    }

    f a(int param0, int param1, f[][] param2, f param3, byte param4) {
        int var6 = -107 % ((param4 - 73) / 42);
        return (f) this;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new jp();
        field_c = new int[16];
        for (var0 = 0; var0 < 16; var0++) {
            field_c[var0] = 393989 * var0;
        }
        field_f = "Teleport";
        field_e = "Press M for a<br>map of the level.";
        field_g = new int[]{12632256, 16760896, 8454143, 16736352};
        field_h = new String[]{null, "to discard it and<nbsp>continue.", "to discard it and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue.", "to discard them and<nbsp>continue."};
    }
}
