/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pw extends fqa {
    private int field_K;
    private int field_L;
    private int field_J;

    final static void a(boolean param0, byte param1, int param2, int param3) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        jea var5 = null;
        int var6 = 0;
        int var7 = 0;
        String var8 = null;
        gqa var9 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (pk.field_r >= pna.field_q) {
                break L1;
              } else {
                pk.field_r = pk.field_r + 1;
                break L1;
              }
            }
            L2: {
              if (mha.field_E != gn.field_C.field_e) {
                tj.field_b = tj.field_b + (gn.field_C.field_e - mha.field_E);
                mha.field_E = gn.field_C.field_e;
                break L2;
              } else {
                break L2;
              }
            }
            if ((pk.field_r ^ -1) < -1) {
              L3: {
                rg.a((byte) -53);
                era.field_e.c(37, param0);
                if (null != apa.field_c) {
                  if (!fua.field_g) {
                    apa.field_c = null;
                    break L3;
                  } else {
                    apa.field_c.a(era.field_e.field_A, param0, era.field_e.field_q, -90);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              var4_int = 0;
              L4: while (true) {
                if (var4_int >= 5) {
                  L5: {
                    if (0 != ara.field_ub.field_y) {
                      fj.field_c = new wla(ara.field_ub.field_q, ara.field_ub.field_A, ara.field_ub.field_G, ara.field_ub.field_t, param2, lma.field_r, oba.field_f, cga.field_g, kua.field_i, kt.field_F, dja.field_p, (String) null, 0L);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = mna.a((byte) 73, param3, di.field_a, mna.field_d);
                    if (var9 == null) {
                      break L6;
                    } else {
                      hpa.a(-2, var9);
                      break L6;
                    }
                  }
                  var8 = fa.a((byte) -126);
                  if (param1 < -75) {
                    L7: {
                      if (var8 == null) {
                        break L7;
                      } else {
                        qda.field_b = var8;
                        break L7;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  var5 = wba.field_p[var4_int];
                  if (var5 != null) {
                    L8: {
                      if (var5.field_y != 0) {
                        nw.a(false, var4_int, var5);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    var6 = gda.a(var4_int, -20011);
                    oka.field_y[var4_int].field_R = vda.field_m[var6];
                    kva.field_p[var4_int].field_r = jra.field_c[var6];
                    var4_int++;
                    continue L4;
                  } else {
                    var4_int++;
                    continue L4;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "pw.VB(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
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

    final int B(int param0) {
        if (param0 != 31609) {
            return -28;
        }
        return 3;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            this.field_K = -83;
            return false;
        }
        return false;
    }

    final static void C(int param0) {
        if (-gpa.field_b + 0 != tl.field_r && tl.field_r != 250 - gpa.field_b) {
        }
        if (param0 != -5) {
            return;
        }
        tl.field_r = tl.field_r + 1;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            this.field_L = 117;
            return false;
        }
        return false;
    }

    pw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
        this.field_L = 2;
        try {
            this.field_L = param2.b((byte) 44, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void q(byte param0) {
        int var2;
        int var3;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          super.q(param0);
          var2 = this.field_m;
          if (3 != var2) {
            if (var2 != 4) {
              this.field_J = -1;
              this.field_K = -1;
              break L0;
            } else {
              this.field_J = 2;
              this.field_K = 2;
              break L0;
            }
          } else {
            this.field_J = 1;
            this.field_K = 1;
            break L0;
          }
        }
        this.b(106, this.field_J * 2097152, 2097152 * this.field_K);
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            this.field_J = 97;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            this.v(97);
        }
        return 5;
    }

    pw(la param0, int param1) {
        super(param0, param1);
        this.field_L = 2;
    }

    final fsa a(boolean param0, int param1, la param2) {
        fsa stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5_int = 0;
        dja var5 = null;
        mfa var6 = null;
        cv var7 = null;
        int var8 = 0;
        int var9 = 0;
        fsa var10 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var10 = new fsa(param2, param0);
              var5_int = this.field_m;
              if ((var5_int ^ -1) == -55) {
                this.field_k = 2097152;
                break L1;
              } else {
                if (55 == var5_int) {
                  this.field_l = 2097152;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var10.b((byte) -11, this.field_k, this.field_l);
              var5 = new dja(param2, param0);
              var5.a(this.field_L, true);
              this.a(var5, (byte) -94);
              var10.a((byte) 83, (nv) (var5));
              var6 = rm.field_a;
              var7 = (cv) ((Object) var6.a(9, param1 ^ 113));
              if (param1 == 3) {
                break L2;
              } else {
                this.field_K = 33;
                break L2;
              }
            }
            L3: {
              var8 = this.field_m;
              if ((var8 ^ -1) != -4) {
                if (-5 != (var8 ^ -1)) {
                  if (54 == var8) {
                    var7.b(4, (byte) -112);
                    break L3;
                  } else {
                    if (-56 == (var8 ^ -1)) {
                      var7.b(5, (byte) -112);
                      break L3;
                    } else {
                      var10.a(var5, (byte) 124, var7);
                      return var10;
                    }
                  }
                } else {
                  var7.b(2, (byte) -112);
                  break L3;
                }
              } else {
                var7.b(0, (byte) -112);
                break L3;
              }
            }
            var10.a(var5, (byte) 124, var7);
            stackIn_20_0 = (fsa) (var10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var4);

            stackIn_23_1 = new StringBuilder().append("pw.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        return stackIn_20_0;
    }

    final static ha a(int param0, java.awt.Canvas param1, int param2, byte param3, d param4) {
        RuntimeException var5 = null;
        ha stackIn_2_0 = null;
        oa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param3 == -62) {
              stackIn_4_0 = new oa(param1, param4, param2, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (ha) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5);

            stackIn_7_1 = new StringBuilder().append("pw.TB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return (ha) ((Object) stackIn_4_0);
        }
    }

    final boolean v(int param0) {
        int var2;
        L0: {
          if (param0 == 555277520) {
            break L0;
          } else {
            this.field_K = -36;
            break L0;
          }
        }
        var2 = this.field_m;
        if (-55 == (var2 ^ -1)) {
          return true;
        } else {
          if ((var2 ^ -1) != -56) {
            return false;
          } else {
            return true;
          }
        }
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
            param1.a((byte) -125, this.field_L, 4);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "pw.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            this.field_K = -50;
            return true;
        }
        return true;
    }

    static {
    }
}
