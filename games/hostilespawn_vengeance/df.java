/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df {
    static String field_b;
    static bd[] field_g;
    private boolean field_h;
    static bd field_a;
    private int[] field_i;
    static String field_e;
    static int field_c;
    private int field_d;
    static bd field_j;
    private int field_f;

    final int b(int param0) {
        if (param0 != -25) {
            ((df) this).field_f = 98;
        }
        return 1 + ((df) this).field_f;
    }

    private final int b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          if (param0 == 0) {
            break L0;
          } else {
            df.a(-32);
            break L0;
          }
        }
        var3 = ((df) this).field_i.length;
        L1: while (true) {
          if (param1 < var3) {
            return var3;
          } else {
            if (!((df) this).field_h) {
              var3 = var3 + ((df) this).field_d;
              continue L1;
            } else {
              if (var3 != 0) {
                var3 = var3 * ((df) this).field_d;
                continue L1;
              } else {
                var3 = 1;
                continue L1;
              }
            }
          }
        }
    }

    final void b(boolean param0, int param1) {
        if (!param0) {
            int discarded$0 = this.b(49, 5);
        }
        this.a(-80, 1 + ((df) this).field_f, param1);
    }

    final void a(int param0, byte param1) {
        L0: {
          if (param0 < 0) {
            break L0;
          } else {
            if (param0 > ((df) this).field_f) {
              break L0;
            } else {
              if (param1 != 35) {
                return;
              } else {
                L1: {
                  if (((df) this).field_f == param0) {
                    break L1;
                  } else {
                    kf.a(((df) this).field_i, param0 + 1, ((df) this).field_i, param0, ((df) this).field_f + -param0);
                    break L1;
                  }
                }
                ((df) this).field_f = ((df) this).field_f - 1;
                return;
              }
            }
          }
        }
        throw new ArrayIndexOutOfBoundsException(param0);
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param1 <= ((df) this).field_f) {
            break L0;
          } else {
            ((df) this).field_f = param1;
            break L0;
          }
        }
        if (param0 > -76) {
          return;
        } else {
          L1: {
            if (((df) this).field_i.length <= param1) {
              this.a(true, param1);
              break L1;
            } else {
              break L1;
            }
          }
          ((df) this).field_i[param1] = param2;
          return;
        }
    }

    final int a(int param0, int param1) {
        if (((df) this).field_f < param0) {
          throw new ArrayIndexOutOfBoundsException(param0);
        } else {
          if (param1 != -2262) {
            return -78;
          } else {
            return ((df) this).field_i[param0];
          }
        }
    }

    final static void a(int param0, oj param1, oc param2, oc param3, int param4, int param5, double param6, oj param7, oc param8, double param9) {
        RuntimeException var12 = null;
        int var12_int = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        oj var19 = null;
        int var20 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        String stackIn_65_2 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var20 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1.field_i == param0) {
                param1.field_G = 1;
                break L1;
              } else {
                param1.field_G = 2;
                break L1;
              }
            }
            L2: {
              var13 = (int)((-param1.field_l.field_a + ((double)param4 + param9 - (double)param8.field_g)) * 24.0);
              var12_int = (int)(24.0 * (-param1.field_l.field_f + (param6 + (double)param5 - (double)param8.field_e)));
              var14 = 0;
              if (var12_int < -24) {
                break L2;
              } else {
                if (var12_int > 24) {
                  break L2;
                } else {
                  if (var13 < -24) {
                    break L2;
                  } else {
                    if (24 > var13) {
                      param7.field_z = 4;
                      if (!pl.field_l) {
                        if (eh.field_g <= 0) {
                          break L2;
                        } else {
                          ci.a(1, 46);
                          if (1 != uj.field_l) {
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                      } else {
                        pl.field_l = false;
                        param1.field_I = 0;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            L3: {
              if (param1.field_i != 25) {
                L4: {
                  if (param1.field_F <= 0) {
                    break L4;
                  } else {
                    var14 = 1;
                    break L4;
                  }
                }
                if (param1.field_F <= 250) {
                  break L3;
                } else {
                  var14 = 5;
                  break L3;
                }
              } else {
                var14 = 2;
                break L3;
              }
            }
            L5: {
              if (0 != param1.field_F) {
                break L5;
              } else {
                if (param1.field_i == 3) {
                  param1.field_G = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
            }
            L6: {
              if (param1.field_F > 1) {
                param1.field_F = param1.field_F - 1;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (param1.field_h != 0) {
                break L7;
              } else {
                param2.a((byte) 46, param3);
                param2.b(param8, 24161);
                param1.a(225, param2.a(param0 ^ 25127), 3);
                break L7;
              }
            }
            L8: {
              if (1 == param1.field_h) {
                param1.a(225, param1.field_c + 10.0, 4);
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param1.field_h != 2) {
                break L9;
              } else {
                param1.a(param0 + 222, param1.field_c - 10.0, 4);
                break L9;
              }
            }
            L10: {
              int fieldTemp$2 = param1.field_e;
              param1.field_e = param1.field_e - 1;
              if (fieldTemp$2 >= 0) {
                break L10;
              } else {
                L11: {
                  if (param1.field_h == 3) {
                    param1.field_h = (int)(3.0 * Math.random());
                    break L11;
                  } else {
                    param1.field_h = 3;
                    break L11;
                  }
                }
                if (3 != param1.field_i) {
                  L12: {
                    param1.field_e = (int)(5.0 * (50.0 * Math.random()));
                    var15 = param8.field_e;
                    var16 = param8.field_g;
                    var17 = 0;
                    var18 = 1;
                    if (~el.field_j >= ~var18) {
                      break L12;
                    } else {
                      var19 = mm.field_m[var18];
                      if (4 != var19.field_i) {
                        break L12;
                      } else {
                        if (var15 != var19.field_j.field_e) {
                          break L12;
                        } else {
                          if (~var19.field_j.field_g != ~var16) {
                            break L12;
                          } else {
                            var17 = 1;
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  if (var17 == 0) {
                    int fieldTemp$3 = param1.field_v - 1;
                    param1.field_v = param1.field_v - 1;
                    if (fieldTemp$3 < 0) {
                      break L10;
                    } else {
                      mm.field_m[el.field_j] = new oj(param8, 4, rl.field_c);
                      el.field_j = el.field_j + 1;
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                } else {
                  param1.field_e = (int)(Math.random() * 25.0);
                  break L10;
                }
              }
            }
            L13: {
              li.field_r = param1.a(var14, param0, ln.field_a);
              if (!li.field_r[0]) {
                break L13;
              } else {
                if (!li.field_r[1]) {
                  break L13;
                } else {
                  if (param1.field_h == 0) {
                    param1.field_e = (int)(Math.random() * 10.0);
                    param1.field_h = (int)(1.0 + 2.0 * Math.random());
                    break L13;
                  } else {
                    break L13;
                  }
                }
              }
            }
            L14: {
              if (param1.field_i == 3) {
                param1.field_p = param1.field_p + 1;
                if (2 >= param1.field_p) {
                  break L14;
                } else {
                  param1.field_z = param1.field_z + 1;
                  param1.field_p = 0;
                  if (~bf.field_f[1].length < ~param1.field_z) {
                    break L14;
                  } else {
                    param1.field_z = 0;
                    break L14;
                  }
                }
              } else {
                break L14;
              }
            }
            L15: {
              if (param1.field_I > 0) {
                break L15;
              } else {
                param1.c((byte) 44);
                bn.a(3, param1);
                break L15;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var12 = decompiledCaughtException;
            stackOut_62_0 = (RuntimeException) var12;
            stackOut_62_1 = new StringBuilder().append("df.D(").append(param0).append(44);
            stackIn_64_0 = stackOut_62_0;
            stackIn_64_1 = stackOut_62_1;
            stackIn_63_0 = stackOut_62_0;
            stackIn_63_1 = stackOut_62_1;
            if (param1 == null) {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "null";
              stackIn_65_0 = stackOut_64_0;
              stackIn_65_1 = stackOut_64_1;
              stackIn_65_2 = stackOut_64_2;
              break L16;
            } else {
              stackOut_63_0 = (RuntimeException) (Object) stackIn_63_0;
              stackOut_63_1 = (StringBuilder) (Object) stackIn_63_1;
              stackOut_63_2 = "{...}";
              stackIn_65_0 = stackOut_63_0;
              stackIn_65_1 = stackOut_63_1;
              stackIn_65_2 = stackOut_63_2;
              break L16;
            }
          }
          L17: {
            stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
            stackOut_65_1 = ((StringBuilder) (Object) stackIn_65_1).append(stackIn_65_2).append(44);
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param2 == null) {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L17;
            } else {
              stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
              stackOut_66_1 = (StringBuilder) (Object) stackIn_66_1;
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L17;
            }
          }
          L18: {
            stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
            stackOut_68_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_68_2).append(44);
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param3 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L18;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L18;
            }
          }
          L19: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param7 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L19;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L19;
            }
          }
          L20: {
            stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(44);
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param8 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L20;
            } else {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L20;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + 44 + param9 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        int[] var4 = new int[this.b(0, param1)];
        int[] var3 = var4;
        kf.a(((df) this).field_i, 0, var4, 0, ((df) this).field_i.length);
        if (!param0) {
            int discarded$0 = this.b(-28, 87);
        }
        ((df) this).field_i = var4;
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 < 44) {
            field_g = null;
        }
        field_g = null;
        field_a = null;
        field_j = null;
        field_e = null;
    }

    private df() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Moves the marine in relation to the mouse.<br><br><col=ffffff>PRESS THE TAB KEY TO SWITCH KEY LAYOUTS.</col>";
        field_c = 0;
        field_b = "Moves the marine in relation to the map.";
    }
}
