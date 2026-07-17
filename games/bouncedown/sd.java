/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd extends sh implements rc {
    private boolean field_ob;
    private boolean field_nb;
    static int field_lb;
    static be field_mb;
    static gk field_pb;
    private gh field_kb;

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        RuntimeException var6 = null;
        Object var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((sd) this).field_nb) {
              l.a(false, true, -100);
              return;
            } else {
              L1: {
                ck.e((byte) 125);
                if (param0 < 6) {
                  var7 = null;
                  this.a(-84, true, (rg) null);
                  ((sd) this).a(true);
                  break L1;
                } else {
                  ((sd) this).a(true);
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var6;
            stackOut_9_1 = new StringBuilder().append("sd.B(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final void j(byte param0) {
        this.a(-1, true, wb.a(248, param0 ^ -51, ih.field_P));
        if (param0 != -52) {
            Object var3 = null;
            this.a(28, false, (rg) null);
        }
    }

    sd(pf param0, gh param1) {
        super(param0, ne.field_v, ce.field_t, false, false);
        try {
            ((sd) this).field_kb = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) (Object) runtimeException, "sd.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(boolean param0) {
        field_pb = null;
        field_mb = null;
    }

    private final void a(int param0, boolean param1, rg param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        uc var5 = null;
        int var6 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              ((sd) this).field_ob = true;
              if (param0 == -1) {
                break L1;
              } else {
                field_lb = 6;
                break L1;
              }
            }
            L2: {
              if (param2.field_f) {
                var4_ref = ha.field_k;
                break L2;
              } else {
                if (param2.field_d == null) {
                  var4_ref = param2.field_c;
                  if (param2.field_g != 248) {
                    break L2;
                  } else {
                    L3: {
                      if (!param1) {
                        rg.b((byte) -128);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var4_ref = ih.field_P;
                    ((sd) this).field_nb = true;
                    break L2;
                  }
                } else {
                  var4_ref = ma.field_n;
                  if (((sd) this).field_kb == null) {
                    break L2;
                  } else {
                    ((sd) this).field_kb.a(-3814);
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new uc((sh) this, ne.field_v, var4_ref);
              if (param2.field_f) {
                if (param2.field_a) {
                  ((sd) this).a(10768, (lk) (Object) new eb((sd) this));
                  return;
                } else {
                  wd discarded$2 = var5.a(pc.field_i, (sk) this, -4);
                  break L4;
                }
              } else {
                L5: {
                  if (((sd) this).field_nb) {
                    wd discarded$3 = var5.a(pc.field_i, (sk) this, -4);
                    break L5;
                  } else {
                    if (param2.field_g == 5) {
                      var5.a(ta.field_e, 11, (byte) 114);
                      var5.a(i.field_g, 17, (byte) 85);
                      break L5;
                    } else {
                      var5.a(pe.field_h, -1, (byte) 124);
                      break L5;
                    }
                  }
                }
                if (param2.field_g == 3) {
                  var5.a(oc.field_c, 7, (byte) 80);
                  break L4;
                } else {
                  if (param2.field_g != 6) {
                    break L4;
                  } else {
                    var5.a(da.field_c, 9, (byte) 93);
                    break L4;
                  }
                }
              }
            }
            ((sd) this).a(10768, (lk) (Object) var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var4;
            stackOut_30_1 = new StringBuilder().append("sd.D(").append(param0).append(44).append(param1).append(44);
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L6;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L6;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + 41);
        }
    }

    final boolean e(byte param0) {
        rg var2 = null;
        if (param0 == 21) {
          if (((sd) this).field_D) {
            if (!((sd) this).field_ob) {
              var2 = jf.a(true);
              if (var2 == null) {
                return super.e((byte) 21);
              } else {
                this.a(-1, false, var2);
                return super.e((byte) 21);
              }
            } else {
              return super.e((byte) 21);
            }
          } else {
            return super.e((byte) 21);
          }
        } else {
          boolean discarded$6 = ((sd) this).e((byte) -34);
          if (((sd) this).field_D) {
            if (!((sd) this).field_ob) {
              var2 = jf.a(true);
              if (var2 == null) {
                return super.e((byte) 21);
              } else {
                this.a(-1, false, var2);
                return super.e((byte) 21);
              }
            } else {
              return super.e((byte) 21);
            }
          } else {
            return super.e((byte) 21);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_lb = 250;
    }
}
