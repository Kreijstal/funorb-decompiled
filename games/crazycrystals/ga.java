/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ga extends pc {
    static String[] field_Q;
    private int field_D;
    private long field_C;
    private int field_N;
    private int field_O;
    private boolean field_G;
    static db field_L;
    private int field_I;
    private boolean field_M;
    private long field_K;
    static mk field_F;
    static am field_B;
    static int[] field_J;
    static dl field_E;
    static ko field_H;

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 != 0) {
          L0: {
            field_L = null;
            if (((ga) this).field_N == ((ga) this).field_D) {
              break L0;
            } else {
              L1: {
                if (((ga) this).field_D >= ((ga) this).field_N) {
                  stackOut_13_0 = ((ga) this).field_N;
                  stackIn_14_0 = stackOut_13_0;
                  break L1;
                } else {
                  stackOut_12_0 = ((ga) this).field_D;
                  stackIn_14_0 = stackOut_12_0;
                  break L1;
                }
              }
              L2: {
                var2 = stackIn_14_0;
                if (((ga) this).field_N > ((ga) this).field_D) {
                  stackOut_16_0 = ((ga) this).field_N;
                  stackIn_17_0 = stackOut_16_0;
                  break L2;
                } else {
                  stackOut_15_0 = ((ga) this).field_D;
                  stackIn_17_0 = stackOut_15_0;
                  break L2;
                }
              }
              var3 = stackIn_17_0;
              ((ga) this).field_D = var2;
              ((ga) this).field_N = var2;
              ((ga) this).field_o = ((ga) this).field_o.substring(0, var2) + ((ga) this).field_o.substring(var3, ((ga) this).field_o.length());
              ((ga) this).h(127);
              break L0;
            }
          }
          return;
        } else {
          L3: {
            if (((ga) this).field_N == ((ga) this).field_D) {
              break L3;
            } else {
              L4: {
                if (((ga) this).field_D >= ((ga) this).field_N) {
                  stackOut_4_0 = ((ga) this).field_N;
                  stackIn_5_0 = stackOut_4_0;
                  break L4;
                } else {
                  stackOut_3_0 = ((ga) this).field_D;
                  stackIn_5_0 = stackOut_3_0;
                  break L4;
                }
              }
              L5: {
                var2 = stackIn_5_0;
                if (((ga) this).field_N > ((ga) this).field_D) {
                  stackOut_7_0 = ((ga) this).field_N;
                  stackIn_8_0 = stackOut_7_0;
                  break L5;
                } else {
                  stackOut_6_0 = ((ga) this).field_D;
                  stackIn_8_0 = stackOut_6_0;
                  break L5;
                }
              }
              var3 = stackIn_8_0;
              ((ga) this).field_D = var2;
              ((ga) this).field_N = var2;
              ((ga) this).field_o = ((ga) this).field_o.substring(0, var2) + ((ga) this).field_o.substring(var3, ((ga) this).field_o.length());
              ((ga) this).h(127);
              break L3;
            }
          }
          return;
        }
    }

    private final int i(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == -26622) {
          if (-1 == ((ga) this).field_N) {
            return ((ga) this).field_N;
          } else {
            var2 = -1 + ((ga) this).field_N;
            L0: while (true) {
              if (var2 > 0) {
                if (-33 != (((ga) this).field_o.charAt(-1 + var2) ^ -1)) {
                  var2--;
                  continue L0;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        } else {
          ((ga) this).field_O = -45;
          if (-1 == (((ga) this).field_N ^ -1)) {
            return ((ga) this).field_N;
          } else {
            var2 = -1 + ((ga) this).field_N;
            L1: while (true) {
              if (var2 > 0) {
                if (-33 != ((ga) this).field_o.charAt(-1 + var2)) {
                  var2--;
                  continue L1;
                } else {
                  return var2;
                }
              } else {
                return var2;
              }
            }
          }
        }
    }

    private final void n(int param0) {
        try {
            Exception var2 = null;
            String var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 >= 59) {
                    break L1;
                  } else {
                    field_F = null;
                    break L1;
                  }
                }
                var2_ref = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                this.l(0);
                this.b(var2_ref, -1);
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = (Exception) (Object) decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        long var6 = 0L;
        Object var8 = null;
        fi var9 = null;
        if (null != ((ga) this).field_i) {
          if (param3 == 0) {
            ((ga) this).field_i.a(param0, false, param2, (qm) this, ((ga) this).field_x);
            if (((ga) this).field_i instanceof fi) {
              L0: {
                var9 = (fi) (Object) ((ga) this).field_i;
                if (((ga) this).field_N != ((ga) this).field_D) {
                  var9.a((byte) 71, (qm) this, param2, ((ga) this).field_D, ((ga) this).field_N, param0);
                  break L0;
                } else {
                  break L0;
                }
              }
              var6 = lo.a((byte) -83);
              if ((-((ga) this).field_K + var6) % 1000L < 500L) {
                var9.a(((ga) this).field_N, 27310, (qm) this, param2, param0);
                if (param1 > -12) {
                  var8 = null;
                  ((ga) this).a((qm) null, 83, 43, 63);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 > -12) {
                  var8 = null;
                  ((ga) this).a((qm) null, 83, 43, 63);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 > -12) {
                var8 = null;
                ((ga) this).a((qm) null, 83, 43, 63);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 > -12) {
              var8 = null;
              ((ga) this).a((qm) null, 83, 43, 63);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param1 > -12) {
            var8 = null;
            ((ga) this).a((qm) null, 83, 43, 63);
            return;
          } else {
            return;
          }
        }
    }

    public static void o(int param0) {
        field_L = null;
        field_F = null;
        field_E = null;
        field_H = null;
        field_Q = null;
        field_J = null;
        if (param0 != 0) {
            return;
        }
        field_B = null;
    }

    private final int j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = CrazyCrystals.field_B;
        var2 = ((ga) this).field_o.length();
        if (var2 == ((ga) this).field_N) {
          return ((ga) this).field_N;
        } else {
          var3 = 1 + ((ga) this).field_N;
          L0: while (true) {
            if (var2 > var3) {
              if (((ga) this).field_o.charAt(var3 - 1) != 32) {
                var3++;
                continue L0;
              } else {
                if (param0 != 612) {
                  return 60;
                } else {
                  return var3;
                }
              }
            } else {
              if (param0 != 612) {
                return 60;
              } else {
                return var3;
              }
            }
          }
        }
    }

    private final void b(String param0, int param1) {
        int var3 = 0;
        L0: {
          if ((((ga) this).field_I ^ -1) == 0) {
            break L0;
          } else {
            var3 = ((ga) this).field_I - ((ga) this).field_o.length();
            if ((var3 ^ -1) <= -1) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          }
        }
        if (param1 == -1) {
          if (((ga) this).field_N == ((ga) this).field_o.length()) {
            ((ga) this).field_o = ((ga) this).field_o + param0;
            ((ga) this).field_N = ((ga) this).field_N + param0.length();
            ((ga) this).field_D = ((ga) this).field_N;
            ((ga) this).h(127);
            return;
          } else {
            ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_N) + param0 + ((ga) this).field_o.substring(((ga) this).field_N, ((ga) this).field_o.length());
            ((ga) this).field_N = ((ga) this).field_N + param0.length();
            ((ga) this).field_D = ((ga) this).field_N;
            ((ga) this).h(127);
            return;
          }
        } else {
          field_L = null;
          if (((ga) this).field_N == ((ga) this).field_o.length()) {
            ((ga) this).field_o = ((ga) this).field_o + param0;
            ((ga) this).field_N = ((ga) this).field_N + param0.length();
            ((ga) this).field_D = ((ga) this).field_N;
            ((ga) this).h(127);
            return;
          } else {
            ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_N) + param0 + ((ga) this).field_o.substring(((ga) this).field_N, ((ga) this).field_o.length());
            ((ga) this).field_N = ((ga) this).field_N + param0.length();
            ((ga) this).field_D = ((ga) this).field_N;
            ((ga) this).h(127);
            return;
          }
        }
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
          if (((ga) this).field_i instanceof fi) {
            L0: {
              var8_int = ((fi) (Object) ((ga) this).field_i).a(qh.field_i, 58, bm.field_h, param4, param0, (qm) this);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (-1 == var8_int) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L0;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = var8_int;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_7_1, true);
              var8 = lo.a((byte) 77);
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (250L <= -((ga) this).field_C + var8) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L1;
              }
            }
            ((ga) this).field_M = stackIn_10_1 != 0;
            if (((ga) this).field_M) {
              ((ga) this).field_D = this.i(-26622);
              ((ga) this).field_N = this.j(612);
              if ((((ga) this).field_N ^ -1) < -1) {
                if (((ga) this).field_o.charAt(((ga) this).field_N + -1) == 32) {
                  ((ga) this).field_N = ((ga) this).field_N - 1;
                  ((ga) this).field_O = ((ga) this).field_N;
                  ((ga) this).field_C = var8;
                  return true;
                } else {
                  ((ga) this).field_O = ((ga) this).field_N;
                  ((ga) this).field_C = var8;
                  return true;
                }
              } else {
                ((ga) this).field_O = ((ga) this).field_N;
                ((ga) this).field_C = var8;
                return true;
              }
            } else {
              ((ga) this).field_C = var8;
              return true;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        Object stackIn_74_0 = null;
        Object stackIn_75_0 = null;
        Object stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        Object stackIn_121_0 = null;
        Object stackIn_122_0 = null;
        Object stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        Object stackOut_120_0 = null;
        Object stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        Object stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        Object stackOut_73_0 = null;
        Object stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        Object stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        Object stackOut_44_0 = null;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          ((ga) this).field_K = lo.a((byte) -116);
          if (60 == param3) {
            break L0;
          } else {
            if (param3 == 62) {
              break L0;
            } else {
              if (param3 < 32) {
                if (85 != param0) {
                  if ((param0 ^ -1) != -102) {
                    if (param0 != 13) {
                      if ((param0 ^ -1) == -97) {
                        if ((((ga) this).field_N ^ -1) < -1) {
                          L1: {
                            stackOut_120_0 = this;
                            stackIn_122_0 = stackOut_120_0;
                            stackIn_121_0 = stackOut_120_0;
                            if (!cp.field_k[82]) {
                              stackOut_122_0 = this;
                              stackOut_122_1 = -1 + ((ga) this).field_N;
                              stackIn_123_0 = stackOut_122_0;
                              stackIn_123_1 = stackOut_122_1;
                              break L1;
                            } else {
                              stackOut_121_0 = this;
                              stackOut_121_1 = this.i(-26622);
                              stackIn_123_0 = stackOut_121_0;
                              stackIn_123_1 = stackOut_121_1;
                              break L1;
                            }
                          }
                          this.a(stackIn_123_1, true);
                          return true;
                        } else {
                          if (param1 == 19279) {
                            return false;
                          } else {
                            ((ga) this).field_D = 58;
                            return false;
                          }
                        }
                      } else {
                        if (-98 != (param0 ^ -1)) {
                          if (param0 == 102) {
                            this.a(0, true);
                            return true;
                          } else {
                            if (103 == param0) {
                              this.a(((ga) this).field_o.length(), true);
                              return true;
                            } else {
                              if (param0 != 84) {
                                if (cp.field_k[82]) {
                                  if ((param0 ^ -1) == -66) {
                                    this.g((byte) -75);
                                    return true;
                                  } else {
                                    if (!cp.field_k[82]) {
                                      L2: {
                                        if (!cp.field_k[82]) {
                                          break L2;
                                        } else {
                                          if (67 != param0) {
                                            break L2;
                                          } else {
                                            this.n(param1 ^ 19254);
                                            return true;
                                          }
                                        }
                                      }
                                      if (param1 == 19279) {
                                        return false;
                                      } else {
                                        ((ga) this).field_D = 58;
                                        return false;
                                      }
                                    } else {
                                      if (-67 == (param0 ^ -1)) {
                                        this.e((byte) 68);
                                        return true;
                                      } else {
                                        L3: {
                                          if (!cp.field_k[82]) {
                                            break L3;
                                          } else {
                                            if (67 != param0) {
                                              break L3;
                                            } else {
                                              this.n(param1 ^ 19254);
                                              return true;
                                            }
                                          }
                                        }
                                        if (param1 == 19279) {
                                          return false;
                                        } else {
                                          ((ga) this).field_D = 58;
                                          return false;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (!cp.field_k[82]) {
                                    L4: {
                                      if (!cp.field_k[82]) {
                                        break L4;
                                      } else {
                                        if (67 != param0) {
                                          break L4;
                                        } else {
                                          this.n(param1 ^ 19254);
                                          return true;
                                        }
                                      }
                                    }
                                    L5: {
                                      if (param1 == 19279) {
                                        break L5;
                                      } else {
                                        ((ga) this).field_D = 58;
                                        break L5;
                                      }
                                    }
                                    return false;
                                  } else {
                                    if (-67 == (param0 ^ -1)) {
                                      this.e((byte) 68);
                                      return true;
                                    } else {
                                      L6: {
                                        if (!cp.field_k[82]) {
                                          break L6;
                                        } else {
                                          if (67 != param0) {
                                            break L6;
                                          } else {
                                            this.n(param1 ^ 19254);
                                            return true;
                                          }
                                        }
                                      }
                                      L7: {
                                        if (param1 == 19279) {
                                          break L7;
                                        } else {
                                          ((ga) this).field_D = 58;
                                          break L7;
                                        }
                                      }
                                      return false;
                                    }
                                  }
                                }
                              } else {
                                this.f((byte) 23);
                                return true;
                              }
                            }
                          }
                        } else {
                          if (((ga) this).field_N < ((ga) this).field_o.length()) {
                            L8: {
                              stackOut_73_0 = this;
                              stackIn_75_0 = stackOut_73_0;
                              stackIn_74_0 = stackOut_73_0;
                              if (!cp.field_k[82]) {
                                stackOut_75_0 = this;
                                stackOut_75_1 = ((ga) this).field_N + 1;
                                stackIn_76_0 = stackOut_75_0;
                                stackIn_76_1 = stackOut_75_1;
                                break L8;
                              } else {
                                stackOut_74_0 = this;
                                stackOut_74_1 = this.j(612);
                                stackIn_76_0 = stackOut_74_0;
                                stackIn_76_1 = stackOut_74_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_76_1, true);
                            return true;
                          } else {
                            if (param1 == 19279) {
                              return false;
                            } else {
                              ((ga) this).field_D = 58;
                              return false;
                            }
                          }
                        }
                      }
                    } else {
                      ((ga) this).k(param1 + -19357);
                      return true;
                    }
                  } else {
                    if ((((ga) this).field_N ^ -1) == (((ga) this).field_D ^ -1)) {
                      if (((ga) this).field_N < ((ga) this).field_o.length()) {
                        ((ga) this).field_D = ((ga) this).field_N - -1;
                        this.l(0);
                        return true;
                      } else {
                        if (param1 == 19279) {
                          return false;
                        } else {
                          ((ga) this).field_D = 58;
                          return false;
                        }
                      }
                    } else {
                      this.l(0);
                      return true;
                    }
                  }
                } else {
                  if ((((ga) this).field_D ^ -1) != (((ga) this).field_N ^ -1)) {
                    this.l(param1 + -19279);
                    return true;
                  } else {
                    if (((ga) this).field_N > 0) {
                      ((ga) this).field_D = ((ga) this).field_N - 1;
                      this.l(param1 ^ 19279);
                      return true;
                    } else {
                      if (param1 == 19279) {
                        return false;
                      } else {
                        ((ga) this).field_D = 58;
                        return false;
                      }
                    }
                  }
                }
              } else {
                if (param3 <= 126) {
                  if (((ga) this).field_D == ((ga) this).field_N) {
                    L9: {
                      if (-1 == ((ga) this).field_I) {
                        break L9;
                      } else {
                        if ((((ga) this).field_o.length() ^ -1) > (((ga) this).field_I ^ -1)) {
                          break L9;
                        } else {
                          return true;
                        }
                      }
                    }
                    if (((ga) this).field_N < ((ga) this).field_o.length()) {
                      ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_N) + param3 + ((ga) this).field_o.substring(((ga) this).field_N, ((ga) this).field_o.length());
                      ((ga) this).field_N = ((ga) this).field_N + 1;
                      ((ga) this).field_D = ((ga) this).field_N;
                      ((ga) this).h(127);
                      return true;
                    } else {
                      ((ga) this).field_o = ((ga) this).field_o + param3;
                      int dupTemp$3 = ((ga) this).field_o.length();
                      ((ga) this).field_N = dupTemp$3;
                      ((ga) this).field_D = dupTemp$3;
                      ((ga) this).h(127);
                      return true;
                    }
                  } else {
                    this.l(param1 + -19279);
                    if (-1 != ((ga) this).field_I) {
                      if ((((ga) this).field_o.length() ^ -1) <= (((ga) this).field_I ^ -1)) {
                        return true;
                      } else {
                        if (((ga) this).field_N < ((ga) this).field_o.length()) {
                          ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_N) + param3 + ((ga) this).field_o.substring(((ga) this).field_N, ((ga) this).field_o.length());
                          ((ga) this).field_N = ((ga) this).field_N + 1;
                          ((ga) this).field_D = ((ga) this).field_N;
                          ((ga) this).h(127);
                          return true;
                        } else {
                          ((ga) this).field_o = ((ga) this).field_o + param3;
                          int dupTemp$4 = ((ga) this).field_o.length();
                          ((ga) this).field_N = dupTemp$4;
                          ((ga) this).field_D = dupTemp$4;
                          ((ga) this).h(127);
                          return true;
                        }
                      }
                    } else {
                      if (((ga) this).field_N < ((ga) this).field_o.length()) {
                        ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_N) + param3 + ((ga) this).field_o.substring(((ga) this).field_N, ((ga) this).field_o.length());
                        ((ga) this).field_N = ((ga) this).field_N + 1;
                        ((ga) this).field_D = ((ga) this).field_N;
                        ((ga) this).h(127);
                        return true;
                      } else {
                        ((ga) this).field_o = ((ga) this).field_o + param3;
                        int dupTemp$5 = ((ga) this).field_o.length();
                        ((ga) this).field_N = dupTemp$5;
                        ((ga) this).field_D = dupTemp$5;
                        ((ga) this).h(127);
                        return true;
                      }
                    }
                  }
                } else {
                  L10: {
                    if (85 != param0) {
                      if ((param0 ^ -1) != -102) {
                        if (param0 != 13) {
                          if ((param0 ^ -1) == -97) {
                            if ((((ga) this).field_N ^ -1) < -1) {
                              L11: {
                                stackOut_44_0 = this;
                                stackIn_46_0 = stackOut_44_0;
                                stackIn_45_0 = stackOut_44_0;
                                if (!cp.field_k[82]) {
                                  stackOut_46_0 = this;
                                  stackOut_46_1 = -1 + ((ga) this).field_N;
                                  stackIn_47_0 = stackOut_46_0;
                                  stackIn_47_1 = stackOut_46_1;
                                  break L11;
                                } else {
                                  stackOut_45_0 = this;
                                  stackOut_45_1 = this.i(-26622);
                                  stackIn_47_0 = stackOut_45_0;
                                  stackIn_47_1 = stackOut_45_1;
                                  break L11;
                                }
                              }
                              this.a(stackIn_47_1, true);
                              return true;
                            } else {
                              break L10;
                            }
                          } else {
                            if (-98 != (param0 ^ -1)) {
                              if (param0 == 102) {
                                this.a(0, true);
                                return true;
                              } else {
                                if (103 == param0) {
                                  this.a(((ga) this).field_o.length(), true);
                                  return true;
                                } else {
                                  if (param0 != 84) {
                                    L12: {
                                      if (!cp.field_k[82]) {
                                        break L12;
                                      } else {
                                        if ((param0 ^ -1) != -66) {
                                          break L12;
                                        } else {
                                          this.g((byte) -75);
                                          return true;
                                        }
                                      }
                                    }
                                    L13: {
                                      if (!cp.field_k[82]) {
                                        break L13;
                                      } else {
                                        if (-67 == (param0 ^ -1)) {
                                          this.e((byte) 68);
                                          return true;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    if (!cp.field_k[82]) {
                                      break L10;
                                    } else {
                                      if (67 != param0) {
                                        break L10;
                                      } else {
                                        this.n(param1 ^ 19254);
                                        return true;
                                      }
                                    }
                                  } else {
                                    this.f((byte) 23);
                                    return true;
                                  }
                                }
                              }
                            } else {
                              if (((ga) this).field_N >= ((ga) this).field_o.length()) {
                                break L10;
                              } else {
                                L14: {
                                  stackOut_22_0 = this;
                                  stackIn_24_0 = stackOut_22_0;
                                  stackIn_23_0 = stackOut_22_0;
                                  if (!cp.field_k[82]) {
                                    stackOut_24_0 = this;
                                    stackOut_24_1 = ((ga) this).field_N + 1;
                                    stackIn_25_0 = stackOut_24_0;
                                    stackIn_25_1 = stackOut_24_1;
                                    break L14;
                                  } else {
                                    stackOut_23_0 = this;
                                    stackOut_23_1 = this.j(612);
                                    stackIn_25_0 = stackOut_23_0;
                                    stackIn_25_1 = stackOut_23_1;
                                    break L14;
                                  }
                                }
                                this.a(stackIn_25_1, true);
                                return true;
                              }
                            }
                          }
                        } else {
                          ((ga) this).k(param1 + -19357);
                          return true;
                        }
                      } else {
                        if ((((ga) this).field_N ^ -1) == (((ga) this).field_D ^ -1)) {
                          if (((ga) this).field_N >= ((ga) this).field_o.length()) {
                            break L10;
                          } else {
                            ((ga) this).field_D = ((ga) this).field_N - -1;
                            this.l(0);
                            return true;
                          }
                        } else {
                          this.l(0);
                          return true;
                        }
                      }
                    } else {
                      if ((((ga) this).field_D ^ -1) != (((ga) this).field_N ^ -1)) {
                        this.l(param1 + -19279);
                        return true;
                      } else {
                        if (((ga) this).field_N > 0) {
                          ((ga) this).field_D = ((ga) this).field_N - 1;
                          this.l(param1 ^ 19279);
                          return true;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  if (param1 == 19279) {
                    return false;
                  } else {
                    ((ga) this).field_D = 58;
                    return false;
                  }
                }
              }
            }
          }
        }
        return false;
    }

    private final void f(byte param0) {
        if (!(!(((ga) this).field_l instanceof ho))) {
            ((ho) (Object) ((ga) this).field_l).a(97, (ga) this);
        }
        int var2 = -60 % ((param0 - 77) / 39);
    }

    void h(int param0) {
        if (param0 <= 125) {
          L0: {
            field_B = null;
            if (((ga) this).field_l instanceof ho) {
              ((ho) (Object) ((ga) this).field_l).a((ga) this, -29513);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((ga) this).field_l instanceof ho) {
              ((ho) (Object) ((ga) this).field_l).a((ga) this, -29513);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final String b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          if (((ga) this).field_D < ((ga) this).field_N) {
            stackOut_2_0 = ((ga) this).field_D;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((ga) this).field_N;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_3_0;
          if (((ga) this).field_N <= ((ga) this).field_D) {
            stackOut_5_0 = ((ga) this).field_D;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = ((ga) this).field_N;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        var3 = stackIn_6_0;
        if (!param0) {
          ((ga) this).field_K = 92L;
          return ((ga) this).field_o.substring(var2, var3);
        } else {
          return ((ga) this).field_o.substring(var2, var3);
        }
    }

    private final void g(byte param0) {
        this.e((byte) 95);
        this.l(0);
        if (param0 >= -54) {
            ((ga) this).field_G = true;
        }
    }

    private final void e(byte param0) {
        try {
            String var2 = null;
            if (param0 < 30) {
              return;
            } else {
              L0: {
                var2 = this.b(true);
                if (var2.length() > 0) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b(true)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        fi var7 = null;
        super.a(param0, -121, param2, param3);
        this.m(0);
        if ((((ga) this).field_s ^ -1) == -2) {
          if (((ga) this).field_i instanceof fi) {
            var7 = (fi) (Object) ((ga) this).field_i;
            var6 = var7.a(qh.field_i, 108, bm.field_h, param2, param3, (qm) this);
            if (0 != (var6 ^ -1)) {
              if (((ga) this).field_M) {
                if (((ga) this).field_O > var6) {
                  if (var6 <= ((ga) this).field_D) {
                    ((ga) this).field_N = var6;
                    ((ga) this).field_K = lo.a((byte) 98);
                    var5 = 26 / ((param1 - -50) / 59);
                    return;
                  } else {
                    var6 = ((ga) this).field_O;
                    ((ga) this).field_N = var6;
                    ((ga) this).field_K = lo.a((byte) 98);
                    var5 = 26 / ((param1 - -50) / 59);
                    return;
                  }
                } else {
                  ((ga) this).field_N = var6;
                  ((ga) this).field_K = lo.a((byte) 98);
                  var5 = 26 / ((param1 - -50) / 59);
                  return;
                }
              } else {
                ((ga) this).field_N = var6;
                ((ga) this).field_K = lo.a((byte) 98);
                var5 = 26 / ((param1 - -50) / 59);
                return;
              }
            } else {
              ((ga) this).field_K = lo.a((byte) 98);
              var5 = 26 / ((param1 - -50) / 59);
              return;
            }
          } else {
            ((ga) this).field_K = lo.a((byte) 98);
            var5 = 26 / ((param1 - -50) / 59);
            return;
          }
        } else {
          var5 = 26 / ((param1 - -50) / 59);
          return;
        }
    }

    final static int p(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        boolean discarded$12 = qe.field_g.a(ea.field_r, false, true, cn.field_a);
        qe.field_g.b(false);
        L0: while (true) {
          if (!ge.b(-31)) {
            if (0 != (pl.field_g ^ -1)) {
              var1 = pl.field_g;
              rc.a(-25537, -1);
              return var1;
            } else {
              if (dj.field_t) {
                return 3;
              } else {
                if (l.field_b != sg.field_b) {
                  if (gk.field_e.b(param0 + -75)) {
                    if (l.field_b == lc.field_c) {
                      return 2;
                    } else {
                      if (param0 != -1) {
                        field_J = null;
                        return -1;
                      } else {
                        return -1;
                      }
                    }
                  } else {
                    return 1;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            boolean discarded$13 = qe.field_g.a(pj.field_q, false, c.field_p);
            continue L0;
          }
        }
    }

    final void k(int param0) {
        ((ga) this).field_D = 0;
        ((ga) this).field_o = "";
        ((ga) this).field_N = 0;
        if (param0 > -70) {
          int discarded$2 = ga.p(-5);
          ((ga) this).h(126);
          return;
        } else {
          ((ga) this).h(126);
          return;
        }
    }

    private final void m(int param0) {
        tb var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fi var9 = null;
        var8 = CrazyCrystals.field_B;
        if (!((ga) this).field_G) {
          ((ga) this).field_h = 0;
          ((ga) this).field_k = 0;
          return;
        } else {
          if (!(((ga) this).field_i instanceof fi)) {
            return;
          } else {
            var9 = (fi) (Object) ((ga) this).field_i;
            var3 = var9.a((qm) this, 1);
            if (param0 != 0) {
              ((ga) this).field_K = -79L;
              var4 = var3.a(108);
              var5 = var9.a(106, (qm) this);
              var6 = var9.a(40) >> 1179813889;
              if (var4 >= var5 - var6) {
                var7 = ((ga) this).field_h - -var3.a(((ga) this).field_N, 1);
                if (var5 + -var6 < var7) {
                  ((ga) this).field_h = ((ga) this).field_h + -var7 + -var6 + var5;
                  if (-1 <= (((ga) this).field_h ^ -1)) {
                    if (((ga) this).field_h >= var6 + -var5) {
                      return;
                    } else {
                      ((ga) this).field_h = -var5 + var6;
                      return;
                    }
                  } else {
                    ((ga) this).field_h = 0;
                    return;
                  }
                } else {
                  if (var7 < var6) {
                    ((ga) this).field_h = -var7 - -var6 + ((ga) this).field_h;
                    if (-1 <= (((ga) this).field_h ^ -1)) {
                      if (((ga) this).field_h >= var6 + -var5) {
                        return;
                      } else {
                        ((ga) this).field_h = -var5 + var6;
                        return;
                      }
                    } else {
                      ((ga) this).field_h = 0;
                      return;
                    }
                  } else {
                    L0: {
                      if (-1 > (((ga) this).field_h ^ -1)) {
                        ((ga) this).field_h = 0;
                        break L0;
                      } else {
                        if (((ga) this).field_h < var6 + -var5) {
                          ((ga) this).field_h = -var5 + var6;
                          break L0;
                        } else {
                          break L0;
                        }
                      }
                    }
                    return;
                  }
                }
              } else {
                ((ga) this).field_k = 0;
                ((ga) this).field_h = 0;
                return;
              }
            } else {
              var4 = var3.a(108);
              var5 = var9.a(106, (qm) this);
              var6 = var9.a(40) >> 1179813889;
              if (var4 >= var5 - var6) {
                var7 = ((ga) this).field_h - -var3.a(((ga) this).field_N, 1);
                if (var5 + -var6 >= var7) {
                  if (var7 >= var6) {
                    L1: {
                      if (-1 > (((ga) this).field_h ^ -1)) {
                        ((ga) this).field_h = 0;
                        break L1;
                      } else {
                        if (((ga) this).field_h < var6 + -var5) {
                          ((ga) this).field_h = -var5 + var6;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                    }
                    return;
                  } else {
                    L2: {
                      ((ga) this).field_h = -var7 - -var6 + ((ga) this).field_h;
                      if (-1 > (((ga) this).field_h ^ -1)) {
                        ((ga) this).field_h = 0;
                        break L2;
                      } else {
                        if (((ga) this).field_h < var6 + -var5) {
                          ((ga) this).field_h = -var5 + var6;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    return;
                  }
                } else {
                  L3: {
                    ((ga) this).field_h = ((ga) this).field_h + -var7 + -var6 + var5;
                    if (-1 > (((ga) this).field_h ^ -1)) {
                      ((ga) this).field_h = 0;
                      break L3;
                    } else {
                      if (((ga) this).field_h < var6 + -var5) {
                        ((ga) this).field_h = -var5 + var6;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  return;
                }
              } else {
                ((ga) this).field_k = 0;
                ((ga) this).field_h = 0;
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0, int param1, String param2) {
        int var4 = 0;
        if (param1 < -54) {
          L0: {
            if (param2 != null) {
              break L0;
            } else {
              param2 = "";
              break L0;
            }
          }
          ((ga) this).field_o = param2;
          var4 = param2.length();
          if ((((ga) this).field_I ^ -1) != 0) {
            if (((ga) this).field_I < var4) {
              ((ga) this).field_o = ((ga) this).field_o.substring(0, ((ga) this).field_I);
              int dupTemp$6 = ((ga) this).field_o.length();
              ((ga) this).field_D = dupTemp$6;
              ((ga) this).field_N = dupTemp$6;
              if (!param0) {
                ((ga) this).h(126);
                return;
              } else {
                return;
              }
            } else {
              int dupTemp$7 = ((ga) this).field_o.length();
              ((ga) this).field_D = dupTemp$7;
              ((ga) this).field_N = dupTemp$7;
              if (!param0) {
                ((ga) this).h(126);
                return;
              } else {
                return;
              }
            }
          } else {
            int dupTemp$8 = ((ga) this).field_o.length();
            ((ga) this).field_D = dupTemp$8;
            ((ga) this).field_N = dupTemp$8;
            if (!param0) {
              ((ga) this).h(126);
              return;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    private final void a(int param0, boolean param1) {
        L0: {
          ((ga) this).field_N = param0;
          if (!cp.field_k[81]) {
            ((ga) this).field_D = ((ga) this).field_N;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          this.f((byte) -31);
          return;
        } else {
          return;
        }
    }

    ga(String param0, bi param1, int param2) {
        super(param0, param1);
        ((ga) this).field_C = 0L;
        ((ga) this).field_O = -1;
        ((ga) this).field_M = false;
        ((ga) this).field_i = pi.field_j.field_q;
        ((ga) this).field_I = param2;
        ((ga) this).a(true, -115, param0);
        ((ga) this).field_G = true;
        ((ga) this).field_K = lo.a((byte) -91);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new String[]{"All scores", "My scores", "Best each"};
        field_F = new mk();
        field_J = new int[1024];
    }
}
