/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends al {
    static tg[] field_p;
    static int field_q;
    private String field_j;
    static int[] field_n;
    static volatile boolean field_o;
    private bd field_l;
    static int field_m;
    private boolean field_k;

    final vf b(String param0, byte param1) {
        qh var3 = null;
        RuntimeException var3_ref = null;
        vf stackIn_3_0 = null;
        vf stackIn_7_0 = null;
        vf stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_l.b(param0, param1) == a.field_e) {
              stackIn_3_0 = a.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.equals(this.field_j)) {
                  break L1;
                } else {
                  var3 = f.a(param0, param1 + -150);
                  if (var3.a(param1 ^ 990)) {
                    this.field_j = param0;
                    this.field_k = var3.b(123);
                    break L1;
                  } else {
                    stackIn_7_0 = mi.field_c;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              L2: {
                if (this.field_k) {
                  stackIn_12_0 = mc.field_a;
                  break L2;
                } else {
                  stackIn_12_0 = a.field_e;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3_ref);

            stackIn_15_1 = new StringBuilder().append("cl.B(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void a(String param0, boolean param1, int param2) {
        int var3_int = 0;
        try {
            ee.field_c = false;
            if (!param1) {
                String var4 = (String) null;
                cl.a((String) null, false, -26);
            }
            ng.field_b = false;
            if (null != nk.field_a && nk.field_a.field_D) {
                var3_int = 1;
                if (8 == param2) {
                    if (fe.field_g) {
                        param0 = q.field_J;
                    } else {
                        param0 = mc.field_c;
                    }
                    param2 = 2;
                    vk.field_c.b(190, gi.field_b);
                }
                if ((param2 ^ -1) == -11) {
                    qf.a(0);
                    var3_int = 0;
                }
                if (!(var3_int == 0)) {
                    if (!(!ee.field_c)) {
                        param0 = jf.a(ta.field_b, new String[]{param0}, (byte) -126);
                    }
                    if (!(!va.field_f)) {
                        param0 = pf.field_B;
                    }
                    nk.field_a.a(param0, 4210752, param2);
                }
                if ((param2 ^ -1) != -257 && 10 != param2) {
                    if (fe.field_g) {
                        return;
                    }
                    vk.field_c.e((byte) -100);
                }
            }
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "cl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_n = null;
        field_p = null;
    }

    cl(ba param0, ba param1) {
        super(param0);
        this.field_j = "";
        this.field_k = false;
        try {
            this.field_l = new bd(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "cl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, byte param1) {
        RuntimeException var3 = null;
        String var4 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -114) {
                break L1;
              } else {
                var4 = (String) null;
                this.a((String) null, (byte) -81);
                break L1;
              }
            }
            if (this.field_l.b(param0, (byte) 54) != a.field_e) {
              if (this.b(param0, (byte) 54) == a.field_e) {
                stackIn_8_0 = hb.field_C;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return ha.field_g;
              }
            } else {
              stackIn_4_0 = this.field_l.a(param0, (byte) -114);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cl.C(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void b(boolean param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        id var4 = null;
        int var4_int = 0;
        int var5 = 0;
        jc var5_ref_jc = null;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ii var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var9 = jc.field_g;
              var2 = var9.d((byte) -118);
              var3 = var9.d((byte) -113);
              if (0 == var2) {
                var4 = (id) ((Object) mf.field_d.a((byte) -105));
                if (var4 != null) {
                  L2: {
                    var5 = -var9.field_h + pe.field_d;
                    var11 = var4.field_h;
                    var10 = var11;
                    var6 = var10;
                    if (var5 > var11.length << -2034825918) {
                      var5 = var11.length << -570147998;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var7 = 0;
                  L3: while (true) {
                    if (var5 <= var7) {
                      var4.c(2);
                      break L1;
                    } else {
                      var6[var7 >> 1426473826] = var6[var7 >> 1426473826] + (var9.d((byte) -125) << da.b(768, var7 << 372978216));
                      var7++;
                      continue L3;
                    }
                  }
                } else {
                  kc.a((byte) 18);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if ((var2 ^ -1) != -2) {
                  ti.a((Throwable) null, (byte) 100, "LR1: " + la.a(-114));
                  kc.a((byte) 18);
                  break L1;
                } else {
                  var4_int = var9.i(128);
                  var5_ref_jc = (jc) ((Object) m.field_e.a((byte) -53));
                  L4: while (true) {
                    L5: {
                      if (var5_ref_jc == null) {
                        break L5;
                      } else {
                        L6: {
                          if (var3 != var5_ref_jc.field_l) {
                            break L6;
                          } else {
                            if (var5_ref_jc.field_j != var4_int) {
                              break L6;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var5_ref_jc = (jc) ((Object) m.field_e.d((byte) 90));
                        continue L4;
                      }
                    }
                    if (var5_ref_jc == null) {
                      kc.a((byte) 18);
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var5_ref_jc.c(2);
                      break L1;
                    }
                  }
                }
              }
            }
            if (!param0) {
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              field_n = (int[]) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "cl.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    static {
        field_o = false;
    }
}
