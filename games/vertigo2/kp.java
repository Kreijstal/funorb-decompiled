/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kp extends d {
    private int field_N;
    private int field_O;
    private boolean field_J;
    private boolean field_I;
    private int field_K;
    private long field_H;
    private int field_L;
    private long field_M;
    static int field_P;

    final void a(boolean param0, int param1, int param2, int param3) {
        qa var5 = null;
        long var6 = 0L;
        if (((kp) this).field_B != null) {
          if (0 == param1) {
            ((kp) this).field_B.a(((kp) this).field_F, param2, true, (iq) this, param3);
            if (((kp) this).field_B instanceof qa) {
              var5 = (qa) (Object) ((kp) this).field_B;
              if (((kp) this).field_K == ((kp) this).field_L) {
                var6 = gk.a(126);
                if (500L <= (var6 - ((kp) this).field_M) % 1000L) {
                  if (param0) {
                    ((kp) this).field_K = -119;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var5.a(-94, ((kp) this).field_K, param2, (iq) this, param3);
                  if (param0) {
                    ((kp) this).field_K = -119;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                var5.a((iq) this, ((kp) this).field_K, param0, ((kp) this).field_L, param3, param2);
                var6 = gk.a(126);
                if (500L <= (var6 - ((kp) this).field_M) % 1000L) {
                  if (param0) {
                    ((kp) this).field_K = -119;
                    return;
                  } else {
                    return;
                  }
                } else {
                  var5.a(-94, ((kp) this).field_K, param2, (iq) this, param3);
                  if (!param0) {
                    return;
                  } else {
                    ((kp) this).field_K = -119;
                    return;
                  }
                }
              }
            } else {
              if (param0) {
                ((kp) this).field_K = -119;
                return;
              } else {
                return;
              }
            }
          } else {
            if (param0) {
              ((kp) this).field_K = -119;
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0) {
            ((kp) this).field_K = -119;
            return;
          } else {
            return;
          }
        }
    }

    private final String h(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 != 0) {
          L0: {
            String discarded$1 = this.h(36);
            if (((kp) this).field_L >= ((kp) this).field_K) {
              stackOut_10_0 = ((kp) this).field_K;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((kp) this).field_L;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var2 = stackIn_11_0;
            if (((kp) this).field_K <= ((kp) this).field_L) {
              stackOut_13_0 = ((kp) this).field_L;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((kp) this).field_K;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var3 = stackIn_14_0;
          return ((kp) this).field_w.substring(var2, var3);
        } else {
          L2: {
            if (((kp) this).field_L >= ((kp) this).field_K) {
              stackOut_3_0 = ((kp) this).field_K;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((kp) this).field_L;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var2 = stackIn_4_0;
            if (((kp) this).field_K <= ((kp) this).field_L) {
              stackOut_6_0 = ((kp) this).field_L;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((kp) this).field_K;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var3 = stackIn_7_0;
          return ((kp) this).field_w.substring(var2, var3);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -27539) {
          var2 = ((kp) this).field_w.length();
          if (var2 != ((kp) this).field_K) {
            var3 = 1 + ((kp) this).field_K;
            L0: while (true) {
              if (var2 > var3) {
                if (-33 != (((kp) this).field_w.charAt(var3 + -1) ^ -1)) {
                  var3++;
                  continue L0;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((kp) this).field_K;
          }
        } else {
          String discarded$5 = this.h(-55);
          var2 = ((kp) this).field_w.length();
          if (var2 != ((kp) this).field_K) {
            var3 = 1 + ((kp) this).field_K;
            L1: while (true) {
              if (var2 > var3) {
                if (-33 != ((kp) this).field_w.charAt(var3 + -1)) {
                  var3++;
                  continue L1;
                } else {
                  return var3;
                }
              } else {
                return var3;
              }
            }
          } else {
            return ((kp) this).field_K;
          }
        }
    }

    private final void b(boolean param0) {
        ro var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        qa var9 = null;
        var8 = Vertigo2.field_L ? 1 : 0;
        if (!((kp) this).field_J) {
          ((kp) this).field_u = 0;
          ((kp) this).field_y = 0;
          return;
        } else {
          if (param0) {
            if (((kp) this).field_B instanceof qa) {
              var9 = (qa) (Object) ((kp) this).field_B;
              var3 = var9.b((iq) this, 64);
              var4 = var3.a(8783);
              var5 = var9.a(-1, (iq) this);
              var6 = var9.a((byte) -91) >> -610322815;
              if (var4 < var5 + -var6) {
                ((kp) this).field_y = 0;
                ((kp) this).field_u = 0;
                return;
              } else {
                var7 = ((kp) this).field_u + var3.b(((kp) this).field_K, 118);
                if (var7 > -var6 + var5) {
                  ((kp) this).field_u = ((kp) this).field_u + (var5 + -var6) + -var7;
                  if ((((kp) this).field_u ^ -1) >= -1) {
                    if (((kp) this).field_u < -var5 - -var6) {
                      ((kp) this).field_u = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((kp) this).field_u = 0;
                    return;
                  }
                } else {
                  if (var7 < var6) {
                    ((kp) this).field_u = var6 - (var7 - ((kp) this).field_u);
                    if ((((kp) this).field_u ^ -1) >= -1) {
                      if (((kp) this).field_u >= -var5 - -var6) {
                        return;
                      } else {
                        ((kp) this).field_u = var6 + -var5;
                        return;
                      }
                    } else {
                      ((kp) this).field_u = 0;
                      return;
                    }
                  } else {
                    if ((((kp) this).field_u ^ -1) >= -1) {
                      if (((kp) this).field_u >= -var5 - -var6) {
                        return;
                      } else {
                        ((kp) this).field_u = var6 + -var5;
                        return;
                      }
                    } else {
                      ((kp) this).field_u = 0;
                      return;
                    }
                  }
                }
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (!(((kp) this).field_K == ((kp) this).field_L)) {
            var2 = ((kp) this).field_K <= ((kp) this).field_L ? ((kp) this).field_K : ((kp) this).field_L;
            var3 = ((kp) this).field_L < ((kp) this).field_K ? ((kp) this).field_K : ((kp) this).field_L;
            ((kp) this).field_L = var2;
            ((kp) this).field_K = var2;
            ((kp) this).field_w = ((kp) this).field_w.substring(0, var2) + ((kp) this).field_w.substring(var3, ((kp) this).field_w.length());
            ((kp) this).h((byte) 34);
        }
        var2 = 55 / ((-22 - param0) / 32);
    }

    private final void a(String param0, byte param1) {
        int var3 = 0;
        L0: {
          if (-1 != ((kp) this).field_N) {
            var3 = ((kp) this).field_N - ((kp) this).field_w.length();
            if (var3 >= 0) {
              return;
            } else {
              param0 = param0.substring(0, var3);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (((kp) this).field_K == ((kp) this).field_w.length()) {
          ((kp) this).field_w = ((kp) this).field_w + param0;
          if (param1 <= 80) {
            return;
          } else {
            ((kp) this).field_K = ((kp) this).field_K + param0.length();
            ((kp) this).field_L = ((kp) this).field_K;
            ((kp) this).h((byte) 32);
            return;
          }
        } else {
          ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_K) + param0 + ((kp) this).field_w.substring(((kp) this).field_K, ((kp) this).field_w.length());
          if (param1 <= 80) {
            return;
          } else {
            ((kp) this).field_K = ((kp) this).field_K + param0.length();
            ((kp) this).field_L = ((kp) this).field_K;
            ((kp) this).h((byte) 32);
            return;
          }
        }
    }

    final void j(int param0) {
        ((kp) this).field_L = 0;
        ((kp) this).field_w = "";
        ((kp) this).field_K = param0;
        ((kp) this).h((byte) 103);
    }

    void h(byte param0) {
        L0: {
          if (((kp) this).field_v instanceof ih) {
            ((ih) (Object) ((kp) this).field_v).a(-122, (kp) this);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 16) {
          this.g((byte) -96);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        ((kp) this).field_K = param0;
        if (param1 < -84) {
          if (!cr.field_eb[81]) {
            ((kp) this).field_L = ((kp) this).field_K;
            return;
          } else {
            return;
          }
        } else {
          ((kp) this).a(true, -70, -56, -82);
          if (cr.field_eb[81]) {
            return;
          } else {
            ((kp) this).field_L = ((kp) this).field_K;
            return;
          }
        }
    }

    private final void e(byte param0) {
        this.f((byte) -127);
        this.m(55);
        if (param0 <= 0) {
            ((kp) this).field_N = -70;
        }
    }

    final void a(String param0, int param1, boolean param2) {
        int var4 = 0;
        Object var5 = null;
        L0: {
          if (param0 == null) {
            param0 = "";
            break L0;
          } else {
            break L0;
          }
        }
        ((kp) this).field_w = param0;
        if (param1 < -71) {
          var4 = param0.length();
          if (-1 != ((kp) this).field_N) {
            if (var4 <= ((kp) this).field_N) {
              L1: {
                ((kp) this).field_L = ((kp) this).field_w.length();
                ((kp) this).field_K = ((kp) this).field_w.length();
                if (!param2) {
                  ((kp) this).h((byte) 29);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_N);
                ((kp) this).field_L = ((kp) this).field_w.length();
                ((kp) this).field_K = ((kp) this).field_w.length();
                if (!param2) {
                  ((kp) this).h((byte) 29);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              ((kp) this).field_L = ((kp) this).field_w.length();
              ((kp) this).field_K = ((kp) this).field_w.length();
              if (!param2) {
                ((kp) this).h((byte) 29);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          var5 = null;
          ((kp) this).a((String) null, -67, false);
          var4 = param0.length();
          if (-1 == ((kp) this).field_N) {
            L4: {
              ((kp) this).field_L = ((kp) this).field_w.length();
              ((kp) this).field_K = ((kp) this).field_w.length();
              if (!param2) {
                ((kp) this).h((byte) 29);
                break L4;
              } else {
                break L4;
              }
            }
            return;
          } else {
            L5: {
              if (var4 > ((kp) this).field_N) {
                ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_N);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              ((kp) this).field_L = ((kp) this).field_w.length();
              ((kp) this).field_K = ((kp) this).field_w.length();
              if (!param2) {
                ((kp) this).h((byte) 29);
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        }
    }

    final boolean a(int param0, int param1, int param2, iq param3, int param4, byte param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackOut_23_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        if (param5 <= -107) {
          if (super.a(param0, param1, param2, param3, param4, (byte) -111, param6)) {
            if (((kp) this).field_B instanceof qa) {
              L0: {
                var8_int = ((qa) (Object) ((kp) this).field_B).a(ed.field_n, param2, 101, param1, (iq) this, gb.field_d);
                stackOut_23_0 = this;
                stackIn_25_0 = stackOut_23_0;
                stackIn_24_0 = stackOut_23_0;
                if (0 == (var8_int ^ -1)) {
                  stackOut_25_0 = this;
                  stackOut_25_1 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  break L0;
                } else {
                  stackOut_24_0 = this;
                  stackOut_24_1 = var8_int;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  break L0;
                }
              }
              L1: {
                this.a(stackIn_26_1, (byte) -126);
                var8 = gk.a(44);
                stackOut_26_0 = this;
                stackIn_28_0 = stackOut_26_0;
                stackIn_27_0 = stackOut_26_0;
                if (-((kp) this).field_H + var8 >= 250L) {
                  stackOut_28_0 = this;
                  stackOut_28_1 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L1;
                } else {
                  stackOut_27_0 = this;
                  stackOut_27_1 = 1;
                  stackIn_29_0 = stackOut_27_0;
                  stackIn_29_1 = stackOut_27_1;
                  break L1;
                }
              }
              ((kp) this).field_I = stackIn_29_1 != 0;
              if (((kp) this).field_I) {
                ((kp) this).field_L = this.l(44);
                ((kp) this).field_K = this.k(-27539);
                if (((kp) this).field_K > 0) {
                  if (32 != ((kp) this).field_w.charAt(-1 + ((kp) this).field_K)) {
                    ((kp) this).field_O = ((kp) this).field_K;
                    ((kp) this).field_H = var8;
                    return true;
                  } else {
                    ((kp) this).field_K = ((kp) this).field_K - 1;
                    ((kp) this).field_O = ((kp) this).field_K;
                    ((kp) this).field_H = var8;
                    return true;
                  }
                } else {
                  ((kp) this).field_O = ((kp) this).field_K;
                  ((kp) this).field_H = var8;
                  return true;
                }
              } else {
                ((kp) this).field_H = var8;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((kp) this).field_O = 102;
          if (super.a(param0, param1, param2, param3, param4, (byte) -111, param6)) {
            if (((kp) this).field_B instanceof qa) {
              L2: {
                var8_int = ((qa) (Object) ((kp) this).field_B).a(ed.field_n, param2, 101, param1, (iq) this, gb.field_d);
                stackOut_5_0 = this;
                stackIn_7_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (0 == (var8_int ^ -1)) {
                  stackOut_7_0 = this;
                  stackOut_7_1 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  break L2;
                } else {
                  stackOut_6_0 = this;
                  stackOut_6_1 = var8_int;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L2;
                }
              }
              L3: {
                this.a(stackIn_8_1, (byte) -126);
                var8 = gk.a(44);
                stackOut_8_0 = this;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (-((kp) this).field_H + var8 >= 250L) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L3;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L3;
                }
              }
              ((kp) this).field_I = stackIn_11_1 != 0;
              if (((kp) this).field_I) {
                ((kp) this).field_L = this.l(44);
                ((kp) this).field_K = this.k(-27539);
                if (((kp) this).field_K > 0) {
                  if (32 != ((kp) this).field_w.charAt(-1 + ((kp) this).field_K)) {
                    ((kp) this).field_O = ((kp) this).field_K;
                    ((kp) this).field_H = var8;
                    return true;
                  } else {
                    ((kp) this).field_K = ((kp) this).field_K - 1;
                    ((kp) this).field_O = ((kp) this).field_K;
                    ((kp) this).field_H = var8;
                    return true;
                  }
                } else {
                  ((kp) this).field_O = ((kp) this).field_K;
                  ((kp) this).field_H = var8;
                  return true;
                }
              } else {
                ((kp) this).field_H = var8;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    void a(byte param0, int param1, int param2, iq param3) {
        qa var5 = null;
        int var6 = 0;
        super.a((byte) 31, param1, param2, param3);
        if (param0 < 6) {
            return;
        }
        this.b(true);
        if (!(((kp) this).field_A != 1)) {
            if (!(((kp) this).field_B instanceof qa)) {
                ((kp) this).field_M = gk.a(57);
                return;
            }
            var5 = (qa) (Object) ((kp) this).field_B;
            var6 = var5.a(ed.field_n, param2, 106, param1, (iq) this, gb.field_d);
            if ((var6 ^ -1) == 0) {
                ((kp) this).field_M = gk.a(57);
                return;
            }
            if (!((kp) this).field_I) {
                ((kp) this).field_K = var6;
                ((kp) this).field_M = gk.a(57);
                return;
            }
            if (((kp) this).field_O <= var6) {
                ((kp) this).field_K = var6;
                ((kp) this).field_M = gk.a(57);
                return;
            }
            if (var6 > ((kp) this).field_L) {
                var6 = ((kp) this).field_O;
                ((kp) this).field_K = var6;
                ((kp) this).field_M = gk.a(57);
                return;
            }
            ((kp) this).field_K = var6;
            ((kp) this).field_M = gk.a(57);
            return;
        }
    }

    final boolean a(char param0, int param1, int param2, iq param3) {
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        Object stackIn_54_0 = null;
        Object stackIn_55_0 = null;
        Object stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        Object stackIn_80_0 = null;
        Object stackIn_81_0 = null;
        Object stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        Object stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        Object stackOut_103_0 = null;
        Object stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_79_0 = null;
        Object stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        Object stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        Object stackOut_53_0 = null;
        Object stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        Object stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        Object stackOut_27_0 = null;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        L0: {
          if (param1 == 13) {
            break L0;
          } else {
            ((kp) this).field_O = -111;
            break L0;
          }
        }
        ((kp) this).field_M = gk.a(77);
        if (param0 != 60) {
          if (param0 != 62) {
            if (param0 >= 32) {
              if (param0 <= 126) {
                if (((kp) this).field_K == ((kp) this).field_L) {
                  if ((((kp) this).field_N ^ -1) == 0) {
                    if (((kp) this).field_K < ((kp) this).field_w.length()) {
                      ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_K) + param0 + ((kp) this).field_w.substring(((kp) this).field_K, ((kp) this).field_w.length());
                      ((kp) this).field_K = ((kp) this).field_K + 1;
                      ((kp) this).field_L = ((kp) this).field_K;
                      ((kp) this).h((byte) 26);
                      return true;
                    } else {
                      ((kp) this).field_w = ((kp) this).field_w + param0;
                      ((kp) this).field_K = ((kp) this).field_w.length();
                      ((kp) this).field_L = ((kp) this).field_w.length();
                      ((kp) this).h((byte) 26);
                      return true;
                    }
                  } else {
                    if (((kp) this).field_w.length() >= ((kp) this).field_N) {
                      return true;
                    } else {
                      L1: {
                        if (((kp) this).field_K < ((kp) this).field_w.length()) {
                          ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_K) + param0 + ((kp) this).field_w.substring(((kp) this).field_K, ((kp) this).field_w.length());
                          ((kp) this).field_K = ((kp) this).field_K + 1;
                          ((kp) this).field_L = ((kp) this).field_K;
                          break L1;
                        } else {
                          ((kp) this).field_w = ((kp) this).field_w + param0;
                          ((kp) this).field_K = ((kp) this).field_w.length();
                          ((kp) this).field_L = ((kp) this).field_w.length();
                          break L1;
                        }
                      }
                      ((kp) this).h((byte) 26);
                      return true;
                    }
                  }
                } else {
                  L2: {
                    L3: {
                      this.m(-126);
                      if ((((kp) this).field_N ^ -1) == 0) {
                        break L3;
                      } else {
                        if (((kp) this).field_w.length() >= ((kp) this).field_N) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (((kp) this).field_K < ((kp) this).field_w.length()) {
                      ((kp) this).field_w = ((kp) this).field_w.substring(0, ((kp) this).field_K) + param0 + ((kp) this).field_w.substring(((kp) this).field_K, ((kp) this).field_w.length());
                      ((kp) this).field_K = ((kp) this).field_K + 1;
                      ((kp) this).field_L = ((kp) this).field_K;
                      ((kp) this).h((byte) 26);
                      break L2;
                    } else {
                      ((kp) this).field_w = ((kp) this).field_w + param0;
                      ((kp) this).field_K = ((kp) this).field_w.length();
                      ((kp) this).field_L = ((kp) this).field_w.length();
                      ((kp) this).h((byte) 26);
                      break L2;
                    }
                  }
                  return true;
                }
              } else {
                L4: {
                  if (param2 != 85) {
                    if (param2 != 101) {
                      if (param2 != 13) {
                        if ((param2 ^ -1) != -97) {
                          if (-98 == param2) {
                            if (((kp) this).field_K < ((kp) this).field_w.length()) {
                              L5: {
                                stackOut_103_0 = this;
                                stackIn_105_0 = stackOut_103_0;
                                stackIn_104_0 = stackOut_103_0;
                                if (!cr.field_eb[82]) {
                                  stackOut_105_0 = this;
                                  stackOut_105_1 = ((kp) this).field_K + 1;
                                  stackIn_106_0 = stackOut_105_0;
                                  stackIn_106_1 = stackOut_105_1;
                                  break L5;
                                } else {
                                  stackOut_104_0 = this;
                                  stackOut_104_1 = this.k(-27539);
                                  stackIn_106_0 = stackOut_104_0;
                                  stackIn_106_1 = stackOut_104_1;
                                  break L5;
                                }
                              }
                              this.a(stackIn_106_1, (byte) -117);
                              return true;
                            } else {
                              break L4;
                            }
                          } else {
                            if (param2 != 102) {
                              if (-104 != param2) {
                                if (param2 != 84) {
                                  L6: {
                                    if (!cr.field_eb[82]) {
                                      break L6;
                                    } else {
                                      if (param2 != -66) {
                                        break L6;
                                      } else {
                                        this.e((byte) 35);
                                        return true;
                                      }
                                    }
                                  }
                                  L7: {
                                    if (!cr.field_eb[82]) {
                                      break L7;
                                    } else {
                                      if (-67 != param2) {
                                        break L7;
                                      } else {
                                        this.f((byte) -127);
                                        return true;
                                      }
                                    }
                                  }
                                  if (cr.field_eb[82]) {
                                    if ((param2 ^ -1) != -68) {
                                      break L4;
                                    } else {
                                      this.i((byte) -35);
                                      return true;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  this.g((byte) 100);
                                  return true;
                                }
                              } else {
                                this.a(((kp) this).field_w.length(), (byte) -116);
                                return true;
                              }
                            } else {
                              this.a(0, (byte) -127);
                              return true;
                            }
                          }
                        } else {
                          if ((((kp) this).field_K ^ -1) < -1) {
                            L8: {
                              stackOut_79_0 = this;
                              stackIn_81_0 = stackOut_79_0;
                              stackIn_80_0 = stackOut_79_0;
                              if (!cr.field_eb[82]) {
                                stackOut_81_0 = this;
                                stackOut_81_1 = -1 + ((kp) this).field_K;
                                stackIn_82_0 = stackOut_81_0;
                                stackIn_82_1 = stackOut_81_1;
                                break L8;
                              } else {
                                stackOut_80_0 = this;
                                stackOut_80_1 = this.l(-128);
                                stackIn_82_0 = stackOut_80_0;
                                stackIn_82_1 = stackOut_80_1;
                                break L8;
                              }
                            }
                            this.a(stackIn_82_1, (byte) -116);
                            return true;
                          } else {
                            return false;
                          }
                        }
                      } else {
                        ((kp) this).j(0);
                        return true;
                      }
                    } else {
                      if (((kp) this).field_K == ((kp) this).field_L) {
                        if (((kp) this).field_K >= ((kp) this).field_w.length()) {
                          return false;
                        } else {
                          ((kp) this).field_L = 1 + ((kp) this).field_K;
                          this.m(48);
                          return true;
                        }
                      } else {
                        this.m(-95);
                        return true;
                      }
                    }
                  } else {
                    if (((kp) this).field_L == ((kp) this).field_K) {
                      if (-1 > (((kp) this).field_K ^ -1)) {
                        ((kp) this).field_L = ((kp) this).field_K - 1;
                        this.m(-69);
                        return true;
                      } else {
                        break L4;
                      }
                    } else {
                      this.m(111);
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              L9: {
                if (param2 != 85) {
                  if (param2 != 101) {
                    if (param2 != 13) {
                      if ((param2 ^ -1) != -97) {
                        if (-98 == param2) {
                          if (((kp) this).field_K < ((kp) this).field_w.length()) {
                            L10: {
                              stackOut_53_0 = this;
                              stackIn_55_0 = stackOut_53_0;
                              stackIn_54_0 = stackOut_53_0;
                              if (!cr.field_eb[82]) {
                                stackOut_55_0 = this;
                                stackOut_55_1 = ((kp) this).field_K + 1;
                                stackIn_56_0 = stackOut_55_0;
                                stackIn_56_1 = stackOut_55_1;
                                break L10;
                              } else {
                                stackOut_54_0 = this;
                                stackOut_54_1 = this.k(-27539);
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_56_1, (byte) -117);
                            return true;
                          } else {
                            break L9;
                          }
                        } else {
                          if (param2 != 102) {
                            if (-104 != param2) {
                              if (param2 != 84) {
                                L11: {
                                  if (!cr.field_eb[82]) {
                                    break L11;
                                  } else {
                                    if (param2 != -66) {
                                      break L11;
                                    } else {
                                      this.e((byte) 35);
                                      return true;
                                    }
                                  }
                                }
                                L12: {
                                  if (!cr.field_eb[82]) {
                                    break L12;
                                  } else {
                                    if (-67 != param2) {
                                      break L12;
                                    } else {
                                      this.f((byte) -127);
                                      return true;
                                    }
                                  }
                                }
                                if (cr.field_eb[82]) {
                                  if ((param2 ^ -1) != -68) {
                                    return false;
                                  } else {
                                    this.i((byte) -35);
                                    return true;
                                  }
                                } else {
                                  return false;
                                }
                              } else {
                                this.g((byte) 100);
                                return true;
                              }
                            } else {
                              this.a(((kp) this).field_w.length(), (byte) -116);
                              return true;
                            }
                          } else {
                            this.a(0, (byte) -127);
                            return true;
                          }
                        }
                      } else {
                        if ((((kp) this).field_K ^ -1) < -1) {
                          L13: {
                            stackOut_27_0 = this;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_28_0 = stackOut_27_0;
                            if (!cr.field_eb[82]) {
                              stackOut_29_0 = this;
                              stackOut_29_1 = -1 + ((kp) this).field_K;
                              stackIn_30_0 = stackOut_29_0;
                              stackIn_30_1 = stackOut_29_1;
                              break L13;
                            } else {
                              stackOut_28_0 = this;
                              stackOut_28_1 = this.l(-128);
                              stackIn_30_0 = stackOut_28_0;
                              stackIn_30_1 = stackOut_28_1;
                              break L13;
                            }
                          }
                          this.a(stackIn_30_1, (byte) -116);
                          return true;
                        } else {
                          return false;
                        }
                      }
                    } else {
                      ((kp) this).j(0);
                      return true;
                    }
                  } else {
                    if (((kp) this).field_K == ((kp) this).field_L) {
                      if (((kp) this).field_K < ((kp) this).field_w.length()) {
                        ((kp) this).field_L = 1 + ((kp) this).field_K;
                        this.m(48);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.m(-95);
                      return true;
                    }
                  }
                } else {
                  if (((kp) this).field_L == ((kp) this).field_K) {
                    if (-1 > (((kp) this).field_K ^ -1)) {
                      ((kp) this).field_L = ((kp) this).field_K - 1;
                      this.m(-69);
                      return true;
                    } else {
                      break L9;
                    }
                  } else {
                    this.m(111);
                    return true;
                  }
                }
              }
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (((kp) this).field_K != 0) {
          var2 = 22 % ((-64 - param0) / 62);
          var3 = ((kp) this).field_K - 1;
          L0: while (true) {
            if (0 < var3) {
              if (((kp) this).field_w.charAt(-1 + var3) != 32) {
                var3--;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          return ((kp) this).field_K;
        }
    }

    kp(String param0, uf param1, int param2) {
        super(param0, param1);
        ((kp) this).field_O = -1;
        ((kp) this).field_H = 0L;
        ((kp) this).field_I = false;
        ((kp) this).field_B = eb.field_c.field_c;
        ((kp) this).field_N = param2;
        ((kp) this).a(param0, -103, true);
        ((kp) this).field_J = true;
        ((kp) this).field_M = gk.a(117);
    }

    final static void i(int param0) {
        if (!pm.field_a) {
          if (param0 != 0) {
            kp.i(-128);
            return;
          } else {
            return;
          }
        } else {
          bi.d(bi.field_d, bi.field_f, -bi.field_d + bi.field_i, bi.field_c - bi.field_f);
          ql.field_L.b(false, param0 ^ 0);
          if (param0 == 0) {
            return;
          } else {
            kp.i(-128);
            return;
          }
        }
    }

    private final void i(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                if (param0 == -35) {
                  break L0;
                } else {
                  ((kp) this).field_H = -44L;
                  break L0;
                }
              }
              this.m(-59);
              this.a(var2, (byte) 100);
            } catch (java.lang.Exception decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2_ref = (Exception) (Object) decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(byte param0) {
        L0: {
          if (((kp) this).field_v instanceof ih) {
            ((ih) (Object) ((kp) this).field_v).a((byte) 58, (kp) this);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 100) {
          this.e((byte) -20);
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        try {
            String var2 = null;
            var2 = this.h(0);
            if (param0 != -127) {
              L0: {
                this.f((byte) 37);
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(0)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L0;
                } else {
                  break L0;
                }
              }
              return;
            } else {
              L1: {
                if (0 < var2.length()) {
                  java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.h(0)), (java.awt.datatransfer.ClipboardOwner) null);
                  break L1;
                } else {
                  break L1;
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

    static {
    }
}
