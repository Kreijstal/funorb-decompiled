/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends os implements oo {
    static boolean field_Y;
    private boolean field_ab;
    private boolean field_Z;
    private rq field_X;

    public final void a(int param0, int param1, int param2, htb param3, int param4) {
        if (!(!((sn) this).field_ab)) {
            int discarded$0 = 0;
            rga.a(false, true);
            return;
        }
        int discarded$4 = -74;
        cnb.f();
        if (param0 != 11) {
            return;
        }
        try {
            ((sn) this).l((byte) -106);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sn.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void e(boolean param0) {
        int discarded$0 = -124;
        this.a(true, param0, tma.a(248, mtb.field_q));
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, lta param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              dva.a(param2, param6, param0, 3, param4, param5, 255, param3);
              if (param1 > 68) {
                break L1;
              } else {
                field_Y = false;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param6 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static void a(int param0, int param1, jk param2, byte param3, int param4, soa param5, int param6) {
        hqb var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        try {
            pea.a(param2.field_zb, (llb) (Object) param2, -1, (int[]) null, param2.field_Hb, param5, param2.field_xb, (byte) 103, -1);
            cka.field_o.a(true, param3 + -35);
            cka.field_o.a(-70, 0, (int[]) null);
            cka.field_o.b(param3 + -9994);
            var13 = cka.field_o;
            var8 = param4;
            var9 = param0;
            var10 = param6;
            if (param3 != 71) {
                Object var12 = null;
                sn.a(64, (byte) -32, -119, -6, 29, 12, (lta) null);
            }
            var11 = param1;
            var13.field_i.b(var8, -29060, var9, var10, var11);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sn.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    private final void a(boolean param0, boolean param1, tpa param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        nna var5 = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((sn) this).field_Z = true;
              if (param2.field_g) {
                var4_ref = uj.field_c;
                break L1;
              } else {
                if (null == param2.field_e) {
                  var4_ref = param2.field_f;
                  if (param2.field_d == 248) {
                    L2: {
                      if (!param0) {
                        qlb.b((byte) -75);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = mtb.field_q;
                    ((sn) this).field_ab = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = ks.field_p;
                  if (null == ((sn) this).field_X) {
                    break L1;
                  } else {
                    ((sn) this).field_X.a(1546);
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new nna((os) this, vob.field_r, var4_ref);
              if (param2.field_g) {
                if (param2.field_c) {
                  ((sn) this).b((shb) (Object) new w((sn) this), -99);
                  return;
                } else {
                  htb discarded$2 = var5.a((byte) 107, tn.field_b, (sba) this);
                  break L3;
                }
              } else {
                L4: {
                  if (((sn) this).field_ab) {
                    htb discarded$3 = var5.a((byte) 98, tn.field_b, (sba) this);
                    break L4;
                  } else {
                    if (param2.field_d == 5) {
                      var5.a(-128, fma.field_c, 11);
                      var5.a(-114, vda.field_q, 17);
                      break L4;
                    } else {
                      var5.a(-115, vab.field_a, -1);
                      break L4;
                    }
                  }
                }
                if (param2.field_d == 3) {
                  var5.a(-115, mab.field_h, 7);
                  break L3;
                } else {
                  if (param2.field_d != 6) {
                    break L3;
                  } else {
                    var5.a(-124, lia.field_c, 9);
                    break L3;
                  }
                }
              }
            }
            L5: {
              if (!param1) {
                break L5;
              } else {
                var7 = null;
                sn.a(-93, 7, (jk) null, (byte) 42, -22, (soa) null, 46);
                break L5;
              }
            }
            ((sn) this).b((shb) (Object) var5, 99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("sn.P(").append(param0).append(',').append(param1).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    sn(ida param0, rq param1) {
        super(param0, vob.field_r, oma.field_c, false, false);
        try {
            ((sn) this).field_X = param1;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "sn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(int param0) {
        tpa var2 = null;
        if (param0 == 248) {
          if (((sn) this).field_z) {
            if (!((sn) this).field_Z) {
              int discarded$4 = 10589;
              var2 = nkb.a();
              if (var2 == null) {
                return super.a(248);
              } else {
                this.a(false, false, var2);
                return super.a(248);
              }
            } else {
              return super.a(248);
            }
          } else {
            return super.a(248);
          }
        } else {
          ((sn) this).field_ab = false;
          if (((sn) this).field_z) {
            if (!((sn) this).field_Z) {
              int discarded$5 = 10589;
              var2 = nkb.a();
              if (var2 == null) {
                return super.a(248);
              } else {
                this.a(false, false, var2);
                return super.a(248);
              }
            } else {
              return super.a(248);
            }
          } else {
            return super.a(248);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Y = true;
    }
}
