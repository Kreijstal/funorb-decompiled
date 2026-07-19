/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dj {
    static String field_a;
    static StringBuilder field_b;
    static String field_c;

    abstract byte[] a(boolean param0);

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != 48) {
            return;
        }
        field_b = null;
    }

    final static String a(CharSequence param0, byte param1) {
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        StringBuilder var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String stackIn_28_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_27_0 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var2_int = 55 % ((-79 - param1) / 36);
            var3 = param0.length();
            var4 = new StringBuilder(var3);
            var5 = 0;
            L1: while (true) {
              L2: {
                if ((var3 ^ -1) >= (var5 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      var6 = param0.charAt(var5);
                      if (var6 < 97) {
                        break L4;
                      } else {
                        if (var6 <= 122) {
                          discarded$6 = var4.append((char) var6);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (var6 < 48) {
                        break L5;
                      } else {
                        if (var6 <= 57) {
                          discarded$7 = var4.append((char) var6);
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 65) {
                        break L6;
                      } else {
                        if (90 < var6) {
                          break L6;
                        } else {
                          discarded$8 = var4.append((char)(32 + var6));
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    L7: {
                      L8: {
                        if (var6 == 43) {
                          break L8;
                        } else {
                          if (var6 != 38) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      discarded$9 = var4.append('+');
                      if (var8 == 0) {
                        break L3;
                      } else {
                        break L7;
                      }
                    }
                    L9: {
                      var7 = var4.length();
                      if (0 >= var7) {
                        break L9;
                      } else {
                        if (-96 == (var4.charAt(-1 + var7) ^ -1)) {
                          break L9;
                        } else {
                          discarded$10 = var4.append('_');
                          break L9;
                        }
                      }
                    }
                    if (var8 == 0) {
                      break L3;
                    } else {
                      discarded$11 = var4.append((char) var6);
                      break L3;
                    }
                  }
                  var5++;
                  if (var8 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_27_0 = var4.toString();
              stackIn_28_0 = stackOut_27_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var2 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) (var2);
            stackOut_29_1 = new StringBuilder().append("dj.E(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_32_0), stackIn_32_2 + ',' + param1 + ')');
        }
        return stackIn_28_0;
    }

    final static void a(boolean param0, boolean param1) {
        boolean discarded$26 = false;
        boolean discarded$27 = false;
        boolean discarded$28 = false;
        boolean discarded$29 = false;
        boolean discarded$30 = false;
        boolean discarded$31 = false;
        boolean discarded$32 = false;
        boolean discarded$33 = false;
        boolean discarded$34 = false;
        boolean discarded$35 = false;
        boolean discarded$36 = false;
        boolean discarded$37 = false;
        boolean discarded$38 = false;
        boolean discarded$39 = false;
        boolean discarded$40 = false;
        boolean discarded$41 = false;
        boolean discarded$42 = false;
        boolean discarded$43 = false;
        boolean discarded$44 = false;
        boolean discarded$45 = false;
        boolean discarded$46 = false;
        boolean discarded$47 = false;
        boolean discarded$48 = false;
        boolean discarded$49 = false;
        boolean discarded$50 = false;
        boolean discarded$51 = false;
        int var2 = 0;
        int var3 = 0;
        var3 = Transmogrify.field_A ? 1 : 0;
        if ((wj.field_o ^ -1) >= -1) {
          if (!qj.b((byte) 73)) {
            var2 = 1;
            if (var3 == 0) {
              if (null == vg.field_b) {
                if (wc.field_b) {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    discarded$26 = dj.b(1);
                    return;
                  }
                } else {
                  if (param0) {
                    return;
                  } else {
                    discarded$27 = dj.b(1);
                    return;
                  }
                }
              } else {
                if (param0) {
                  return;
                } else {
                  discarded$28 = dj.b(1);
                  return;
                }
              }
            } else {
              var2 = 0;
              if (var3 == 0) {
                L0: {
                  if (null != vg.field_b) {
                    break L0;
                  } else {
                    if (!wc.field_b) {
                      break L0;
                    } else {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        discarded$29 = dj.b(1);
                        return;
                      }
                    }
                  }
                }
                if (param0) {
                  return;
                } else {
                  discarded$30 = dj.b(1);
                  return;
                }
              } else {
                if (vg.field_b == null) {
                  L1: {
                    L2: {
                      ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                      if (null != ub.field_c) {
                        break L2;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L1;
                  }
                  L3: {
                    if (null != vg.field_b) {
                      break L3;
                    } else {
                      if (!wc.field_b) {
                        break L3;
                      } else {
                        tf.a((byte) 46, param1, var2);
                        if (param0) {
                          return;
                        } else {
                          discarded$31 = dj.b(1);
                          return;
                        }
                      }
                    }
                  }
                  if (param0) {
                    return;
                  } else {
                    discarded$32 = dj.b(1);
                    return;
                  }
                } else {
                  ub.field_c = vg.field_b.d((byte) -18);
                  kc.a(-14226, 2);
                  if (var3 == 0) {
                    L4: {
                      L5: {
                        if (null != ub.field_c) {
                          break L5;
                        } else {
                          var2 = 3;
                          if (var3 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = 2;
                      cj.a(ub.field_c, 13861);
                      break L4;
                    }
                    L6: {
                      if (null != vg.field_b) {
                        break L6;
                      } else {
                        if (!wc.field_b) {
                          break L6;
                        } else {
                          tf.a((byte) 46, param1, var2);
                          if (param0) {
                            return;
                          } else {
                            discarded$33 = dj.b(1);
                            return;
                          }
                        }
                      }
                    }
                    if (param0) {
                      return;
                    } else {
                      discarded$34 = dj.b(1);
                      return;
                    }
                  } else {
                    L7: {
                      L8: {
                        ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                        if (null != ub.field_c) {
                          break L8;
                        } else {
                          var2 = 3;
                          if (var3 == 0) {
                            break L7;
                          } else {
                            break L8;
                          }
                        }
                      }
                      var2 = 2;
                      cj.a(ub.field_c, 13861);
                      break L7;
                    }
                    L9: {
                      if (null != vg.field_b) {
                        break L9;
                      } else {
                        if (!wc.field_b) {
                          break L9;
                        } else {
                          tf.a((byte) 46, param1, var2);
                          if (param0) {
                            return;
                          } else {
                            discarded$35 = dj.b(1);
                            return;
                          }
                        }
                      }
                    }
                    if (param0) {
                      return;
                    } else {
                      discarded$36 = dj.b(1);
                      return;
                    }
                  }
                }
              }
            }
          } else {
            var2 = 0;
            if (var3 == 0) {
              L10: {
                if (null != vg.field_b) {
                  break L10;
                } else {
                  if (!wc.field_b) {
                    break L10;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      discarded$37 = dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                discarded$38 = dj.b(1);
                return;
              }
            } else {
              if (vg.field_b == null) {
                L11: {
                  L12: {
                    ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                    if (null != ub.field_c) {
                      break L12;
                    } else {
                      var2 = 3;
                      if (var3 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2 = 2;
                  cj.a(ub.field_c, 13861);
                  break L11;
                }
                L13: {
                  if (null != vg.field_b) {
                    break L13;
                  } else {
                    if (!wc.field_b) {
                      break L13;
                    } else {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        discarded$39 = dj.b(1);
                        return;
                      }
                    }
                  }
                }
                if (param0) {
                  return;
                } else {
                  discarded$40 = dj.b(1);
                  return;
                }
              } else {
                ub.field_c = vg.field_b.d((byte) -18);
                kc.a(-14226, 2);
                if (var3 == 0) {
                  L14: {
                    L15: {
                      if (null != ub.field_c) {
                        break L15;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L14;
                  }
                  if (null == vg.field_b) {
                    if (wc.field_b) {
                      tf.a((byte) 46, param1, var2);
                      if (param0) {
                        return;
                      } else {
                        discarded$41 = dj.b(1);
                        return;
                      }
                    } else {
                      if (param0) {
                        return;
                      } else {
                        discarded$42 = dj.b(1);
                        return;
                      }
                    }
                  } else {
                    if (param0) {
                      return;
                    } else {
                      discarded$43 = dj.b(1);
                      return;
                    }
                  }
                } else {
                  L16: {
                    L17: {
                      ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                      if (null != ub.field_c) {
                        break L17;
                      } else {
                        var2 = 3;
                        if (var3 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var2 = 2;
                    cj.a(ub.field_c, 13861);
                    break L16;
                  }
                  L18: {
                    if (null != vg.field_b) {
                      break L18;
                    } else {
                      if (!wc.field_b) {
                        break L18;
                      } else {
                        tf.a((byte) 46, param1, var2);
                        if (param0) {
                          return;
                        } else {
                          discarded$44 = dj.b(1);
                          return;
                        }
                      }
                    }
                  }
                  if (param0) {
                    return;
                  } else {
                    discarded$45 = dj.b(1);
                    return;
                  }
                }
              }
            }
          }
        } else {
          if (vg.field_b == null) {
            L19: {
              L20: {
                ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                if (null != ub.field_c) {
                  break L20;
                } else {
                  var2 = 3;
                  if (var3 == 0) {
                    break L19;
                  } else {
                    break L20;
                  }
                }
              }
              var2 = 2;
              cj.a(ub.field_c, 13861);
              break L19;
            }
            L21: {
              if (null != vg.field_b) {
                break L21;
              } else {
                if (!wc.field_b) {
                  break L21;
                } else {
                  tf.a((byte) 46, param1, var2);
                  if (param0) {
                    return;
                  } else {
                    discarded$46 = dj.b(1);
                    return;
                  }
                }
              }
            }
            if (param0) {
              return;
            } else {
              discarded$47 = dj.b(1);
              return;
            }
          } else {
            ub.field_c = vg.field_b.d((byte) -18);
            kc.a(-14226, 2);
            if (var3 == 0) {
              L22: {
                L23: {
                  if (null != ub.field_c) {
                    break L23;
                  } else {
                    var2 = 3;
                    if (var3 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L22;
              }
              L24: {
                if (null != vg.field_b) {
                  break L24;
                } else {
                  if (!wc.field_b) {
                    break L24;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      discarded$48 = dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                discarded$49 = dj.b(1);
                return;
              }
            } else {
              L25: {
                L26: {
                  ub.field_c = ql.a(0, 0, lk.field_b, 0, 640, 480);
                  if (null != ub.field_c) {
                    break L26;
                  } else {
                    var2 = 3;
                    if (var3 == 0) {
                      break L25;
                    } else {
                      break L26;
                    }
                  }
                }
                var2 = 2;
                cj.a(ub.field_c, 13861);
                break L25;
              }
              L27: {
                if (null != vg.field_b) {
                  break L27;
                } else {
                  if (!wc.field_b) {
                    break L27;
                  } else {
                    tf.a((byte) 46, param1, var2);
                    if (param0) {
                      return;
                    } else {
                      discarded$50 = dj.b(1);
                      return;
                    }
                  }
                }
              }
              if (param0) {
                return;
              } else {
                discarded$51 = dj.b(1);
                return;
              }
            }
          }
        }
    }

    final static byte[] a(int param0, hj param1, byte[] param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_21_0 = null;
        byte[] stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_20_0 = null;
        byte[] stackOut_23_0 = null;
        Object stackOut_5_0 = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4_int = param1.k(param3, 1522829539);
            if (param0 == -39) {
              if ((var4_int ^ -1) != -1) {
                L1: {
                  L2: {
                    if (param2 == null) {
                      break L2;
                    } else {
                      if ((var4_int ^ -1) != (param2.length ^ -1)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param2 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.k(3, 1522829539);
                      var6 = (byte)param1.k(8, 1522829539);
                      if ((var5 ^ -1) < -1) {
                        break L5;
                      } else {
                        var7 = 0;
                        L6: while (true) {
                          L7: {
                            if (var4_int <= var7) {
                              break L7;
                            } else {
                              param2[var7] = (byte)var6;
                              var7++;
                              if (var8 != 0) {
                                break L4;
                              } else {
                                if (var8 == 0) {
                                  continue L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    var7 = 0;
                    L8: while (true) {
                      if (var4_int <= var7) {
                        break L4;
                      } else {
                        stackOut_20_0 = (byte[]) (param2);
                        stackIn_24_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (var8 != 0) {
                          break L3;
                        } else {
                          stackIn_21_0[var7] = (byte)(param1.k(var5, ak.a(param0, -1522829510)) + var6);
                          var7++;
                          if (var8 == 0) {
                            continue L8;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_23_0 = (byte[]) (param2);
                  stackIn_24_0 = stackOut_23_0;
                  break L3;
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (byte[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var4);
            stackOut_25_1 = new StringBuilder().append("dj.F(").append(param0).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          L10: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param2 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L10;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L10;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_6_0);
          } else {
            return stackIn_24_0;
          }
        }
    }

    final static boolean a(char param0, boolean param1) {
        if (!param1) {
            return false;
        }
        if (param0 < 48) {
            return false;
        }
        if (57 < param0) {
            return false;
        }
        return true;
    }

    abstract void a(byte[] param0, byte param1);

    final static int a(boolean param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((param1 ^ -1) >= -1) {
                    break L3;
                  } else {
                    var3_int = var3_int << 1782217825 | 1 & param2;
                    param1--;
                    param2 = param2 >>> 1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0) {
                  break L2;
                } else {
                  field_b = (StringBuilder) null;
                  break L2;
                }
              }
              stackOut_8_0 = var3_int;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "dj.G(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(boolean param0, String[] param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            L2: {
              if (ta.field_f != null) {
                ta.field_f.field_D.a(param1, 17036);
                break L2;
              } else {
                break L2;
              }
            }
            if (null != ca.field_g) {
              ca.field_g.field_B.a(param1, 17036);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var2);
            stackOut_9_1 = new StringBuilder().append("dj.J(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final static boolean b(int param0) {
        pd.field_b = true;
        if (param0 != -1) {
            return false;
        }
        qf.field_b = lk.a(param0 + 1) - -15000L;
        return 11 == gl.field_y ? true : false;
    }

    static {
        field_a = "Waiting for fonts";
        field_b = new StringBuilder(12);
    }
}
