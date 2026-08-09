/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aqa implements ntb {
    private boolean field_d;
    private tbb field_b;
    private gqb field_c;
    static String[] field_a;

    final int c(int param0) {
        if (!(this.field_c == null)) {
            return this.field_c.field_c;
        }
        if (param0 != 0) {
            this.field_d = false;
            return 0;
        }
        return 0;
    }

    private final void a(pe param0, int param1, int param2, int param3, int param4, int[] param5, int param6, int param7, anb param8) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        try {
          L0: {
            if (param3 == 0) {
              L1: {
                var10_int = this.a(param6, false) * param1 >> -1600749560;
                var11 = var10_int * fc.a(param2, (byte) 31) >> 755971176;
                var12 = var10_int * eu.a(param2, param3 ^ 50) >> -1347339608;
                param8.a(var12, param4, param7, (byte) -117, var11);
                if (veb.field_b != 0) {
                  break L1;
                } else {
                  if ((param6 ^ -1) != -47) {
                    param0.a(1, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 0, param7, -var12 >> ina.field_p);
                    break L1;
                  } else {
                    param0.a(5, -var11 >> ina.field_p, 0, slb.field_a, 30273, param4, 1024, param7, -var12 >> ina.field_p);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_b == null) {
                  break L2;
                } else {
                  if (!param0.c((byte) -86)) {
                    this.field_b.a((byte) 98, 16);
                    break L2;
                  } else {
                    return;
                  }
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
            var10 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var10);

            stackIn_13_1 = new StringBuilder().append("aqa.G(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        if (param0) {
            return;
        }
        if (this.field_b != null) {
            this.field_b.a(98);
        }
    }

    final void a(boolean param0, int param1) {
        L0: {
          if (veb.field_b == 0) {
            param0 = false;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 == 1024) {
          if (param0) {
            if (this.field_b != null) {
              if (!param0) {
                if (null == this.field_b) {
                  return;
                } else {
                  this.field_b = null;
                  return;
                }
              } else {
                return;
              }
            } else {
              this.field_b = new tbb();
              return;
            }
          } else {
            if (null == this.field_b) {
              return;
            } else {
              this.field_b = null;
              return;
            }
          }
        } else {
          return;
        }
    }

    public final boolean a(byte param0, tv param1) {
        aqa var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              var4 = -36 % ((22 - param0) / 59);
              var3 = (aqa) ((Object) param1);
              if (this.field_c != null) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {


              if (var3.field_c != null) {

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
                    if (null == this.field_c) {
                      break L5;
                    } else {
                      if (this.field_c.a((byte) -83, var3.field_c)) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (null != this.field_b) {
                      stackIn_13_0 = 0;
                      break L6;
                    } else {
                      stackIn_13_0 = 1;
                      break L6;
                    }
                  }
                  L7: {


                    if (var3.field_b != null) {

                      stackIn_16_1 = 0;
                      break L7;
                    } else {

                      stackIn_16_1 = 1;
                      break L7;
                    }
                  }
                  if ((stackIn_13_0 ^ stackIn_16_1) != 0) {
                    break L4;
                  } else {
                    L8: {
                      if (null == this.field_b) {
                        break L8;
                      } else {
                        if (!this.field_b.a((byte) -44, var3.field_b)) {
                          break L8;
                        } else {
                          break L4;
                        }
                      }
                    }
                    stackIn_22_0 = 0;
                    break L3;
                  }
                }
              }
              stackIn_22_0 = 1;
              break L3;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("aqa.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        tv var4 = null;
        faa stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        faa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              stackIn_2_0 = (faa) (param0);

              stackIn_2_1 = 53;

              if (this.field_c == null) {
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
                this.field_c.b(param0, -123);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              stackIn_8_0 = (faa) (param0);

              stackIn_8_1 = 87;

              if (null == this.field_b) {
                stackIn_9_0 = (faa) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = 0;
                break L3;
              } else {
                stackIn_9_0 = (faa) ((Object) stackIn_8_0);
                stackIn_9_1 = stackIn_8_1;
                stackIn_9_2 = 1;
                break L3;
              }
            }
            L4: {
              if (!vq.a(stackIn_9_0, stackIn_9_1, stackIn_9_2 != 0)) {
                break L4;
              } else {
                this.field_b.b(param0, -126);
                break L4;
              }
            }
            if (param1 < -109) {
              break L0;
            } else {
              var4 = (tv) null;
              this.a((tv) null, -102);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("aqa.B(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        int stackIn_12_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_1 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        aqa var5 = null;
        try {
          L0: {
            var5 = (aqa) ((Object) param0);
            if (param1 <= -19) {
              L1: {
                if (this.field_c == null) {
                  break L1;
                } else {
                  if (var5.field_c == null) {
                    break L1;
                  } else {
                    this.field_c.a(var5.field_c, -100);
                    break L1;
                  }
                }
              }
              L2: {
                if (this.field_b == null) {
                  break L2;
                } else {
                  if (null != var5.field_b) {
                    this.field_b.a(var5.field_b, -61);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                var4 = 0;
                if (this.field_c != null) {
                  stackIn_12_0 = 0;
                  break L3;
                } else {
                  stackIn_12_0 = 1;
                  break L3;
                }
              }
              L4: {


                if (null != var5.field_c) {

                  stackIn_15_1 = 0;
                  break L4;
                } else {

                  stackIn_15_1 = 1;
                  break L4;
                }
              }
              L5: {
                L6: {
                  if ((stackIn_12_0 ^ stackIn_15_1) != 0) {
                    break L6;
                  } else {
                    if (null == this.field_c) {
                      break L5;
                    } else {
                      if (this.field_c.a((byte) 81, var5.field_c)) {
                        break L6;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                System.out.println("TimedSpecialOrderBehaviour timer has changed. before=" + var5.field_c + ", now=" + this.field_c);
                var4 = 1;
                break L5;
              }
              L7: {
                if (null != this.field_b) {
                  stackIn_23_0 = 0;
                  break L7;
                } else {
                  stackIn_23_0 = 1;
                  break L7;
                }
              }
              L8: {


                if (var5.field_b != null) {

                  stackIn_26_1 = 0;
                  break L8;
                } else {

                  stackIn_26_1 = 1;
                  break L8;
                }
              }
              L9: {
                L10: {
                  if ((stackIn_23_0 ^ stackIn_26_1) != 0) {
                    break L10;
                  } else {
                    if (null == this.field_b) {
                      break L9;
                    } else {
                      if (this.field_b.a((byte) 91, var5.field_b)) {
                        break L10;
                      } else {
                        break L9;
                      }
                    }
                  }
                }
                var4 = 1;
                System.out.println("TrailHolder trail has changed. before=" + var5.field_b + ", now=" + this.field_b);
                break L9;
              }
              if (var4 == 0) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                System.out.println("This instance of ThrusterBehaviour has changed");
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var3 = decompiledCaughtException;
            stackIn_36_0 = (RuntimeException) (var3);

            stackIn_36_1 = new StringBuilder().append("aqa.F(");

            if (param0 == null) {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "null";
              break L11;
            } else {
              stackIn_37_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackIn_37_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackIn_37_2 = "{...}";
              break L11;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void b(byte param0, tv param1) {
        aqa var4 = null;
        aqa var3 = null;
        try {
            var4 = (aqa) ((Object) param1);
            var3 = var4;
            if (null == this.field_c) {
                var4.field_c = null;
            } else {
                if (!(var3.field_c != null)) {
                    var3.field_c = new gqb();
                }
                this.field_c.b((byte) 102, var3.field_c);
            }
            this.field_d = false;
            var3.field_b = this.field_b;
            if (param0 < 54) {
                aqa.b(-40);
            }
            var3.field_d = false;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "aqa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        tbb var2;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        if (!this.field_d) {
          if (null == this.field_b) {
            return;
          } else {
            L0: {
              var2 = this.field_b;
              this.field_b = new tbb();
              var2.b((byte) 112, this.field_b);
              stackIn_5_0 = this;

              if (!param0) {
                stackIn_6_0 = this;
                stackIn_6_1 = 0;
                break L0;
              } else {
                stackIn_6_0 = this;
                stackIn_6_1 = 1;
                break L0;
              }
            }
            ((aqa) (this)).field_d = stackIn_6_1 != 0;
            return;
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param1 != -61) {
          L0: {
            this.field_d = false;
            if (param0 != 46) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param0 != 46) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(byte param0, int param1, lta param2, int[] param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -116) {
                break L1;
              } else {
                this.a(false, -52);
                break L1;
              }
            }
            if (this.field_b != null) {
              this.field_b.a(param2, 1325107016, param1);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("aqa.K(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    final void a(int param0, anb param1, int param2) {
        uj var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (46 != param0) {
                break L1;
              } else {
                if (param1 instanceof sg) {
                  break L1;
                } else {
                  var4 = pca.field_i[5];
                  if (this.field_c.field_c > var4.d((byte) 64)) {
                    this.field_c.field_c = var4.d((byte) 64);
                    param1.d((byte) -55);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            if (param2 == -24213) {
              break L0;
            } else {
              this.field_b = (tbb) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("aqa.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 > -52) {
            aqa.a(115);
        }
    }

    final int a(int param0, boolean param1) {
        int var3;
        var3 = param0;
        if (-47 != (var3 ^ -1)) {
          if (var3 != 13) {
            if (var3 != 12) {
              if (param1) {
                return 127;
              } else {
                return 0;
              }
            } else {
              return clb.field_a;
            }
          } else {
            return pwa.field_b;
          }
        } else {
          return enb.field_c;
        }
    }

    final static boolean a(int param0) {
        if (param0 > -53) {
            return false;
        }
        return ho.field_a.a(true);
    }

    public aqa() {
    }

    final void a(boolean param0, anb param1, int param2, int param3, int param4, int[] param5, int param6, int param7, pe param8) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        try {
          L0: {
            L1: {
              if (!oua.field_a) {
                break L1;
              } else {
                if (null == this.field_b) {
                  break L1;
                } else {
                  if (param8.c((byte) 33)) {
                    break L1;
                  } else {
                    this.field_b.a((byte) -128);
                    this.field_b.a(param5[3], param5[2], (byte) -125, param5[4], param5[2] - -param5[4] >> -1002476799, param5[5], param5[3] + param5[5] >> -603423519);
                    break L1;
                  }
                }
              }
            }
            L2: {
              if (-47 != (param4 ^ -1)) {
                break L2;
              } else {
                var10_int = pca.field_i[5].d((byte) 64);
                if (param0) {
                  L3: {
                    if (this.field_c.field_c <= var10_int) {
                      break L3;
                    } else {
                      this.field_c.field_c = var10_int;
                      param1.d((byte) -82);
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  L4: {
                    if (0 >= this.field_c.field_c) {
                      break L4;
                    } else {
                      this.field_c.field_c = this.field_c.field_c - 1;
                      param1.d((byte) -128);
                      break L4;
                    }
                  }
                  if (this.field_c.field_c > var10_int) {
                    rmb.a(param3, param1.field_l + param8.d(1000).length, 2, -64, param7);
                    this.a(param8, 256, param2, param6 + 31501, param7, param5, param4, param3, param1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            if (param6 == -31501) {
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              this.field_c = (gqb) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var10 = decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var10);

            stackIn_20_1 = new StringBuilder().append("aqa.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, anb param5, int[] param6, int[] param7, pe param8, int param9, int param10, int param11, int param12, int param13) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        uj var16 = null;
        try {
          L0: {
            L1: {
              if (-47 == (param13 ^ -1)) {
                if (this.field_c.field_c > 0) {
                  break L1;
                } else {
                  var16 = pca.field_i[5];
                  this.field_c.field_c = var16.d((byte) 64) + var16.b(-25131);
                  param5.d((byte) -57);
                  break L1;
                }
              } else {
                L2: {
                  if (param13 != 12) {
                    rmb.a(param3, param5.field_l, 69, 87, param2);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.a(param8, param11, param9, 0, param2, param7, param13, param3, param5);
                break L1;
              }
            }
            if (param0) {
              break L0;
            } else {
              aqa.a(-31);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var15 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var15);

            stackIn_12_1 = new StringBuilder().append("aqa.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');

            if (param5 == null) {
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
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param6 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param7 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',');

            if (param8 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_22_2 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ',' + param13 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        tv var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            if (!param1) {
              break L0;
            } else {
              var5 = (tv) null;
              this.a((byte) 111, (tv) null);
              break L0;
            }
          }
          L1: {
            if (!kv.a(param1, param0)) {
              this.field_c = null;
              break L1;
            } else {
              L2: {
                if (null == this.field_c) {
                  this.field_c = new gqb();
                  break L2;
                } else {
                  break L2;
                }
              }
              this.field_c.a(param0, false);
              break L1;
            }
          }
          if (kv.a(param1, param0)) {
            this.field_b = new tbb();
            this.field_b.a(param0, false);
            return;
          } else {
            this.field_b = null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var3);

            stackIn_15_1 = new StringBuilder().append("aqa.H(");

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
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
    }

    aqa(int param0) {
        if (-47 == (param0 ^ -1)) {
            this.field_c = new gqb();
        }
    }

    static {
    }
}
