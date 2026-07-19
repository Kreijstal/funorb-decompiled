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
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4_int = 0;
        kaa var4 = null;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                    L4: {
                      if (var4_int >= var3_int) {
                        break L4;
                      } else {
                        this.field_A[var4_int] = wt.a(kha.b(param0, 17404), (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
                        var4_int++;
                        if (var6 == 0) {
                          continue L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    var4 = new kaa(mj.field_J, 0, 1);
                    this.field_z = new rj[1 + var3_int];
                    var5 = 0;
                    L5: while (true) {
                      L6: {
                        if (var5 >= var3_int) {
                          this.field_z[var3_int] = new rj(ll.field_h, (qc) (this));
                          this.field_z[var3_int].field_r = (isa) ((Object) var4);
                          this.field_z[var3_int].a((byte) -31, 100, 15, 0, 20 - -(var3_int * 16) + 16);
                          this.a(this.field_z[var3_int], -1);
                          break L6;
                        } else {
                          this.field_z[var5] = new rj(this.field_A[var5], (qc) (this));
                          this.field_z[var5].field_r = (isa) ((Object) var4);
                          this.field_z[var5].field_q = qla.field_i;
                          this.field_z[var5].a((byte) -31, 80, 15, 0, 20 + 16 * var5);
                          this.a(this.field_z[var5], param0 ^ -13598);
                          var5++;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            continue L5;
                          }
                        }
                      }
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L7: {
            var3 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) (var3);
            stackOut_18_1 = new StringBuilder().append("laa.D(").append(param0).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        rj stackIn_6_0 = null;
        rj stackIn_6_1 = null;
        rj stackIn_11_0 = null;
        rj stackIn_11_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        rj stackOut_5_0 = null;
        rj stackOut_5_1 = null;
        rj stackOut_10_0 = null;
        rj stackOut_10_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 > 44) {
              var6_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_int >= this.field_A.length) {
                      break L3;
                    } else {
                      stackOut_5_0 = this.field_z[var6_int];
                      stackOut_5_1 = (rj) (param2);
                      stackIn_11_0 = stackOut_5_0;
                      stackIn_11_1 = stackOut_5_1;
                      stackIn_6_0 = stackOut_5_0;
                      stackIn_6_1 = stackOut_5_1;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_6_0 == stackIn_6_1) {
                            this.field_w.a(this.field_A[var6_int], 38);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var6_int++;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = (rj) (param2);
                  stackOut_10_1 = this.field_z[this.field_A.length];
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                }
                L5: {
                  if (stackIn_11_0 != stackIn_11_1) {
                    break L5;
                  } else {
                    this.field_w.a(10000536);
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("laa.M(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int discarded$0 = 0;
        super.a(param0, param1, param2, param3);
        if (!(-1 == (param3 ^ -1))) {
            return;
        }
        il var5 = mj.field_J;
        if (null != this.field_A) {
            discarded$0 = var5.a(ch.field_e, param0 - -this.field_i, param1 + this.field_n, this.field_m, 20, 16777215, -1, 0, 0, var5.field_k + var5.field_w);
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
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_99_0 = 0;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        RuntimeException stackIn_102_0 = null;
        StringBuilder stackIn_102_1 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        String stackIn_103_2 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_100_0 = null;
        StringBuilder stackOut_100_1 = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        String stackOut_102_2 = null;
        RuntimeException stackOut_101_0 = null;
        StringBuilder stackOut_101_1 = null;
        String stackOut_101_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        RuntimeException stackOut_105_0 = null;
        StringBuilder stackOut_105_1 = null;
        String stackOut_105_2 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var6_int = -param3 + param1;
            if (param5 == -4) {
              var7 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var7 >= var6_int) {
                      break L3;
                    } else {
                      var8 = param4.charAt(param3 + var7);
                      stackOut_6_0 = var8 ^ -1;
                      stackIn_99_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var9 != 0) {
                        break L2;
                      } else {
                        L4: {
                          L5: {
                            L6: {
                              L7: {
                                if (stackIn_7_0 >= -1) {
                                  break L7;
                                } else {
                                  if (var8 < 128) {
                                    break L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              if (var8 < 160) {
                                break L5;
                              } else {
                                if (var8 > 255) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                            param2[param0 - -var7] = (byte)var8;
                            if (var9 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                          L8: {
                            if (8364 != var8) {
                              break L8;
                            } else {
                              param2[var7 + param0] = (byte)-128;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (var8 != 8218) {
                              break L9;
                            } else {
                              param2[param0 - -var7] = (byte)-126;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L9;
                              }
                            }
                          }
                          L10: {
                            if (var8 == 402) {
                              break L10;
                            } else {
                              L11: {
                                if (var8 == 8222) {
                                  break L11;
                                } else {
                                  L12: {
                                    if (var8 == 8230) {
                                      break L12;
                                    } else {
                                      L13: {
                                        if (var8 == 8224) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (var8 != 8225) {
                                              break L14;
                                            } else {
                                              param2[var7 + param0] = (byte)-121;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          L15: {
                                            if (var8 != 710) {
                                              break L15;
                                            } else {
                                              param2[var7 + param0] = (byte)-120;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L15;
                                              }
                                            }
                                          }
                                          L16: {
                                            if (var8 != 8240) {
                                              break L16;
                                            } else {
                                              param2[param0 + var7] = (byte)-119;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          L17: {
                                            if (var8 == 352) {
                                              break L17;
                                            } else {
                                              L18: {
                                                if (var8 == 8249) {
                                                  break L18;
                                                } else {
                                                  L19: {
                                                    if (var8 != 338) {
                                                      break L19;
                                                    } else {
                                                      param2[var7 + param0] = (byte)-116;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L19;
                                                      }
                                                    }
                                                  }
                                                  L20: {
                                                    if (var8 == 381) {
                                                      break L20;
                                                    } else {
                                                      L21: {
                                                        if (var8 != 8216) {
                                                          break L21;
                                                        } else {
                                                          param2[param0 - -var7] = (byte)-111;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L21;
                                                          }
                                                        }
                                                      }
                                                      L22: {
                                                        if (var8 != 8217) {
                                                          break L22;
                                                        } else {
                                                          param2[var7 + param0] = (byte)-110;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L22;
                                                          }
                                                        }
                                                      }
                                                      L23: {
                                                        if (8220 != var8) {
                                                          break L23;
                                                        } else {
                                                          param2[var7 + param0] = (byte)-109;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L23;
                                                          }
                                                        }
                                                      }
                                                      L24: {
                                                        if (var8 == 8221) {
                                                          break L24;
                                                        } else {
                                                          L25: {
                                                            if (var8 == 8226) {
                                                              break L25;
                                                            } else {
                                                              L26: {
                                                                if (8211 != var8) {
                                                                  break L26;
                                                                } else {
                                                                  param2[param0 - -var7] = (byte)-106;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L26;
                                                                  }
                                                                }
                                                              }
                                                              L27: {
                                                                if (var8 == 8212) {
                                                                  break L27;
                                                                } else {
                                                                  L28: {
                                                                    if (var8 == 732) {
                                                                      break L28;
                                                                    } else {
                                                                      L29: {
                                                                        if (var8 == 8482) {
                                                                          break L29;
                                                                        } else {
                                                                          L30: {
                                                                            if (var8 != 353) {
                                                                              break L30;
                                                                            } else {
                                                                              param2[param0 + var7] = (byte)-102;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L30;
                                                                              }
                                                                            }
                                                                          }
                                                                          L31: {
                                                                            if (8250 != var8) {
                                                                              break L31;
                                                                            } else {
                                                                              param2[param0 + var7] = (byte)-101;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L31;
                                                                              }
                                                                            }
                                                                          }
                                                                          L32: {
                                                                            if (var8 != 339) {
                                                                              break L32;
                                                                            } else {
                                                                              param2[param0 - -var7] = (byte)-100;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L32;
                                                                              }
                                                                            }
                                                                          }
                                                                          L33: {
                                                                            if (382 != var8) {
                                                                              break L33;
                                                                            } else {
                                                                              param2[param0 - -var7] = (byte)-98;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L33;
                                                                              }
                                                                            }
                                                                          }
                                                                          L34: {
                                                                            if (var8 == 376) {
                                                                              break L34;
                                                                            } else {
                                                                              param2[var7 + param0] = (byte)63;
                                                                              if (var9 == 0) {
                                                                                break L4;
                                                                              } else {
                                                                                break L34;
                                                                              }
                                                                            }
                                                                          }
                                                                          param2[param0 + var7] = (byte)-97;
                                                                          if (var9 == 0) {
                                                                            break L4;
                                                                          } else {
                                                                            break L29;
                                                                          }
                                                                        }
                                                                      }
                                                                      param2[param0 - -var7] = (byte)-103;
                                                                      if (var9 == 0) {
                                                                        break L4;
                                                                      } else {
                                                                        break L28;
                                                                      }
                                                                    }
                                                                  }
                                                                  param2[param0 - -var7] = (byte)-104;
                                                                  if (var9 == 0) {
                                                                    break L4;
                                                                  } else {
                                                                    break L27;
                                                                  }
                                                                }
                                                              }
                                                              param2[param0 + var7] = (byte)-105;
                                                              if (var9 == 0) {
                                                                break L4;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                          }
                                                          param2[var7 + param0] = (byte)-107;
                                                          if (var9 == 0) {
                                                            break L4;
                                                          } else {
                                                            break L24;
                                                          }
                                                        }
                                                      }
                                                      param2[var7 + param0] = (byte)-108;
                                                      if (var9 == 0) {
                                                        break L4;
                                                      } else {
                                                        break L20;
                                                      }
                                                    }
                                                  }
                                                  param2[var7 + param0] = (byte)-114;
                                                  if (var9 == 0) {
                                                    break L4;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                              }
                                              param2[var7 + param0] = (byte)-117;
                                              if (var9 == 0) {
                                                break L4;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          param2[var7 + param0] = (byte)-118;
                                          if (var9 == 0) {
                                            break L4;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      param2[param0 + var7] = (byte)-122;
                                      if (var9 == 0) {
                                        break L4;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  param2[var7 + param0] = (byte)-123;
                                  if (var9 == 0) {
                                    break L4;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              param2[var7 + param0] = (byte)-124;
                              if (var9 == 0) {
                                break L4;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param2[param0 + var7] = (byte)-125;
                          break L4;
                        }
                        var7++;
                        if (var9 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_98_0 = var6_int;
                  stackIn_99_0 = stackOut_98_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 49;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L35: {
            var6 = decompiledCaughtException;
            stackOut_100_0 = (RuntimeException) (var6);
            stackOut_100_1 = new StringBuilder().append("laa.E(").append(param0).append(',').append(param1).append(',');
            stackIn_102_0 = stackOut_100_0;
            stackIn_102_1 = stackOut_100_1;
            stackIn_101_0 = stackOut_100_0;
            stackIn_101_1 = stackOut_100_1;
            if (param2 == null) {
              stackOut_102_0 = (RuntimeException) ((Object) stackIn_102_0);
              stackOut_102_1 = (StringBuilder) ((Object) stackIn_102_1);
              stackOut_102_2 = "null";
              stackIn_103_0 = stackOut_102_0;
              stackIn_103_1 = stackOut_102_1;
              stackIn_103_2 = stackOut_102_2;
              break L35;
            } else {
              stackOut_101_0 = (RuntimeException) ((Object) stackIn_101_0);
              stackOut_101_1 = (StringBuilder) ((Object) stackIn_101_1);
              stackOut_101_2 = "{...}";
              stackIn_103_0 = stackOut_101_0;
              stackIn_103_1 = stackOut_101_1;
              stackIn_103_2 = stackOut_101_2;
              break L35;
            }
          }
          L36: {
            stackOut_103_0 = (RuntimeException) ((Object) stackIn_103_0);
            stackOut_103_1 = ((StringBuilder) (Object) stackIn_103_1).append(stackIn_103_2).append(',').append(param3).append(',');
            stackIn_105_0 = stackOut_103_0;
            stackIn_105_1 = stackOut_103_1;
            stackIn_104_0 = stackOut_103_0;
            stackIn_104_1 = stackOut_103_1;
            if (param4 == null) {
              stackOut_105_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackOut_105_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackOut_105_2 = "null";
              stackIn_106_0 = stackOut_105_0;
              stackIn_106_1 = stackOut_105_1;
              stackIn_106_2 = stackOut_105_2;
              break L36;
            } else {
              stackOut_104_0 = (RuntimeException) ((Object) stackIn_104_0);
              stackOut_104_1 = (StringBuilder) ((Object) stackIn_104_1);
              stackOut_104_2 = "{...}";
              stackIn_106_0 = stackOut_104_0;
              stackIn_106_1 = stackOut_104_1;
              stackIn_106_2 = stackOut_104_2;
              break L36;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_99_0;
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
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_11_0 = 0;
        boolean stackOut_9_0 = false;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (-99 == (param2 ^ -1)) {
                stackOut_6_0 = this.b(param1, (byte) -120);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param2 != 99) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackOut_9_0 = this.a(param1, (byte) -9);
                  stackIn_10_0 = stackOut_9_0;
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
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("laa.P(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L1;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
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
