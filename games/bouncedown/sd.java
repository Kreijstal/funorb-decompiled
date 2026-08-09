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
        rg var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            if (this.field_nb) {
              l.a(false, true, -100);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                ck.e((byte) 125);
                if (param0 < 6) {
                  var7 = (rg) null;
                  this.a(-84, true, (rg) null);
                  this.a(true);
                  break L1;
                } else {
                  this.a(true);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var6);

            stackIn_11_1 = new StringBuilder().append("sd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          throw ii.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void j(byte param0) {
        this.a(-1, true, wb.a(248, param0 ^ -51, ih.field_P));
        if (param0 != -52) {
            rg var3 = (rg) null;
            this.a(28, false, (rg) null);
        }
    }

    sd(pf param0, gh param1) {
        super(param0, ne.field_v, ce.field_t, false, false);
        try {
            this.field_kb = param1;
        } catch (RuntimeException runtimeException) {
            throw ii.a((Throwable) ((Object) runtimeException), "sd.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(boolean param0) {
        field_pb = null;
        if (param0) {
            sd.b(false);
            field_mb = null;
            return;
        }
        field_mb = null;
    }

    private final void a(int param0, boolean param1, rg param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        uc var5 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          L0: {
            L1: {
              this.field_ob = true;
              if (param0 == -1) {
                break L1;
              } else {
                field_lb = 6;
                break L1;
              }
            }
            L2: {
              if (param2.field_f) {
                var4 = ha.field_k;
                break L2;
              } else {
                if (param2.field_d == null) {
                  var4 = param2.field_c;
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
                    var4 = ih.field_P;
                    this.field_nb = true;
                    break L2;
                  }
                } else {
                  var4 = ma.field_n;
                  if (this.field_kb == null) {
                    break L2;
                  } else {
                    this.field_kb.a(-3814);
                    break L2;
                  }
                }
              }
            }
            L4: {
              var5 = new uc((sh) (this), ne.field_v, var4);
              if (param2.field_f) {
                if (param2.field_a) {
                  this.a(10768, new eb((sd) (this)));
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a(pc.field_i, (sk) (this), -4);
                  break L4;
                }
              } else {
                L5: {
                  if (this.field_nb) {
                    var5.a(pc.field_i, (sk) (this), -4);
                    break L5;
                  } else {
                    if ((param2.field_g ^ -1) == -6) {
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
                  if ((param2.field_g ^ -1) != -7) {
                    break L4;
                  } else {
                    var5.a(da.field_c, 9, (byte) 93);
                    break L4;
                  }
                }
              }
            }
            this.a(10768, var5);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("sd.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L6;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L6;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean e(byte param0) {
        rg var2;
        if (param0 == 21) {
          if (this.field_D) {
            if (!this.field_ob) {
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
          this.e((byte) -34);
          if (this.field_D) {
            if (!this.field_ob) {
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
        field_lb = 250;
    }
}
