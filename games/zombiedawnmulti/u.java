/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class u extends br {
    static String field_k;
    static boolean field_i;
    int[] field_h;
    static String field_j;
    static String field_f;
    int field_g;

    final static int b(int param0, int param1) {
        ll discarded$1 = null;
        int var2 = 0;
        int var3 = 0;
        go var4 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        vh.field_Gb = null;
        vo.field_o = null;
        la.field_d = 0;
        var2 = qe.field_f;
        qe.field_f = ll.field_b;
        ll.field_b = var2;
        if (param1 == 5) {
          if (-52 != (param0 ^ -1)) {
            if (param0 != 50) {
              i.field_a.field_p = 1;
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                L0: {
                  if (-3 < (i.field_a.field_n ^ -1)) {
                    break L0;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L0;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  L1: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L1;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L1;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              i.field_a.field_p = 5;
              if (var3 == 0) {
                i.field_a.field_n = i.field_a.field_n + 1;
                if (i.field_a.field_n < 2) {
                  L2: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L2;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L2;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 == 51) {
                    return 2;
                  } else {
                    L3: {
                      if (-3 < (i.field_a.field_n ^ -1)) {
                        break L3;
                      } else {
                        if ((param0 ^ -1) != -51) {
                          break L3;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              } else {
                i.field_a.field_p = 1;
                i.field_a.field_n = i.field_a.field_n + 1;
                if (i.field_a.field_n < 2) {
                  L4: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L4;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L4;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                } else {
                  if (param0 == 51) {
                    return 2;
                  } else {
                    L5: {
                      if (-3 < (i.field_a.field_n ^ -1)) {
                        break L5;
                      } else {
                        if ((param0 ^ -1) != -51) {
                          break L5;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  }
                }
              }
            }
          } else {
            i.field_a.field_p = 2;
            if (var3 != 0) {
              if (param0 != 50) {
                L6: {
                  i.field_a.field_p = 1;
                  i.field_a.field_n = i.field_a.field_n + 1;
                  if (i.field_a.field_n < 2) {
                    break L6;
                  } else {
                    if (param0 == 51) {
                      return 2;
                    } else {
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-3 < (i.field_a.field_n ^ -1)) {
                    break L7;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L7;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 > i.field_a.field_n) {
                  return -1;
                } else {
                  return 1;
                }
              } else {
                i.field_a.field_p = 5;
                if (var3 == 0) {
                  i.field_a.field_n = i.field_a.field_n + 1;
                  if (i.field_a.field_n < 2) {
                    L8: {
                      if (-3 < (i.field_a.field_n ^ -1)) {
                        break L8;
                      } else {
                        if ((param0 ^ -1) != -51) {
                          break L8;
                        } else {
                          return 5;
                        }
                      }
                    }
                    if (4 > i.field_a.field_n) {
                      return -1;
                    } else {
                      return 1;
                    }
                  } else {
                    if (param0 == 51) {
                      return 2;
                    } else {
                      if (-3 >= (i.field_a.field_n ^ -1)) {
                        if ((param0 ^ -1) != -51) {
                          if (4 > i.field_a.field_n) {
                            return -1;
                          } else {
                            return 1;
                          }
                        } else {
                          return 5;
                        }
                      } else {
                        if (4 > i.field_a.field_n) {
                          return -1;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                } else {
                  L9: {
                    i.field_a.field_p = 1;
                    i.field_a.field_n = i.field_a.field_n + 1;
                    if (i.field_a.field_n < 2) {
                      break L9;
                    } else {
                      if (param0 == 51) {
                        return 2;
                      } else {
                        break L9;
                      }
                    }
                  }
                  L10: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L10;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L10;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 > i.field_a.field_n) {
                    return -1;
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                L11: {
                  if (-3 < (i.field_a.field_n ^ -1)) {
                    break L11;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L11;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 <= i.field_a.field_n) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param0 != 51) {
                  L12: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L12;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L12;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 <= i.field_a.field_n) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            }
          }
        } else {
          var4 = (go) null;
          discarded$1 = u.a(-78, (go) null, 25, -28, -35, -43);
          if (-52 == (param0 ^ -1)) {
            i.field_a.field_p = 2;
            if (var3 != 0) {
              L13: {
                if (param0 != 50) {
                  i.field_a.field_p = 1;
                  break L13;
                } else {
                  i.field_a.field_p = 5;
                  if (var3 == 0) {
                    break L13;
                  } else {
                    i.field_a.field_p = 1;
                    break L13;
                  }
                }
              }
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                L14: {
                  if (-3 < (i.field_a.field_n ^ -1)) {
                    break L14;
                  } else {
                    if ((param0 ^ -1) != -51) {
                      break L14;
                    } else {
                      return 5;
                    }
                  }
                }
                if (4 <= i.field_a.field_n) {
                  return 1;
                } else {
                  return -1;
                }
              } else {
                if (param0 != 51) {
                  L15: {
                    if (-3 < (i.field_a.field_n ^ -1)) {
                      break L15;
                    } else {
                      if ((param0 ^ -1) != -51) {
                        break L15;
                      } else {
                        return 5;
                      }
                    }
                  }
                  if (4 <= i.field_a.field_n) {
                    return 1;
                  } else {
                    return -1;
                  }
                } else {
                  return 2;
                }
              }
            } else {
              L16: {
                i.field_a.field_n = i.field_a.field_n + 1;
                if (i.field_a.field_n < 2) {
                  break L16;
                } else {
                  if (param0 == 51) {
                    return 2;
                  } else {
                    break L16;
                  }
                }
              }
              L17: {
                if (-3 < (i.field_a.field_n ^ -1)) {
                  break L17;
                } else {
                  if ((param0 ^ -1) != -51) {
                    break L17;
                  } else {
                    return 5;
                  }
                }
              }
              if (4 <= i.field_a.field_n) {
                return 1;
              } else {
                return -1;
              }
            }
          } else {
            L18: {
              if (param0 != 50) {
                i.field_a.field_p = 1;
                break L18;
              } else {
                i.field_a.field_p = 5;
                if (var3 == 0) {
                  break L18;
                } else {
                  i.field_a.field_p = 1;
                  break L18;
                }
              }
            }
            L19: {
              i.field_a.field_n = i.field_a.field_n + 1;
              if (i.field_a.field_n < 2) {
                break L19;
              } else {
                if (param0 == 51) {
                  return 2;
                } else {
                  break L19;
                }
              }
            }
            L20: {
              if (-3 < (i.field_a.field_n ^ -1)) {
                break L20;
              } else {
                if ((param0 ^ -1) != -51) {
                  break L20;
                } else {
                  return 5;
                }
              }
            }
            if (4 <= i.field_a.field_n) {
              return 1;
            } else {
              return -1;
            }
          }
        }
    }

    final static ja[] a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 21242) {
            return (ja[]) null;
        }
        return qa.a(param3, param4, 1, 3, (byte) 127, param2, param1, 1, 1);
    }

    final static ul a(int param0, int param1) {
        if (param0 != 5) {
          field_k = (String) null;
          return wm.a(param1, 1, true, false, 19, false);
        } else {
          return wm.a(param1, 1, true, false, 19, false);
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_f = null;
        if (param0 != -7406) {
            field_k = (String) null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final static int a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_33_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        byte stackOut_9_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_11_0 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (!ba.c(-1)) {
                    break L3;
                  } else {
                    aq.field_B.d(99);
                    stackOut_3_0 = aq.field_B.c(-85);
                    stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var1_int = 1;
                          break L4;
                        }
                      }
                      if (-14 == (sj.field_p ^ -1)) {
                        var2 = 1;
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
                aq.field_B.a(iq.a(bo.field_d, -1, bd.field_g), 76, iq.a(ka.field_t, -1, vb.field_f));
                stackOut_9_0 = param0;
                stackIn_10_0 = stackOut_9_0;
                break L2;
              }
              if (stackIn_10_0 <= -50) {
                L5: {
                  if (!aq.field_B.c(-85)) {
                    break L5;
                  } else {
                    var1_int = 1;
                    break L5;
                  }
                }
                L6: {
                  L7: {
                    L8: {
                      var3 = 0;
                      if (var1_int == 0) {
                        break L8;
                      } else {
                        if ((aq.field_B.field_d ^ -1) <= -1) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L6;
                    } else {
                      if (2 == ho.field_q) {
                        break L6;
                      } else {
                        ek.i(126);
                        if (var7 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L9: {
                    var3 = v.field_b[aq.field_B.field_d];
                    if (2 == var3) {
                      break L9;
                    } else {
                      if (5 == var3) {
                        break L9;
                      } else {
                        break L6;
                      }
                    }
                  }
                  ek.i(81);
                  break L6;
                }
                L10: {
                  if (-1 != (var3 ^ -1)) {
                    break L10;
                  } else {
                    if (ho.field_q == 2) {
                      var4 = bl.a((byte) 118) - so.field_s;
                      var6 = (int)((-var4 + 10999L) / 1000L);
                      if (-1 <= (var6 ^ -1)) {
                        eb.a(false, true, 5);
                        var3 = 2;
                        break L10;
                      } else {
                        break L10;
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                stackOut_32_0 = var3;
                stackIn_33_0 = stackOut_32_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_11_0 = 119;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "u.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_12_0;
        } else {
          return stackIn_33_0;
        }
    }

    final static ll a(int param0, go param1, int param2, int param3, int param4, int param5) {
        java.awt.Component discarded$2 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        ll var7 = null;
        java.awt.Frame var8 = null;
        ll stackIn_2_0 = null;
        ll stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ll stackOut_6_0 = null;
        ll stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var8 = m.a(param5, param1, param4, param3, param2, 88);
            var6 = var8;
            if (param0 == 10386) {
              if (var8 != null) {
                var7 = new ll();
                var7.field_i = var8;
                discarded$2 = var7.field_i.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param5, param2);
                var7.addFocusListener(var7);
                var7.requestFocus();
                stackOut_6_0 = (ll) (var7);
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = (ll) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var6_ref);
            stackOut_8_1 = new StringBuilder().append("u.A(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_7_0;
        }
    }

    private u() throws Throwable {
        throw new Error();
    }

    static {
        field_k = "(1 player wants to join)";
        field_j = "Rematch?";
        field_f = "Invalid name";
    }
}
