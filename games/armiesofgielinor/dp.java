/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dp extends je {
    private hd field_Tb;
    private je field_Ob;
    private int field_Kb;
    static int[][] field_Vb;
    private boolean field_Nb;
    private int field_Mb;
    private int field_Jb;
    static long field_Lb;
    private boolean field_Ib;
    private long field_Wb;
    je field_Pb;
    private int field_Ub;
    private StringBuilder field_Rb;
    private wo field_Sb;
    private je field_Xb;
    private int field_Qb;

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 48) {
          var3 = 0;
          var4 = 0;
          var5 = ((dp) this).field_Rb.length();
          L0: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                var3++;
                var4 = var4 + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.charAt(var3));
                continue L0;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        } else {
          ((dp) this).field_Qb = -37;
          var3 = 0;
          var4 = 0;
          var5 = ((dp) this).field_Rb.length();
          L1: while (true) {
            if (param1 > var4) {
              if (var5 > var3) {
                var3++;
                var4 = var4 + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.charAt(var3));
                continue L1;
              } else {
                return var3;
              }
            } else {
              return var3;
            }
          }
        }
    }

    final void a(boolean param0) {
        StringBuilder discarded$0 = up.a(' ', 0, ((dp) this).field_Rb, param0);
        ((dp) this).field_Qb = 0;
        ((dp) this).field_Jb = 0;
        ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
    }

    final void a(hd param0, int param1) {
        ((dp) this).field_Tb = param0;
        if (param1 != 176) {
            dp.n(63);
        }
    }

    final static void n(int param0) {
        int var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        int[] var5 = am.field_K;
        int[] var1 = var5;
        int var2 = param0;
        int var3 = var5.length;
        while (var2 < var3) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
    }

    public static void f(byte param0) {
        if (param0 != -123) {
            dp.f((byte) -111);
            field_Vb = null;
            return;
        }
        field_Vb = null;
    }

    private dp(long param0, je param1, je param2, je param3, int param4) {
        super(param0, param1);
        ((dp) this).field_Mb = -1;
        ((dp) this).field_Nb = false;
        ((dp) this).field_Ib = false;
        ((dp) this).field_Wb = 0L;
        ((dp) this).field_Ub = param4;
        ((dp) this).field_Xb = new je(0L, param2);
        ((dp) this).field_Pb = new je(0L, param3);
        ((dp) this).field_Ob = new je(0L, param3);
        ((dp) this).field_M = true;
        ((dp) this).field_Rb = new StringBuilder(0 != (((dp) this).field_Ub ^ -1) ? ((dp) this).field_Ub : 256);
        ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
        ((dp) this).field_Ob.field_X = "";
        ((dp) this).field_Ob.field_I = "|";
        ((dp) this).field_fb = new at();
        ((dp) this).a(((dp) this).field_Xb, 48);
        ((dp) this).a(((dp) this).field_Pb, 48);
        ((dp) this).a(((dp) this).field_Ob, 89);
        ((dp) this).field_Y = true;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = ArmiesOfGielinor.field_M ? 1 : 0;
          var4 = ((dp) this).field_Rb.length();
          if (0 > param1) {
            param1 = 0;
            break L0;
          } else {
            if (param1 <= var4) {
              break L0;
            } else {
              param1 = var4;
              if (0 > param2) {
                param2 = 0;
                if (param0 == -98) {
                  ((dp) this).field_Qb = param2;
                  ((dp) this).field_Jb = param1;
                  return;
                } else {
                  int discarded$6 = this.k(-15);
                  ((dp) this).field_Qb = param2;
                  ((dp) this).field_Jb = param1;
                  return;
                }
              } else {
                if (param2 > var4) {
                  param2 = var4;
                  if (param0 == -98) {
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  } else {
                    int discarded$7 = this.k(-15);
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  }
                } else {
                  if (param0 == -98) {
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  } else {
                    int discarded$8 = this.k(-15);
                    ((dp) this).field_Qb = param2;
                    ((dp) this).field_Jb = param1;
                    return;
                  }
                }
              }
            }
          }
        }
        if (0 > param2) {
          param2 = 0;
          if (param0 != -98) {
            int discarded$9 = this.k(-15);
            ((dp) this).field_Qb = param2;
            ((dp) this).field_Jb = param1;
            return;
          } else {
            ((dp) this).field_Qb = param2;
            ((dp) this).field_Jb = param1;
            return;
          }
        } else {
          if (param2 > var4) {
            param2 = var4;
            if (param0 != -98) {
              int discarded$10 = this.k(-15);
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            } else {
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            }
          } else {
            if (param0 == -98) {
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            } else {
              int discarded$11 = this.k(-15);
              ((dp) this).field_Qb = param2;
              ((dp) this).field_Jb = param1;
              return;
            }
          }
        }
    }

    private final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((dp) this).field_Qb == ((dp) this).field_Jb) {
            break L0;
          } else {
            L1: {
              if (((dp) this).field_Qb <= ((dp) this).field_Jb) {
                stackOut_3_0 = ((dp) this).field_Qb;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ((dp) this).field_Jb;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var2 = stackIn_4_0;
              if (((dp) this).field_Jb >= ((dp) this).field_Qb) {
                stackOut_6_0 = ((dp) this).field_Jb;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = ((dp) this).field_Qb;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            var3 = stackIn_7_0;
            ((dp) this).field_Jb = var2;
            ((dp) this).field_Qb = var2;
            var4 = ((dp) this).field_Rb.toString().substring(var3, ((dp) this).field_Rb.length());
            StringBuilder discarded$4 = up.a(' ', var2, ((dp) this).field_Rb, true);
            StringBuilder discarded$5 = ((dp) this).field_Rb.append(var4);
            ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
            break L0;
          }
        }
        if (param0 != 32) {
          field_Lb = -1L;
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, String param1) {
        int var3 = 0;
        String var4 = null;
        L0: {
          if (0 != (((dp) this).field_Ub ^ -1)) {
            var3 = ((dp) this).field_Ub - ((dp) this).field_Rb.length();
            if (0 == var3) {
              return;
            } else {
              param1 = param1.substring(0, var3);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (((dp) this).field_Qb != ((dp) this).field_Rb.length()) {
          var4 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
          StringBuilder discarded$4 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
          StringBuilder discarded$5 = ((dp) this).field_Rb.append(param1);
          StringBuilder discarded$6 = ((dp) this).field_Rb.append(var4);
          var3 = 109 / ((param0 - 44) / 40);
          ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
          ((dp) this).field_Qb = ((dp) this).field_Rb.length();
          ((dp) this).field_Jb = ((dp) this).field_Qb;
          return;
        } else {
          StringBuilder discarded$7 = ((dp) this).field_Rb.append(param1);
          var3 = 109 / ((param0 - 44) / 40);
          ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
          ((dp) this).field_Qb = ((dp) this).field_Rb.length();
          ((dp) this).field_Jb = ((dp) this).field_Qb;
          return;
        }
    }

    private final String d(byte param0) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
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
        if (param0 != 115) {
          L0: {
            this.p(78);
            var2 = ((dp) this).field_Rb.toString();
            if (((dp) this).field_Qb <= ((dp) this).field_Jb) {
              stackOut_10_0 = ((dp) this).field_Qb;
              stackIn_11_0 = stackOut_10_0;
              break L0;
            } else {
              stackOut_9_0 = ((dp) this).field_Jb;
              stackIn_11_0 = stackOut_9_0;
              break L0;
            }
          }
          L1: {
            var3 = stackIn_11_0;
            if (((dp) this).field_Jb >= ((dp) this).field_Qb) {
              stackOut_13_0 = ((dp) this).field_Jb;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            } else {
              stackOut_12_0 = ((dp) this).field_Qb;
              stackIn_14_0 = stackOut_12_0;
              break L1;
            }
          }
          var4 = stackIn_14_0;
          return var2.substring(var3, var4);
        } else {
          L2: {
            var2 = ((dp) this).field_Rb.toString();
            if (((dp) this).field_Qb <= ((dp) this).field_Jb) {
              stackOut_3_0 = ((dp) this).field_Qb;
              stackIn_4_0 = stackOut_3_0;
              break L2;
            } else {
              stackOut_2_0 = ((dp) this).field_Jb;
              stackIn_4_0 = stackOut_2_0;
              break L2;
            }
          }
          L3: {
            var3 = stackIn_4_0;
            if (((dp) this).field_Jb >= ((dp) this).field_Qb) {
              stackOut_6_0 = ((dp) this).field_Jb;
              stackIn_7_0 = stackOut_6_0;
              break L3;
            } else {
              stackOut_5_0 = ((dp) this).field_Qb;
              stackIn_7_0 = stackOut_5_0;
              break L3;
            }
          }
          var4 = stackIn_7_0;
          return var2.substring(var3, var4);
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        String var11 = null;
        String var12 = null;
        int stackIn_51_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_141_0 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_49_0 = 0;
        if (param2 != 60) {
          if (62 != param2) {
            if (param2 < 32) {
              if (-86 != (param0 ^ -1)) {
                if (-102 != (param0 ^ -1)) {
                  if ((param0 ^ -1) != -14) {
                    if (param0 == -97) {
                      if (-1 > (((dp) this).field_Qb ^ -1)) {
                        L0: {
                          if (!br.field_f[82]) {
                            stackOut_140_0 = -1 + ((dp) this).field_Qb;
                            stackIn_141_0 = stackOut_140_0;
                            break L0;
                          } else {
                            stackOut_139_0 = this.k(-1);
                            stackIn_141_0 = stackOut_139_0;
                            break L0;
                          }
                        }
                        var4 = stackIn_141_0;
                        this.b(var4, false);
                        return true;
                      } else {
                        if (param1 == -26126) {
                          return false;
                        } else {
                          ((dp) this).field_Wb = -48L;
                          return false;
                        }
                      }
                    } else {
                      L1: {
                        if (-98 == param0) {
                          if (((dp) this).field_Qb >= ((dp) this).field_Rb.length()) {
                            break L1;
                          } else {
                            L2: {
                              if (!br.field_f[82]) {
                                stackOut_132_0 = ((dp) this).field_Qb + 1;
                                stackIn_133_0 = stackOut_132_0;
                                break L2;
                              } else {
                                stackOut_131_0 = this.e((byte) 109);
                                stackIn_133_0 = stackOut_131_0;
                                break L2;
                              }
                            }
                            var4 = stackIn_133_0;
                            this.b(var4, false);
                            return true;
                          }
                        } else {
                          if (param0 != -103) {
                            if (-104 != param0) {
                              if (!br.field_f[82]) {
                                if (!br.field_f[82]) {
                                  if (!br.field_f[82]) {
                                    break L1;
                                  } else {
                                    if ((param0 ^ -1) == -68) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        ((dp) this).field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                } else {
                                  if ((param0 ^ -1) == -67) {
                                    this.p(param1 ^ 26164);
                                    return true;
                                  } else {
                                    if (br.field_f[82]) {
                                      if ((param0 ^ -1) == -68) {
                                        this.g((byte) -77);
                                        return true;
                                      } else {
                                        if (param1 == -26126) {
                                          return false;
                                        } else {
                                          ((dp) this).field_Wb = -48L;
                                          return false;
                                        }
                                      }
                                    } else {
                                      if (param1 == -26126) {
                                        return false;
                                      } else {
                                        ((dp) this).field_Wb = -48L;
                                        return false;
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (-66 != (param0 ^ -1)) {
                                  L3: {
                                    if (!br.field_f[82]) {
                                      break L3;
                                    } else {
                                      if ((param0 ^ -1) != -67) {
                                        break L3;
                                      } else {
                                        this.p(param1 ^ 26164);
                                        return true;
                                      }
                                    }
                                  }
                                  if (br.field_f[82]) {
                                    if ((param0 ^ -1) == -68) {
                                      this.g((byte) -77);
                                      return true;
                                    } else {
                                      L4: {
                                        if (param1 == -26126) {
                                          break L4;
                                        } else {
                                          ((dp) this).field_Wb = -48L;
                                          break L4;
                                        }
                                      }
                                      return false;
                                    }
                                  } else {
                                    L5: {
                                      if (param1 == -26126) {
                                        break L5;
                                      } else {
                                        ((dp) this).field_Wb = -48L;
                                        break L5;
                                      }
                                    }
                                    return false;
                                  }
                                } else {
                                  this.h((byte) 114);
                                  return true;
                                }
                              }
                            } else {
                              this.b(((dp) this).field_Rb.length(), false);
                              return true;
                            }
                          } else {
                            this.b(0, false);
                            return true;
                          }
                        }
                      }
                      if (param1 == -26126) {
                        return false;
                      } else {
                        ((dp) this).field_Wb = -48L;
                        return false;
                      }
                    }
                  } else {
                    ((dp) this).a(true);
                    return true;
                  }
                } else {
                  if (((dp) this).field_Jb == ((dp) this).field_Qb) {
                    if (((dp) this).field_Qb >= ((dp) this).field_Rb.length()) {
                      if (param1 == -26126) {
                        return false;
                      } else {
                        ((dp) this).field_Wb = -48L;
                        return false;
                      }
                    } else {
                      ((dp) this).field_Jb = 1 + ((dp) this).field_Qb;
                      this.l(32);
                      return true;
                    }
                  } else {
                    this.l(32);
                    return true;
                  }
                }
              } else {
                if (((dp) this).field_Qb == ((dp) this).field_Jb) {
                  if ((((dp) this).field_Qb ^ -1) >= -1) {
                    if (param1 == -26126) {
                      return false;
                    } else {
                      ((dp) this).field_Wb = -48L;
                      return false;
                    }
                  } else {
                    ((dp) this).field_Jb = ((dp) this).field_Qb + -1;
                    this.l(32);
                    return true;
                  }
                } else {
                  this.l(32);
                  return true;
                }
              }
            } else {
              if (param2 <= 126) {
                L6: {
                  if (((dp) this).field_Qb != ((dp) this).field_Jb) {
                    this.l(32);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (-1 == ((dp) this).field_Ub) {
                    L8: {
                      if (((dp) this).field_Qb != ((dp) this).field_Rb.length()) {
                        var12 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
                        StringBuilder discarded$8 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
                        StringBuilder discarded$9 = ((dp) this).field_Rb.append(param2);
                        StringBuilder discarded$10 = ((dp) this).field_Rb.append(var12);
                        break L8;
                      } else {
                        StringBuilder discarded$11 = ((dp) this).field_Rb.append(param2);
                        break L8;
                      }
                    }
                    ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
                    ((dp) this).field_Qb = ((dp) this).field_Qb + 1;
                    ((dp) this).field_Jb = ((dp) this).field_Qb;
                    break L7;
                  } else {
                    if (((dp) this).field_Rb.length() >= ((dp) this).field_Ub) {
                      break L7;
                    } else {
                      L9: {
                        if (((dp) this).field_Qb != ((dp) this).field_Rb.length()) {
                          var11 = ((dp) this).field_Rb.toString().substring(((dp) this).field_Qb, ((dp) this).field_Rb.length());
                          StringBuilder discarded$12 = up.a(' ', ((dp) this).field_Qb, ((dp) this).field_Rb, true);
                          StringBuilder discarded$13 = ((dp) this).field_Rb.append(param2);
                          StringBuilder discarded$14 = ((dp) this).field_Rb.append(var11);
                          break L9;
                        } else {
                          StringBuilder discarded$15 = ((dp) this).field_Rb.append(param2);
                          break L9;
                        }
                      }
                      ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
                      ((dp) this).field_Qb = ((dp) this).field_Qb + 1;
                      ((dp) this).field_Jb = ((dp) this).field_Qb;
                      return true;
                    }
                  }
                }
                return true;
              } else {
                L10: {
                  if (-86 != (param0 ^ -1)) {
                    if (-102 != (param0 ^ -1)) {
                      if ((param0 ^ -1) != -14) {
                        if (param0 == -97) {
                          if (-1 > (((dp) this).field_Qb ^ -1)) {
                            L11: {
                              if (!br.field_f[82]) {
                                stackOut_60_0 = -1 + ((dp) this).field_Qb;
                                stackIn_61_0 = stackOut_60_0;
                                break L11;
                              } else {
                                stackOut_59_0 = this.k(-1);
                                stackIn_61_0 = stackOut_59_0;
                                break L11;
                              }
                            }
                            var4 = stackIn_61_0;
                            this.b(var4, false);
                            return true;
                          } else {
                            break L10;
                          }
                        } else {
                          if (-98 == param0) {
                            if (((dp) this).field_Qb >= ((dp) this).field_Rb.length()) {
                              L12: {
                                if (param1 == -26126) {
                                  break L12;
                                } else {
                                  ((dp) this).field_Wb = -48L;
                                  break L12;
                                }
                              }
                              return false;
                            } else {
                              L13: {
                                if (!br.field_f[82]) {
                                  stackOut_50_0 = ((dp) this).field_Qb + 1;
                                  stackIn_51_0 = stackOut_50_0;
                                  break L13;
                                } else {
                                  stackOut_49_0 = this.e((byte) 109);
                                  stackIn_51_0 = stackOut_49_0;
                                  break L13;
                                }
                              }
                              var4 = stackIn_51_0;
                              this.b(var4, false);
                              return true;
                            }
                          } else {
                            if (param0 != -103) {
                              if (-104 != param0) {
                                L14: {
                                  if (!br.field_f[82]) {
                                    break L14;
                                  } else {
                                    if (-66 != (param0 ^ -1)) {
                                      break L14;
                                    } else {
                                      this.h((byte) 114);
                                      return true;
                                    }
                                  }
                                }
                                L15: {
                                  if (!br.field_f[82]) {
                                    break L15;
                                  } else {
                                    if ((param0 ^ -1) != -67) {
                                      break L15;
                                    } else {
                                      this.p(param1 ^ 26164);
                                      return true;
                                    }
                                  }
                                }
                                if (br.field_f[82]) {
                                  if ((param0 ^ -1) == -68) {
                                    this.g((byte) -77);
                                    return true;
                                  } else {
                                    break L10;
                                  }
                                } else {
                                  L16: {
                                    if (param1 == -26126) {
                                      break L16;
                                    } else {
                                      ((dp) this).field_Wb = -48L;
                                      break L16;
                                    }
                                  }
                                  return false;
                                }
                              } else {
                                this.b(((dp) this).field_Rb.length(), false);
                                return true;
                              }
                            } else {
                              this.b(0, false);
                              return true;
                            }
                          }
                        }
                      } else {
                        ((dp) this).a(true);
                        return true;
                      }
                    } else {
                      if (((dp) this).field_Jb == ((dp) this).field_Qb) {
                        if (((dp) this).field_Qb < ((dp) this).field_Rb.length()) {
                          ((dp) this).field_Jb = 1 + ((dp) this).field_Qb;
                          this.l(32);
                          return true;
                        } else {
                          L17: {
                            if (param1 == -26126) {
                              break L17;
                            } else {
                              ((dp) this).field_Wb = -48L;
                              break L17;
                            }
                          }
                          return false;
                        }
                      } else {
                        this.l(32);
                        return true;
                      }
                    }
                  } else {
                    if (((dp) this).field_Qb == ((dp) this).field_Jb) {
                      if ((((dp) this).field_Qb ^ -1) < -1) {
                        ((dp) this).field_Jb = ((dp) this).field_Qb + -1;
                        this.l(32);
                        return true;
                      } else {
                        break L10;
                      }
                    } else {
                      this.l(32);
                      return true;
                    }
                  }
                }
                L18: {
                  if (param1 == -26126) {
                    break L18;
                  } else {
                    ((dp) this).field_Wb = -48L;
                    break L18;
                  }
                }
                return false;
              }
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    private final void g(byte param0) {
        if (!(((dp) this).field_Tb != null)) {
            return;
        }
        int var2 = -66 / ((72 - param0) / 35);
        ((dp) this).field_Sb = ((dp) this).field_Tb.a(0);
    }

    private final void h(byte param0) {
        if (null == ((dp) this).field_Tb) {
          return;
        } else {
          this.p(-87);
          if (param0 <= 90) {
            ((dp) this).field_Xb = null;
            this.l(32);
            return;
          } else {
            this.l(32);
            return;
          }
        }
    }

    private final void p(int param0) {
        try {
            int var2 = 0;
            String var3 = null;
            java.awt.datatransfer.StringSelection var4 = null;
            if (((dp) this).field_Tb != null) {
              var2 = -53 / ((param0 - 11) / 49);
              var3 = this.d((byte) 115);
              if (var3.length() == 0) {
                return;
              } else {
                var4 = new java.awt.datatransfer.StringSelection(this.d((byte) 115));
                wo discarded$2 = ((dp) this).field_Tb.a((java.awt.datatransfer.Transferable) (Object) var4, -26522);
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final String q(int param0) {
        if (param0 != 0) {
            ((dp) this).field_Xb = null;
            return ((dp) this).field_Rb.toString();
        }
        return ((dp) this).field_Rb.toString();
    }

    final int o(int param0) {
        int var2 = -34 / ((param0 - 21) / 39);
        return ((dp) this).field_Qb;
    }

    final void a(String param0, byte param1) {
        int var3 = 0;
        L0: {
          ((dp) this).field_Rb.setLength(0);
          var3 = param0.length();
          if (((dp) this).field_Ub == -1) {
            break L0;
          } else {
            if (((dp) this).field_Ub < var3) {
              var3 = ((dp) this).field_Ub;
              break L0;
            } else {
              StringBuilder discarded$8 = ((dp) this).field_Rb.append(param0.substring(0, var3));
              ((dp) this).field_Jb = ((dp) this).field_Rb.length();
              ((dp) this).field_Qb = ((dp) this).field_Rb.length();
              ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
              if (param1 == 45) {
                return;
              } else {
                int discarded$9 = this.e((byte) 43);
                return;
              }
            }
          }
        }
        StringBuilder discarded$10 = ((dp) this).field_Rb.append(param0.substring(0, var3));
        ((dp) this).field_Jb = ((dp) this).field_Rb.length();
        ((dp) this).field_Qb = ((dp) this).field_Rb.length();
        ((dp) this).field_Pb.field_X = ((dp) this).field_Rb.toString();
        if (param1 != 45) {
          int discarded$11 = this.e((byte) 43);
          return;
        } else {
          return;
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        ((dp) this).a(param3, -20500, param2, param0, param4);
        ((dp) this).field_Pb.a(param3, -20500, param2, param1, 0);
        ((dp) this).field_Ob.a(param3, -20500, param2, 0, 0);
        ((dp) this).field_Kb = -4 + param3;
    }

    private final void b(int param0, boolean param1) {
        ((dp) this).field_Qb = param0;
        if (param1) {
            return;
        }
        if (!br.field_f[81]) {
            ((dp) this).field_Jb = ((dp) this).field_Qb;
        }
    }

    dp(long param0, je param1, je param2, je param3) {
        this(param0, param1, param2, param3, -1);
    }

    final void c(int param0, boolean param1) {
        ((dp) this).field_Jb = param0;
        ((dp) this).field_Qb = param0;
        if (param1) {
            boolean discarded$0 = ((dp) this).a(-36, 44, '');
        }
    }

    final void m(int param0) {
        try {
            int var2 = 0;
            long var3_long = 0L;
            int var3 = 0;
            Exception var4 = null;
            int var4_int = 0;
            int var5 = 0;
            int var6 = 0;
            java.awt.datatransfer.Transferable var7 = null;
            String var8 = null;
            Object stackIn_15_0 = null;
            Object stackIn_16_0 = null;
            Object stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            int stackIn_34_0 = 0;
            Object stackOut_14_0 = null;
            Object stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            Object stackOut_16_0 = null;
            int stackOut_16_1 = 0;
            int stackOut_32_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
                        var2 = this.c(param0 ^ 48, sm.field_d - (((dp) this).field_V - -((dp) this).field_Pb.field_F));
                        if (-2 == (((dp) this).field_yb ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if ((ro.field_ub ^ -1) != -2) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (((dp) this).field_Ib) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ((dp) this).field_Ib = false;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 5: {
                        ((dp) this).field_Ib = false;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 6: {
                        if (!((dp) this).field_Nb) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        if (var2 >= ((dp) this).field_Mb) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        if (((dp) this).field_Jb >= var2) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var2 = ((dp) this).field_Mb;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 10: {
                        ((dp) this).field_Qb = var2;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 11: {
                        ((dp) this).field_Qb = var2;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 12: {
                        ((dp) this).field_Qb = var2;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 13: {
                        ((dp) this).field_Qb = var2;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 14: {
                        this.b(var2, false);
                        ((dp) this).field_Ib = true;
                        var3_long = vi.b(param0 + -95);
                        stackOut_14_0 = this;
                        stackIn_16_0 = stackOut_14_0;
                        stackIn_15_0 = stackOut_14_0;
                        if (250L <= var3_long - ((dp) this).field_Wb) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = this;
                        stackOut_15_1 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = this;
                        stackOut_16_1 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        ((dp) this).field_Nb = stackIn_17_1 != 0;
                        if (!((dp) this).field_Nb) {
                            statePc = 24;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        ((dp) this).field_Jb = this.k(-1);
                        ((dp) this).field_Qb = this.e((byte) 109);
                        if ((((dp) this).field_Qb ^ -1) >= -1) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (((dp) this).field_Rb.charAt(((dp) this).field_Qb + -1) != 32) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        ((dp) this).field_Qb = ((dp) this).field_Qb - 1;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 21: {
                        ((dp) this).field_Mb = ((dp) this).field_Qb;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 22: {
                        ((dp) this).field_Mb = ((dp) this).field_Qb;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 23: {
                        ((dp) this).field_Mb = ((dp) this).field_Qb;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 24: {
                        ((dp) this).field_Wb = var3_long;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 25: {
                        ((dp) this).field_Wb = var3_long;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 26: {
                        ((dp) this).field_Wb = var3_long;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        ((dp) this).field_Wb = var3_long;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (((dp) this).field_Y) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        ((dp) this).field_Jb = ((dp) this).field_Rb.length();
                        ((dp) this).field_Qb = ((dp) this).field_Rb.length();
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        ((dp) this).field_Ob.field_S = ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.toString().substring(param0, ((dp) this).field_Qb));
                        if (((dp) this).field_Jb == ((dp) this).field_Qb) {
                            statePc = 35;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        var3 = ((dp) this).field_Pb.field_S + ((dp) this).field_Pb.field_Z.a(((dp) this).field_Rb.toString().substring(0, ((dp) this).field_Jb));
                        if (((dp) this).field_Ob.field_S <= var3) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        stackOut_32_0 = var3;
                        stackIn_34_0 = stackOut_32_0;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 33: {
                        stackOut_33_0 = ((dp) this).field_Ob.field_S;
                        stackIn_34_0 = stackOut_33_0;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        var4_int = stackIn_34_0;
                        var5 = Math.abs(var3 - ((dp) this).field_Ob.field_S);
                        ((dp) this).field_Xb.a(((dp) this).field_Kb, param0 + -20500, var5, 2, var4_int + ((dp) this).field_Pb.field_F);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 35: {
                        ((dp) this).field_Xb.a(((dp) this).field_Kb, -20500, 0, 2, ((dp) this).field_Ob.field_S);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (((dp) this).field_Sb == null) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (((dp) this).field_Sb.field_g != 0) {
                            statePc = 39;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        return;
                    }
                    case 39: {
                        var7 = (java.awt.datatransfer.Transferable) ((dp) this).field_Sb.field_f;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        try {
                            var8 = (String) var7.getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
                            this.l(32);
                            this.a((byte) 90, var8);
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 42;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        var4 = (Exception) (Object) caughtException;
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        ((dp) this).field_Sb = null;
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArmiesOfGielinor.field_M ? 1 : 0;
        if ((((dp) this).field_Qb ^ -1) != param0) {
          var2 = ((dp) this).field_Qb + -1;
          L0: while (true) {
            if (0 < var2) {
              if (!wr.a(((dp) this).field_Rb.charAt(-1 + var2), (byte) 95)) {
                var2--;
                continue L0;
              } else {
                return var2;
              }
            } else {
              return var2;
            }
          }
        } else {
          return ((dp) this).field_Qb;
        }
    }

    private final int e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 == 109) {
          var2 = ((dp) this).field_Rb.length();
          if (((dp) this).field_Qb != var2) {
            var3 = 1 + ((dp) this).field_Qb;
            L0: while (true) {
              if (var2 > var3) {
                if (!wr.a(((dp) this).field_Rb.charAt(var3 + -1), (byte) 95)) {
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
            return ((dp) this).field_Qb;
          }
        } else {
          ((dp) this).field_Ib = false;
          var2 = ((dp) this).field_Rb.length();
          if (((dp) this).field_Qb != var2) {
            var3 = 1 + ((dp) this).field_Qb;
            L1: while (true) {
              if (var2 > var3) {
                if (!wr.a(((dp) this).field_Rb.charAt(var3 + -1), (byte) 95)) {
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
            return ((dp) this).field_Qb;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Vb = new int[][]{new int[2], new int[2], new int[2], new int[2], new int[2], new int[2]};
    }
}
