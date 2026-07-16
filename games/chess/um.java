/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class um {
    static int[] field_j;
    boolean field_k;
    private Object[] field_m;
    int field_f;
    static km field_c;
    private ua field_i;
    private lj field_d;
    private Object[][] field_e;
    static String field_h;
    static wf field_b;
    static jk field_g;
    static int field_a;
    static lm[] field_l;

    public static void d(byte param0) {
        field_b = null;
        field_g = null;
        if (param0 != 73) {
            um.b(102);
        }
        field_l = null;
        field_j = null;
        field_h = null;
        field_c = null;
    }

    final static void a(int param0) {
        if (param0 != 5) {
            field_c = null;
        }
        in.field_a = false;
    }

    private final synchronized boolean b(int param0, int param1) {
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            ((byte[]) ((um) this).field_m[8])[0] = ((byte[]) ((Object[]) ((um) this).field_m[5])[10])[18];
            break L0;
          }
        }
        if (((um) this).c((byte) 127)) {
          L1: {
            if ((param1 ^ -1) > -1) {
              break L1;
            } else {
              if (((um) this).field_d.field_o.length <= param1) {
                break L1;
              } else {
                if (((um) this).field_d.field_o[param1] == 0) {
                  break L1;
                } else {
                  return true;
                }
              }
            }
          }
          if (!om.field_j) {
            return false;
          } else {
            throw new IllegalArgumentException(Integer.toString(param1));
          }
        } else {
          return false;
        }
    }

    final int a(boolean param0) {
        if (param0) {
            field_b = null;
        }
        if (!((um) this).c((byte) 126)) {
            return -1;
        }
        return ((um) this).field_d.field_o.length;
    }

    final synchronized byte[] a(String param0, int param1, String param2) {
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (((um) this).c((byte) 119)) {
          if (param1 == 30045) {
            param0 = param0.toLowerCase();
            param2 = param2.toLowerCase();
            var6 = (CharSequence) (Object) param0;
            var4 = ((um) this).field_d.field_e.a(ga.a((byte) -75, var6), (byte) 17);
            if (!this.b(0, var4)) {
              return null;
            } else {
              var7 = (CharSequence) (Object) param2;
              var5 = ((um) this).field_d.field_j[var4].a(ga.a((byte) -106, var7), (byte) 17);
              return ((um) this).a(var4, var5, 5847);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final synchronized int a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        var5 = Chess.field_G;
        if (((um) this).c((byte) 122)) {
          L0: {
            var2 = 0;
            if (param0 <= -53) {
              break L0;
            } else {
              boolean discarded$2 = ((um) this).a((byte) -102, ((int[]) ((um) this).field_m[4])[2], ((int[]) ((Object[]) ((Object[]) ((um) this).field_m[3])[13])[0])[13]);
              break L0;
            }
          }
          var3 = 0;
          var4 = 0;
          L1: while (true) {
            if (((um) this).field_m.length <= var4) {
              if (var2 == 0) {
                return 100;
              } else {
                var4 = 100 * var3 / var2;
                return var4;
              }
            } else {
              stackOut_6_0 = 0;
              stackOut_6_1 = ((um) this).field_d.field_l[var4];
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              if (var5 == 0) {
                L2: {
                  if (stackIn_8_0 < stackIn_8_1) {
                    var3 = var3 + ((um) this).c(var4, -91);
                    var2 += 100;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var4++;
                continue L1;
              } else {
                var4 = stackIn_7_0 / stackIn_7_1;
                return var4;
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final synchronized byte[] a(boolean param0, int[] param1, int param2, int param3) {
        Object var5 = null;
        byte[] var5_array = null;
        byte[] var7 = null;
        if (this.b(param3, param2, 0)) {
          L0: {
            if (param0) {
              break L0;
            } else {
              byte[] discarded$1 = ((um) this).a(-73, 12, ((int[]) ((um) this).field_m[23])[2]);
              break L0;
            }
          }
          L1: {
            L2: {
              var5 = null;
              if (((um) this).field_e[param3] == null) {
                break L2;
              } else {
                if (null == ((um) this).field_e[param3][param2]) {
                  break L2;
                } else {
                  break L1;
                }
              }
            }
            if (this.a(param1, 123, param2, param3)) {
              break L1;
            } else {
              this.a(param3, 11076);
              if (this.a(param1, -41, param2, param3)) {
                break L1;
              } else {
                return null;
              }
            }
          }
          if (((um) this).field_e[param3] != null) {
            if (((um) this).field_e[param3][param2] != null) {
              var7 = jf.a(false, false, ((um) this).field_e[param3][param2]);
              var5_array = var7;
              if (var7 == null) {
                throw new RuntimeException("");
              } else {
                L3: {
                  if (var5_array == null) {
                    break L3;
                  } else {
                    L4: {
                      if ((((um) this).field_f ^ -1) != -2) {
                        break L4;
                      } else {
                        ((um) this).field_e[param3][param2] = null;
                        if (1 != ((um) this).field_d.field_o[param3]) {
                          break L3;
                        } else {
                          ((um) this).field_e[param3] = null;
                          if (Chess.field_G == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    if ((((um) this).field_f ^ -1) == -3) {
                      ((um) this).field_e[param3] = null;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                return var5_array;
              }
            } else {
              L5: {
                if (var5 == null) {
                  break L5;
                } else {
                  L6: {
                    if ((((um) this).field_f ^ -1) != -2) {
                      break L6;
                    } else {
                      ((um) this).field_e[param3][param2] = null;
                      if (1 != ((um) this).field_d.field_o[param3]) {
                        break L5;
                      } else {
                        ((um) this).field_e[param3] = null;
                        if (Chess.field_G == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if ((((um) this).field_f ^ -1) == -3) {
                    ((um) this).field_e[param3] = null;
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              return (byte[]) var5;
            }
          } else {
            throw new RuntimeException("");
          }
        } else {
          return null;
        }
    }

    final boolean b(String param0, int param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (((um) this).c((byte) 127)) {
          if (param1 != 100) {
            return true;
          } else {
            param0 = param0.toLowerCase();
            var4 = (CharSequence) (Object) param0;
            var3 = ((um) this).field_d.field_e.a(ga.a((byte) -110, var4), (byte) 17);
            return ((um) this).a(var3, (byte) -72);
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (this.b(param1, param2, 0)) {
          L0: {
            var4 = 124 % ((14 - param0) / 54);
            if (null == ((um) this).field_e[param1]) {
              break L0;
            } else {
              if (((um) this).field_e[param1][param2] != null) {
                return true;
              } else {
                break L0;
              }
            }
          }
          if (null == ((um) this).field_m[param1]) {
            this.a(param1, 11076);
            if (null != ((um) this).field_m[param1]) {
              return true;
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final synchronized int c(int param0, int param1) {
        if (param1 > -27) {
            return 121;
        }
        if (!(this.b(0, param0))) {
            return 0;
        }
        if (!(((um) this).field_m[param0] == null)) {
            return 100;
        }
        return ((um) this).field_i.b(110, param0);
    }

    final boolean a(int param0, String param1) {
        int var3 = 0;
        CharSequence var4 = null;
        if (((um) this).c((byte) 124)) {
          if (param0 == 4) {
            param1 = param1.toLowerCase();
            var4 = (CharSequence) (Object) param1;
            var3 = ((um) this).field_d.field_e.a(ga.a((byte) -100, var4), (byte) 17);
            if ((var3 ^ -1) > -1) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final synchronized boolean a(int param0, byte param1) {
        if (this.b(0, param0)) {
          if (null != ((um) this).field_m[param0]) {
            return true;
          } else {
            this.a(param0, 11076);
            if (((um) this).field_m[param0] == null) {
              if (param1 != -72) {
                ((byte[]) ((um) this).field_m[1])[3] = ((byte[]) ((Object[]) ((um) this).field_m[20])[2])[19];
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final byte[] a(int param0, int param1, int param2) {
        if (param2 != 5847) {
            field_l = (lm[]) ((um) this).field_m[2];
        }
        return this.a(true, (int[]) null, param1, param0);
    }

    private final synchronized boolean a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        Object[] var7 = null;
        int var8 = 0;
        int var9_int = 0;
        byte[] var9 = null;
        int var10_int = 0;
        byte[] var10 = null;
        p var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        p var14 = null;
        int var15 = 0;
        int[] var15_ref_int__ = null;
        int var16 = 0;
        byte[][] var16_ref_byte____ = null;
        int var17_int = 0;
        byte[] var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        byte[] var24 = null;
        Object stackIn_8_0 = null;
        int[] stackIn_8_1 = null;
        Object stackIn_19_0 = null;
        int[] stackIn_19_1 = null;
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_109_0 = 0;
        Object stackOut_7_0 = null;
        int[] stackOut_7_1 = null;
        Object stackOut_18_0 = null;
        int[] stackOut_18_1 = null;
        int stackOut_49_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_108_0 = 0;
        int stackOut_97_0 = 0;
        var23 = Chess.field_G;
        if (this.b(0, param3)) {
          if (((um) this).field_m[param3] != null) {
            L0: {
              var5 = ((um) this).field_d.field_l[param3];
              var6 = ((um) this).field_d.field_h[param3];
              if (((um) this).field_e[param3] != null) {
                break L0;
              } else {
                ((um) this).field_e[param3] = new Object[((um) this).field_d.field_o[param3]];
                break L0;
              }
            }
            L1: {
              L2: {
                var7 = ((um) this).field_e[param3];
                var8 = 1;
                var9_int = 0;
                if (var9_int >= var5) {
                  break L2;
                } else {
                  stackOut_7_0 = null;
                  stackOut_7_1 = (int[]) var6;
                  stackIn_19_0 = stackOut_7_0;
                  stackIn_19_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var23 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_8_0 != (Object) (Object) stackIn_8_1) {
                          break L4;
                        } else {
                          var10_int = var9_int;
                          if (var23 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var10_int = var6[var9_int];
                      break L3;
                    }
                    L5: {
                      if (null == var7[var10_int]) {
                        var8 = 0;
                        if (var23 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var9_int++;
                    break L2;
                  }
                }
              }
              if (var8 != 0) {
                return true;
              } else {
                stackOut_18_0 = null;
                stackOut_18_1 = (int[]) param0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L1;
              }
            }
            L6: {
              L7: {
                if (stackIn_19_0 == (Object) (Object) stackIn_19_1) {
                  break L7;
                } else {
                  L8: {
                    if (0 != param0[0]) {
                      break L8;
                    } else {
                      if (0 != param0[1]) {
                        break L8;
                      } else {
                        if (-1 != param0[2]) {
                          break L8;
                        } else {
                          if (-1 == param0[3]) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                    }
                  }
                  var9 = jf.a(true, false, ((um) this).field_m[param3]);
                  var10_ref = new p(var9);
                  var10_ref.a(5, param0, (byte) -67, var10_ref.field_o.length);
                  break L6;
                }
              }
              var9 = jf.a(false, false, ((um) this).field_m[param3]);
              break L6;
            }
            L9: {
              var11 = -12 / ((49 - param1) / 41);
              var24 = dj.a(var9, -21);
              var10 = var24;
              if (((um) this).field_k) {
                ((um) this).field_m[param3] = null;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if ((var5 ^ -1) < -2) {
                break L10;
              } else {
                L11: {
                  L12: {
                    if (var6 == null) {
                      break L12;
                    } else {
                      var12 = var6[0];
                      if (var23 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var24 = var10;
                  var12 = 0;
                  break L11;
                }
                L13: {
                  L14: {
                    var24 = var10;
                    if (-1 == (((um) this).field_f ^ -1)) {
                      break L14;
                    } else {
                      var7[var12] = (Object) (Object) var24;
                      if (var23 == 0) {
                        break L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var24 = var10;
                  var7[var12] = vm.a(25633, var24, false);
                  break L13;
                }
                if (var23 != 0) {
                  break L10;
                } else {
                  return true;
                }
              }
            }
            L15: {
              var24 = var10;
              if (2 == ((um) this).field_f) {
                break L15;
              } else {
                var12 = var24.length;
                var12--;
                var13 = 255 & var24[var12];
                var12 = var12 - var5 * (var13 * 4);
                var14 = new p(var10);
                var15_ref_int__ = new int[var5];
                var14.field_l = var12;
                var16 = 0;
                L16: while (true) {
                  L17: {
                    if (var13 <= var16) {
                      stackOut_49_0 = var5;
                      stackIn_50_0 = stackOut_49_0;
                      break L17;
                    } else {
                      var17_int = 0;
                      stackOut_43_0 = 0;
                      stackIn_50_0 = stackOut_43_0;
                      stackIn_44_0 = stackOut_43_0;
                      if (var23 != 0) {
                        break L17;
                      } else {
                        var18 = stackIn_44_0;
                        L18: while (true) {
                          if (var5 <= var18) {
                            var16++;
                            continue L16;
                          } else {
                            var17_int = var17_int + var14.e((byte) -119);
                            var15_ref_int__[var18] = var15_ref_int__[var18] + var17_int;
                            var18++;
                            continue L18;
                          }
                        }
                      }
                    }
                  }
                  var16_ref_byte____ = new byte[stackIn_50_0][];
                  var17_int = 0;
                  L19: while (true) {
                    L20: {
                      if (var17_int >= var5) {
                        var14.field_l = var12;
                        var17_int = 0;
                        break L20;
                      } else {
                        var16_ref_byte____[var17_int] = new byte[var15_ref_int__[var17_int]];
                        var15_ref_int__[var17_int] = 0;
                        var17_int++;
                        if (var23 != 0) {
                          break L20;
                        } else {
                          continue L19;
                        }
                      }
                    }
                    var18 = 0;
                    L21: while (true) {
                      L22: {
                        if (var13 <= var18) {
                          stackOut_64_0 = 0;
                          stackIn_65_0 = stackOut_64_0;
                          break L22;
                        } else {
                          var19 = 0;
                          stackOut_58_0 = 0;
                          stackIn_65_0 = stackOut_58_0;
                          stackIn_59_0 = stackOut_58_0;
                          if (var23 != 0) {
                            break L22;
                          } else {
                            var20 = stackIn_59_0;
                            L23: while (true) {
                              if (var5 <= var20) {
                                var18++;
                                continue L21;
                              } else {
                                var19 = var19 + var14.e((byte) -127);
                                ne.a(var24, var17_int, var16_ref_byte____[var20], var15_ref_int__[var20], var19);
                                var15_ref_int__[var20] = var15_ref_int__[var20] + var19;
                                var17_int = var17_int + var19;
                                var20++;
                                continue L23;
                              }
                            }
                          }
                        }
                      }
                      var18 = stackIn_65_0;
                      L24: while (true) {
                        if (var5 <= var18) {
                          if (var23 != 0) {
                            break L15;
                          } else {
                            return true;
                          }
                        } else {
                          if (var23 == 0) {
                            L25: {
                              L26: {
                                if (var6 != null) {
                                  break L26;
                                } else {
                                  var19 = var18;
                                  if (var23 == 0) {
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              var19 = var6[var18];
                              break L25;
                            }
                            L27: {
                              L28: {
                                if (((um) this).field_f == 0) {
                                  break L28;
                                } else {
                                  var7[var19] = (Object) (Object) var16_ref_byte____[var18];
                                  if (var23 == 0) {
                                    break L27;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              var7[var19] = vm.a(25633, var16_ref_byte____[var18], false);
                              break L27;
                            }
                            var18++;
                            continue L24;
                          } else {
                            return true;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            var12 = var24.length;
            var12--;
            var13 = 255 & var24[var12];
            var12 = var12 - 4 * var5 * var13;
            var14 = new p(var10);
            var15 = 0;
            var14.field_l = var12;
            var16 = 0;
            var17_int = 0;
            L29: while (true) {
              L30: {
                if (var17_int >= var13) {
                  stackOut_91_0 = -1;
                  stackIn_92_0 = stackOut_91_0;
                  break L30;
                } else {
                  var18 = 0;
                  stackOut_81_0 = 0;
                  stackIn_92_0 = stackOut_81_0;
                  stackIn_82_0 = stackOut_81_0;
                  if (var23 != 0) {
                    break L30;
                  } else {
                    var19 = stackIn_82_0;
                    L31: while (true) {
                      if (var5 <= var19) {
                        var17_int++;
                        continue L29;
                      } else {
                        L32: {
                          L33: {
                            var18 = var18 + var14.e((byte) -105);
                            if (var6 == null) {
                              break L33;
                            } else {
                              var20 = var6[var19];
                              if (var23 == 0) {
                                break L32;
                              } else {
                                break L33;
                              }
                            }
                          }
                          var20 = var19;
                          break L32;
                        }
                        L34: {
                          if (var20 != param2) {
                            break L34;
                          } else {
                            var15 = var15 + var18;
                            var16 = var20;
                            break L34;
                          }
                        }
                        var19++;
                        continue L31;
                      }
                    }
                  }
                }
              }
              if (stackIn_92_0 == (var15 ^ -1)) {
                return true;
              } else {
                var17 = new byte[var15];
                var14.field_l = var12;
                var15 = 0;
                var18 = 0;
                var19 = 0;
                L35: while (true) {
                  L36: {
                    if (var13 <= var19) {
                      var7[var16] = (Object) (Object) var17;
                      stackOut_108_0 = 1;
                      stackIn_109_0 = stackOut_108_0;
                      break L36;
                    } else {
                      var20 = 0;
                      stackOut_97_0 = 0;
                      stackIn_109_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if (var23 != 0) {
                        break L36;
                      } else {
                        var21 = stackIn_98_0;
                        L37: while (true) {
                          if (var21 >= var5) {
                            var19++;
                            continue L35;
                          } else {
                            L38: {
                              L39: {
                                var20 = var20 + var14.e((byte) -94);
                                if (var6 == null) {
                                  break L39;
                                } else {
                                  var22 = var6[var21];
                                  if (var23 == 0) {
                                    break L38;
                                  } else {
                                    break L39;
                                  }
                                }
                              }
                              var22 = var21;
                              break L38;
                            }
                            L40: {
                              if (var22 == param2) {
                                ne.a(var10, var18, var17, var15, var20);
                                var15 = var15 + var20;
                                break L40;
                              } else {
                                break L40;
                              }
                            }
                            var18 = var18 + var20;
                            var21++;
                            continue L37;
                          }
                        }
                      }
                    }
                  }
                  return stackIn_109_0 != 0;
                }
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(byte param0, int param1) {
        if (!this.b(0, param1)) {
          return 0;
        } else {
          L0: {
            if (param0 < -49) {
              break L0;
            } else {
              ((um) this).field_d = null;
              break L0;
            }
          }
          return ((um) this).field_d.field_o[param1];
        }
    }

    private final synchronized boolean b(int param0, int param1, int param2) {
        if (((um) this).c((byte) 127)) {
          L0: {
            if (param0 < param2) {
              break L0;
            } else {
              if (-1 < (param1 ^ -1)) {
                break L0;
              } else {
                if (((um) this).field_d.field_o.length <= param0) {
                  break L0;
                } else {
                  if (param1 >= ((um) this).field_d.field_o[param0]) {
                    break L0;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
          if (om.field_j) {
            throw new IllegalArgumentException(param0 + " " + param1);
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1, int param2) {
        if (!(this.b(0, param2))) {
            return -1;
        }
        if (param1 != 7) {
            ((um) this).field_m = (Object[]) ((um) this).field_m[1];
        }
        param0 = param0.toLowerCase();
        CharSequence var5 = (CharSequence) (Object) param0;
        int var4 = ((um) this).field_d.field_j[param2].a(ga.a((byte) -77, var5), (byte) 17);
        if (!(this.b(param2, var4, 0))) {
            return -1;
        }
        return var4;
    }

    final static void b(int param0) {
        int var1 = 0;
        int var2 = 0;
        cd[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        cd stackIn_8_2 = null;
        cd stackIn_8_3 = null;
        int stackIn_8_4 = 0;
        int stackIn_8_5 = 0;
        rk stackIn_8_6 = null;
        rk stackIn_8_7 = null;
        Object stackIn_8_8 = null;
        cd[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        cd stackIn_9_2 = null;
        cd stackIn_9_3 = null;
        int stackIn_9_4 = 0;
        int stackIn_9_5 = 0;
        rk stackIn_9_6 = null;
        rk stackIn_9_7 = null;
        Object stackIn_9_8 = null;
        cd[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        cd stackIn_10_2 = null;
        cd stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        rk stackIn_10_6 = null;
        rk stackIn_10_7 = null;
        Object stackIn_10_8 = null;
        int stackIn_10_9 = 0;
        cd[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        cd stackIn_11_2 = null;
        cd stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        rk stackIn_11_6 = null;
        rk stackIn_11_7 = null;
        Object stackIn_11_8 = null;
        int stackIn_11_9 = 0;
        cd[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        cd stackIn_12_2 = null;
        cd stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        rk stackIn_12_6 = null;
        rk stackIn_12_7 = null;
        Object stackIn_12_8 = null;
        int stackIn_12_9 = 0;
        cd[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        cd stackIn_13_2 = null;
        cd stackIn_13_3 = null;
        int stackIn_13_4 = 0;
        int stackIn_13_5 = 0;
        rk stackIn_13_6 = null;
        rk stackIn_13_7 = null;
        Object stackIn_13_8 = null;
        int stackIn_13_9 = 0;
        cd[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        cd stackIn_14_2 = null;
        cd stackIn_14_3 = null;
        int stackIn_14_4 = 0;
        int stackIn_14_5 = 0;
        rk stackIn_14_6 = null;
        rk stackIn_14_7 = null;
        Object stackIn_14_8 = null;
        int stackIn_14_9 = 0;
        int stackIn_14_10 = 0;
        cd[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        cd stackOut_7_2 = null;
        cd stackOut_7_3 = null;
        int stackOut_7_4 = 0;
        int stackOut_7_5 = 0;
        rk stackOut_7_6 = null;
        rk stackOut_7_7 = null;
        Object stackOut_7_8 = null;
        cd[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        cd stackOut_9_2 = null;
        cd stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        rk stackOut_9_6 = null;
        rk stackOut_9_7 = null;
        Object stackOut_9_8 = null;
        int stackOut_9_9 = 0;
        cd[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        cd stackOut_8_2 = null;
        cd stackOut_8_3 = null;
        int stackOut_8_4 = 0;
        int stackOut_8_5 = 0;
        rk stackOut_8_6 = null;
        rk stackOut_8_7 = null;
        Object stackOut_8_8 = null;
        int stackOut_8_9 = 0;
        cd[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        cd stackOut_10_2 = null;
        cd stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        rk stackOut_10_6 = null;
        rk stackOut_10_7 = null;
        Object stackOut_10_8 = null;
        int stackOut_10_9 = 0;
        cd[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        cd stackOut_11_2 = null;
        cd stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        rk stackOut_11_6 = null;
        rk stackOut_11_7 = null;
        Object stackOut_11_8 = null;
        int stackOut_11_9 = 0;
        cd[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        cd stackOut_13_2 = null;
        cd stackOut_13_3 = null;
        int stackOut_13_4 = 0;
        int stackOut_13_5 = 0;
        rk stackOut_13_6 = null;
        rk stackOut_13_7 = null;
        Object stackOut_13_8 = null;
        int stackOut_13_9 = 0;
        int stackOut_13_10 = 0;
        cd[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        cd stackOut_12_2 = null;
        cd stackOut_12_3 = null;
        int stackOut_12_4 = 0;
        int stackOut_12_5 = 0;
        rk stackOut_12_6 = null;
        rk stackOut_12_7 = null;
        Object stackOut_12_8 = null;
        int stackOut_12_9 = 0;
        int stackOut_12_10 = 0;
        L0: {
          var2 = Chess.field_G;
          if (null != qd.field_w) {
            break L0;
          } else {
            qd.field_w = new qe();
            break L0;
          }
        }
        L1: {
          mi.field_q = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
          hg.field_b = new wg(100, 100, 150, bj.field_bb[0], wh.field_c, bj.field_bb[1], dj.field_t, (km) null);
          mi.field_q.field_y = 80;
          hg.field_b.field_y = 80;
          if (param0 == 640) {
            break L1;
          } else {
            field_g = null;
            break L1;
          }
        }
        var1 = 0;
        L2: while (true) {
          L3: {
            L4: {
              if ((var1 ^ -1) <= -6) {
                break L4;
              } else {
                if (var2 != 0) {
                  break L3;
                } else {
                  L5: {
                    stackOut_7_0 = ok.field_Ib;
                    stackOut_7_1 = var1;
                    stackOut_7_2 = null;
                    stackOut_7_3 = null;
                    stackOut_7_4 = 24 * var1 + ak.field_k[3];
                    stackOut_7_5 = ak.field_m[3] + -28;
                    stackOut_7_6 = ek.field_c[var1];
                    stackOut_7_7 = ek.field_c[5 + var1];
                    stackOut_7_8 = null;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    stackIn_9_5 = stackOut_7_5;
                    stackIn_9_6 = stackOut_7_6;
                    stackIn_9_7 = stackOut_7_7;
                    stackIn_9_8 = stackOut_7_8;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    stackIn_8_2 = stackOut_7_2;
                    stackIn_8_3 = stackOut_7_3;
                    stackIn_8_4 = stackOut_7_4;
                    stackIn_8_5 = stackOut_7_5;
                    stackIn_8_6 = stackOut_7_6;
                    stackIn_8_7 = stackOut_7_7;
                    stackIn_8_8 = stackOut_7_8;
                    if (-3 != (var1 ^ -1)) {
                      stackOut_9_0 = (cd[]) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackOut_9_2 = null;
                      stackOut_9_3 = null;
                      stackOut_9_4 = stackIn_9_4;
                      stackOut_9_5 = stackIn_9_5;
                      stackOut_9_6 = (rk) (Object) stackIn_9_6;
                      stackOut_9_7 = (rk) (Object) stackIn_9_7;
                      stackOut_9_8 = stackIn_9_8;
                      stackOut_9_9 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      stackIn_10_4 = stackOut_9_4;
                      stackIn_10_5 = stackOut_9_5;
                      stackIn_10_6 = stackOut_9_6;
                      stackIn_10_7 = stackOut_9_7;
                      stackIn_10_8 = stackOut_9_8;
                      stackIn_10_9 = stackOut_9_9;
                      break L5;
                    } else {
                      stackOut_8_0 = (cd[]) (Object) stackIn_8_0;
                      stackOut_8_1 = stackIn_8_1;
                      stackOut_8_2 = null;
                      stackOut_8_3 = null;
                      stackOut_8_4 = stackIn_8_4;
                      stackOut_8_5 = stackIn_8_5;
                      stackOut_8_6 = (rk) (Object) stackIn_8_6;
                      stackOut_8_7 = (rk) (Object) stackIn_8_7;
                      stackOut_8_8 = stackIn_8_8;
                      stackOut_8_9 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      stackIn_10_2 = stackOut_8_2;
                      stackIn_10_3 = stackOut_8_3;
                      stackIn_10_4 = stackOut_8_4;
                      stackIn_10_5 = stackOut_8_5;
                      stackIn_10_6 = stackOut_8_6;
                      stackIn_10_7 = stackOut_8_7;
                      stackIn_10_8 = stackOut_8_8;
                      stackIn_10_9 = stackOut_8_9;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      stackOut_10_0 = (cd[]) (Object) stackIn_10_0;
                      stackOut_10_1 = stackIn_10_1;
                      stackOut_10_2 = null;
                      stackOut_10_3 = null;
                      stackOut_10_4 = stackIn_10_4;
                      stackOut_10_5 = stackIn_10_5;
                      stackOut_10_6 = (rk) (Object) stackIn_10_6;
                      stackOut_10_7 = (rk) (Object) stackIn_10_7;
                      stackOut_10_8 = stackIn_10_8;
                      stackOut_10_9 = stackIn_10_9;
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      stackIn_12_2 = stackOut_10_2;
                      stackIn_12_3 = stackOut_10_3;
                      stackIn_12_4 = stackOut_10_4;
                      stackIn_12_5 = stackOut_10_5;
                      stackIn_12_6 = stackOut_10_6;
                      stackIn_12_7 = stackOut_10_7;
                      stackIn_12_8 = stackOut_10_8;
                      stackIn_12_9 = stackOut_10_9;
                      stackIn_11_0 = stackOut_10_0;
                      stackIn_11_1 = stackOut_10_1;
                      stackIn_11_2 = stackOut_10_2;
                      stackIn_11_3 = stackOut_10_3;
                      stackIn_11_4 = stackOut_10_4;
                      stackIn_11_5 = stackOut_10_5;
                      stackIn_11_6 = stackOut_10_6;
                      stackIn_11_7 = stackOut_10_7;
                      stackIn_11_8 = stackOut_10_8;
                      stackIn_11_9 = stackOut_10_9;
                      if ((var1 ^ -1) == -4) {
                        break L7;
                      } else {
                        stackOut_11_0 = (cd[]) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = null;
                        stackOut_11_3 = null;
                        stackOut_11_4 = stackIn_11_4;
                        stackOut_11_5 = stackIn_11_5;
                        stackOut_11_6 = (rk) (Object) stackIn_11_6;
                        stackOut_11_7 = (rk) (Object) stackIn_11_7;
                        stackOut_11_8 = stackIn_11_8;
                        stackOut_11_9 = stackIn_11_9;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_13_2 = stackOut_11_2;
                        stackIn_13_3 = stackOut_11_3;
                        stackIn_13_4 = stackOut_11_4;
                        stackIn_13_5 = stackOut_11_5;
                        stackIn_13_6 = stackOut_11_6;
                        stackIn_13_7 = stackOut_11_7;
                        stackIn_13_8 = stackOut_11_8;
                        stackIn_13_9 = stackOut_11_9;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        stackIn_12_5 = stackOut_11_5;
                        stackIn_12_6 = stackOut_11_6;
                        stackIn_12_7 = stackOut_11_7;
                        stackIn_12_8 = stackOut_11_8;
                        stackIn_12_9 = stackOut_11_9;
                        if (var1 != 1) {
                          stackOut_13_0 = (cd[]) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = null;
                          stackOut_13_3 = null;
                          stackOut_13_4 = stackIn_13_4;
                          stackOut_13_5 = stackIn_13_5;
                          stackOut_13_6 = (rk) (Object) stackIn_13_6;
                          stackOut_13_7 = (rk) (Object) stackIn_13_7;
                          stackOut_13_8 = stackIn_13_8;
                          stackOut_13_9 = stackIn_13_9;
                          stackOut_13_10 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          stackIn_14_3 = stackOut_13_3;
                          stackIn_14_4 = stackOut_13_4;
                          stackIn_14_5 = stackOut_13_5;
                          stackIn_14_6 = stackOut_13_6;
                          stackIn_14_7 = stackOut_13_7;
                          stackIn_14_8 = stackOut_13_8;
                          stackIn_14_9 = stackOut_13_9;
                          stackIn_14_10 = stackOut_13_10;
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    stackOut_12_0 = (cd[]) (Object) stackIn_12_0;
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = null;
                    stackOut_12_3 = null;
                    stackOut_12_4 = stackIn_12_4;
                    stackOut_12_5 = stackIn_12_5;
                    stackOut_12_6 = (rk) (Object) stackIn_12_6;
                    stackOut_12_7 = (rk) (Object) stackIn_12_7;
                    stackOut_12_8 = stackIn_12_8;
                    stackOut_12_9 = stackIn_12_9;
                    stackOut_12_10 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    stackIn_14_1 = stackOut_12_1;
                    stackIn_14_2 = stackOut_12_2;
                    stackIn_14_3 = stackOut_12_3;
                    stackIn_14_4 = stackOut_12_4;
                    stackIn_14_5 = stackOut_12_5;
                    stackIn_14_6 = stackOut_12_6;
                    stackIn_14_7 = stackOut_12_7;
                    stackIn_14_8 = stackOut_12_8;
                    stackIn_14_9 = stackOut_12_9;
                    stackIn_14_10 = stackOut_12_10;
                    break L6;
                  }
                  stackIn_14_0[stackIn_14_1] = new cd(stackIn_14_4, stackIn_14_5, stackIn_14_6, stackIn_14_7, (rk) (Object) stackIn_14_8, stackIn_14_9 != 0, stackIn_14_10 != 0);
                  var1++;
                  if (var2 == 0) {
                    continue L2;
                  } else {
                    break L4;
                  }
                }
              }
            }
            var1 = v.field_j.field_t + (v.field_j.field_H + 4);
            ak.field_m[7] = v.field_j.field_C + (200 + v.field_j.field_t) - -var1;
            ak.field_y[7] = 30 + 2 * var1;
            break L3;
          }
          return;
        }
    }

    private final synchronized void a(int param0, int param1) {
        L0: {
          if (param1 == 11076) {
            break L0;
          } else {
            ((um) this).field_m = (Object[]) ((um) this).field_m[5];
            break L0;
          }
        }
        L1: {
          L2: {
            if (((um) this).field_k) {
              break L2;
            } else {
              ((um) this).field_m[param0] = vm.a(dm.a(param1, 20325), ((um) this).field_i.c(param0, 1), false);
              if (Chess.field_G == 0) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ((um) this).field_m[param0] = (Object) (Object) ((um) this).field_i.c(param0, 1);
          break L1;
        }
    }

    final synchronized byte[] b(byte param0, int param1) {
        if (((um) this).c((byte) 125)) {
          if ((((um) this).field_d.field_o.length ^ -1) != -2) {
            if (this.b(0, param1)) {
              if ((((um) this).field_d.field_o[param1] ^ -1) == -2) {
                return ((um) this).a(param1, 0, 5847);
              } else {
                L0: {
                  if (param0 == -74) {
                    break L0;
                  } else {
                    ((long[]) ((Object[]) ((um) this).field_m[2])[1])[0] = -41L;
                    break L0;
                  }
                }
                throw new RuntimeException();
              }
            } else {
              return null;
            }
          } else {
            return ((um) this).a(0, param1, param0 + 5921);
          }
        } else {
          return null;
        }
    }

    final synchronized boolean c(byte param0) {
        L0: {
          if (param0 >= 117) {
            break L0;
          } else {
            ((um) this).field_e = null;
            break L0;
          }
        }
        if (null == ((um) this).field_d) {
          ((um) this).field_d = ((um) this).field_i.b(104);
          if (((um) this).field_d == null) {
            return false;
          } else {
            ((um) this).field_m = new Object[((um) this).field_d.field_g];
            ((um) this).field_e = new Object[((um) this).field_d.field_g][];
            return true;
          }
        } else {
          return true;
        }
    }

    final boolean a(String param0, String param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        if (((um) this).c((byte) 120)) {
          L0: {
            param0 = param0.toLowerCase();
            if (param2 == -78) {
              break L0;
            } else {
              int discarded$2 = ((um) this).a((String) ((um) this).field_m[0], ((int[]) ((um) this).field_m[0])[1], ((int[]) ((um) this).field_m[10])[1]);
              break L0;
            }
          }
          param1 = param1.toLowerCase();
          var6 = (CharSequence) (Object) param0;
          var4 = ((um) this).field_d.field_e.a(ga.a((byte) -109, var6), (byte) 17);
          if (!this.b(0, var4)) {
            return false;
          } else {
            var7 = (CharSequence) (Object) param1;
            var5 = ((um) this).field_d.field_j[var4].a(ga.a((byte) -112, var7), (byte) 17);
            return ((um) this).a((byte) -80, var4, var5);
          }
        } else {
          return false;
        }
    }

    final int a(String param0, int param1) {
        if (!((um) this).c((byte) 124)) {
            return -1;
        }
        param0 = param0.toLowerCase();
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((um) this).field_d.field_e.a(ga.a((byte) -124, var4), (byte) 17);
        if (!(this.b(param1, var3))) {
            return -1;
        }
        return var3;
    }

    final synchronized boolean b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_12_0 = 0;
        var5 = Chess.field_G;
        if (((um) this).c((byte) 119)) {
          if (param0 != -40) {
            return true;
          } else {
            var2 = 1;
            var3 = 0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var3 >= ((um) this).field_d.field_q.length) {
                    break L2;
                  } else {
                    stackOut_5_0 = ((um) this).field_d.field_q[var3];
                    stackIn_13_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var5 != 0) {
                      break L1;
                    } else {
                      L3: {
                        var4 = stackIn_6_0;
                        if (((um) this).field_m[var4] == null) {
                          this.a(var4, 11076);
                          if (((um) this).field_m[var4] == null) {
                            var2 = 0;
                            break L3;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var3++;
                      if (var5 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_12_0 = var2;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              return stackIn_13_0 != 0;
            }
          }
        } else {
          return false;
        }
    }

    final int c(String param0, int param1) {
        if (!(((um) this).c((byte) 125))) {
            return 0;
        }
        param0 = param0.toLowerCase();
        if (param1 != 0) {
            boolean discarded$0 = ((um) this).a(-40, ((byte[]) ((Object[]) ((um) this).field_m[9])[4])[14]);
        }
        CharSequence var4 = (CharSequence) (Object) param0;
        int var3 = ((um) this).field_d.field_e.a(ga.a((byte) -94, var4), (byte) 17);
        return ((um) this).c(var3, param1 + -47);
    }

    um(ua param0, boolean param1, int param2) {
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
          ((um) this).field_d = null;
          if (-1 < (param2 ^ -1)) {
            break L0;
          } else {
            if (param2 <= 2) {
              L1: {
                ((um) this).field_i = param0;
                ((um) this).field_f = param2;
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
              ((um) this).field_k = stackIn_6_1 != 0;
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
        field_c = new km(640, 480);
        field_h = "No players";
        field_a = 0;
        field_l = new lm[13];
    }
}
