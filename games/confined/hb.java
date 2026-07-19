/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hb extends kg {
    static bf field_u;
    private int field_p;
    static String field_v;
    private fc field_q;
    static String field_s;
    static be field_r;
    static String field_t;

    final void i(int param0) {
        this.field_p = this.field_n * param0;
    }

    final void a(byte[] param0, int param1, int param2, int param3) {
        int fieldTemp$5 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var5_int = param1;
            L1: while (true) {
              if (param2 <= var5_int) {
                break L0;
              } else {
                fieldTemp$5 = this.field_n;
                this.field_n = this.field_n + 1;
                param0[var5_int + param3] = (byte)(this.field_m[fieldTemp$5] + -this.field_q.c(km.a(param1, 256)));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("hb.NA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hb(byte[] param0) {
        super(param0);
    }

    final void b(boolean param0, int param1) {
        int fieldTemp$0 = this.field_n;
        this.field_n = this.field_n + 1;
        this.field_m[fieldTemp$0] = (byte)(this.field_q.c(256) + param1);
        if (!param0) {
            this.j(-107);
        }
    }

    final void a(int[] param0, int param1) {
        try {
            int var3_int = -124 % ((17 - param1) / 51);
            this.field_q = new fc(param0);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "hb.OA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var3 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 122) {
              L1: {
                hm.field_qb = hm.field_qb + 1;
                if (-1 != c.field_t) {
                  break L1;
                } else {
                  if (-1 != ah.field_Q) {
                    break L1;
                  } else {
                    c.field_t = ld.field_l;
                    ah.field_Q = jh.field_R;
                    break L1;
                  }
                }
              }
              L2: {
                L3: {
                  if (param1 != null) {
                    if (param1.equals(vf.field_o)) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    if (vf.field_o != null) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (!sa.field_R) {
                    if (kc.field_t <= hm.field_qb) {
                      if (kc.field_t + hm.field_nb > hm.field_qb) {
                        stackOut_16_0 = 1;
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      } else {
                        stackOut_15_0 = 0;
                        stackIn_18_0 = stackOut_15_0;
                        break L4;
                      }
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_18_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = 0;
                    stackIn_18_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var2_int = stackIn_18_0;
                  if (param1 == null) {
                    hm.field_qb = 0;
                    break L5;
                  } else {
                    if (sa.field_R) {
                      hm.field_qb = kc.field_t;
                      break L5;
                    } else {
                      if (var2_int == 0) {
                        hm.field_qb = 0;
                        break L5;
                      } else {
                        hm.field_qb = kc.field_t;
                        break L5;
                      }
                    }
                  }
                }
                L6: {
                  if (param1 != null) {
                    sa.field_R = false;
                    break L6;
                  } else {
                    if (var2_int != 0) {
                      sa.field_R = true;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                }
                nm.field_I = c.field_t;
                he.field_f = ah.field_Q;
                break L2;
              }
              L7: {
                vf.field_o = param1;
                if (sa.field_R) {
                  break L7;
                } else {
                  if (hm.field_qb >= kc.field_t) {
                    break L7;
                  } else {
                    if (hn.field_D) {
                      hm.field_qb = 0;
                      he.field_f = ah.field_Q;
                      nm.field_I = c.field_t;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (!sa.field_R) {
                  break L8;
                } else {
                  if (hm.field_qb != qa.field_f) {
                    break L8;
                  } else {
                    hm.field_qb = 0;
                    sa.field_R = false;
                    break L8;
                  }
                }
              }
              c.field_t = -1;
              ah.field_Q = -1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_42_0 = (RuntimeException) (var2);
            stackOut_42_1 = new StringBuilder().append("hb.VA(").append(param0).append(',');
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param1 == null) {
              stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
              stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L9;
            } else {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L9;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_45_0), stackIn_45_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final int g(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = Confined.field_J ? 1 : 0;
        int var3 = this.field_p >> 1904482147;
        int var4 = 8 - (7 & this.field_p);
        this.field_p = this.field_p + param0;
        int var5 = param1;
        while (var4 < param0) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((hn.field_C[var4] & this.field_m[incrementValue$0]) << param0 - var4);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_m[var3] >> var4 + -param0 & hn.field_C[param0]);
        } else {
            var5 = var5 + (hn.field_C[var4] & this.field_m[var3]);
        }
        return var5;
    }

    hb(int param0) {
        super(param0);
    }

    final int h(int param0) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 != -1) {
          field_r = (be) null;
          fieldTemp$4 = this.field_n;
          this.field_n = this.field_n + 1;
          return this.field_m[fieldTemp$4] + -this.field_q.c(param0 ^ -257) & 255;
        } else {
          fieldTemp$5 = this.field_n;
          this.field_n = this.field_n + 1;
          return this.field_m[fieldTemp$5] + -this.field_q.c(param0 ^ -257) & 255;
        }
    }

    final void j(int param0) {
        int var2 = 126 % ((77 - param0) / 38);
        this.field_n = (this.field_p + 7) / 8;
    }

    public static void g(int param0) {
        field_r = null;
        field_s = null;
        field_t = null;
        if (param0 != -1) {
          hb.g(10);
          field_u = null;
          field_v = null;
          return;
        } else {
          field_u = null;
          field_v = null;
          return;
        }
    }

    static {
        field_s = "Score";
        field_t = "Confirm Password: ";
    }
}
