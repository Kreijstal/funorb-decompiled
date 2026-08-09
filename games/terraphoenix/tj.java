/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj extends si implements n {
    static int field_wb;
    private boolean field_xb;
    static String field_ub;
    private boolean field_vb;
    static int field_sb;
    private pl field_tb;

    final static String a(CharSequence param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 9) {
                break L1;
              } else {
                var3 = (CharSequence) null;
                tj.a((CharSequence) null, 66);
                break L1;
              }
            }
            L2: {
              var2 = hi.a(qd.a(-113, param0), -12382);
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("tj.R(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    tj(d param0, pl param1) {
        super(param0, be.field_x, mm.field_d, false, false);
        try {
            this.field_tb = param1;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void p(int param0) {
        field_ub = null;
        if (param0 <= 29) {
            CharSequence var2 = (CharSequence) null;
            tj.a((CharSequence) null, 112);
        }
    }

    final void q(int param0) {
        CharSequence var3;
        if (param0 < 66) {
          var3 = (CharSequence) null;
          tj.a((CharSequence) null, -117);
          this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
          return;
        } else {
          this.a(aj.a(248, (byte) -47, ib.field_ab), (byte) -110, true);
          return;
        }
    }

    private final void a(pd param0, byte param1, boolean param2) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        oi var5 = null;
        int var6 = 0;
        var6 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              this.field_vb = true;
              if (param0.field_i) {
                var4 = sh.field_q;
                break L1;
              } else {
                if (null == param0.field_d) {
                  var4 = param0.field_b;
                  if (248 == param0.field_c) {
                    if (param2) {
                      var4 = ib.field_ab;
                      this.field_xb = true;
                      break L1;
                    } else {
                      dm.a((byte) -119);
                      var4 = ib.field_ab;
                      this.field_xb = true;
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  var4 = mg.field_m;
                  if (null == this.field_tb) {
                    break L1;
                  } else {
                    this.field_tb.a(50);
                    break L1;
                  }
                }
              }
            }
            L2: {
              var5 = new oi((si) (this), be.field_x, var4);
              if (param1 == -110) {
                break L2;
              } else {
                this.q(102);
                break L2;
              }
            }
            L3: {
              if (param0.field_i) {
                if (!param0.field_a) {
                  var5.a((byte) 23, (sc) (this), rj.field_e);
                  break L3;
                } else {
                  this.a(new cl((tj) (this)), -86);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L4: {
                  if (!this.field_xb) {
                    if (param0.field_c == 5) {
                      var5.a(11, hf.field_u, (byte) -65);
                      var5.a(17, ed.field_c, (byte) 54);
                      break L4;
                    } else {
                      var5.a(-1, gd.field_b, (byte) -120);
                      break L4;
                    }
                  } else {
                    var5.a((byte) 23, (sc) (this), rj.field_e);
                    break L4;
                  }
                }
                if (3 == param0.field_c) {
                  var5.a(7, mi.field_i, (byte) 118);
                  break L3;
                } else {
                  if (param0.field_c != 6) {
                    break L3;
                  } else {
                    var5.a(9, fc.field_b, (byte) -117);
                    break L3;
                  }
                }
              }
            }
            this.a(var5, -31);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var4_ref);

            stackIn_32_1 = new StringBuilder().append("tj.S(");

            if (param0 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L5;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L5;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        if (!(!this.field_xb)) {
            qc.a(false, true, 123);
            return;
        }
        try {
            jh.c((byte) 30);
            this.h((byte) -126);
            int var6_int = 75 / ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "tj.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean f(byte param0) {
        pd var2;
        L0: {
          if (!this.field_J) {
            break L0;
          } else {
            if (!this.field_vb) {
              var2 = pd.a(-352);
              if (var2 != null) {
                this.a(var2, (byte) -110, false);
                break L0;
              } else {
                if (param0 == -121) {
                  return super.f((byte) -121);
                } else {
                  field_sb = 5;
                  return super.f((byte) -121);
                }
              }
            } else {
              if (param0 == -121) {
                return super.f((byte) -121);
              } else {
                field_sb = 5;
                return super.f((byte) -121);
              }
            }
          }
        }
        if (param0 != -121) {
          field_sb = 5;
          return super.f((byte) -121);
        } else {
          return super.f((byte) -121);
        }
    }

    static {
        field_sb = 128;
        field_ub = "CRC mismatch - unable to get a valid download. Please check any firewall/antivirus/filtering software.";
    }
}
