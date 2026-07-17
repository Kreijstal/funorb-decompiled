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
        var2 = ((ui) this).field_j;
        if (var2 == ((ui) this).field_d) {
          ((ui) this).field_j = null;
          return null;
        } else {
          ((ui) this).field_j = var2.field_s;
          if (param0 != 24) {
            return null;
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
              no.a(param0, (uo) (Object) var3, param1, -24721);
              var4 = 0;
              stackOut_3_0 = (ca) var3;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ca) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("ui.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + 80 + 41);
        }
        return stackIn_4_0;
    }

    final ms b(int param0) {
        ms var2 = null;
        var2 = ((ui) this).field_d.field_s;
        if (param0 == 11) {
          if (((ui) this).field_d == var2) {
            return null;
          } else {
            var2.c((byte) -76);
            return var2;
          }
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_e = null;
        field_a = null;
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
          field_k = null;
          var3 = ((ui) this).field_d.field_s;
          L0: while (true) {
            if (((ui) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_s;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = ((ui) this).field_d.field_s;
          L1: while (true) {
            if (((ui) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_s;
              var2++;
              continue L1;
            }
          }
        }
    }

    final void a(ms param0, boolean param1) {
        try {
            if (null != param0.field_l) {
                param0.c((byte) -76);
            }
            param0.field_s = ((ui) this).field_d;
            if (param1) {
                field_i = '￠';
            }
            param0.field_l = ((ui) this).field_d.field_l;
            param0.field_l.field_s = param0;
            param0.field_s.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ui.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final ms a(byte param0) {
        ms var2 = null;
        int var3 = 0;
        var2 = ((ui) this).field_d.field_s;
        var3 = 125 / ((param0 - -44) / 59);
        if (var2 == ((ui) this).field_d) {
          ((ui) this).field_j = null;
          return null;
        } else {
          ((ui) this).field_j = var2.field_s;
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
        int stackIn_57_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_177_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_176_0 = 0;
        int stackOut_175_0 = 0;
        int stackOut_173_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_45_0 = 0;
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
          if (sr.a(param3 + -1, param0, 11, (byte) -94) != 11) {
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
            if (var5 == 0) {
              if (var6 == 0) {
                L8: {
                  if (var6 == 0) {
                    break L8;
                  } else {
                    if (var8 == 0) {
                      break L8;
                    } else {
                      L9: {
                        var11 = 1;
                        if (var11 != 0) {
                          L10: {
                            if (var7 == 0) {
                              break L10;
                            } else {
                              l.field_b[30].a(param1, param4);
                              break L10;
                            }
                          }
                          L11: {
                            if (var5 == 0) {
                              break L11;
                            } else {
                              l.field_b[29].a(param1, param4);
                              break L11;
                            }
                          }
                          L12: {
                            l.field_b[24].a(param1, param4);
                            if (var6 == 0) {
                              break L12;
                            } else {
                              l.field_b[27].a(param1, param4);
                              break L12;
                            }
                          }
                          if (var8 == 0) {
                            break L9;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L9;
                          }
                        } else {
                          L13: {
                            if (var7 == 0) {
                              break L13;
                            } else {
                              if (var8 != 0) {
                                l.field_b[26].a(param1, param4);
                                break L9;
                              } else {
                                break L13;
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
                              break L9;
                            }
                          }
                        }
                      }
                      return;
                    }
                  }
                }
                L14: {
                  var11 = 0;
                  if (var11 != 0) {
                    if (var7 == 0) {
                      if (var5 == 0) {
                        l.field_b[24].a(param1, param4);
                        if (var6 == 0) {
                          if (var8 == 0) {
                            break L14;
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
                          if (var8 == 0) {
                            return;
                          } else {
                            l.field_b[28].a(param1, param4);
                            return;
                          }
                        }
                      }
                    } else {
                      l.field_b[30].a(param1, param4);
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
                        L15: {
                          l.field_b[29].a(param1, param4);
                          l.field_b[24].a(param1, param4);
                          if (var6 == 0) {
                            break L15;
                          } else {
                            l.field_b[27].a(param1, param4);
                            break L15;
                          }
                        }
                        L16: {
                          if (var8 == 0) {
                            break L16;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L16;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    L17: {
                      if (var7 == 0) {
                        break L17;
                      } else {
                        if (var8 != 0) {
                          l.field_b[26].a(param1, param4);
                          return;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L14;
                    } else {
                      if (var6 == 0) {
                        break L14;
                      } else {
                        l.field_b[25].a(param1, param4);
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                if (var7 != 0) {
                  var11 = 1;
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
                          L18: {
                            l.field_b[27].a(param1, param4);
                            if (var8 == 0) {
                              break L18;
                            } else {
                              l.field_b[28].a(param1, param4);
                              break L18;
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      l.field_b[30].a(param1, param4);
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
                          L19: {
                            l.field_b[27].a(param1, param4);
                            if (var8 == 0) {
                              break L19;
                            } else {
                              l.field_b[28].a(param1, param4);
                              break L19;
                            }
                          }
                          return;
                        }
                      } else {
                        L20: {
                          l.field_b[29].a(param1, param4);
                          l.field_b[24].a(param1, param4);
                          if (var6 == 0) {
                            break L20;
                          } else {
                            l.field_b[27].a(param1, param4);
                            break L20;
                          }
                        }
                        L21: {
                          if (var8 == 0) {
                            break L21;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L21;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    if (var8 == 0) {
                      if (var5 != 0) {
                        if (var6 != 0) {
                          l.field_b[25].a(param1, param4);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      l.field_b[26].a(param1, param4);
                      return;
                    }
                  }
                } else {
                  L22: {
                    if (var6 != 0) {
                      if (var8 == 0) {
                        stackOut_176_0 = 0;
                        stackIn_177_0 = stackOut_176_0;
                        break L22;
                      } else {
                        stackOut_175_0 = 1;
                        stackIn_177_0 = stackOut_175_0;
                        break L22;
                      }
                    } else {
                      stackOut_173_0 = 0;
                      stackIn_177_0 = stackOut_173_0;
                      break L22;
                    }
                  }
                  L23: {
                    var11 = stackIn_177_0;
                    if (var11 != 0) {
                      L24: {
                        if (var7 == 0) {
                          break L24;
                        } else {
                          l.field_b[30].a(param1, param4);
                          break L24;
                        }
                      }
                      L25: {
                        if (var5 == 0) {
                          break L25;
                        } else {
                          l.field_b[29].a(param1, param4);
                          break L25;
                        }
                      }
                      L26: {
                        l.field_b[24].a(param1, param4);
                        if (var6 == 0) {
                          break L26;
                        } else {
                          l.field_b[27].a(param1, param4);
                          break L26;
                        }
                      }
                      if (var8 == 0) {
                        break L23;
                      } else {
                        l.field_b[28].a(param1, param4);
                        break L23;
                      }
                    } else {
                      L27: {
                        if (var7 == 0) {
                          break L27;
                        } else {
                          if (var8 != 0) {
                            l.field_b[26].a(param1, param4);
                            break L23;
                          } else {
                            break L27;
                          }
                        }
                      }
                      if (var5 == 0) {
                        break L23;
                      } else {
                        if (var6 == 0) {
                          break L23;
                        } else {
                          l.field_b[25].a(param1, param4);
                          break L23;
                        }
                      }
                    }
                  }
                  return;
                }
              }
            } else {
              if (var8 != 0) {
                var11 = 1;
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
                        L28: {
                          l.field_b[27].a(param1, param4);
                          if (var8 == 0) {
                            break L28;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L28;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    l.field_b[30].a(param1, param4);
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
                        L29: {
                          l.field_b[27].a(param1, param4);
                          if (var8 == 0) {
                            break L29;
                          } else {
                            l.field_b[28].a(param1, param4);
                            break L29;
                          }
                        }
                        return;
                      }
                    } else {
                      L30: {
                        l.field_b[29].a(param1, param4);
                        l.field_b[24].a(param1, param4);
                        if (var6 == 0) {
                          break L30;
                        } else {
                          l.field_b[27].a(param1, param4);
                          break L30;
                        }
                      }
                      L31: {
                        if (var8 == 0) {
                          break L31;
                        } else {
                          l.field_b[28].a(param1, param4);
                          break L31;
                        }
                      }
                      return;
                    }
                  }
                } else {
                  L32: {
                    if (var7 == 0) {
                      break L32;
                    } else {
                      if (var8 == 0) {
                        break L32;
                      } else {
                        l.field_b[26].a(param1, param4);
                        return;
                      }
                    }
                  }
                  if (var5 != 0) {
                    if (var6 != 0) {
                      l.field_b[25].a(param1, param4);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L33: {
                  L34: {
                    if (var6 == 0) {
                      break L34;
                    } else {
                      if (var7 != 0) {
                        stackOut_107_0 = 1;
                        stackIn_109_0 = stackOut_107_0;
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackOut_106_0 = 1;
                      stackIn_109_0 = stackOut_106_0;
                      break L33;
                    } else {
                      stackOut_105_0 = 0;
                      stackIn_109_0 = stackOut_105_0;
                      break L33;
                    }
                  } else {
                    stackOut_103_0 = 0;
                    stackIn_109_0 = stackOut_103_0;
                    break L33;
                  }
                }
                L35: {
                  var11 = stackIn_109_0;
                  if (var11 != 0) {
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
                    if (var8 == 0) {
                      break L35;
                    } else {
                      l.field_b[28].a(param1, param4);
                      break L35;
                    }
                  } else {
                    L39: {
                      if (var7 == 0) {
                        break L39;
                      } else {
                        if (var8 != 0) {
                          l.field_b[26].a(param1, param4);
                          break L35;
                        } else {
                          break L39;
                        }
                      }
                    }
                    if (var5 == 0) {
                      break L35;
                    } else {
                      if (var6 == 0) {
                        break L35;
                      } else {
                        l.field_b[25].a(param1, param4);
                        break L35;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (var7 != 0) {
              var11 = 1;
              if (var11 == 0) {
                if (var8 == 0) {
                  if (var5 != 0) {
                    if (var6 == 0) {
                      return;
                    } else {
                      l.field_b[25].a(param1, param4);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  l.field_b[26].a(param1, param4);
                  return;
                }
              } else {
                L40: {
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
              }
            } else {
              L44: {
                if (var8 == 0) {
                  L45: {
                    if (var6 == 0) {
                      break L45;
                    } else {
                      if (var7 == 0) {
                        break L45;
                      } else {
                        stackOut_49_0 = 1;
                        stackIn_57_0 = stackOut_49_0;
                        break L44;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackOut_55_0 = 1;
                      stackIn_57_0 = stackOut_55_0;
                      break L44;
                    } else {
                      stackOut_54_0 = 0;
                      stackIn_57_0 = stackOut_54_0;
                      break L44;
                    }
                  } else {
                    stackOut_52_0 = 0;
                    stackIn_57_0 = stackOut_52_0;
                    break L44;
                  }
                } else {
                  stackOut_45_0 = 1;
                  stackIn_57_0 = stackOut_45_0;
                  break L44;
                }
              }
              L46: {
                var11 = stackIn_57_0;
                if (var11 != 0) {
                  L47: {
                    if (var7 == 0) {
                      break L47;
                    } else {
                      l.field_b[30].a(param1, param4);
                      break L47;
                    }
                  }
                  L48: {
                    if (var5 == 0) {
                      break L48;
                    } else {
                      l.field_b[29].a(param1, param4);
                      break L48;
                    }
                  }
                  L49: {
                    l.field_b[24].a(param1, param4);
                    if (var6 == 0) {
                      break L49;
                    } else {
                      l.field_b[27].a(param1, param4);
                      break L49;
                    }
                  }
                  if (var8 == 0) {
                    break L46;
                  } else {
                    l.field_b[28].a(param1, param4);
                    break L46;
                  }
                } else {
                  L50: {
                    if (var7 == 0) {
                      break L50;
                    } else {
                      if (var8 != 0) {
                        l.field_b[26].a(param1, param4);
                        break L46;
                      } else {
                        break L50;
                      }
                    }
                  }
                  if (var5 == 0) {
                    break L46;
                  } else {
                    if (var6 == 0) {
                      break L46;
                    } else {
                      l.field_b[25].a(param1, param4);
                      break L46;
                    }
                  }
                }
              }
              return;
            }
          }
        } else {
          L51: {
            var11 = 1;
            if (var11 != 0) {
              L52: {
                if (var7 == 0) {
                  break L52;
                } else {
                  l.field_b[30].a(param1, param4);
                  break L52;
                }
              }
              L53: {
                if (var5 == 0) {
                  break L53;
                } else {
                  l.field_b[29].a(param1, param4);
                  break L53;
                }
              }
              L54: {
                l.field_b[24].a(param1, param4);
                if (var6 == 0) {
                  break L54;
                } else {
                  l.field_b[27].a(param1, param4);
                  break L54;
                }
              }
              if (var8 == 0) {
                break L51;
              } else {
                l.field_b[28].a(param1, param4);
                break L51;
              }
            } else {
              L55: {
                if (var7 == 0) {
                  break L55;
                } else {
                  if (var8 != 0) {
                    l.field_b[26].a(param1, param4);
                    break L51;
                  } else {
                    break L55;
                  }
                }
              }
              if (var5 == 0) {
                break L51;
              } else {
                if (var6 == 0) {
                  break L51;
                } else {
                  l.field_b[25].a(param1, param4);
                  break L51;
                }
              }
            }
          }
          return;
        }
    }

    final static void a(byte param0, kl param1) {
        qs var2 = null;
        try {
            qs.a(param1.a("", 96, "headers.packvorbis"));
            var2 = qs.a(param1, "jagex logo2.packvorbis", "");
            if (param0 >= -102) {
                ui.a(-11, -82, (byte) 79, 117, -17);
            }
            sn discarded$0 = var2.c();
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ui.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public ui() {
        ((ui) this).field_d = new ms();
        ((ui) this).field_d.field_l = ((ui) this).field_d;
        ((ui) this).field_d.field_s = ((ui) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Accept";
        field_h = "Username: ";
        field_k = "This unit cannot move";
        field_a = "Out of range";
    }
}
