/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vf extends hb {
    static String field_f;
    private wb field_g;

    final static void a(int param0, int param1, int param2, boolean param3, ln[] param4, Random param5, ln[] param6) {
        ln[] array$0 = null;
        int var15 = 0;
        Object stackIn_22_0 = null;
        ln[] stackIn_22_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        String stackIn_63_2 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln[][] var7 = null;
        RuntimeException var7_ref = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        pf var10_ref_pf = null;
        int var11 = 0;
        ln[] var11_ref_ln__ = null;
        int var12 = 0;
        ln var13 = null;
        fi[] var14 = null;
        fi var16 = null;
        ln[] var17_ref_ln__ = null;
        int var17 = 0;
        int var18 = 0;
        ln var19_ref_ln = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        ln var22 = null;
        int var23 = 0;
        int[] var24 = null;
        ln[][] var25 = null;
        ln var26 = null;
        int[] var27 = null;
        int var12Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var20Lifetime1;
        int var9Lifetime1;
        var21 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var25 = new ln[param1][];
          var7 = var25;
          var27 = new int[param1];
          var24 = var27;
          var8 = var24;
          if (!param3) {
            return;
          }
          for (var9 = 0; var9 < param1; var9++) {
            var10_ref_pf = new pf();
            var11_ref_ln__ = param4;
            for (var12 = 0; var11_ref_ln__.length > var12; var12++) {
              var22 = var11_ref_ln__[var12];
              var13 = var22;
              var10_ref_pf.a((byte) -113, var22);
              var8[var9] = var8[var9] + 1;
            }
            array$0 = new ln[var27[var9]];
            var7[var9] = array$0;
            var10_ref_pf.a((byte) 112, var25[var9]);
          }
          var9Lifetime1 = 0;
          while (true) {
            if (param1 <= var9Lifetime1) {
              return;
            }
            var10 = 1 + var9Lifetime1;
            while (true) {
              if (var10 >= param1) {
                var9Lifetime1++;
                break;
              }
              var11 = qf.a((byte) 76, var27[var9Lifetime1], param5);
              var12Lifetime1 = 0;
              L4: while (true) {
                if (var27[var9Lifetime1] > var12Lifetime1) {
                  var26 = var25[var9Lifetime1][(var12Lifetime1 + var11) % var27[var9Lifetime1]];
                  if (~var26.field_x == ~var9Lifetime1) {
                    var14 = var26.field_v;
                    for (var15 = 0; var14.length > var15; var15++) {
                      boolean decompiledFrameCompleted1 = true;
                      boolean decompiledFrameCompleted0 = true;
                      var16 = var14[var15];
                      if (~var16.field_k.field_x == ~var10) {
                        stackIn_22_0 = null;
                        stackIn_22_1 = var26.field_D;
                        if (stackIn_22_0 != stackIn_22_1) {
                          var17_ref_ln__ = var26.field_D;
                          for (var18 = 0; var18 < var17_ref_ln__.length; var18++) {
                            var19_ref_ln = var17_ref_ln__[var18];
                            if (var16.field_k == var19_ref_ln) {
                              decompiledFrameCompleted1 = false;
                              break;
                            }
                          }
                        }
                        if (decompiledFrameCompleted1) {
                          var17 = 0;
                          var18Lifetime1 = 0;
                          for (var19 = 0; param6.length > var19; var19++) {
                            if (null != param6[var19]) {
                              if (var26.field_p == param6[var19].field_p) {
                                var17 = var19;
                              }
                              if (var16.field_k.field_p == param6[var19].field_p) {
                                var18Lifetime1 = var19;
                              }
                            }
                          }
                          if (var17 > var18Lifetime1) {
                            var19Lifetime1 = var17;
                            var17 = var18Lifetime1;
                            var18Lifetime1 = var19Lifetime1;
                          }
                          var19Lifetime2 = var18Lifetime1 / param0 - var17 / param0;
                          if (var19Lifetime2 != 0 &&
                            var18Lifetime1 < param0 * var19Lifetime2 + var17) {
                            var20 = var18Lifetime1;
                            var18Lifetime1 = var17 + var19Lifetime2 * param0;
                            var17 = -(param0 * var19Lifetime2) + var20;
                          }
                          var23 = 1 + var17;
                          var20Lifetime1 = var23;
                          while (var18Lifetime1 > var23) {
                            if (null != param6[var23] &&
                              param6[var23].field_p != var16.field_k.field_p &&
                              param6[var23].field_p != var26.field_p &&
                              !kp.a((byte) 96, param6[var23], var16.field_k, param2, var26)) {
                              decompiledFrameCompleted0 = false;
                              break;
                            }
                            var23++;
                          }
                          if (decompiledFrameCompleted0) {
                            var26.a((byte) -113, var16.field_k);
                            var16.field_k.a((byte) -111, var26);
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  var12Lifetime1++;
                  continue;
                }
                break;
              }
              var10++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_62_0 = var7_ref;
          stackIn_62_1 = new StringBuilder().append("vf.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_63_2 = "null";
          } else {
            stackIn_63_2 = "{...}";
          }
          stackIn_65_1 = ((StringBuilder) (Object) stackIn_62_1).append(stackIn_63_2).append(',');
          if (param5 == null) {
            stackIn_66_2 = "null";
          } else {
            stackIn_66_2 = "{...}";
          }
          stackIn_68_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_66_2).append(',');
          if (param6 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_62_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    final static void d(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        ld var3_ref_ld = null;
        fk var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        byte[] var7 = null;
        sl var8 = null;
        byte[] var9 = null;
        byte[] var10 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var8 = sa.field_a;
          if (param0 != -117) {
            field_f = (String) null;
          }
          var2 = var8.j(-121);
          if (0 != var2) {
            if (1 == var2) {
              var3 = var8.a(16711680);
              var4 = (fk) (tr.field_vb.d(param0 + 117));
              while (var4 != null) {
                if (var4.field_j != var3) {
                  var4 = (fk) (tr.field_vb.a((byte) -71));
                  continue;
                }
                break;
              }
              if (var4 == null) {
                q.g(-118);
                return;
              }
              var4.b((byte) -122);
              return;
            }
            jq.a(-29901, (Throwable) null, "A1: " + w.a(16738));
            q.g(-108);
          } else {
            var3_ref_ld = (ld) (ua.field_d.d(0));
            if (var3_ref_ld == null) {
              q.g(-96);
              return;
            }
            var4_int = var8.j(param0 - 2);
            if (var4_int != 0) {
              var10 = new byte[var4_int];
              var9 = var10;
              var7 = var9;
              var5 = var7;
              var8.a(var4_int, 0, 17469032, var10);
            } else {
              var5 = null;
            }
            var8.field_j = var8.field_j + 4;
            if (!var8.f((byte) 104)) {
              q.g(param0 + 17);
              return;
            }
            var3_ref_ld.field_l = true;
            var3_ref_ld.field_o = (byte[]) (var5);
            var3_ref_ld.b((byte) -100);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "vf.D(" + param0 + ')');
        }
    }

    final oh a(boolean param0) {
        if (param0) {
          vf.d((byte) 82);
        }
        return (oh) ((Object) this.field_g.d(-115));
    }

    final static void a(int param0, sd param1) {
        int var3 = 0;
        int[] var2 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 < 119) {
            return;
          }
          var6 = new int[4];
          var2 = var6;
          sn.a(var6, (byte) -76, param1);
          var4 = var6[0];
          for (var3 = 1; var3 < 4; var3++) {
            if (var6[var3] < var4) {
              var4 = var6[var3];
            }
          }
          if (var4 < 0) {
            var4 = 0;
          }
          param1.field_x = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("vf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final oh a(byte param0) {
        if (param0 < 99) {
          return (oh) null;
        }
        return (oh) ((Object) this.field_g.e(-31364));
    }

    final int b(byte param0) {
        if (param0 != -61) {
          this.field_g = (wb) null;
        }
        return this.field_g.c(-7432);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        eo.field_cb.field_j = 0;
        eo.field_cb.c(12, (byte) -128);
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.e(11135, na.field_u.nextInt());
        eo.field_cb.c(param3, (byte) -85);
        eo.field_cb.c(param1, (byte) -123);
        eo.field_cb.d(param0, 255);
        eo.field_cb.a(jl.field_V, hr.field_a, (byte) -56);
        js.field_f.h(18, param2 + 251);
        int fieldTemp$0 = js.field_f.field_j + 1;
        js.field_f.field_j = js.field_f.field_j + 1;
        int var4 = fieldTemp$0;
        js.field_f.a(0, eo.field_cb.field_j, eo.field_cb.field_h, 22186);
        if (param2 != 4) {
          return;
        }
        js.field_f.b(-var4 + js.field_f.field_j, (byte) 118);
    }

    public static void a(int param0) {
        if (param0 != 17593) {
          sd var2 = (sd) null;
          vf.a(-89, (sd) null);
        }
        field_f = null;
    }

    vf(wb param0) {
        try {
          this.field_g = param0;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "vf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = "Add name";
    }
}
