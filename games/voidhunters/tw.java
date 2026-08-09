/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw implements ntb {
    boa field_a;
    so field_d;
    twa field_e;
    static caa[] field_f;
    int field_b;
    dv field_c;

    public final void a(tv param0, int param1) {
        int stackIn_19_0 = 0;
        int stackIn_22_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_57_1 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        tw var5 = null;
        try {
          L0: {
            L1: {
              var5 = (tw) ((Object) param0);
              if (this.field_d == null) {
                break L1;
              } else {
                if (var5.field_d != null) {
                  this.field_d.a(var5.field_d, -52);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_e == null) {
                break L2;
              } else {
                if (var5.field_e != null) {
                  this.field_e.a(var5.field_e, -93);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (null == this.field_c) {
                break L3;
              } else {
                if (null == var5.field_c) {
                  break L3;
                } else {
                  this.field_c.a(var5.field_c, -60);
                  break L3;
                }
              }
            }
            L4: {
              if (this.field_a == null) {
                break L4;
              } else {
                if (null == var5.field_a) {
                  break L4;
                } else {
                  this.field_a.a(var5.field_a, -68);
                  break L4;
                }
              }
            }
            L5: {
              var4 = 0;
              if (this.field_b == var5.field_b) {
                break L5;
              } else {
                System.out.println("int ordertype has changed. before=" + var5.field_b + ", now=" + this.field_b);
                var4 = 1;
                break L5;
              }
            }
            L6: {
              if (null != var5.field_d) {
                stackIn_19_0 = 0;
                break L6;
              } else {
                stackIn_19_0 = 1;
                break L6;
              }
            }
            L7: {


              if (null != this.field_d) {

                stackIn_22_1 = 0;
                break L7;
              } else {

                stackIn_22_1 = 1;
                break L7;
              }
            }
            L8: {
              L9: {
                if ((stackIn_19_0 ^ stackIn_22_1) != 0) {
                  break L9;
                } else {
                  if (this.field_d == null) {
                    break L8;
                  } else {
                    if (this.field_d.a((byte) -80, var5.field_d)) {
                      break L9;
                    } else {
                      break L8;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("SettingsChange settings_change has changed. before=" + var5.field_d + ", now=" + this.field_d);
              break L8;
            }
            L10: {
              if (param1 < -19) {
                break L10;
              } else {
                this.field_b = 9;
                break L10;
              }
            }
            L11: {
              if (null != this.field_e) {
                stackIn_32_0 = 0;
                break L11;
              } else {
                stackIn_32_0 = 1;
                break L11;
              }
            }
            L12: {


              if (var5.field_e != null) {

                stackIn_35_1 = 0;
                break L12;
              } else {

                stackIn_35_1 = 1;
                break L12;
              }
            }
            L13: {
              L14: {
                if ((stackIn_32_0 ^ stackIn_35_1) != 0) {
                  break L14;
                } else {
                  if (this.field_e == null) {
                    break L13;
                  } else {
                    if (this.field_e.a((byte) -64, var5.field_e)) {
                      break L14;
                    } else {
                      break L13;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("SpawnChoice spawnchoice has changed. before=" + var5.field_e + ", now=" + this.field_e);
              break L13;
            }
            L15: {
              if (var5.field_c != null) {
                stackIn_43_0 = 0;
                break L15;
              } else {
                stackIn_43_0 = 1;
                break L15;
              }
            }
            L16: {


              if (null != this.field_c) {

                stackIn_46_1 = 0;
                break L16;
              } else {

                stackIn_46_1 = 1;
                break L16;
              }
            }
            L17: {
              L18: {
                if ((stackIn_43_0 ^ stackIn_46_1) != 0) {
                  break L18;
                } else {
                  if (this.field_c == null) {
                    break L17;
                  } else {
                    if (!this.field_c.a((byte) -42, var5.field_c)) {
                      break L17;
                    } else {
                      break L18;
                    }
                  }
                }
              }
              var4 = 1;
              System.out.println("PlayerVote vote has changed. before=" + var5.field_c + ", now=" + this.field_c);
              break L17;
            }
            L19: {
              if (var5.field_a != null) {
                stackIn_54_0 = 0;
                break L19;
              } else {
                stackIn_54_0 = 1;
                break L19;
              }
            }
            L20: {


              if (this.field_a != null) {

                stackIn_57_1 = 0;
                break L20;
              } else {

                stackIn_57_1 = 1;
                break L20;
              }
            }
            L21: {
              L22: {
                if ((stackIn_54_0 ^ stackIn_57_1) != 0) {
                  break L22;
                } else {
                  if (null == this.field_a) {
                    break L21;
                  } else {
                    if (this.field_a.a((byte) -40, var5.field_a)) {
                      break L22;
                    } else {
                      break L21;
                    }
                  }
                }
              }
              System.out.println("ShipBlueprint blueprint has changed. before=" + var5.field_a + ", now=" + this.field_a);
              var4 = 1;
              break L21;
            }
            if (var4 == 0) {
              break L0;
            } else {
              System.out.println("This instance of SpecialOrderSubmessage has changed");
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var3 = decompiledCaughtException;
            stackIn_67_0 = (RuntimeException) (var3);

            stackIn_67_1 = new StringBuilder().append("tw.F(");

            if (param0 == null) {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "null";
              break L23;
            } else {
              stackIn_68_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackIn_68_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackIn_68_2 = "{...}";
              break L23;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ',' + param1 + ')');
        }
    }

    final static void a(fm[] param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        fm var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              if (param1 == 62) {
                break L1;
              } else {
                tw.a(-111);
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              if (var2_int <= var3) {
                break L0;
              } else {
                var4 = param0[var3];
                var5 = var3 + -1;
                L3: while (true) {
                  L4: {
                    if ((var5 ^ -1) > -1) {
                      break L4;
                    } else {
                      if (!uk.a(param1 ^ -27562, param0[var5], var4)) {
                        break L4;
                      } else {
                        param0[1 + var5] = param0[var5];
                        var5--;
                        continue L3;
                      }
                    }
                  }
                  param0[var5 + 1] = var4;
                  var3++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("tw.A(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        fm[] var5 = null;
        tw var6 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = (tw) ((Object) param1);
              var6.field_b = this.field_b;
              if (null == this.field_d) {
                var6.field_d = null;
                break L1;
              } else {
                L2: {
                  if (null == var6.field_d) {
                    var6.field_d = new so();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_d.b((byte) 64, var6.field_d);
                break L1;
              }
            }
            L3: {
              if (null != this.field_e) {
                L4: {
                  if (null != var6.field_e) {
                    break L4;
                  } else {
                    var6.field_e = new twa();
                    break L4;
                  }
                }
                this.field_e.b((byte) 111, var6.field_e);
                break L3;
              } else {
                var6.field_e = null;
                break L3;
              }
            }
            L5: {
              if (param0 > 54) {
                break L5;
              } else {
                var5 = (fm[]) null;
                tw.a((fm[]) null, (byte) -120);
                break L5;
              }
            }
            L6: {
              if (this.field_c != null) {
                L7: {
                  if (null == var6.field_c) {
                    var6.field_c = new dv();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                this.field_c.b((byte) 88, var6.field_c);
                break L6;
              } else {
                var6.field_c = null;
                break L6;
              }
            }
            if (this.field_a != null) {
              L8: {
                if (var6.field_a != null) {
                  break L8;
                } else {
                  var6.field_a = new boa();
                  break L8;
                }
              }
              this.field_a.b((byte) 86, var6.field_a);
              break L0;
            } else {
              var6.field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("tw.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    public tw() {
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = -65 % ((-23 - param0) / 51);
    }

    public final boolean a(byte param0, tv param1) {
        int stackIn_4_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        tw var4 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 114 / ((22 - param0) / 59);
                var4 = (tw) ((Object) param1);
                if (this.field_b != var4.field_b) {
                  break L2;
                } else {
                  L3: {
                    if (null != var4.field_d) {
                      stackIn_4_0 = 0;
                      break L3;
                    } else {
                      stackIn_4_0 = 1;
                      break L3;
                    }
                  }
                  L4: {


                    if (null != this.field_d) {

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
                      if (this.field_d == null) {
                        break L5;
                      } else {
                        if (this.field_d.a((byte) 123, var4.field_d)) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_e != null) {
                        stackIn_14_0 = 0;
                        break L6;
                      } else {
                        stackIn_14_0 = 1;
                        break L6;
                      }
                    }
                    L7: {


                      if (null != var4.field_e) {

                        stackIn_17_1 = 0;
                        break L7;
                      } else {

                        stackIn_17_1 = 1;
                        break L7;
                      }
                    }
                    if ((stackIn_14_0 ^ stackIn_17_1) != 0) {
                      break L2;
                    } else {
                      L8: {
                        if (this.field_e == null) {
                          break L8;
                        } else {
                          if (this.field_e.a((byte) -38, var4.field_e)) {
                            break L2;
                          } else {
                            break L8;
                          }
                        }
                      }
                      L9: {
                        if (var4.field_c != null) {
                          stackIn_24_0 = 0;
                          break L9;
                        } else {
                          stackIn_24_0 = 1;
                          break L9;
                        }
                      }
                      L10: {


                        if (this.field_c != null) {

                          stackIn_27_1 = 0;
                          break L10;
                        } else {

                          stackIn_27_1 = 1;
                          break L10;
                        }
                      }
                      if ((stackIn_24_0 ^ stackIn_27_1) != 0) {
                        break L2;
                      } else {
                        L11: {
                          if (this.field_c == null) {
                            break L11;
                          } else {
                            if (this.field_c.a((byte) 110, var4.field_c)) {
                              break L2;
                            } else {
                              break L11;
                            }
                          }
                        }
                        L12: {
                          if (this.field_a != null) {
                            stackIn_34_0 = 0;
                            break L12;
                          } else {
                            stackIn_34_0 = 1;
                            break L12;
                          }
                        }
                        L13: {


                          if (null != var4.field_a) {

                            stackIn_37_1 = 0;
                            break L13;
                          } else {

                            stackIn_37_1 = 1;
                            break L13;
                          }
                        }
                        if ((stackIn_34_0 ^ stackIn_37_1) != 0) {
                          break L2;
                        } else {
                          L14: {
                            if (this.field_a == null) {
                              break L14;
                            } else {
                              if (!this.field_a.a((byte) -118, var4.field_a)) {
                                break L14;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackIn_43_0 = 0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_43_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var3);

            stackIn_46_1 = new StringBuilder().append("tw.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L15;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L15;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ')');
        }
        return stackIn_43_0 != 0;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        faa stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            param0.a(-632, this.field_b, 32);
            if (param1 < -109) {
              L1: {
                stackIn_4_0 = (faa) (param0);

                stackIn_4_1 = 66;

                if (null == this.field_d) {
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
              L2: {
                if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                  this.field_d.b(param0, -110);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                stackIn_10_0 = (faa) (param0);

                stackIn_10_1 = 80;

                if (this.field_e == null) {
                  stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = (faa) ((Object) stackIn_10_0);
                  stackIn_11_1 = stackIn_10_1;
                  stackIn_11_2 = 1;
                  break L3;
                }
              }
              L4: {
                if (!vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 != 0)) {
                  break L4;
                } else {
                  this.field_e.b(param0, -125);
                  break L4;
                }
              }
              L5: {
                stackIn_15_0 = (faa) (param0);

                stackIn_15_1 = 117;

                if (this.field_c == null) {
                  stackIn_16_0 = (faa) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 0;
                  break L5;
                } else {
                  stackIn_16_0 = (faa) ((Object) stackIn_15_0);
                  stackIn_16_1 = stackIn_15_1;
                  stackIn_16_2 = 1;
                  break L5;
                }
              }
              L6: {
                if (!vq.a(stackIn_16_0, stackIn_16_1, stackIn_16_2 != 0)) {
                  break L6;
                } else {
                  this.field_c.b(param0, -126);
                  break L6;
                }
              }
              L7: {
                stackIn_20_0 = (faa) (param0);

                stackIn_20_1 = 122;

                if (null == this.field_a) {
                  stackIn_21_0 = (faa) ((Object) stackIn_20_0);
                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 0;
                  break L7;
                } else {
                  stackIn_21_0 = (faa) ((Object) stackIn_20_0);
                  stackIn_21_1 = stackIn_20_1;
                  stackIn_21_2 = 1;
                  break L7;
                }
              }
              if (vq.a(stackIn_21_0, stackIn_21_1, stackIn_21_2 != 0)) {
                this.field_a.b(param0, -113);
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
          L8: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("tw.B(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L8;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    tw(int param0) {
        this.field_b = param0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              this.field_b = param0.i(0, 32);
              if (kv.a(param1, param0)) {
                L2: {
                  if (null == this.field_d) {
                    this.field_d = new so();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                this.field_d.a(param0, false);
                break L1;
              } else {
                this.field_d = null;
                break L1;
              }
            }
            L3: {
              if (!kv.a(false, param0)) {
                this.field_e = null;
                break L3;
              } else {
                L4: {
                  if (null == this.field_e) {
                    this.field_e = new twa();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                this.field_e.a(param0, false);
                break L3;
              }
            }
            L5: {
              if (!kv.a(false, param0)) {
                this.field_c = null;
                break L5;
              } else {
                if (this.field_c != null) {
                  this.field_c.a(param0, false);
                  break L5;
                } else {
                  this.field_c = new dv();
                  this.field_c.a(param0, false);
                  break L5;
                }
              }
            }
            if (kv.a(param1, param0)) {
              L6: {
                if (null != this.field_a) {
                  break L6;
                } else {
                  this.field_a = new boa();
                  break L6;
                }
              }
              this.field_a.a(param0, param1);
              break L0;
            } else {
              this.field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var3);

            stackIn_27_1 = new StringBuilder().append("tw.H(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L7;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
