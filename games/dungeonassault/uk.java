/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uk {
    private java.util.zip.Inflater field_d;
    static int field_c;
    static String field_b;
    static cn field_e;
    static int field_a;

    final static wm a(int param0, Random param1) {
        int fieldTemp$0 = 0;
        int var10 = 0;
        int var7 = 0;
        int stackIn_54_0 = 0;
        wm stackIn_103_0 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var16 = null;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var5Lifetime1;
        int var6Lifetime1;
        int var8Lifetime1;
        var12 = DungeonAssault.field_K;
        try {
          bo.field_Jb = new wm(ib.field_l);
          wl.field_e = new int[ib.field_l];
          h.field_j = 0;
          for (var2_int = 0; var2_int < ib.field_l; var2_int++) {
            if (var2_int != 14 &&
              var2_int != 15 &&
              26 != var2_int &&
              var2_int != 27 &&
              var2_int != 58 &&
              var2_int != 60 &&
              65 != var2_int &&
              var2_int != 67 &&
              var2_int != 20 &&
              var2_int != 21 &&
              var2_int != 59 &&
              var2_int != 66) {
              fieldTemp$0 = h.field_j;
              h.field_j = h.field_j + 1;
              wl.field_e[fieldTemp$0] = var2_int;
            }
          }
          ue.field_j = new int[ib.field_k];
          for (var2_intLifetime1 = param0; ib.field_k > var2_intLifetime1; var2_intLifetime1++) {
            ue.field_j[var2_intLifetime1] = var2_intLifetime1;
          }
          while (h.field_j > 0) {
            fo.a(-126, gd.a(param1, true));
          }
          var2_intLifetime2 = uj.a(param1, param0 ^ 37, 4);
          var3 = uj.a(param1, 37, 3);
          if (var3 == var2_intLifetime2) {
            var3 = 3;
          }
          if (0 != var2_intLifetime2) {
            if (0 == var3) {
              bo.field_Jb.a(20, -111);
            }
          } else {
            bo.field_Jb.a(20, -111);
          }
          if (1 != var2_intLifetime2) {
            if (1 == var3) {
              bo.field_Jb.a(21, -90);
            }
          } else {
            bo.field_Jb.a(21, -90);
          }
          if (var2_intLifetime2 == 2 ||
            var3 == 2) {
            bo.field_Jb.a(59, -86);
          }
          if (3 == var2_intLifetime2 ||
            var3 == 3) {
            bo.field_Jb.a(66, -70);
          }
          var4 = ec.h(24, 5);
          for (var5 = 0; var5 < 4; var5++) {
            if (var5 == 0) {
              stackIn_54_0 = 0;
            } else {
              if (1 != var5) {
                if (var5 == 2) {
                  stackIn_54_0 = ib.field_k - ib.field_j;
                } else {
                  stackIn_54_0 = -1 + ib.field_k;
                }
              } else {
                stackIn_54_0 = -1 + ib.field_j;
              }
            }
            var6 = stackIn_54_0;
            var16 = ec.h(var6, param0 ^ 5);
            var8 = 0;
            var9 = -1;
            for (var10 = 1; ib.field_l > var10; var10++) {
              if (var10 != 20 &&
                var10 != 21 &&
                var10 != 59 &&
                var10 != 66 &&
                10 <= qc.a(var10, 122, var16)) {
                var11 = sh.a(param0 + 123, var10, var16);
                if (-1 == var9 ||
                  var8 < var11) {
                  var8 = var11;
                  var9 = var10;
                }
              }
            }
            if (var9 != -1) {
              bo.field_Jb.a(var9, -126);
            }
          }
          while (true) {
            var5Lifetime1 = 4;
            var6Lifetime1 = -1;
            for (var7 = 0; var7 < ib.field_l; var7++) {
              if (var7 != 20 &&
                var7 != 21 &&
                var7 != 59 &&
                var7 != 66 &&
                8 <= qc.a(var7, -127, var4)) {
                var8Lifetime1 = sh.a(120, var7, var4);
                if (var5Lifetime1 < var8Lifetime1) {
                  var6Lifetime1 = var7;
                  var5Lifetime1 = var8Lifetime1;
                }
              }
            }
            if (var6Lifetime1 == -1) {
              stackIn_103_0 = bo.field_Jb;
              return stackIn_103_0;
            }
            bo.field_Jb.a(var6Lifetime1, -88);
            var4 = ec.h(24, 5);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_106_0 = var2;
          stackIn_106_1 = new StringBuilder().append("uk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(')').toString());
        }
    }

    public uk() {
        this(-1, 1000000, 1000000);
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          lj.a((java.awt.Component) ((Object) param0), (byte) 70);
          if (param1 >= -119) {
            field_c = 72;
          }
          im.a((java.awt.Component) ((Object) param0), (byte) 94);
          if (bn.field_j != null) {
            bn.field_j.a((byte) 123, (java.awt.Component) ((Object) param0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("uk.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_e = null;
        if (param0 != 0) {
          field_e = (cn) null;
        }
    }

    final void a(int param0, byte[] param1, ec param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2.field_m[param2.field_o] == 31 &&
              param2.field_m[1 + param2.field_o] == -117) {
              if (null == this.field_d) {
                this.field_d = new java.util.zip.Inflater(true);
              }
              try {
                this.field_d.setInput(param2.field_m, 10 + param2.field_o, param2.field_m.length - 10 + (-param2.field_o - 8));
                this.field_d.inflate(param1);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_d.reset();
                throw new RuntimeException("");
              }
              if (param0 >= -80) {
                field_e = (cn) null;
              }
              this.field_d.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("uk.A(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private uk(int param0, int param1, int param2) {
    }

    static {
        field_b = "You must gain the <%0> Achievement in <%1> to earn the title of <%2>.";
        field_c = 2;
    }
}
