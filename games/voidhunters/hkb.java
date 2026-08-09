/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hkb implements ntb {
    private pe field_a;

    public final void b(faa param0, int param1) {
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = 81;

              if (this.field_a == null) {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 0;
                break L1;
              } else {
                stackIn_3_0 = (faa) ((Object) stackIn_2_0);
                stackIn_3_1 = stackIn_2_1;
                stackIn_3_2 = 1;
                break L1;
              }
            }
            L2: {
              if (vq.a(stackIn_3_0, stackIn_3_1, stackIn_3_2 != 0)) {
                this.field_a.b(param0, -120);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 < -109) {
                break L3;
              } else {
                this.field_a = (pe) null;
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("hkb.B(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static boolean b(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 == -1) {
            break L0;
          } else {
            hkb.b(36);
            break L0;
          }
        }
        L1: {
          L2: {
            if (ar.field_d) {
              break L2;
            } else {
              if (!fda.e((byte) 103)) {
                stackIn_7_0 = 0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 1;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        hkb var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var3_int = -104 % ((22 - param0) / 59);
              var4 = (hkb) ((Object) param1);
              if (null != this.field_a) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (null != var4.field_a) {

                stackIn_6_1 = 0;
                break L2;
              } else {

                stackIn_6_1 = 1;
                break L2;
              }
            }
            L3: {
              L4: {
                if ((stackIn_3_0 ^ stackIn_6_1) != 0) {
                  break L4;
                } else {
                  L5: {
                    if (this.field_a == null) {
                      break L5;
                    } else {
                      if (!this.field_a.a((byte) 96, var4.field_a)) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_12_0 = 0;
                  break L3;
                }
              }
              stackIn_12_0 = 1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("hkb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L6;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_12_0 != 0;
    }

    final int a(int param0) {
        if (param0 != 0) {
            hkb.b(29);
        }
        return this.field_a.d(false);
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              if (kv.a(param1, param0)) {
                L2: {
                  if (null == this.field_a) {
                    this.field_a = new pe();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_a.a(param0, false);
                break L1;
              } else {
                this.field_a = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("hkb.H(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        hkb var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            if (param0 > 54) {
              L1: {
                var3 = (hkb) ((Object) param1);
                if (null == this.field_a) {
                  var3.field_a = null;
                  break L1;
                } else {
                  L2: {
                    if (null == var3.field_a) {
                      var3.field_a = new pe();
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  this.field_a.b((byte) 108, var3.field_a);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("hkb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        tv var5 = null;
        hkb var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              var6 = (hkb) ((Object) param0);
              if (param1 <= -19) {
                break L1;
              } else {
                var5 = (tv) null;
                this.a((tv) null, 5);
                break L1;
              }
            }
            L2: {
              if (this.field_a == null) {
                break L2;
              } else {
                if (var6.field_a == null) {
                  break L2;
                } else {
                  this.field_a.a(var6.field_a, -32);
                  break L2;
                }
              }
            }
            L3: {
              var4 = 0;
              if (this.field_a != null) {
                stackIn_8_0 = 0;
                break L3;
              } else {
                stackIn_8_0 = 1;
                break L3;
              }
            }
            L4: {


              if (var6.field_a != null) {

                stackIn_11_1 = 0;
                break L4;
              } else {

                stackIn_11_1 = 1;
                break L4;
              }
            }
            L5: {
              L6: {
                if ((stackIn_8_0 ^ stackIn_11_1) != 0) {
                  break L6;
                } else {
                  if (this.field_a == null) {
                    break L5;
                  } else {
                    if (this.field_a.a((byte) 82, var6.field_a)) {
                      break L6;
                    } else {
                      break L5;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("World saved_state has changed. before=" + var6.field_a + ", now=" + this.field_a);
              break L5;
            }
            L7: {
              if (var4 != 0) {
                System.out.println("This instance of Mission has changed");
                break L7;
              } else {
                break L7;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var3);

            stackIn_22_1 = new StringBuilder().append("hkb.F(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, rsb param1, int param2) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        sg[] var5_ref_sg__ = null;
        int var5 = 0;
        sg[] var6_ref_sg__ = null;
        int var6 = 0;
        int var7 = 0;
        sg var8 = null;
        tfa var9 = null;
        int var10 = 0;
        pe var11 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var11 = param1.field_g;
              if (param0) {
                var5_ref_sg__ = var11.d(1000);
                var6_ref_sg__ = var5_ref_sg__;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6_ref_sg__.length) {
                    break L1;
                  } else {
                    var8 = var6_ref_sg__[var7];
                    if (var8 != null) {
                      if (-1 >= (var8.o((byte) -117) ^ -1)) {
                        L3: {
                          if (!var8.l((byte) -10)) {
                            L4: {
                              if (qv.field_o != 0) {
                                break L4;
                              } else {
                                var8.h(17704, 2);
                                break L4;
                              }
                            }
                            L5: {
                              var9 = param1.a(var8.o((byte) -117), (byte) 59);
                              if (null == var9.field_g) {
                                var9.field_g = new sg();
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var8.b((byte) 92, var9.field_g);
                            var9.field_g.u(-14);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var7++;
                        continue L2;
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var5 = var11.f(24797);
            this.field_a.b((byte) 58, var11);
            var6 = -74 / ((param2 - 66) / 59);
            var11.b(-123, false);
            var11.a(0, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("hkb.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
    }

    hkb() {
    }

    hkb(pe param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "hkb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
