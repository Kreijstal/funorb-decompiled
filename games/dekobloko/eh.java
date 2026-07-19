/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class eh {
    int field_g;
    int[] field_f;
    int field_i;
    java.awt.Image field_c;
    static jc field_b;
    static boolean[][] field_h;
    static String field_e;
    static String field_d;
    static ni field_j;
    static int field_a;

    final void a(byte param0) {
        if (param0 > -82) {
            this.a((byte) 23);
        }
        hk.a(this.field_f, this.field_g, this.field_i);
    }

    abstract void a(int param0, byte param1, int param2, java.awt.Component param3);

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$1 = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        wl var16 = null;
        wl var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var15 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -72) {
                break L1;
              } else {
                field_a = 89;
                break L1;
              }
            }
            var16 = new wl(param1);
            var17 = var16;
            var17.field_n = -2 + param1.length;
            ec.field_g = var17.e(3);
            da.field_d = new boolean[ec.field_g];
            sg.field_d = new int[ec.field_g];
            fh.field_a = new int[ec.field_g];
            tm.field_a = new int[ec.field_g];
            hc.field_c = new int[ec.field_g];
            pd.field_e = new byte[ec.field_g][];
            tc.field_Nb = new byte[ec.field_g][];
            var17.field_n = -(ec.field_g * 8) + (param1.length - 7);
            ed.field_f = var17.e(3);
            i.field_d = var17.e(3);
            var3 = 1 + (var17.d((byte) -104) & 255);
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var4 >= ec.field_g) {
                    break L4;
                  } else {
                    sg.field_d[var4] = var16.e(qm.b((int) param0, -69));
                    var4++;
                    if (var15 != 0) {
                      break L3;
                    } else {
                      if (var15 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                var4 = 0;
                break L3;
              }
              L5: while (true) {
                L6: {
                  L7: {
                    if (ec.field_g <= var4) {
                      break L7;
                    } else {
                      fh.field_a[var4] = var16.e(qm.b((int) param0, -69));
                      var4++;
                      if (var15 != 0) {
                        break L6;
                      } else {
                        if (var15 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L6;
                }
                L8: while (true) {
                  L9: {
                    L10: {
                      if (var4 >= ec.field_g) {
                        break L10;
                      } else {
                        tm.field_a[var4] = var16.e(3);
                        var4++;
                        if (var15 != 0) {
                          break L9;
                        } else {
                          if (var15 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    var4 = 0;
                    break L9;
                  }
                  L11: while (true) {
                    L12: {
                      L13: {
                        if (ec.field_g <= var4) {
                          break L13;
                        } else {
                          hc.field_c[var4] = var16.e(3);
                          var4++;
                          if (var15 != 0) {
                            break L12;
                          } else {
                            if (var15 == 0) {
                              continue L11;
                            } else {
                              break L13;
                            }
                          }
                        }
                      }
                      var17.field_n = -(3 * (var3 + -1)) + (param1.length - (7 + ec.field_g * 8));
                      mb.field_d = new int[var3];
                      break L12;
                    }
                    var4 = 1;
                    L14: while (true) {
                      L15: {
                        L16: {
                          L17: {
                            if (var3 <= var4) {
                              var17.field_n = 0;
                              var4 = 0;
                              L18: while (true) {
                                stackOut_32_0 = ec.field_g;
                                stackIn_33_0 = stackOut_32_0;
                                L19: while (true) {
                                  stackOut_33_0 = stackIn_33_0;
                                  stackOut_33_1 = var4;
                                  stackIn_34_0 = stackOut_33_0;
                                  stackIn_34_1 = stackOut_33_1;
                                  L20: while (true) {
                                    if (stackIn_34_0 <= stackIn_34_1) {
                                      break L15;
                                    } else {
                                      var5 = tm.field_a[var4];
                                      var6 = hc.field_c[var4];
                                      var7 = var5 * var6;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      tc.field_Nb[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      pd.field_e[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.d((byte) -35);
                                      if (var15 != 0) {
                                        break L16;
                                      } else {
                                        L21: {
                                          L22: {
                                            L23: {
                                              if ((var11 & 1) != 0) {
                                                break L23;
                                              } else {
                                                var12 = 0;
                                                L24: while (true) {
                                                  L25: {
                                                    if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                      break L25;
                                                    } else {
                                                      var8[var12] = var16.g((byte) -127);
                                                      var12++;
                                                      if (var15 != 0) {
                                                        break L21;
                                                      } else {
                                                        if (var15 == 0) {
                                                          continue L24;
                                                        } else {
                                                          break L25;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if ((var11 & 2) == 0) {
                                                    break L22;
                                                  } else {
                                                    var12 = 0;
                                                    L26: while (true) {
                                                      if (var12 >= var7) {
                                                        if (var15 == 0) {
                                                          break L22;
                                                        } else {
                                                          break L23;
                                                        }
                                                      } else {
                                                        dupTemp$1 = var16.g((byte) -119);
                                                        var9[var12] = dupTemp$1;
                                                        var13 = dupTemp$1;
                                                        stackOut_45_0 = var10;
                                                        stackOut_45_1 = var13 ^ -1;
                                                        stackIn_34_0 = stackOut_45_0;
                                                        stackIn_34_1 = stackOut_45_1;
                                                        stackIn_46_0 = stackOut_45_0;
                                                        stackIn_46_1 = stackOut_45_1;
                                                        if (var15 != 0) {
                                                          continue L20;
                                                        } else {
                                                          L27: {
                                                            stackOut_46_0 = stackIn_46_0;
                                                            stackIn_48_0 = stackOut_46_0;
                                                            stackIn_47_0 = stackOut_46_0;
                                                            if (stackIn_46_1 == 0) {
                                                              stackOut_48_0 = stackIn_48_0;
                                                              stackOut_48_1 = 0;
                                                              stackIn_49_0 = stackOut_48_0;
                                                              stackIn_49_1 = stackOut_48_1;
                                                              break L27;
                                                            } else {
                                                              stackOut_47_0 = stackIn_47_0;
                                                              stackOut_47_1 = 1;
                                                              stackIn_49_0 = stackOut_47_0;
                                                              stackIn_49_1 = stackOut_47_1;
                                                              break L27;
                                                            }
                                                          }
                                                          var10 = stackIn_49_0 | stackIn_49_1;
                                                          var12++;
                                                          continue L26;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var12 = 0;
                                            L28: while (true) {
                                              L29: {
                                                if (var5 <= var12) {
                                                  stackOut_61_0 = 2 & var11;
                                                  stackIn_62_0 = stackOut_61_0;
                                                  break L29;
                                                } else {
                                                  stackOut_53_0 = 0;
                                                  stackIn_62_0 = stackOut_53_0;
                                                  stackIn_54_0 = stackOut_53_0;
                                                  if (var15 != 0) {
                                                    break L29;
                                                  } else {
                                                    var13 = stackIn_54_0;
                                                    L30: while (true) {
                                                      L31: {
                                                        if (var13 >= var6) {
                                                          var12++;
                                                          break L31;
                                                        } else {
                                                          var8[var13 * var5 + var12] = var16.g((byte) -124);
                                                          var13++;
                                                          if (var15 != 0) {
                                                            break L31;
                                                          } else {
                                                            continue L30;
                                                          }
                                                        }
                                                      }
                                                      continue L28;
                                                    }
                                                  }
                                                }
                                              }
                                              if (stackIn_62_0 != 0) {
                                                var12 = 0;
                                                if (var5 <= var12) {
                                                  break L22;
                                                } else {
                                                  stackOut_65_0 = 0;
                                                  stackIn_33_0 = stackOut_65_0;
                                                  continue L19;
                                                }
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                          da.field_d[var4] = var10 != 0;
                                          var4++;
                                          break L21;
                                        }
                                        if (var15 == 0) {
                                          continue L18;
                                        } else {
                                          break L17;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              mb.field_d[var4] = var16.h(param0 + 65352);
                              stackOut_26_0 = 0;
                              stackOut_26_1 = mb.field_d[var4];
                              stackIn_34_0 = stackOut_26_0;
                              stackIn_34_1 = stackOut_26_1;
                              stackIn_27_0 = stackOut_26_0;
                              stackIn_27_1 = stackOut_26_1;
                              if (var15 != 0) {
                                L32: while (true) {
                                  if (stackIn_34_0 <= stackIn_34_1) {
                                    break L15;
                                  } else {
                                    var5 = tm.field_a[var4];
                                    var6 = hc.field_c[var4];
                                    var7 = var5 * var6;
                                    var20 = new byte[var7];
                                    var18 = var20;
                                    var8 = var18;
                                    tc.field_Nb[var4] = var20;
                                    var21 = new byte[var7];
                                    var19 = var21;
                                    var9 = var19;
                                    pd.field_e[var4] = var21;
                                    var10 = 0;
                                    var11 = var17.d((byte) -35);
                                    if (var15 != 0) {
                                      break L16;
                                    } else {
                                      L33: {
                                        L34: {
                                          L35: {
                                            L36: {
                                              if ((var11 & 1) != 0) {
                                                break L36;
                                              } else {
                                                var12 = 0;
                                                L37: while (true) {
                                                  L38: {
                                                    if ((var7 ^ -1) >= (var12 ^ -1)) {
                                                      break L38;
                                                    } else {
                                                      var8[var12] = var16.g((byte) -127);
                                                      var12++;
                                                      if (var15 != 0) {
                                                        break L34;
                                                      } else {
                                                        if (var15 == 0) {
                                                          continue L37;
                                                        } else {
                                                          break L38;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  if ((var11 & 2) == 0) {
                                                    break L35;
                                                  } else {
                                                    var12 = 0;
                                                    L39: while (true) {
                                                      if (var12 >= var7) {
                                                        if (var15 == 0) {
                                                          break L35;
                                                        } else {
                                                          break L36;
                                                        }
                                                      } else {
                                                        dupTemp$1 = var16.g((byte) -119);
                                                        var9[var12] = dupTemp$1;
                                                        var13 = dupTemp$1;
                                                        stackOut_45_0 = var10;
                                                        stackOut_45_1 = var13 ^ -1;
                                                        stackIn_34_0 = stackOut_45_0;
                                                        stackIn_34_1 = stackOut_45_1;
                                                        stackIn_46_0 = stackOut_45_0;
                                                        stackIn_46_1 = stackOut_45_1;
                                                        if (var15 != 0) {
                                                          continue L32;
                                                        } else {
                                                          L40: {
                                                            stackOut_46_0 = stackIn_46_0;
                                                            stackIn_48_0 = stackOut_46_0;
                                                            stackIn_47_0 = stackOut_46_0;
                                                            if (stackIn_46_1 == 0) {
                                                              stackOut_48_0 = stackIn_48_0;
                                                              stackOut_48_1 = 0;
                                                              stackIn_49_0 = stackOut_48_0;
                                                              stackIn_49_1 = stackOut_48_1;
                                                              break L40;
                                                            } else {
                                                              stackOut_47_0 = stackIn_47_0;
                                                              stackOut_47_1 = 1;
                                                              stackIn_49_0 = stackOut_47_0;
                                                              stackIn_49_1 = stackOut_47_1;
                                                              break L40;
                                                            }
                                                          }
                                                          var10 = stackIn_49_0 | stackIn_49_1;
                                                          var12++;
                                                          continue L39;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            var12 = 0;
                                            L41: while (true) {
                                              L42: {
                                                if (var5 <= var12) {
                                                  stackOut_61_0 = 2 & var11;
                                                  stackIn_62_0 = stackOut_61_0;
                                                  break L42;
                                                } else {
                                                  stackOut_53_0 = 0;
                                                  stackIn_62_0 = stackOut_53_0;
                                                  stackIn_54_0 = stackOut_53_0;
                                                  if (var15 != 0) {
                                                    break L42;
                                                  } else {
                                                    var13 = stackIn_54_0;
                                                    L43: while (true) {
                                                      L44: {
                                                        if (var13 >= var6) {
                                                          var12++;
                                                          break L44;
                                                        } else {
                                                          var8[var13 * var5 + var12] = var16.g((byte) -124);
                                                          var13++;
                                                          if (var15 != 0) {
                                                            break L44;
                                                          } else {
                                                            continue L43;
                                                          }
                                                        }
                                                      }
                                                      continue L41;
                                                    }
                                                  }
                                                }
                                              }
                                              if (stackIn_62_0 != 0) {
                                                var12 = 0;
                                                if (var5 <= var12) {
                                                  break L35;
                                                } else {
                                                  stackOut_65_0 = 0;
                                                  stackIn_33_0 = stackOut_65_0;
                                                  break L33;
                                                }
                                              } else {
                                                break L35;
                                              }
                                            }
                                          }
                                          da.field_d[var4] = var10 != 0;
                                          var4++;
                                          break L34;
                                        }
                                        if (var15 == 0) {
                                          stackOut_32_0 = ec.field_g;
                                          stackIn_33_0 = stackOut_32_0;
                                          break L33;
                                        } else {
                                          break L17;
                                        }
                                      }
                                      stackOut_33_0 = stackIn_33_0;
                                      stackOut_33_1 = var4;
                                      stackIn_34_0 = stackOut_33_0;
                                      stackIn_34_1 = stackOut_33_1;
                                      continue L32;
                                    }
                                  }
                                }
                              } else {
                                L45: {
                                  if (stackIn_27_0 == stackIn_27_1) {
                                    mb.field_d[var4] = 1;
                                    break L45;
                                  } else {
                                    break L45;
                                  }
                                }
                                var4++;
                                continue L14;
                              }
                            }
                          }
                          break L15;
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                      decompiledRegionSelector0 = 0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L46: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var2);
            stackOut_70_1 = new StringBuilder().append("eh.M(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L46;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L46;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(byte param0, java.awt.Graphics param1, int param2, int param3);

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_h = (boolean[][]) null;
        field_b = null;
        field_j = null;
        if (param0 != 24744) {
            eh.a(125);
        }
    }

    static {
        field_b = new jc();
        field_e = "Shape feedback:";
    }
}
