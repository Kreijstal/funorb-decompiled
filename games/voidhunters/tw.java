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
        RuntimeException var3 = null;
        int var4 = 0;
        tw var5 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        try {
          L0: {
            L1: {
              var5 = (tw) (Object) param0;
              if (var5.field_d == null) {
                break L1;
              } else {
                if (var5.field_d != null) {
                  var5.field_d.a((tv) (Object) var5.field_d, -52);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (var5.field_e == null) {
                break L2;
              } else {
                if (var5.field_e != null) {
                  var5.field_e.a((tv) (Object) var5.field_e, -93);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (null == var5.field_c) {
                break L3;
              } else {
                if (null == var5.field_c) {
                  break L3;
                } else {
                  var5.field_c.a((tv) (Object) var5.field_c, -60);
                  break L3;
                }
              }
            }
            L4: {
              if (var5.field_a == null) {
                break L4;
              } else {
                if (null == var5.field_a) {
                  break L4;
                } else {
                  var5.field_a.a((tv) (Object) var5.field_a, -68);
                  break L4;
                }
              }
            }
            L5: {
              var4 = 0;
              if (var5.field_b == var5.field_b) {
                break L5;
              } else {
                System.out.println("int ordertype has changed. before=" + var5.field_b + ", now=" + var5.field_b);
                var4 = 1;
                break L5;
              }
            }
            so discarded$4 = var5.field_d;
            L6: {
              if (var5.field_d == null) {
                break L6;
              } else {
                if (var5.field_d.a((byte) -80, (tv) (Object) var5.field_d)) {
                  var4 = 1;
                  System.out.println("SettingsChange settings_change has changed. before=" + (Object) (Object) var5.field_d + ", now=" + (Object) (Object) var5.field_d);
                  break L6;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (param1 < -19) {
                break L7;
              } else {
                ((tw) this).field_b = 9;
                break L7;
              }
            }
            twa discarded$5 = var5.field_e;
            L8: {
              if (var5.field_e == null) {
                break L8;
              } else {
                if (var5.field_e.a((byte) -64, (tv) (Object) var5.field_e)) {
                  var4 = 1;
                  System.out.println("SpawnChoice spawnchoice has changed. before=" + (Object) (Object) var5.field_e + ", now=" + (Object) (Object) var5.field_e);
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            dv discarded$6 = var5.field_c;
            L9: {
              if (var5.field_c == null) {
                break L9;
              } else {
                if (!var5.field_c.a((byte) -42, (tv) (Object) var5.field_c)) {
                  break L9;
                } else {
                  var4 = 1;
                  System.out.println("PlayerVote vote has changed. before=" + (Object) (Object) var5.field_c + ", now=" + (Object) (Object) var5.field_c);
                  break L9;
                }
              }
            }
            boa discarded$7 = var5.field_a;
            L10: {
              if (null == var5.field_a) {
                break L10;
              } else {
                if (var5.field_a.a((byte) -40, (tv) (Object) var5.field_a)) {
                  System.out.println("ShipBlueprint blueprint has changed. before=" + (Object) (Object) var5.field_a + ", now=" + (Object) (Object) var5.field_a);
                  var4 = 1;
                  break L10;
                } else {
                  break L10;
                }
              }
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
          L11: {
            var3 = decompiledCaughtException;
            stackOut_45_0 = (RuntimeException) var3;
            stackOut_45_1 = new StringBuilder().append("tw.F(");
            stackIn_47_0 = stackOut_45_0;
            stackIn_47_1 = stackOut_45_1;
            stackIn_46_0 = stackOut_45_0;
            stackIn_46_1 = stackOut_45_1;
            if (param0 == null) {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "null";
              stackIn_48_0 = stackOut_47_0;
              stackIn_48_1 = stackOut_47_1;
              stackIn_48_2 = stackOut_47_2;
              break L11;
            } else {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "{...}";
              stackIn_48_0 = stackOut_46_0;
              stackIn_48_1 = stackOut_46_1;
              stackIn_48_2 = stackOut_46_2;
              break L11;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_48_0, stackIn_48_2 + ',' + param1 + ')');
        }
    }

    final static void a(fm[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fm var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
                    if (var5 < 0) {
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
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("tw.A(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        tw var6 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var6 = (tw) (Object) param1;
              var6.field_b = var6.field_b;
              if (null == var6.field_d) {
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
                var6.field_d.b((byte) 64, (tv) (Object) var6.field_d);
                break L1;
              }
            }
            L3: {
              if (null != var6.field_e) {
                L4: {
                  if (null != var6.field_e) {
                    break L4;
                  } else {
                    var6.field_e = new twa();
                    break L4;
                  }
                }
                var6.field_e.b((byte) 111, (tv) (Object) var6.field_e);
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
                var5 = null;
                tw.a((fm[]) null, (byte) -120);
                break L5;
              }
            }
            L6: {
              if (var6.field_c != null) {
                L7: {
                  if (null == var6.field_c) {
                    var6.field_c = new dv();
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var6.field_c.b((byte) 88, (tv) (Object) var6.field_c);
                break L6;
              } else {
                var6.field_c = null;
                break L6;
              }
            }
            if (var6.field_a != null) {
              L8: {
                if (var6.field_a != null) {
                  break L8;
                } else {
                  var6.field_a = new boa();
                  break L8;
                }
              }
              var6.field_a.b((byte) 86, (tv) (Object) var6.field_a);
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
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("tw.D(").append(param0).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
    }

    public tw() {
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = -65 % ((-23 - param0) / 51);
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        tw var4 = null;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 114 / ((22 - param0) / 59);
                var4 = (tw) (Object) param1;
                if (var4.field_b != var4.field_b) {
                  break L2;
                } else {
                  so discarded$4 = var4.field_d;
                  L3: {
                    if (var4.field_d == null) {
                      break L3;
                    } else {
                      if (var4.field_d.a((byte) 123, (tv) (Object) var4.field_d)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  twa discarded$5 = var4.field_e;
                  L4: {
                    if (var4.field_e == null) {
                      break L4;
                    } else {
                      if (var4.field_e.a((byte) -38, (tv) (Object) var4.field_e)) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  dv discarded$6 = var4.field_c;
                  L5: {
                    if (var4.field_c == null) {
                      break L5;
                    } else {
                      if (var4.field_c.a((byte) 110, (tv) (Object) var4.field_c)) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  boa discarded$7 = var4.field_a;
                  L6: {
                    if (var4.field_a == null) {
                      break L6;
                    } else {
                      if (!var4.field_a.a((byte) -118, (tv) (Object) var4.field_a)) {
                        break L6;
                      } else {
                        break L2;
                      }
                    }
                  }
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L1;
                }
              }
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var3;
            stackOut_24_1 = new StringBuilder().append("tw.C(").append(param0).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
        return stackIn_23_0 != 0;
    }

    public final void b(faa param0, int param1) {
        RuntimeException var3 = null;
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        faa stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        int stackIn_16_2 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        faa stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        faa stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_21_2 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        faa stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        faa stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        faa stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int stackOut_20_2 = 0;
        faa stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            param0.a(-632, ((tw) this).field_b, 32);
            if (param1 < -109) {
              L1: {
                stackOut_2_0 = (faa) param0;
                stackOut_2_1 = 66;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                if (null == ((tw) this).field_d) {
                  stackOut_4_0 = (faa) (Object) stackIn_4_0;
                  stackOut_4_1 = stackIn_4_1;
                  stackOut_4_2 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  stackIn_5_2 = stackOut_4_2;
                  break L1;
                } else {
                  stackOut_3_0 = (faa) (Object) stackIn_3_0;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  stackIn_5_2 = stackOut_3_2;
                  break L1;
                }
              }
              L2: {
                if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
                  ((tw) this).field_d.b(param0, -110);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                stackOut_8_0 = (faa) param0;
                stackOut_8_1 = 80;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (((tw) this).field_e == null) {
                  stackOut_10_0 = (faa) (Object) stackIn_10_0;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L3;
                } else {
                  stackOut_9_0 = (faa) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
              }
              L4: {
                if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 == 0)) {
                  break L4;
                } else {
                  ((tw) this).field_e.b(param0, -125);
                  break L4;
                }
              }
              L5: {
                stackOut_13_0 = (faa) param0;
                stackOut_13_1 = 117;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (((tw) this).field_c == null) {
                  stackOut_15_0 = (faa) (Object) stackIn_15_0;
                  stackOut_15_1 = stackIn_15_1;
                  stackOut_15_2 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L5;
                } else {
                  stackOut_14_0 = (faa) (Object) stackIn_14_0;
                  stackOut_14_1 = stackIn_14_1;
                  stackOut_14_2 = 1;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L5;
                }
              }
              L6: {
                if (vq.a(stackIn_16_0, stackIn_16_1, stackIn_16_2 == 0)) {
                  break L6;
                } else {
                  ((tw) this).field_c.b(param0, -126);
                  break L6;
                }
              }
              L7: {
                stackOut_18_0 = (faa) param0;
                stackOut_18_1 = 122;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (null == ((tw) this).field_a) {
                  stackOut_20_0 = (faa) (Object) stackIn_20_0;
                  stackOut_20_1 = stackIn_20_1;
                  stackOut_20_2 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (faa) (Object) stackIn_19_0;
                  stackOut_19_1 = stackIn_19_1;
                  stackOut_19_2 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              if (vq.a(stackIn_21_0, stackIn_21_1, stackIn_21_2 != 0)) {
                ((tw) this).field_a.b(param0, -113);
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("tw.B(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    tw(int param0) {
        ((tw) this).field_b = param0;
    }

    public final void a(faa param0, boolean param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var4 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              ((tw) this).field_b = param0.i(0, 32);
              if (kv.a(param1, param0)) {
                L2: {
                  if (null == ((tw) this).field_d) {
                    ((tw) this).field_d = new so();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((tw) this).field_d.a(param0, false);
                break L1;
              } else {
                ((tw) this).field_d = null;
                break L1;
              }
            }
            L3: {
              if (!kv.a(false, param0)) {
                ((tw) this).field_e = null;
                break L3;
              } else {
                L4: {
                  if (null == ((tw) this).field_e) {
                    ((tw) this).field_e = new twa();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                ((tw) this).field_e.a(param0, false);
                break L3;
              }
            }
            L5: {
              if (!kv.a(false, param0)) {
                ((tw) this).field_c = null;
                break L5;
              } else {
                if (((tw) this).field_c != null) {
                  ((tw) this).field_c.a(param0, false);
                  break L5;
                } else {
                  ((tw) this).field_c = new dv();
                  ((tw) this).field_c.a(param0, false);
                  break L5;
                }
              }
            }
            if (kv.a(param1, param0)) {
              L6: {
                if (null != ((tw) this).field_a) {
                  break L6;
                } else {
                  ((tw) this).field_a = new boa();
                  break L6;
                }
              }
              ((tw) this).field_a.a(param0, param1);
              break L0;
            } else {
              ((tw) this).field_a = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var3;
            stackOut_25_1 = new StringBuilder().append("tw.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + ',' + param1 + ')');
        }
    }

    static {
    }
}
