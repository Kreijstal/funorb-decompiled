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
        ms var2;
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (0 != param1) {
              var3 = new ca();
              no.a(param0, var3, param1, -24721);
              var4 = -10 % ((param2 - -23) / 54);
              stackIn_4_0 = (ca) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("ui.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
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
        ms var2;
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
        int var2;
        ms var3;
        int var4;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var2 = 0;
        if (param0 != 30578) {
          field_k = (String) null;
          var3 = this.field_d.field_s;
          L0: while (true) {
            if (this.field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_s;
              var2++;
              continue L0;
            }
          }
        } else {
          var3 = this.field_d.field_s;
          L1: while (true) {
            if (this.field_d == var3) {
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
        ms var2;
        int var3;
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
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_109_0 = 0;
        int stackIn_177_0 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (11 != sr.a(param3, -1 + param0, 11, (byte) -122)) {
            stackIn_3_0 = 0;
            break L0;
          } else {
            stackIn_3_0 = 1;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (11 != sr.a(param3, param0 - -1, 11, (byte) -115)) {
            stackIn_6_0 = 0;
            break L1;
          } else {
            stackIn_6_0 = 1;
            break L1;
          }
        }
        L2: {
          var6 = stackIn_6_0;
          if (11 != sr.a(param3 - -1, param0, 11, (byte) -104)) {
            stackIn_9_0 = 0;
            break L2;
          } else {
            stackIn_9_0 = 1;
            break L2;
          }
        }
        L3: {
          var7 = stackIn_9_0;
          if (-12 != (sr.a(param3 + -1, param0, 11, (byte) -94) ^ -1)) {
            stackIn_12_0 = 0;
            break L3;
          } else {
            stackIn_12_0 = 1;
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
                        stackIn_177_0 = 0;
                        break L22;
                      } else {
                        stackIn_177_0 = 1;
                        break L22;
                      }
                    } else {
                      stackIn_177_0 = 0;
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
                        stackIn_109_0 = 1;
                        break L33;
                      } else {
                        break L34;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackIn_109_0 = 1;
                      break L33;
                    } else {
                      stackIn_109_0 = 0;
                      break L33;
                    }
                  } else {
                    stackIn_109_0 = 0;
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
                        stackIn_57_0 = 1;
                        break L44;
                      }
                    }
                  }
                  if (var6 != 0) {
                    if (var8 != 0) {
                      stackIn_57_0 = 1;
                      break L44;
                    } else {
                      stackIn_57_0 = 0;
                      break L44;
                    }
                  } else {
                    stackIn_57_0 = 0;
                    break L44;
                  }
                } else {
                  stackIn_57_0 = 1;
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
            var2.c();
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
