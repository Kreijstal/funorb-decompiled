/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dj {
    private Object[] field_j;
    static vo field_l;
    private int field_d;
    private w field_h;
    static String field_a;
    private boolean field_f;
    static vo field_m;
    static int[] field_g;
    private Object[][] field_c;
    static hi field_e;
    private jh field_b;
    static vn[] field_k;
    static int[] field_i;

    private final synchronized boolean a(int[] param0, int param1, int param2, byte param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        byte[] var10 = null;
        de var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        de var13 = null;
        int var14_int = 0;
        int[] var14 = null;
        int var15_int = 0;
        byte[][] var15 = null;
        int var16 = 0;
        byte[] var16_ref_byte__ = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        byte[] var24 = null;
        int[] stackIn_10_0 = null;
        int[] stackIn_28_0 = null;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_139_0 = 0;
        int[] stackOut_9_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_89_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_138_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_61_0 = 0;
        var22 = ZombieDawn.field_J;
        if (this.b(param2, (byte) -82)) {
          if (((dj) this).field_j[param2] == null) {
            return false;
          } else {
            L0: {
              var5 = ((dj) this).field_b.field_t[param2];
              var6 = ((dj) this).field_b.field_p[param2];
              if (((dj) this).field_c[param2] == null) {
                ((dj) this).field_c[param2] = new Object[((dj) this).field_b.field_d[param2]];
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              L2: {
                L3: {
                  var7 = ((dj) this).field_c[param2];
                  var8 = 1;
                  var9_int = 0;
                  if (var5 <= var9_int) {
                    break L3;
                  } else {
                    stackOut_9_0 = (int[]) var6;
                    stackIn_28_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var22 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_10_0 == null) {
                            break L5;
                          } else {
                            var10_int = var6[var9_int];
                            if (var22 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var10_int = var9_int;
                        break L4;
                      }
                      L6: {
                        if (var7[var10_int] == null) {
                          var8 = 0;
                          if (var22 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        } else {
                          break L6;
                        }
                      }
                      var9_int++;
                      break L3;
                    }
                  }
                }
                if (var8 != 0) {
                  return true;
                } else {
                  L7: {
                    if (param0 == null) {
                      break L7;
                    } else {
                      L8: {
                        if (-1 != (param0[0] ^ -1)) {
                          break L8;
                        } else {
                          if (param0[1] != 0) {
                            break L8;
                          } else {
                            if (0 != param0[2]) {
                              break L8;
                            } else {
                              if (param0[3] == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                      var9 = ag.a(((dj) this).field_j[param2], (byte) 125, true);
                      var10_ref = new de(var9);
                      var10_ref.a(153818020, var10_ref.field_h.length, param0, 5);
                      break L1;
                    }
                  }
                  stackOut_27_0 = ((dj) this).field_j[param2];
                  stackIn_28_0 = (int[]) (Object) stackOut_27_0;
                  break L2;
                }
              }
              var9 = ag.a((Object) (Object) stackIn_28_0, (byte) 88, false);
              break L1;
            }
            L9: {
              if (param3 <= -28) {
                break L9;
              } else {
                var23 = null;
                byte[] discarded$1 = ((dj) this).a((String) ((dj) this).field_j[2], -6, (String) null);
                break L9;
              }
            }
            L10: {
              var24 = va.a((byte) -112, var9);
              var10 = var24;
              if (!((dj) this).field_f) {
                break L10;
              } else {
                ((dj) this).field_j[param2] = null;
                break L10;
              }
            }
            L11: {
              if (1 < var5) {
                break L11;
              } else {
                L12: {
                  L13: {
                    if (var6 == null) {
                      break L13;
                    } else {
                      var11 = var6[0];
                      if (var22 == 0) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  var24 = var10;
                  var11 = 0;
                  break L12;
                }
                L14: {
                  L15: {
                    var24 = var10;
                    if (((dj) this).field_d == 0) {
                      break L15;
                    } else {
                      var7[var11] = (Object) (Object) var24;
                      if (var22 == 0) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  var24 = var10;
                  var7[var11] = el.a((byte) 94, false, var24);
                  break L14;
                }
                if (var22 != 0) {
                  break L11;
                } else {
                  return true;
                }
              }
            }
            var24 = var10;
            if (-3 == (((dj) this).field_d ^ -1)) {
              var11 = var24.length;
              var11--;
              var12 = 255 & var24[var11];
              var11 = var11 - var12 * (var5 * 4);
              var13 = new de(var10);
              var14_int = 0;
              var13.field_j = var11;
              var15_int = 0;
              var16 = 0;
              L16: while (true) {
                L17: {
                  if (var12 <= var16) {
                    stackOut_89_0 = var14_int ^ -1;
                    stackIn_90_0 = stackOut_89_0;
                    break L17;
                  } else {
                    var17 = 0;
                    stackOut_78_0 = 0;
                    stackIn_90_0 = stackOut_78_0;
                    stackIn_79_0 = stackOut_78_0;
                    if (var22 != 0) {
                      break L17;
                    } else {
                      var18 = stackIn_79_0;
                      L18: while (true) {
                        if (var5 <= var18) {
                          var16++;
                          continue L16;
                        } else {
                          L19: {
                            L20: {
                              var17 = var17 + var13.c(100);
                              if (var6 != null) {
                                break L20;
                              } else {
                                var19 = var18;
                                if (var22 == 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            var19 = var6[var18];
                            break L19;
                          }
                          L21: {
                            if (var19 == param1) {
                              var14_int = var14_int + var17;
                              var15_int = var19;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                          var18++;
                          continue L18;
                        }
                      }
                    }
                  }
                }
                if (stackIn_90_0 == -1) {
                  return true;
                } else {
                  var16_ref_byte__ = new byte[var14_int];
                  var14_int = 0;
                  var13.field_j = var11;
                  var17 = 0;
                  var18 = 0;
                  L22: while (true) {
                    L23: {
                      if (var12 <= var18) {
                        L24: {
                          var7[var15_int] = (Object) (Object) var16_ref_byte__;
                          if (var22 == 0) {
                            break L24;
                          } else {
                            var11 = var24.length;
                            var11--;
                            var12 = 255 & var24[var11];
                            var11 = var11 - 4 * (var12 * var5);
                            var13 = new de(var10);
                            var14 = new int[var5];
                            var13.field_j = var11;
                            var15_int = 0;
                            L25: while (true) {
                              L26: {
                                if (var15_int >= var12) {
                                  stackOut_115_0 = var5;
                                  stackIn_116_0 = stackOut_115_0;
                                  break L26;
                                } else {
                                  var16 = 0;
                                  stackOut_109_0 = 0;
                                  stackIn_116_0 = stackOut_109_0;
                                  stackIn_110_0 = stackOut_109_0;
                                  if (var22 != 0) {
                                    break L26;
                                  } else {
                                    var17 = stackIn_110_0;
                                    L27: while (true) {
                                      if (var17 >= var5) {
                                        var15_int++;
                                        continue L25;
                                      } else {
                                        var16 = var16 + var13.c(124);
                                        var14[var17] = var14[var17] + var16;
                                        var17++;
                                        continue L27;
                                      }
                                    }
                                  }
                                }
                              }
                              var15 = new byte[stackIn_116_0][];
                              var16 = 0;
                              L28: while (true) {
                                L29: {
                                  if (var16 >= var5) {
                                    var13.field_j = var11;
                                    var16 = 0;
                                    break L29;
                                  } else {
                                    var15[var16] = new byte[var14[var16]];
                                    var14[var16] = 0;
                                    var16++;
                                    if (var22 != 0) {
                                      break L29;
                                    } else {
                                      continue L28;
                                    }
                                  }
                                }
                                var17 = 0;
                                L30: while (true) {
                                  L31: {
                                    if (var12 <= var17) {
                                      stackOut_130_0 = 0;
                                      stackIn_131_0 = stackOut_130_0;
                                      break L31;
                                    } else {
                                      var18 = 0;
                                      stackOut_124_0 = 0;
                                      stackIn_131_0 = stackOut_124_0;
                                      stackIn_125_0 = stackOut_124_0;
                                      if (var22 != 0) {
                                        break L31;
                                      } else {
                                        var19 = stackIn_125_0;
                                        L32: while (true) {
                                          if (var5 <= var19) {
                                            var17++;
                                            continue L30;
                                          } else {
                                            var18 = var18 + var13.c(-48);
                                            gp.a(var24, var16, var15[var19], var14[var19], var18);
                                            var14[var19] = var14[var19] + var18;
                                            var16 = var16 + var18;
                                            var19++;
                                            continue L32;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var17 = stackIn_131_0;
                                  if (var5 <= var17) {
                                    break L24;
                                  } else {
                                    L33: {
                                      if (var6 == null) {
                                        break L33;
                                      } else {
                                        var18 = var6[var17];
                                        break L33;
                                      }
                                    }
                                    L34: {
                                      var18 = var17;
                                      if (((dj) this).field_d != 0) {
                                        break L34;
                                      } else {
                                        var7[var18] = el.a((byte) 94, false, var15[var17]);
                                        break L34;
                                      }
                                    }
                                    var7[var18] = (Object) (Object) var15[var17];
                                    var17++;
                                    break L24;
                                  }
                                }
                              }
                            }
                          }
                        }
                        stackOut_138_0 = 1;
                        stackIn_139_0 = stackOut_138_0;
                        break L23;
                      } else {
                        var19 = 0;
                        stackOut_95_0 = 0;
                        stackIn_139_0 = stackOut_95_0;
                        stackIn_96_0 = stackOut_95_0;
                        if (var22 != 0) {
                          break L23;
                        } else {
                          var20 = stackIn_96_0;
                          L35: while (true) {
                            if (var20 >= var5) {
                              var18++;
                              continue L22;
                            } else {
                              L36: {
                                L37: {
                                  var19 = var19 + var13.c(-44);
                                  if (var6 == null) {
                                    break L37;
                                  } else {
                                    var21 = var6[var20];
                                    if (var22 == 0) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                var21 = var20;
                                break L36;
                              }
                              L38: {
                                if (var21 == param1) {
                                  gp.a(var10, var17, var16_ref_byte__, var14_int, var19);
                                  var14_int = var14_int + var19;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              var17 = var17 + var19;
                              var20++;
                              continue L35;
                            }
                          }
                        }
                      }
                    }
                    return stackIn_139_0 != 0;
                  }
                }
              }
            } else {
              var11 = var24.length;
              var11--;
              var12 = 255 & var24[var11];
              var11 = var11 - 4 * (var12 * var5);
              var13 = new de(var10);
              var14 = new int[var5];
              var13.field_j = var11;
              var15_int = 0;
              L39: while (true) {
                L40: {
                  if (var15_int >= var12) {
                    stackOut_52_0 = var5;
                    stackIn_53_0 = stackOut_52_0;
                    break L40;
                  } else {
                    var16 = 0;
                    stackOut_46_0 = 0;
                    stackIn_53_0 = stackOut_46_0;
                    stackIn_47_0 = stackOut_46_0;
                    if (var22 != 0) {
                      break L40;
                    } else {
                      var17 = stackIn_47_0;
                      L41: while (true) {
                        if (var17 >= var5) {
                          var15_int++;
                          continue L39;
                        } else {
                          var16 = var16 + var13.c(124);
                          var14[var17] = var14[var17] + var16;
                          var17++;
                          continue L41;
                        }
                      }
                    }
                  }
                }
                var15 = new byte[stackIn_53_0][];
                var16 = 0;
                L42: while (true) {
                  L43: {
                    if (var16 >= var5) {
                      var13.field_j = var11;
                      var16 = 0;
                      break L43;
                    } else {
                      var15[var16] = new byte[var14[var16]];
                      var14[var16] = 0;
                      var16++;
                      if (var22 != 0) {
                        break L43;
                      } else {
                        continue L42;
                      }
                    }
                  }
                  var17 = 0;
                  L44: while (true) {
                    L45: {
                      if (var12 <= var17) {
                        stackOut_67_0 = 0;
                        stackIn_68_0 = stackOut_67_0;
                        break L45;
                      } else {
                        var18 = 0;
                        stackOut_61_0 = 0;
                        stackIn_68_0 = stackOut_61_0;
                        stackIn_62_0 = stackOut_61_0;
                        if (var22 != 0) {
                          break L45;
                        } else {
                          var19 = stackIn_62_0;
                          L46: while (true) {
                            if (var5 <= var19) {
                              var17++;
                              continue L44;
                            } else {
                              var18 = var18 + var13.c(-48);
                              gp.a(var24, var16, var15[var19], var14[var19], var18);
                              var14[var19] = var14[var19] + var18;
                              var16 = var16 + var18;
                              var19++;
                              continue L46;
                            }
                          }
                        }
                      }
                    }
                    L47: {
                      var17 = stackIn_68_0;
                      if (var5 <= var17) {
                        break L47;
                      } else {
                        L48: {
                          if (var6 == null) {
                            break L48;
                          } else {
                            var18 = var6[var17];
                            break L48;
                          }
                        }
                        L49: {
                          var18 = var17;
                          if (((dj) this).field_d != 0) {
                            break L49;
                          } else {
                            var7[var18] = el.a((byte) 94, false, var15[var17]);
                            break L49;
                          }
                        }
                        var7[var18] = (Object) (Object) var15[var17];
                        var17++;
                        break L47;
                      }
                    }
                    return true;
                  }
                }
              }
            }
          }
        } else {
          return false;
        }
    }

    final boolean a(String param0, byte param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (((dj) this).a((byte) 73)) {
          L0: {
            param0 = param0.toLowerCase();
            if (param1 < -9) {
              break L0;
            } else {
              boolean discarded$2 = ((dj) this).a(76, (byte) -89, 2);
              break L0;
            }
          }
          param2 = param2.toLowerCase();
          var6 = (CharSequence) (Object) param0;
          var4 = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
          if (!this.b(var4, (byte) -82)) {
            return false;
          } else {
            var7 = (CharSequence) (Object) param2;
            var5 = ((dj) this).field_b.field_a[var4].a(1, tc.a(var7, 14));
            return ((dj) this).a(var5, (byte) -128, var4);
          }
        } else {
          return false;
        }
    }

    final int d(int param0) {
        if (!((dj) this).a((byte) 73)) {
            return -1;
        }
        if (param0 != -1) {
            field_l = null;
        }
        return ((dj) this).field_b.field_d.length;
    }

    private final synchronized byte[] a(int[] param0, int param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        L0: {
          if (param3 >= 124) {
            break L0;
          } else {
            ((dj) this).field_b = (jh) ((Object[]) ((dj) this).field_j[16])[1];
            break L0;
          }
        }
        if (this.a(param1, param2, 105)) {
          L1: {
            L2: {
              var5 = null;
              if (((dj) this).field_c[param2] == null) {
                break L2;
              } else {
                if (((dj) this).field_c[param2][param1] != null) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            if (this.a(param0, param1, param2, (byte) -57)) {
              break L1;
            } else {
              this.c(4, param2);
              if (this.a(param0, param1, param2, (byte) -85)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (((dj) this).field_c[param2] == null) {
            throw new RuntimeException("");
          } else {
            if (null != ((dj) this).field_c[param2][param1]) {
              var7 = ag.a(((dj) this).field_c[param2][param1], (byte) 98, false);
              var5_array = var7;
              if (var7 == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (var5_array != null) {
                    L4: {
                      if (1 != ((dj) this).field_d) {
                        break L4;
                      } else {
                        ((dj) this).field_c[param2][param1] = null;
                        if (-2 != (((dj) this).field_b.field_d[param2] ^ -1)) {
                          break L3;
                        } else {
                          ((dj) this).field_c[param2] = null;
                          if (ZombieDawn.field_J == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if (((dj) this).field_d != 2) {
                      break L3;
                    } else {
                      ((dj) this).field_c[param2] = null;
                      break L3;
                    }
                  } else {
                    break L3;
                  }
                }
                return var5_array;
              }
            } else {
              L5: {
                if (var5 != null) {
                  L6: {
                    if (1 != ((dj) this).field_d) {
                      break L6;
                    } else {
                      ((dj) this).field_c[param2][param1] = null;
                      if (-2 != (((dj) this).field_b.field_d[param2] ^ -1)) {
                        break L5;
                      } else {
                        ((dj) this).field_c[param2] = null;
                        if (ZombieDawn.field_J == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (((dj) this).field_d != 2) {
                    break L5;
                  } else {
                    ((dj) this).field_c[param2] = null;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              return (byte[]) var5;
            }
          }
        } else {
          return null;
        }
    }

    final synchronized boolean a(byte param0) {
        L0: {
          if (param0 == 73) {
            break L0;
          } else {
            ((dj) this).field_b = (jh) ((dj) this).field_j[19];
            break L0;
          }
        }
        if (((dj) this).field_b == null) {
          ((dj) this).field_b = ((dj) this).field_h.b((byte) 106);
          if (null == ((dj) this).field_b) {
            return false;
          } else {
            ((dj) this).field_j = new Object[((dj) this).field_b.field_s];
            ((dj) this).field_c = new Object[((dj) this).field_b.field_s][];
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        jm.a((String) null, "", -901373652);
        int var1 = -106 % ((67 - param0) / 40);
    }

    final synchronized int e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        var5 = ZombieDawn.field_J;
        if (((dj) this).a((byte) 73)) {
          L0: {
            var2 = 0;
            if (param0 < -79) {
              break L0;
            } else {
              int discarded$2 = ((dj) this).a((byte) -52, 65);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            L2: {
              L3: {
                if (((dj) this).field_j.length <= var4) {
                  break L3;
                } else {
                  stackOut_6_0 = 0;
                  stackOut_6_1 = ((dj) this).field_b.field_t[var4];
                  stackIn_11_0 = stackOut_6_0;
                  stackIn_11_1 = stackOut_6_1;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  if (var5 != 0) {
                    break L2;
                  } else {
                    L4: {
                      if (stackIn_7_0 >= stackIn_7_1) {
                        break L4;
                      } else {
                        var3 = var3 + ((dj) this).a(var4, -5366);
                        var2 += 100;
                        break L4;
                      }
                    }
                    var4++;
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              stackOut_10_0 = -1;
              stackOut_10_1 = var2 ^ -1;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              break L2;
            }
            if (stackIn_11_0 == stackIn_11_1) {
              return 100;
            } else {
              var4 = var3 * 100 / var2;
              return var4;
            }
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, String param1, boolean param2) {
        if (!(this.b(param0, (byte) -82))) {
            return -1;
        }
        param1 = param1.toLowerCase();
        if (!param2) {
            return 8;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var4 = ((dj) this).field_b.field_a[param0].a(1, tc.a(var5, 14));
        if (!(this.a(var4, param0, 126))) {
            return -1;
        }
        return var4;
    }

    final int b(String param0, int param1) {
        if (!(((dj) this).a((byte) 73))) {
            return 0;
        }
        if (param1 <= 83) {
            ((dj) this).field_d = -4;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
        return ((dj) this).a(var3, -5366);
    }

    final synchronized boolean a(int param0, byte param1, int param2) {
        int var4 = 0;
        if (this.a(param0, param2, 113)) {
          L0: {
            var4 = -105 / ((-38 - param1) / 58);
            if (((dj) this).field_c[param2] == null) {
              break L0;
            } else {
              if (null == ((dj) this).field_c[param2][param0]) {
                break L0;
              } else {
                return true;
              }
            }
          }
          if (null != ((dj) this).field_j[param2]) {
            return true;
          } else {
            this.c(4, param2);
            if (((dj) this).field_j[param2] == null) {
              return false;
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (((dj) this).a((byte) 73)) {
          L0: {
            if (param1 < -82) {
              break L0;
            } else {
              boolean discarded$2 = ((dj) this).a((String) null, (byte) 28, (String) ((dj) this).field_j[1]);
              break L0;
            }
          }
          param2 = param2.toLowerCase();
          param0 = param0.toLowerCase();
          var6 = (CharSequence) (Object) param2;
          var4 = ((dj) this).field_b.field_g.a(1, tc.a(var6, 14));
          if (!this.b(var4, (byte) -82)) {
            return null;
          } else {
            var7 = (CharSequence) (Object) param0;
            var5 = ((dj) this).field_b.field_a[var4].a(1, tc.a(var7, 14));
            return ((dj) this).a((byte) 51, var4, var5);
          }
        } else {
          return null;
        }
    }

    final boolean a(int param0, String param1) {
        if (!(((dj) this).a((byte) 73))) {
            return false;
        }
        param1 = param1.toLowerCase();
        if (param0 != -1) {
            int discarded$0 = ((dj) this).a(((int[]) ((dj) this).field_j[7])[0], -46);
        }
        CharSequence var4 = (CharSequence) (Object) param1;
        int var3 = ((dj) this).field_b.field_g.a(1, tc.a(var4, param0 + 15));
        return ((dj) this).b(-29092, var3);
    }

    private final synchronized void c(int param0, int param1) {
        if (param0 != 4) {
          return;
        } else {
          L0: {
            L1: {
              if (!((dj) this).field_f) {
                break L1;
              } else {
                ((dj) this).field_j[param1] = (Object) (Object) ((dj) this).field_h.a(param1, (byte) 112);
                if (ZombieDawn.field_J == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            ((dj) this).field_j[param1] = el.a((byte) 94, false, ((dj) this).field_h.a(param1, (byte) 112));
            break L0;
          }
          return;
        }
    }

    private final synchronized boolean b(int param0, byte param1) {
        L0: {
          if (param1 == -82) {
            break L0;
          } else {
            this.c(((int[]) ((dj) this).field_j[4])[0], 99);
            break L0;
          }
        }
        if (((dj) this).a((byte) 73)) {
          L1: {
            if ((param0 ^ -1) > -1) {
              break L1;
            } else {
              if ((param0 ^ -1) <= (((dj) this).field_b.field_d.length ^ -1)) {
                break L1;
              } else {
                if (-1 != (((dj) this).field_b.field_d[param0] ^ -1)) {
                  return true;
                } else {
                  break L1;
                }
              }
            }
          }
          if (!sg.field_ib) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param0));
          }
        } else {
          return false;
        }
    }

    final byte[] a(byte param0, int param1, int param2) {
        if (param0 != 51) {
            ((dj) this).field_d = -23;
        }
        return this.a((int[]) null, param2, param1, param0 ^ 77);
    }

    public static void b(int param0) {
        field_k = null;
        field_i = null;
        field_a = null;
        field_m = null;
        field_l = null;
        if (param0 <= 67) {
            field_e = null;
        }
        field_e = null;
        field_g = null;
    }

    final int a(byte param0, int param1) {
        if (param0 < 53) {
            return 18;
        }
        if (!(this.b(param1, (byte) -82))) {
            return 0;
        }
        return ((dj) this).field_b.field_d[param1];
    }

    final synchronized int a(int param0, int param1) {
        if (!this.b(param0, (byte) -82)) {
            return 0;
        }
        if (!(((dj) this).field_j[param0] == null)) {
            return 100;
        }
        if (param1 != -5366) {
            byte[] discarded$0 = ((dj) this).a((String) null, -127, (String) ((dj) this).field_j[4]);
        }
        return ((dj) this).field_h.a(-90, param0);
    }

    final boolean a(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          param0 = param0.toLowerCase();
          var4 = (CharSequence) (Object) param0;
          var3 = ((dj) this).field_b.field_g.a(1, tc.a(var4, 14));
          if (param1 > var3) {
            return false;
          } else {
            return true;
          }
        }
    }

    private final synchronized boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          L0: {
            if (0 > param1) {
              break L0;
            } else {
              if (param0 < 0) {
                break L0;
              } else {
                if (param1 >= ((dj) this).field_b.field_d.length) {
                  break L0;
                } else {
                  if (param0 >= ((dj) this).field_b.field_d[param1]) {
                    break L0;
                  } else {
                    var4 = -60 % ((63 - param2) / 41);
                    return true;
                  }
                }
              }
            }
          }
          if (sg.field_ib) {
            throw new IllegalArgumentException(param1 + " " + param0);
          } else {
            return false;
          }
        }
    }

    final synchronized byte[] a(int param0, byte param1) {
        if (!((dj) this).a((byte) 73)) {
            return null;
        }
        if (1 == ((dj) this).field_b.field_d.length) {
            return ((dj) this).a((byte) 51, 0, param0);
        }
        int var3 = 84 % ((-21 - param1) / 37);
        if (!this.b(param0, (byte) -82)) {
            return null;
        }
        if (!(-2 != (((dj) this).field_b.field_d[param0] ^ -1))) {
            return ((dj) this).a((byte) 51, param0, 0);
        }
        throw new RuntimeException();
    }

    final int a(String param0, byte param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (!((dj) this).a((byte) 73)) {
          return -1;
        } else {
          L0: {
            param0 = param0.toLowerCase();
            if (param1 == 8) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          var4 = (CharSequence) (Object) param0;
          var3 = ((dj) this).field_b.field_g.a(param1 ^ 9, tc.a(var4, 14));
          if (!this.b(var3, (byte) -82)) {
            return -1;
          } else {
            return var3;
          }
        }
    }

    final synchronized boolean b(int param0, int param1) {
        if (!this.b(param1, (byte) -82)) {
          return false;
        } else {
          if (param0 == -29092) {
            if (null == ((dj) this).field_j[param1]) {
              this.c(4, param1);
              if (((dj) this).field_j[param1] == null) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final synchronized boolean c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_11_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_10_0 = null;
        var5 = ZombieDawn.field_J;
        if (!((dj) this).a((byte) 73)) {
          return false;
        } else {
          var2 = 1;
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                L3: {
                  if (((dj) this).field_b.field_n.length <= var3) {
                    break L3;
                  } else {
                    var4 = ((dj) this).field_b.field_n[var3];
                    stackOut_3_0 = this;
                    stackIn_11_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (((dj) this).field_j[var4] != null) {
                          break L4;
                        } else {
                          this.c(param0 + -8997, var4);
                          if (null == ((dj) this).field_j[var4]) {
                            var2 = 0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 9001) {
                  break L1;
                } else {
                  stackOut_10_0 = this;
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
              }
              boolean discarded$2 = ((dj) this).a(70, ((byte[]) ((dj) this).field_j[19])[2], 26);
              break L1;
            }
            return var2 != 0;
          }
        }
    }

    dj(w param0, boolean param1, int param2) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          ((dj) this).field_b = null;
          if ((param2 ^ -1) > -1) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -3) {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (!param1) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              ((dj) this).field_f = stackIn_6_1 != 0;
              ((dj) this).field_d = param2;
              ((dj) this).field_h = param0;
              return;
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords can only contain letters and numbers";
        field_l = new vo();
        field_i = ae.a(14821);
    }
}
