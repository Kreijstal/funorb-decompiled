/*
 * Decompiled by CFR-JS 0.4.0.
 */
class uqb extends ksa implements ntb {
    boolean field_f;
    static int field_h;
    int field_e;
    pwa field_d;
    boolean field_g;

    public void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.a(-632, this.field_e, bnb.field_p);
            if (param1 < -109) {
              L1: {
                stackIn_4_0 = (faa) (param0);

                stackIn_4_1 = 59;

                if (this.field_d == null) {
                  stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 0;
                  break L1;
                } else {
                  stackIn_5_0 = (faa) ((Object) stackIn_4_0);
                  stackIn_5_1 = stackIn_4_1;
                  stackIn_5_2 = 1;
                  break L1;
                }
              }
              if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                this.field_d.b(param0, -113);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("uqb.B(");

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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte param0, mfa param1, tja param2) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        tv var7 = null;
        gqa var8 = null;
        bha var9 = null;
        hg var10 = null;
        bha var11 = null;
        try {
          L0: {
            L1: {
              if (param0 < -111) {
                break L1;
              } else {
                var7 = (tv) null;
                this.a((byte) 62, (tv) null);
                break L1;
              }
            }
            L2: {
              L3: {
                if (this.field_d == null) {
                  break L3;
                } else {
                  if (this.field_d.field_e == null) {
                    break L3;
                  } else {
                    L4: {
                      var8 = this.field_d.field_e;
                      var5 = var8.field_a;
                      var9 = param2.field_c[var5];
                      if (param1 != null) {
                        param1.a(var8.field_b, var5, (byte) -117);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var9.field_a = true;
                    var9.a(param2, var5, -24354, this.field_e);
                    iva.a(-6940, "CarouselEvent: Applied join for " + var8.field_b);
                    break L2;
                  }
                }
              }
              if (null == this.field_d) {
                break L2;
              } else {
                if (this.field_d.field_d != null) {
                  var10 = this.field_d.field_d;
                  var5 = var10.field_d;
                  var11 = param2.field_c[var5];
                  var11.field_a = false;
                  var11.a(true, param2, this.field_e, var5);
                  iva.a(-6940, "CarouselEvent: Applied leave for player " + var5);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (null != this.field_d) {
              break L0;
            } else {
              this.a(param1, 0, param2);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("uqb.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    public boolean a(byte param0, tv param1) {
        uqb var3 = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              L2: {
                var3 = (uqb) ((Object) param1);
                var4 = 72 % ((22 - param0) / 59);
                if (var3.field_e != this.field_e) {
                  break L2;
                } else {
                  L3: {
                    if (this.field_d != null) {
                      stackIn_4_0 = 0;
                      break L3;
                    } else {
                      stackIn_4_0 = 1;
                      break L3;
                    }
                  }
                  L4: {


                    if (var3.field_d != null) {

                      stackIn_7_1 = 0;
                      break L4;
                    } else {

                      stackIn_7_1 = 1;
                      break L4;
                    }
                  }
                  if ((stackIn_4_0 ^ stackIn_7_1) != 0) {
                    break L2;
                  } else {
                    L5: {
                      if (null == this.field_d) {
                        break L5;
                      } else {
                        if (!this.field_d.a((byte) 121, var3.field_d)) {
                          break L5;
                        } else {
                          break L2;
                        }
                      }
                    }
                    stackIn_13_0 = 0;
                    break L1;
                  }
                }
              }
              stackIn_13_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3_ref);

            stackIn_16_1 = new StringBuilder().append("uqb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        return stackIn_13_0 != 0;
    }

    public void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        faa var5 = null;
        uqb var6 = null;
        try {
          L0: {
            L1: {
              var6 = (uqb) ((Object) param0);
              var4 = 0;
              if (this.field_e != var6.field_e) {
                iva.a(-6940, "int tick has changed. before=" + var6.field_e + ", now=" + this.field_e);
                var4 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param1 <= -19) {
                break L2;
              } else {
                var5 = (faa) null;
                this.b((faa) null, 67);
                break L2;
              }
            }
            L3: {
              if (this.field_d == null) {
                break L3;
              } else {
                if (null != var6.field_d) {
                  this.field_d.a(var6.field_d, -70);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (null != this.field_d) {
                stackIn_12_0 = 0;
                break L4;
              } else {
                stackIn_12_0 = 1;
                break L4;
              }
            }
            L5: {


              if (var6.field_d != null) {

                stackIn_15_1 = 0;
                break L5;
              } else {

                stackIn_15_1 = 1;
                break L5;
              }
            }
            L6: {
              L7: {
                if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
                  break L7;
                } else {
                  if (this.field_d == null) {
                    break L6;
                  } else {
                    if (this.field_d.a((byte) 108, var6.field_d)) {
                      break L7;
                    } else {
                      break L6;
                    }
                  }
                }
              }
              var4 = 1;
              iva.a(-6940, "CarouselSystemMessage system_message has changed. before=" + var6.field_d + ", now=" + this.field_d);
              break L6;
            }
            if (var4 != 0) {
              tfb.a((byte) -78, "This instance of CarouselEvent has changed");
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var3);

            stackIn_26_1 = new StringBuilder().append("uqb.F(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
    }

    final boolean c(int param0) {
        int var2 = -71 / ((param0 - 59) / 43);
        return null != this.field_d ? true : false;
    }

    final void a(int param0, int param1) {
        int var3 = -106 % ((-71 - param1) / 44);
        this.field_d = new pwa();
        this.field_d.field_f = new gtb(param0);
    }

    public void b(byte param0, tv param1) {
        uqb var3 = null;
        RuntimeException var3_ref = null;
        uqb var4 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = (uqb) ((Object) param1);
            var3 = var4;
            var4.field_e = this.field_e;
            if (param0 >= 54) {
              if (this.field_d != null) {
                L1: {
                  L2: {
                    if (null == var3.field_d) {
                      break L2;
                    } else {
                      if (var3.field_d.getClass() != this.field_d.getClass()) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3.field_d = new pwa();
                  break L1;
                }
                this.field_d.b((byte) 121, var3.field_d);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4.field_d = null;
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3_ref);

            stackIn_12_1 = new StringBuilder().append("uqb.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    void a(mfa param0, int param1, tja param2) {
        RuntimeException runtimeException = null;
        tv var5 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var5 = (tv) null;
                this.a((byte) -98, (tv) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("uqb.A(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), stackIn_9_2 + ')');
        }
    }

    final boolean c(byte param0) {
        if (param0 <= 21) {
            this.a(52, -95);
            return this.field_g;
        }
        return this.field_g;
    }

    public void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.field_e = param0.i(0, bnb.field_p);
            if (!param1) {
              if (!kv.a(param1, param0)) {
                this.field_d = null;
                return;
              } else {
                L1: {
                  if (this.field_d == null) {
                    this.field_d = new pwa();
                    break L1;
                  } else {
                    break L1;
                  }
                }
                this.field_d.a(param0, param1);
                return;
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("uqb.H(");

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
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final boolean a(int param0) {
        int var2 = -72 % ((param0 - 70) / 40);
        return this.field_f;
    }

    uqb() {
        this.field_f = true;
        this.field_g = true;
    }

    static {
        field_h = 0;
    }
}
