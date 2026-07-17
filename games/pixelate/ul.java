/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends bg {
    static String field_n;
    private int field_o;
    static ak field_p;
    static int field_q;
    static String field_m;
    private int field_r;
    private int field_s;

    final void b(int param0, boolean param1) {
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        if (param0 > -23) {
          L0: {
            field_p = null;
            stackOut_5_0 = this;
            stackOut_5_1 = ((ul) this).field_s;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = -50;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 50;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          ((ul) this).field_s = stackIn_8_1 + stackIn_8_2;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackOut_1_1 = ((ul) this).field_s;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = -50;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 50;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          ((ul) this).field_s = stackIn_4_1 + stackIn_4_2;
          return;
        }
    }

    final static boolean a(int param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            if (!oo.field_d) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (param0 > 48) {
                  break L1;
                } else {
                  field_q = 5;
                  break L1;
                }
              }
              L2: {
                if (ce.field_d != 2) {
                  break L2;
                } else {
                  if (null == fp.field_d) {
                    break L2;
                  } else {
                    var3 = (CharSequence) (Object) param1;
                    if (!fp.field_d.equals((Object) (Object) dh.a(var3, (byte) 26))) {
                      break L2;
                    } else {
                      return true;
                    }
                  }
                }
              }
              stackOut_10_0 = 0;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("ul.G(").append(param0).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_11_0 != 0;
    }

    public static void c(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        boolean stackIn_1_0 = false;
        boolean stackIn_2_0 = false;
        boolean stackIn_3_0 = false;
        boolean stackIn_4_0 = false;
        int stackIn_4_1 = 0;
        boolean stackOut_0_0 = false;
        boolean stackOut_1_0 = false;
        boolean stackOut_2_0 = false;
        int stackOut_2_1 = 0;
        boolean stackOut_3_0 = false;
        int stackOut_3_1 = 0;
        L0: {
          L1: {
            var5 = Pixelate.field_H ? 1 : 0;
            super.a((byte) 21);
            stackOut_0_0 = param1;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (!pf.field_e) {
              break L1;
            } else {
              stackOut_1_0 = stackIn_1_0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!gf.field_b) {
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L0;
              }
            }
          }
          stackOut_3_0 = stackIn_3_0;
          stackOut_3_1 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          break L0;
        }
        L2: {
          param1 = stackIn_4_0 | stackIn_4_1 != 0;
          if (((ul) this).field_s > ((ul) this).field_r) {
            ((ul) this).field_s = ((ul) this).field_r;
            break L2;
          } else {
            break L2;
          }
        }
        if (param1) {
          var3 = -68 % ((-83 - param0) / 37);
          if (((ul) this).field_s > 0) {
            if (((ul) this).field_s < (((ul) this).field_r >> 2) - -20) {
              if (((ul) this).field_s % 30 == 0) {
                ((ul) this).b(255);
                pp discarded$6 = mc.a(129, -120);
                var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                if (((ul) this).field_o < var4) {
                  ((ul) this).field_o = ((ul) this).field_o + 10;
                  ((ul) this).field_h = 0;
                  if (((ul) this).field_o > var4) {
                    L3: {
                      ((ul) this).field_o = var4;
                      if (-616 > ((ul) this).field_o) {
                        ((ul) this).field_o = 615;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    return;
                  } else {
                    L4: {
                      if (-616 < ((ul) this).field_o) {
                        ((ul) this).field_o = 615;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    return;
                  }
                } else {
                  L5: {
                    ((ul) this).field_o = var4;
                    if (((ul) this).field_o > 615) {
                      ((ul) this).field_o = 615;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  return;
                }
              } else {
                L6: {
                  if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                    break L6;
                  } else {
                    if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                      ((ul) this).b(255);
                      break L6;
                    } else {
                      var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                      if (((ul) this).field_o < var4) {
                        ((ul) this).field_o = ((ul) this).field_o + 10;
                        ((ul) this).field_h = 0;
                        if (((ul) this).field_o > var4) {
                          L7: {
                            ((ul) this).field_o = var4;
                            if (-616 > ((ul) this).field_o) {
                              ((ul) this).field_o = 615;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          return;
                        } else {
                          L8: {
                            if (-616 < ((ul) this).field_o) {
                              ((ul) this).field_o = 615;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          return;
                        }
                      } else {
                        L9: {
                          ((ul) this).field_o = var4;
                          if (((ul) this).field_o > 615) {
                            ((ul) this).field_o = 615;
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                if (((ul) this).field_o < var4) {
                  ((ul) this).field_o = ((ul) this).field_o + 10;
                  ((ul) this).field_h = 0;
                  if (((ul) this).field_o > var4) {
                    L10: {
                      ((ul) this).field_o = var4;
                      if (-616 > ((ul) this).field_o) {
                        ((ul) this).field_o = 615;
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    return;
                  } else {
                    L11: {
                      if (-616 < ((ul) this).field_o) {
                        ((ul) this).field_o = 615;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    return;
                  }
                } else {
                  L12: {
                    ((ul) this).field_o = var4;
                    if (((ul) this).field_o > 615) {
                      ((ul) this).field_o = 615;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  return;
                }
              }
            } else {
              L13: {
                if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                  break L13;
                } else {
                  if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                    ((ul) this).b(255);
                    break L13;
                  } else {
                    var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                    if (((ul) this).field_o < var4) {
                      ((ul) this).field_o = ((ul) this).field_o + 10;
                      ((ul) this).field_h = 0;
                      if (((ul) this).field_o > var4) {
                        L14: {
                          ((ul) this).field_o = var4;
                          if (-616 > ((ul) this).field_o) {
                            ((ul) this).field_o = 615;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                        return;
                      } else {
                        L15: {
                          if (-616 < ((ul) this).field_o) {
                            ((ul) this).field_o = 615;
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        return;
                      }
                    } else {
                      L16: {
                        ((ul) this).field_o = var4;
                        if (((ul) this).field_o > 615) {
                          ((ul) this).field_o = 615;
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      return;
                    }
                  }
                }
              }
              var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
              if (((ul) this).field_o < var4) {
                ((ul) this).field_o = ((ul) this).field_o + 10;
                ((ul) this).field_h = 0;
                if (((ul) this).field_o > var4) {
                  L17: {
                    ((ul) this).field_o = var4;
                    if (-616 > ((ul) this).field_o) {
                      ((ul) this).field_o = 615;
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  return;
                } else {
                  L18: {
                    if (-616 < ((ul) this).field_o) {
                      ((ul) this).field_o = 615;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  return;
                }
              } else {
                L19: {
                  ((ul) this).field_o = var4;
                  if (((ul) this).field_o > 615) {
                    ((ul) this).field_o = 615;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                return;
              }
            }
          } else {
            L20: {
              L21: {
                ((ul) this).field_s = 0;
                pp discarded$7 = mc.a(130, -123);
                if (((ul) this).field_s >= (((ul) this).field_r >> 2) - -20) {
                  break L21;
                } else {
                  if (((ul) this).field_s % 30 != 0) {
                    break L21;
                  } else {
                    ((ul) this).b(255);
                    pp discarded$8 = mc.a(129, -120);
                    break L20;
                  }
                }
              }
              if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                break L20;
              } else {
                if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                  ((ul) this).b(255);
                  break L20;
                } else {
                  break L20;
                }
              }
            }
            var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
            if (((ul) this).field_o < var4) {
              ((ul) this).field_o = ((ul) this).field_o + 10;
              ((ul) this).field_h = 0;
              if (((ul) this).field_o > var4) {
                L22: {
                  ((ul) this).field_o = var4;
                  if (-616 > ((ul) this).field_o) {
                    ((ul) this).field_o = 615;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                return;
              } else {
                L23: {
                  if (-616 < ((ul) this).field_o) {
                    ((ul) this).field_o = 615;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                return;
              }
            } else {
              L24: {
                ((ul) this).field_o = var4;
                if (((ul) this).field_o > 615) {
                  ((ul) this).field_o = 615;
                  break L24;
                } else {
                  break L24;
                }
              }
              return;
            }
          }
        } else {
          ((ul) this).field_s = ((ul) this).field_s - 1;
          var3 = -68 % ((-83 - param0) / 37);
          if (((ul) this).field_s <= 0) {
            ((ul) this).field_s = 0;
            pp discarded$9 = mc.a(130, -123);
            if (((ul) this).field_s >= (((ul) this).field_r >> 2) - -20) {
              L25: {
                if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                  break L25;
                } else {
                  if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                    ((ul) this).b(255);
                    break L25;
                  } else {
                    break L25;
                  }
                }
              }
              L26: {
                var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                if (((ul) this).field_o < var4) {
                  ((ul) this).field_o = ((ul) this).field_o + 10;
                  ((ul) this).field_h = 0;
                  if (((ul) this).field_o <= var4) {
                    break L26;
                  } else {
                    ((ul) this).field_o = var4;
                    break L26;
                  }
                } else {
                  ((ul) this).field_o = var4;
                  break L26;
                }
              }
              L27: {
                if (((ul) this).field_o > 615) {
                  ((ul) this).field_o = 615;
                  break L27;
                } else {
                  break L27;
                }
              }
              return;
            } else {
              L28: {
                if (((ul) this).field_s % 30 != 0) {
                  if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                    break L28;
                  } else {
                    if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                      ((ul) this).b(255);
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                } else {
                  ((ul) this).b(255);
                  pp discarded$10 = mc.a(129, -120);
                  break L28;
                }
              }
              L29: {
                var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
                if (((ul) this).field_o < var4) {
                  ((ul) this).field_o = ((ul) this).field_o + 10;
                  ((ul) this).field_h = 0;
                  if (((ul) this).field_o <= var4) {
                    break L29;
                  } else {
                    ((ul) this).field_o = var4;
                    break L29;
                  }
                } else {
                  ((ul) this).field_o = var4;
                  break L29;
                }
              }
              L30: {
                if (((ul) this).field_o > 615) {
                  ((ul) this).field_o = 615;
                  break L30;
                } else {
                  break L30;
                }
              }
              return;
            }
          } else {
            L31: {
              L32: {
                if (((ul) this).field_s >= (((ul) this).field_r >> 2) - -20) {
                  break L32;
                } else {
                  if (((ul) this).field_s % 30 != 0) {
                    break L32;
                  } else {
                    ((ul) this).b(255);
                    pp discarded$11 = mc.a(129, -120);
                    break L31;
                  }
                }
              }
              if (-20 + ((ul) this).field_r <= ((ul) this).field_s) {
                break L31;
              } else {
                if (((ul) this).field_s % (((ul) this).field_r >> 2) == 0) {
                  ((ul) this).b(255);
                  break L31;
                } else {
                  break L31;
                }
              }
            }
            L33: {
              var4 = 615 * ((ul) this).field_s / ((ul) this).field_r;
              if (((ul) this).field_o < var4) {
                ((ul) this).field_o = ((ul) this).field_o + 10;
                ((ul) this).field_h = 0;
                if (((ul) this).field_o <= var4) {
                  break L33;
                } else {
                  ((ul) this).field_o = var4;
                  break L33;
                }
              } else {
                ((ul) this).field_o = var4;
                break L33;
              }
            }
            L34: {
              if (((ul) this).field_o > 615) {
                ((ul) this).field_o = 615;
                break L34;
              } else {
                break L34;
              }
            }
            return;
          }
        }
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          if (615 > ((ul) this).field_o) {
            stackOut_2_0 = -1 + -((ul) this).field_o + 615;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        ((ul) this).a(param0 ^ 119, var2, 435, ((ul) this).field_o);
        var3 = -(((ul) this).field_o / param0) + 320;
        var4 = 0;
        L1: while (true) {
          if (var4 >= 7) {
            return;
          } else {
            var5 = 13 + (76 + var4 * 76 + 2);
            if (var3 + 5 > var5) {
              var4++;
              var4++;
              continue L1;
            } else {
              if (var3 + ((ul) this).field_o - 6 >= var5) {
                t.f(1 + var5, 438, 19, 0, 128);
                t.f(2 + var5, 439, 18, 16777215, 128);
                var4++;
                continue L1;
              } else {
                var4++;
                continue L1;
              }
            }
          }
        }
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0) {
          L0: {
            ((ul) this).b(-8, true);
            if (((ul) this).field_s > 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ul) this).field_s > 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    private final void a(boolean param0, int param1) {
        ((ul) this).field_s = param1 * 50;
        ((ul) this).field_r = ((ul) this).field_s;
        if (!param0) {
            field_n = null;
        }
    }

    final boolean a(int param0, byte param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        ((ul) this).field_s = ((ul) this).field_s + param0 * 50;
        if (param1 != 73) {
          L0: {
            ((ul) this).field_s = -66;
            if (((ul) this).field_r > ((ul) this).field_s) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((ul) this).field_r > ((ul) this).field_s) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ul(int param0) {
        this.a(true, param0);
        ((ul) this).field_r = ((ul) this).field_s;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "All games";
        field_m = "Lobby";
    }
}
