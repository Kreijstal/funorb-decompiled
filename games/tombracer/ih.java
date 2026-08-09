/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih extends ge {
    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        ov var5 = null;
        up var6 = null;
        mfa var7 = null;
        boa var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.h(param1, 0);
            var9.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new ov(param2, param0);
            var6 = new up(1, 10);
            var6.b(1, 13);
            var5.a(var6, true);
            this.a((byte) 43, var5, param2);
            var9.a((byte) 83, (nv) (var5));
            var7 = rm.field_a;
            var8 = (boa) ((Object) var7.a(7, 100));
            var8.b(114, 16);
            var9.a(var5, (byte) 124, var8);
            this.a(var9, param1 ^ 3, var5, 16777130);
            stackIn_1_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("ih.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    ih(la param0, int param1) {
        super(param0, param1);
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "ih.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(CharSequence param0, boolean param1, char param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!ov.a(62, param2)) {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (param0 != null) {
                var3_int = param0.length();
                if (-13 >= (var3_int ^ -1)) {
                  stackIn_10_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L1: {
                    if (!hf.a(114, param2)) {
                      break L1;
                    } else {
                      if (0 == var3_int) {
                        stackIn_15_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  L2: {
                    if (param1) {
                      break L2;
                    } else {
                      ih.D(97);
                      break L2;
                    }
                  }
                  stackIn_19_0 = 1;
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("ih.VB(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L3;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_15_0 != 0;
              } else {
                return stackIn_19_0 != 0;
              }
            }
          }
        }
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return true;
        }
        return false;
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return true;
    }

    ih(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            this.t(60);
            return false;
        }
        return false;
    }

    final static mi[] a(byte param0, String param1) {
        int incrementValue$1 = 0;
        vna var2 = null;
        RuntimeException var2_ref = null;
        mi[] var3 = null;
        int var4 = 0;
        mi var5 = null;
        int var6 = 0;
        mi[] stackIn_3_0 = null;
        mi[] stackIn_9_0 = null;
        mi[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (!param1.equals(cf.field_e)) {
              var2 = lp.a((byte) 48, param1);
              var3 = new mi[var2.a((byte) -16)];
              var4 = 0;
              var5 = (mi) ((Object) var2.f(-80));
              L1: while (true) {
                if (var5 == null) {
                  if (param0 == 126) {
                    opa.field_n = var3;
                    cf.field_e = param1;
                    stackIn_11_0 = (mi[]) (var3);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackIn_9_0 = (mi[]) null;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  incrementValue$1 = var4;
                  var4++;
                  var3[incrementValue$1] = var5;
                  var5 = (mi) ((Object) var2.e(124));
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = opa.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2_ref);

            stackIn_14_1 = new StringBuilder().append("ih.BC(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            return stackIn_11_0;
          }
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -4;
        }
        return 7;
    }

    final boolean B(int param0) {
        if (param0 != -23309) {
            return false;
        }
        return true;
    }

    final boolean C(int param0) {
        if (param0 != 128) {
            return true;
        }
        return true;
    }

    final static void D(int param0) {
        if (param0 == 17229) {
          if (null != baa.field_d) {
            if (!baa.field_d.b(100663296)) {
              if (tga.field_a == null) {
                if (null != baa.field_d.field_i) {
                  nia.d(-25405);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              nia.d(-25405);
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void q(byte param0) {
        super.q(param0);
        this.b(112, 2097152, 2097152);
    }

    final boolean A(int param0) {
        if (param0 != -1) {
            return true;
        }
        return true;
    }

    static {
    }
}
