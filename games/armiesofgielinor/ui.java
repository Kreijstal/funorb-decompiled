/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static int field_g;
    static String field_e;
    static String field_k;
    static int field_c;
    static char field_i;
    static String field_h;
    private ms field_d;
    static int field_f;
    static boolean field_b;
    static String field_a;
    private ms field_j;

    final ms c(int param0) {
        ms var2 = null;
        var2 = this.field_j;
        if (var2 == this.field_d) {
          this.field_j = null;
          return null;
        } else {
          this.field_j = var2.field_s;
          if (param0 != 24) {
            return (ms) null;
          } else {
            return var2;
          }
        }
    }

    final static ca a(bv param0, int param1, int param2) {
        ca var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_2_0 = null;
        ca stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ca stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (0 != param1) {
              var3 = new ca();
              no.a(param0, var3, param1, -24721);
              var4 = -10 % ((param2 - -23) / 54);
              stackOut_3_0 = (ca) (var3);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3_ref);
            stackOut_5_1 = new StringBuilder().append("ui.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ca) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
    }

    final ms b(int param0) {
        ms var2 = null;
        var2 = this.field_d.field_s;
        if (param0 == 11) {
          if (this.field_d == var2) {
            return null;
          } else {
            var2.c((byte) -76);
            return var2;
          }
        } else {
          return (ms) null;
        }
    }

    public static void d(int param0) {
        field_e = null;
        field_a = null;
        if (param0 <= 93) {
            return;
        }
        field_k = null;
        field_h = null;
    }

    final int a(int param0) {
        int var2 = 0;
        ms var3 = null;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        if (param0 != 30578) {
          field_k = (String) null;
          var3 = this.field_d.field_s;
          L0: while (true) {
            L1: {
              if (this.field_d == var3) {
                break L1;
              } else {
                var3 = var3.field_s;
                var2++;
                if (var4 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            return var2;
          }
        } else {
          var3 = this.field_d.field_s;
          L2: while (true) {
            L3: {
              if (this.field_d == var3) {
                break L3;
              } else {
                var3 = var3.field_s;
                var2++;
                if (var4 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            return var2;
          }
        }
    }

    final void a(ms param0, boolean param1) {
        try {
            if (null != param0.field_l) {
                param0.c((byte) -76);
            }
            param0.field_s = this.field_d;
            if (param1) {
                field_i = '￠';
            }
            param0.field_l = this.field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ui.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ms a(byte param0) {
        ms var2 = null;
        int var3 = 0;
        var2 = this.field_d.field_s;
        var3 = 125 / ((param0 - -44) / 59);
        if (var2 == this.field_d) {
          this.field_j = null;
          return null;
        } else {
          this.field_j = var2.field_s;
          return var2;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_203_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_182_0 = 0;
        int stackOut_180_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (11 != sr.a(param3, -1 + param0, 11, (byte) -122)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (11 != sr.a(param3, param0 - -1, 11, (byte) -115)) {
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 1;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (11 != sr.a(param3 - -1, param0, 11, (byte) -104)) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (-12 != (sr.a(param3 + -1, param0, 11, (byte) -94) ^ -1)) {
            stackOut_11_0 = 0;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = 1;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        L4: {
          var8 = stackIn_12_0;
          var10 = -98 % ((11 - param2) / 40);
          var9 = 0;
          if (var5 != 0) {
            var9++;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var6 != 0) {
            var9++;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (var7 != 0) {
            var9++;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          if (var8 != 0) {
            var9++;
            break L7;
          } else {
            break L7;
          }
        }
        param4 -= 44;
        if (1 < var9) {
          if (var5 == 0) {
            L8: {
              if (var5 == 0) {
                if (var6 == 0) {
                  if (var6 != 0) {
                    if (var8 != 0) {
                      L9: {
                        L10: {
                          var11 = 1;
                          if (var11 != 0) {
                            break L10;
                          } else {
                            L11: {
                              L12: {
                                if (var7 == 0) {
                                  break L12;
                                } else {
                                  if (var8 != 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              if (var5 == 0) {
                                break L9;
                              } else {
                                if (var6 == 0) {
                                  break L9;
                                } else {
                                  l.field_b[25].a(param1, param4);
                                  if (var12 == 0) {
                                    break L9;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                            }
                            l.field_b[26].a(param1, param4);
                            if (var12 == 0) {
                              break L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        L13: {
                          if (var7 == 0) {
                            break L13;
                          } else {
                            l.field_b[30].a(param1, param4);
                            break L13;
                          }
                        }
                        L14: {
                          if (var5 == 0) {
                            break L14;
                          } else {
                            l.field_b[29].a(param1, param4);
                            break L14;
                          }
                        }
                        L15: {
                          l.field_b[24].a(param1, param4);
                          if (var6 == 0) {
                            break L15;
                          } else {
                            l.field_b[27].a(param1, param4);
                            break L15;
                          }
                        }
                        if (var8 == 0) {
                          break L9;
                        } else {
                          l.field_b[28].a(param1, param4);
                          break L9;
                        }
                      }
                      return;
                    } else {
                      stackOut_182_0 = 0;
                      stackIn_203_0 = stackOut_182_0;
                      break L8;
                    }
                  } else {
                    stackOut_180_0 = 0;
                    stackIn_203_0 = stackOut_180_0;
                    break L8;
                  }
                } else {
                  if (var7 == 0) {
                    L16: {
                      if (var6 != 0) {
                        if (var8 == 0) {
                          stackOut_159_0 = 0;
                          stackIn_160_0 = stackOut_159_0;
                          break L16;
                        } else {
                          stackOut_158_0 = 1;
                          stackIn_160_0 = stackOut_158_0;
                          break L16;
                        }
                      } else {
                        stackOut_156_0 = 0;
                        stackIn_160_0 = stackOut_156_0;
                        break L16;
                      }
                    }
                    L17: {
                      L18: {
                        var11 = stackIn_160_0;
                        if (var11 != 0) {
                          break L18;
                        } else {
                          L19: {
                            L20: {
                              if (var7 == 0) {
                                break L20;
                              } else {
                                if (var8 != 0) {
                                  break L19;
                                } else {
                                  break L20;
                                }
                              }
                            }
                            if (var5 == 0) {
                              break L17;
                            } else {
                              if (var6 == 0) {
                                break L17;
                              } else {
                                l.field_b[25].a(param1, param4);
                                if (var12 == 0) {
                                  break L17;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          l.field_b[26].a(param1, param4);
                          if (var12 == 0) {
                            break L17;
                          } else {
                            break L18;
                          }
                        }
                      }
                      L21: {
                        if (var7 == 0) {
                          break L21;
                        } else {
                          l.field_b[30].a(param1, param4);
                          break L21;
                        }
                      }
                      L22: {
                        if (var5 == 0) {
                          break L22;
                        } else {
                          l.field_b[29].a(param1, param4);
                          break L22;
                        }
                      }
                      L23: {
                        l.field_b[24].a(param1, param4);
                        if (var6 == 0) {
                          break L23;
                        } else {
                          l.field_b[27].a(param1, param4);
                          break L23;
                        }
                      }
                      if (var8 == 0) {
                        break L17;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L17;
                      }
                    }
                    return;
                  } else {
                    stackOut_154_0 = 1;
                    stackIn_203_0 = stackOut_154_0;
                    break L8;
                  }
                }
              } else {
                if (var8 == 0) {
                  L24: {
                    L25: {
                      if (var6 == 0) {
                        break L25;
                      } else {
                        if (var7 != 0) {
                          stackOut_131_0 = 1;
                          stackIn_133_0 = stackOut_131_0;
                          break L24;
                        } else {
                          break L25;
                        }
                      }
                    }
                    if (var6 != 0) {
                      if (var8 != 0) {
                        stackOut_130_0 = 1;
                        stackIn_133_0 = stackOut_130_0;
                        break L24;
                      } else {
                        stackOut_129_0 = 0;
                        stackIn_133_0 = stackOut_129_0;
                        break L24;
                      }
                    } else {
                      stackOut_127_0 = 0;
                      stackIn_133_0 = stackOut_127_0;
                      break L24;
                    }
                  }
                  L26: {
                    L27: {
                      var11 = stackIn_133_0;
                      if (var11 != 0) {
                        break L27;
                      } else {
                        L28: {
                          L29: {
                            if (var7 == 0) {
                              break L29;
                            } else {
                              if (var8 != 0) {
                                break L28;
                              } else {
                                break L29;
                              }
                            }
                          }
                          if (var5 == 0) {
                            break L26;
                          } else {
                            if (var6 == 0) {
                              break L26;
                            } else {
                              l.field_b[25].a(param1, param4);
                              if (var12 == 0) {
                                break L26;
                              } else {
                                break L28;
                              }
                            }
                          }
                        }
                        l.field_b[26].a(param1, param4);
                        if (var12 == 0) {
                          break L26;
                        } else {
                          break L27;
                        }
                      }
                    }
                    L30: {
                      if (var7 == 0) {
                        break L30;
                      } else {
                        l.field_b[30].a(param1, param4);
                        break L30;
                      }
                    }
                    L31: {
                      if (var5 == 0) {
                        break L31;
                      } else {
                        l.field_b[29].a(param1, param4);
                        break L31;
                      }
                    }
                    L32: {
                      l.field_b[24].a(param1, param4);
                      if (var6 == 0) {
                        break L32;
                      } else {
                        l.field_b[27].a(param1, param4);
                        break L32;
                      }
                    }
                    if (var8 == 0) {
                      break L26;
                    } else {
                      l.field_b[28].a(param1, param4);
                      break L26;
                    }
                  }
                  return;
                } else {
                  stackOut_122_0 = 1;
                  stackIn_203_0 = stackOut_122_0;
                  break L8;
                }
              }
            }
            var11 = stackIn_203_0;
            if (var11 != 0) {
              if (var7 == 0) {
                if (var5 == 0) {
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    if (var8 == 0) {
                      return;
                    } else {
                      l.field_b[28].a(param1, param4);
                      return;
                    }
                  } else {
                    l.field_b[27].a(param1, param4);
                    if (var8 == 0) {
                      return;
                    } else {
                      l.field_b[28].a(param1, param4);
                      return;
                    }
                  }
                } else {
                  l.field_b[29].a(param1, param4);
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    if (var8 == 0) {
                      return;
                    } else {
                      l.field_b[28].a(param1, param4);
                      return;
                    }
                  } else {
                    l.field_b[27].a(param1, param4);
                    if (var8 != 0) {
                      l.field_b[28].a(param1, param4);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              } else {
                l.field_b[30].a(param1, param4);
                if (var5 == 0) {
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    if (var8 != 0) {
                      l.field_b[28].a(param1, param4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    l.field_b[27].a(param1, param4);
                    if (var8 != 0) {
                      l.field_b[28].a(param1, param4);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  L33: {
                    l.field_b[29].a(param1, param4);
                    l.field_b[24].a(param1, param4);
                    if (var6 == 0) {
                      break L33;
                    } else {
                      l.field_b[27].a(param1, param4);
                      break L33;
                    }
                  }
                  L34: {
                    if (var8 == 0) {
                      break L34;
                    } else {
                      l.field_b[28].a(param1, param4);
                      break L34;
                    }
                  }
                  return;
                }
              }
            } else {
              L35: {
                if (var7 == 0) {
                  break L35;
                } else {
                  if (var8 != 0) {
                    l.field_b[26].a(param1, param4);
                    if (var12 != 0) {
                      L36: {
                        if (var7 == 0) {
                          break L36;
                        } else {
                          l.field_b[30].a(param1, param4);
                          break L36;
                        }
                      }
                      L37: {
                        if (var5 == 0) {
                          break L37;
                        } else {
                          l.field_b[29].a(param1, param4);
                          break L37;
                        }
                      }
                      L38: {
                        l.field_b[24].a(param1, param4);
                        if (var6 == 0) {
                          break L38;
                        } else {
                          l.field_b[27].a(param1, param4);
                          break L38;
                        }
                      }
                      L39: {
                        if (var8 == 0) {
                          break L39;
                        } else {
                          l.field_b[28].a(param1, param4);
                          break L39;
                        }
                      }
                      return;
                    } else {
                      return;
                    }
                  } else {
                    break L35;
                  }
                }
              }
              if (var5 != 0) {
                if (var6 != 0) {
                  l.field_b[25].a(param1, param4);
                  if (var12 != 0) {
                    L40: {
                      l.field_b[26].a(param1, param4);
                      if (var7 == 0) {
                        break L40;
                      } else {
                        l.field_b[30].a(param1, param4);
                        break L40;
                      }
                    }
                    L41: {
                      if (var5 == 0) {
                        break L41;
                      } else {
                        l.field_b[29].a(param1, param4);
                        break L41;
                      }
                    }
                    L42: {
                      l.field_b[24].a(param1, param4);
                      if (var6 == 0) {
                        break L42;
                      } else {
                        l.field_b[27].a(param1, param4);
                        break L42;
                      }
                    }
                    L43: {
                      if (var8 == 0) {
                        break L43;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L43;
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (var7 == 0) {
              L44: {
                L45: {
                  if (var5 == 0) {
                    break L45;
                  } else {
                    if (var8 == 0) {
                      break L45;
                    } else {
                      stackOut_66_0 = 1;
                      stackIn_78_0 = stackOut_66_0;
                      break L44;
                    }
                  }
                }
                L46: {
                  if (var6 == 0) {
                    break L46;
                  } else {
                    if (var7 == 0) {
                      break L46;
                    } else {
                      stackOut_70_0 = 1;
                      stackIn_78_0 = stackOut_70_0;
                      break L44;
                    }
                  }
                }
                if (var6 != 0) {
                  if (var8 != 0) {
                    stackOut_76_0 = 1;
                    stackIn_78_0 = stackOut_76_0;
                    break L44;
                  } else {
                    stackOut_75_0 = 0;
                    stackIn_78_0 = stackOut_75_0;
                    break L44;
                  }
                } else {
                  stackOut_73_0 = 0;
                  stackIn_78_0 = stackOut_73_0;
                  break L44;
                }
              }
              var11 = stackIn_78_0;
              if (var11 == 0) {
                L47: {
                  if (var7 == 0) {
                    break L47;
                  } else {
                    if (var8 == 0) {
                      break L47;
                    } else {
                      L48: {
                        l.field_b[26].a(param1, param4);
                        if (var12 == 0) {
                          break L48;
                        } else {
                          L49: {
                            if (var7 == 0) {
                              break L49;
                            } else {
                              l.field_b[30].a(param1, param4);
                              break L49;
                            }
                          }
                          L50: {
                            if (var5 == 0) {
                              break L50;
                            } else {
                              l.field_b[29].a(param1, param4);
                              break L50;
                            }
                          }
                          L51: {
                            l.field_b[24].a(param1, param4);
                            if (var6 == 0) {
                              break L51;
                            } else {
                              l.field_b[27].a(param1, param4);
                              break L51;
                            }
                          }
                          if (var8 == 0) {
                            break L48;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L48;
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                if (var5 != 0) {
                  if (var6 == 0) {
                    return;
                  } else {
                    L52: {
                      l.field_b[25].a(param1, param4);
                      if (var12 == 0) {
                        break L52;
                      } else {
                        l.field_b[26].a(param1, param4);
                        if (var12 == 0) {
                          break L52;
                        } else {
                          L53: {
                            if (var7 == 0) {
                              break L53;
                            } else {
                              l.field_b[30].a(param1, param4);
                              break L53;
                            }
                          }
                          L54: {
                            if (var5 == 0) {
                              break L54;
                            } else {
                              l.field_b[29].a(param1, param4);
                              break L54;
                            }
                          }
                          L55: {
                            l.field_b[24].a(param1, param4);
                            if (var6 == 0) {
                              break L55;
                            } else {
                              l.field_b[27].a(param1, param4);
                              break L55;
                            }
                          }
                          if (var8 == 0) {
                            break L52;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L52;
                          }
                        }
                      }
                    }
                    return;
                  }
                } else {
                  return;
                }
              } else {
                L56: {
                  if (var7 == 0) {
                    break L56;
                  } else {
                    l.field_b[30].a(param1, param4);
                    break L56;
                  }
                }
                L57: {
                  if (var5 == 0) {
                    break L57;
                  } else {
                    l.field_b[29].a(param1, param4);
                    break L57;
                  }
                }
                L58: {
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    break L58;
                  } else {
                    l.field_b[27].a(param1, param4);
                    break L58;
                  }
                }
                L59: {
                  if (var8 == 0) {
                    break L59;
                  } else {
                    l.field_b[28].a(param1, param4);
                    break L59;
                  }
                }
                return;
              }
            } else {
              L60: {
                L61: {
                  var11 = 1;
                  if (var11 != 0) {
                    break L61;
                  } else {
                    L62: {
                      if (var8 != 0) {
                        break L62;
                      } else {
                        if (var5 == 0) {
                          break L60;
                        } else {
                          if (var6 == 0) {
                            break L60;
                          } else {
                            l.field_b[25].a(param1, param4);
                            if (var12 == 0) {
                              break L60;
                            } else {
                              break L62;
                            }
                          }
                        }
                      }
                    }
                    l.field_b[26].a(param1, param4);
                    if (var12 == 0) {
                      break L60;
                    } else {
                      break L61;
                    }
                  }
                }
                L63: {
                  if (var7 == 0) {
                    break L63;
                  } else {
                    l.field_b[30].a(param1, param4);
                    break L63;
                  }
                }
                L64: {
                  if (var5 == 0) {
                    break L64;
                  } else {
                    l.field_b[29].a(param1, param4);
                    break L64;
                  }
                }
                L65: {
                  l.field_b[24].a(param1, param4);
                  if (var6 == 0) {
                    break L65;
                  } else {
                    l.field_b[27].a(param1, param4);
                    break L65;
                  }
                }
                if (var8 == 0) {
                  break L60;
                } else {
                  l.field_b[28].a(param1, param4);
                  break L60;
                }
              }
              return;
            }
          }
        } else {
          L66: {
            L67: {
              var11 = 1;
              if (var11 != 0) {
                break L67;
              } else {
                L68: {
                  L69: {
                    if (var7 == 0) {
                      break L69;
                    } else {
                      if (var8 != 0) {
                        break L68;
                      } else {
                        break L69;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L66;
                  } else {
                    if (var6 == 0) {
                      break L66;
                    } else {
                      l.field_b[25].a(param1, param4);
                      if (var12 == 0) {
                        break L66;
                      } else {
                        break L68;
                      }
                    }
                  }
                }
                l.field_b[26].a(param1, param4);
                if (var12 == 0) {
                  break L66;
                } else {
                  break L67;
                }
              }
            }
            L70: {
              if (var7 == 0) {
                break L70;
              } else {
                l.field_b[30].a(param1, param4);
                break L70;
              }
            }
            L71: {
              if (var5 == 0) {
                break L71;
              } else {
                l.field_b[29].a(param1, param4);
                break L71;
              }
            }
            L72: {
              l.field_b[24].a(param1, param4);
              if (var6 == 0) {
                break L72;
              } else {
                l.field_b[27].a(param1, param4);
                break L72;
              }
            }
            if (var8 == 0) {
              break L66;
            } else {
              l.field_b[28].a(param1, param4);
              break L66;
            }
          }
          return;
        }
    }

    final static void a(byte param0, kl param1) {
        qs var2 = null;
        sn discarded$0 = null;
        try {
            qs.a(param1.a("", 96, "headers.packvorbis"));
            var2 = qs.a(param1, "jagex logo2.packvorbis", "");
            if (param0 >= -102) {
                ui.a(-11, -82, (byte) 79, 117, -17);
            }
            discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "ui.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public ui() {
        this.field_d = new ms();
        this.field_d.field_l = this.field_d;
        this.field_d.field_s = this.field_d;
    }

    static {
        field_e = "Accept";
        field_h = "Username: ";
        field_k = "This unit cannot move";
        field_a = "Out of range";
    }
}
