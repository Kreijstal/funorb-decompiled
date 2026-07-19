/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm {
    static String field_c;
    static je field_a;
    static int field_b;
    private ho[][] field_d;

    public static void a(boolean param0) {
        field_a = null;
        field_c = null;
        if (!param0) {
            return;
        }
        field_a = (je) null;
    }

    final int a(boolean param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        cf var12 = null;
        cf var13 = null;
        om var14 = null;
        ho var15 = null;
        cf var16 = null;
        cf var17 = null;
        om var18 = null;
        ho var19 = null;
        int stackIn_8_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (null != this.field_d[param1]) {
          if (param0) {
            this.a(-6, 29, -98, 117, 69);
            var13 = br.a(param1, (byte) -93);
            var12 = var13;
            var4 = 0;
            var5 = 0;
            L0: while (true) {
              L1: {
                if (var5 >= var12.field_n.length) {
                  break L1;
                } else {
                  L2: {
                    var15 = this.field_d[param1][var5];
                    var14 = var13.field_n[var5];
                    if (var15 == null) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L2;
                    } else {
                      stackOut_13_0 = b.a(var14.field_m, var14.field_F, var15.field_c, (byte) 25, var15.field_b);
                      stackIn_15_0 = stackOut_13_0;
                      break L2;
                    }
                  }
                  var8 = stackIn_15_0;
                  var4 = var4 + var8;
                  var5++;
                  if (var9 == 0) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              return var4;
            }
          } else {
            var17 = br.a(param1, (byte) -93);
            var16 = var17;
            var4 = 0;
            var5 = 0;
            L3: while (true) {
              L4: {
                if (var5 >= var16.field_n.length) {
                  break L4;
                } else {
                  L5: {
                    var19 = this.field_d[param1][var5];
                    var18 = var17.field_n[var5];
                    if (var19 == null) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L5;
                    } else {
                      stackOut_6_0 = b.a(var18.field_m, var18.field_F, var19.field_c, (byte) 25, var19.field_b);
                      stackIn_8_0 = stackOut_6_0;
                      break L5;
                    }
                  }
                  var8 = stackIn_8_0;
                  var4 = var4 + var8;
                  var5++;
                  if (var9 == 0) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              return var4;
            }
          }
        } else {
          return 0;
        }
    }

    final static String b(boolean param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_8_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_7_0 = 0;
        boolean stackOut_17_0 = false;
        var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        var6 = "(" + me.field_c + " " + ba.field_F + " " + sj.field_e + ") " + nm.field_o;
        var1 = var6;
        if ((fk.field_b ^ -1) < -1) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var2 >= fk.field_b) {
                  break L2;
                } else {
                  var7 = var1 + ' ';
                  var1 = var7;
                  var3 = 255 & mg.field_e.field_o[var2];
                  var4 = var3 >> -1969862716;
                  var3 = var3 & 15;
                  stackOut_7_0 = var4 ^ -1;
                  stackIn_18_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        if (stackIn_8_0 > -11) {
                          break L4;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 += 48;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (var3 < 10) {
                          break L6;
                        } else {
                          var3 += 55;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 += 48;
                      break L5;
                    }
                    var8 = var7 + (char)var4;
                    var1 = var8 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_17_0 = param0;
              stackIn_18_0 = stackOut_17_0 ? 1 : 0;
              break L1;
            }
            if (stackIn_18_0 != 0) {
              return (String) null;
            } else {
              return var1;
            }
          }
        } else {
          if (param0) {
            return (String) null;
          } else {
            return var1;
          }
        }
    }

    final void a(int param0, vh param1, int param2) {
        int dupTemp$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var4_int = param1.e((byte) -104);
            var5 = 0;
            if (param2 <= -109) {
              stackOut_3_0 = 0;
              stackIn_5_0 = stackOut_3_0;
              L1: while (true) {
                if (stackIn_5_0 == var4_int) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (var10 == 0) {
                    L2: {
                      L3: {
                        if ((var4_int & 1) != 0) {
                          this.field_d[var5] = new ho[64];
                          L4: while (true) {
                            dupTemp$1 = param1.k(0);
                            var6 = dupTemp$1;
                            if (255 == dupTemp$1) {
                              break L3;
                            } else {
                              stackOut_12_0 = -8;
                              stackOut_12_1 = param0 ^ -1;
                              stackIn_18_0 = stackOut_12_0;
                              stackIn_18_1 = stackOut_12_1;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              if (var10 != 0) {
                                break L2;
                              } else {
                                L5: {
                                  L6: {
                                    if (stackIn_13_0 < stackIn_13_1) {
                                      break L6;
                                    } else {
                                      var7 = param1.e((byte) -104);
                                      var8 = param1.e((byte) -104);
                                      if (var10 == 0) {
                                        break L5;
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  var7 = 2000;
                                  var9 = param1.e((byte) -104);
                                  var8 = var9;
                                  break L5;
                                }
                                this.field_d[var5][var6] = new ho(var7, var8);
                                continue L4;
                              }
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      stackOut_17_0 = var4_int;
                      stackOut_17_1 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      break L2;
                    }
                    var4_int = stackIn_18_0 >> stackIn_18_1;
                    var5++;
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    continue L1;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4);
            stackOut_20_1 = new StringBuilder().append("cm.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(String param0, int param1, String param2) {
        String discarded$0 = null;
        try {
            if (param1 != 0) {
                discarded$0 = cm.b(false);
            }
            wb.a(false, (byte) 32, param2, param0);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "cm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(int param0, int param1, int param2) {
        int var4 = 0;
        cf var5 = null;
        om var6 = null;
        var4 = 54 / ((67 - param1) / 36);
        if (this.field_d[param0] != null) {
          if (null == this.field_d[param0][param2]) {
            return 0;
          } else {
            var5 = br.a(param0, (byte) -57);
            var6 = var5.field_n[param2];
            return b.a(var6.field_m, var6.field_F, this.field_d[param0][param2].field_c, (byte) 25, this.field_d[param0][param2].field_b);
          }
        } else {
          return 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        if (this.field_d[param3] != null) {
          if (param0 == 65535) {
            L0: {
              if (-1 != param2) {
                if (65535 != param2) {
                  break L0;
                } else {
                  if (param4 != 65535) {
                    break L0;
                  } else {
                    this.field_d[param3][param1] = null;
                    if (ArmiesOfGielinor.field_M) {
                      this.field_d[param3][param1] = new ho(param2, param4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (-1 == param4) {
                  this.field_d[param3][param1] = null;
                  if (ArmiesOfGielinor.field_M) {
                    break L0;
                  } else {
                    return;
                  }
                } else {
                  L1: {
                    if (65535 != param2) {
                      break L1;
                    } else {
                      if (param4 != 65535) {
                        break L1;
                      } else {
                        this.field_d[param3][param1] = null;
                        if (ArmiesOfGielinor.field_M) {
                          break L1;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  this.field_d[param3][param1] = new ho(param2, param4);
                  return;
                }
              }
            }
            this.field_d[param3][param1] = new ho(param2, param4);
            return;
          } else {
            L2: {
              field_b = -24;
              if (-1 != param2) {
                if (65535 != param2) {
                  break L2;
                } else {
                  if (param4 != 65535) {
                    break L2;
                  } else {
                    this.field_d[param3][param1] = null;
                    if (ArmiesOfGielinor.field_M) {
                      this.field_d[param3][param1] = new ho(param2, param4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (-1 == param4) {
                  this.field_d[param3][param1] = null;
                  if (ArmiesOfGielinor.field_M) {
                    break L2;
                  } else {
                    return;
                  }
                } else {
                  L3: {
                    if (65535 != param2) {
                      break L3;
                    } else {
                      if (param4 != 65535) {
                        break L3;
                      } else {
                        this.field_d[param3][param1] = null;
                        if (ArmiesOfGielinor.field_M) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  this.field_d[param3][param1] = new ho(param2, param4);
                  return;
                }
              }
            }
            this.field_d[param3][param1] = new ho(param2, param4);
            return;
          }
        } else {
          this.field_d[param3] = new ho[64];
          if (param0 != 65535) {
            field_b = -24;
            if (-1 == param2) {
              if (-1 == param4) {
                this.field_d[param3][param1] = null;
                if (ArmiesOfGielinor.field_M) {
                  this.field_d[param3][param1] = new ho(param2, param4);
                  return;
                } else {
                  return;
                }
              } else {
                if (65535 == param2) {
                  if (param4 == 65535) {
                    this.field_d[param3][param1] = null;
                    if (ArmiesOfGielinor.field_M) {
                      this.field_d[param3][param1] = new ho(param2, param4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    this.field_d[param3][param1] = new ho(param2, param4);
                    return;
                  }
                } else {
                  this.field_d[param3][param1] = new ho(param2, param4);
                  return;
                }
              }
            } else {
              L4: {
                if (65535 != param2) {
                  break L4;
                } else {
                  if (param4 != 65535) {
                    break L4;
                  } else {
                    this.field_d[param3][param1] = null;
                    if (ArmiesOfGielinor.field_M) {
                      break L4;
                    } else {
                      return;
                    }
                  }
                }
              }
              this.field_d[param3][param1] = new ho(param2, param4);
              return;
            }
          } else {
            L5: {
              if (-1 != param2) {
                if (65535 != param2) {
                  break L5;
                } else {
                  if (param4 != 65535) {
                    break L5;
                  } else {
                    this.field_d[param3][param1] = null;
                    if (ArmiesOfGielinor.field_M) {
                      this.field_d[param3][param1] = new ho(param2, param4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                if (-1 == param4) {
                  this.field_d[param3][param1] = null;
                  if (ArmiesOfGielinor.field_M) {
                    break L5;
                  } else {
                    return;
                  }
                } else {
                  if (65535 == param2) {
                    if (param4 == 65535) {
                      this.field_d[param3][param1] = null;
                      if (ArmiesOfGielinor.field_M) {
                        this.field_d[param3][param1] = new ho(param2, param4);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      this.field_d[param3][param1] = new ho(param2, param4);
                      return;
                    }
                  } else {
                    this.field_d[param3][param1] = new ho(param2, param4);
                    return;
                  }
                }
              }
            }
            this.field_d[param3][param1] = new ho(param2, param4);
            return;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        L0: {
          if (jj.b((byte) -73)) {
            param1 = false;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          nm.a((byte) 95, param1);
          if (gl.field_b) {
            qn.d(ij.field_w.field_a.field_S, ij.field_w.field_a.field_ab, ij.field_w.field_a.field_gb, ij.field_w.field_a.field_ob);
            ij.field_w.field_a.b(param1, 20);
            break L1;
          } else {
            break L1;
          }
        }
        if (param0 != 2000) {
          return;
        } else {
          ArmiesOfGielinor.b(0, param1);
          return;
        }
    }

    public cm() {
        this.field_d = new ho[3][];
    }

    static {
        field_c = "Unrated game";
    }
}
