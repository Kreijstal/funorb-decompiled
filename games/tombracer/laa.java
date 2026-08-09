/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class laa extends b implements tsa {
    private String[] field_A;
    static lqa field_x;
    private mia field_w;
    static java.awt.Font field_y;
    private rj[] field_z;

    final void a(int param0, String[] param1) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4_int = 0;
        kaa var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_u.d(param0 + -13589);
              if (param1 == null) {
                break L1;
              } else {
                if (param1.length == 0) {
                  break L1;
                } else {
                  L2: {
                    if (param0 == 13597) {
                      break L2;
                    } else {
                      field_y = (java.awt.Font) null;
                      break L2;
                    }
                  }
                  var3_int = param1.length;
                  this.field_A = new String[var3_int];
                  var4_int = 0;
                  L3: while (true) {
                    if (var4_int >= var3_int) {
                      var4 = new kaa(mj.field_J, 0, 1);
                      this.field_z = new rj[1 + var3_int];
                      var5 = 0;
                      L4: while (true) {
                        if (var5 >= var3_int) {
                          this.field_z[var3_int] = new rj(ll.field_h, (qc) (this));
                          this.field_z[var3_int].field_r = (isa) ((Object) var4);
                          this.field_z[var3_int].a((byte) -31, 100, 15, 0, 20 - -(var3_int * 16) + 16);
                          this.a(this.field_z[var3_int], -1);
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          this.field_z[var5] = new rj(this.field_A[var5], (qc) (this));
                          this.field_z[var5].field_r = (isa) ((Object) var4);
                          this.field_z[var5].field_q = qla.field_i;
                          this.field_z[var5].a((byte) -31, 80, 15, 0, 20 + 16 * var5);
                          this.a(this.field_z[var5], param0 ^ -13598);
                          var5++;
                          continue L4;
                        }
                      }
                    } else {
                      this.field_A[var4_int] = wt.a(kha.b(param0, 17404), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                      var4_int++;
                      continue L3;
                    }
                  }
                }
              }
            }
            this.field_A = null;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var3);

            stackIn_18_1 = new StringBuilder().append("laa.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 > 44) {
              var6_int = 0;
              L1: while (true) {
                if (var6_int >= this.field_A.length) {
                  L2: {
                    if (param2 != this.field_z[this.field_A.length]) {
                      break L2;
                    } else {
                      this.field_w.a(10000536);
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    if (this.field_z[var6_int] == param2) {
                      this.field_w.a(this.field_A[var6_int], 38);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var6);

            stackIn_14_1 = new StringBuilder().append("laa.M(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        il var5 = mj.field_J;
        if (null != this.field_A) {
            var5.a(ch.field_e, param0 - -this.field_i, param1 + this.field_n, this.field_m, 20, 16777215, -1, 0, 0, var5.field_k + var5.field_w);
        }
    }

    public static void a(int param0) {
        field_y = null;
        field_x = null;
        if (param0 != 16964) {
            laa.a(-107);
        }
    }

    final static int a(int param0, int param1, byte[] param2, int param3, CharSequence param4, byte param5) {
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = -param3 + param1;
            if (param5 == -4) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6_int) {
                  stackIn_70_0 = var6_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param4.charAt(param3 + var7);
                        if (var8 <= 0) {
                          break L4;
                        } else {
                          if (var8 < 128) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (var8 < 160) {
                          break L5;
                        } else {
                          if (var8 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (8364 != var8) {
                        if (var8 != 8218) {
                          if (var8 == 402) {
                            param2[param0 + var7] = (byte)-125;
                            break L2;
                          } else {
                            if (var8 == 8222) {
                              param2[var7 + param0] = (byte)-124;
                              break L2;
                            } else {
                              if (var8 == 8230) {
                                param2[var7 + param0] = (byte)-123;
                                break L2;
                              } else {
                                if (var8 == 8224) {
                                  param2[param0 + var7] = (byte)-122;
                                  break L2;
                                } else {
                                  if (var8 != 8225) {
                                    if (var8 != 710) {
                                      if (var8 != 8240) {
                                        if (var8 == 352) {
                                          param2[var7 + param0] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var8 == 8249) {
                                            param2[var7 + param0] = (byte)-117;
                                            break L2;
                                          } else {
                                            if (var8 != 338) {
                                              if (var8 == 381) {
                                                param2[var7 + param0] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var8 != 8216) {
                                                  if (var8 != 8217) {
                                                    if (8220 != var8) {
                                                      if (var8 == 8221) {
                                                        param2[var7 + param0] = (byte)-108;
                                                        break L2;
                                                      } else {
                                                        if (var8 == 8226) {
                                                          param2[var7 + param0] = (byte)-107;
                                                          break L2;
                                                        } else {
                                                          if (8211 != var8) {
                                                            if (var8 == 8212) {
                                                              param2[param0 + var7] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (var8 == 732) {
                                                                param2[param0 - -var7] = (byte)-104;
                                                                break L2;
                                                              } else {
                                                                if (var8 == 8482) {
                                                                  param2[param0 - -var7] = (byte)-103;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 != 353) {
                                                                    if (8250 != var8) {
                                                                      if (var8 != 339) {
                                                                        if (382 != var8) {
                                                                          if (var8 == 376) {
                                                                            param2[param0 + var7] = (byte)-97;
                                                                            break L2;
                                                                          } else {
                                                                            param2[var7 + param0] = (byte)63;
                                                                            break L2;
                                                                          }
                                                                        } else {
                                                                          param2[param0 - -var7] = (byte)-98;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param2[param0 - -var7] = (byte)-100;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      param2[param0 + var7] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param2[param0 + var7] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            param2[param0 - -var7] = (byte)-106;
                                                            break L2;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param2[var7 + param0] = (byte)-109;
                                                      break L2;
                                                    }
                                                  } else {
                                                    param2[var7 + param0] = (byte)-110;
                                                    break L2;
                                                  }
                                                } else {
                                                  param2[param0 - -var7] = (byte)-111;
                                                  break L2;
                                                }
                                              }
                                            } else {
                                              param2[var7 + param0] = (byte)-116;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        param2[param0 + var7] = (byte)-119;
                                        break L2;
                                      }
                                    } else {
                                      param2[var7 + param0] = (byte)-120;
                                      break L2;
                                    }
                                  } else {
                                    param2[var7 + param0] = (byte)-121;
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          param2[param0 - -var7] = (byte)-126;
                          break L2;
                        }
                      } else {
                        param2[var7 + param0] = (byte)-128;
                        break L2;
                      }
                    }
                    param2[param0 - -var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 49;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("laa.E(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L6;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L7;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_74_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_74_0), stackIn_77_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    laa(mia param0) {
        super(0, 0, 0, 0, (isa) null);
        try {
            this.field_w = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "laa.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackIn_7_0 = this.b(param1, (byte) -120);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 != 99) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(param1, (byte) -9);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("laa.P(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    static {
    }
}
