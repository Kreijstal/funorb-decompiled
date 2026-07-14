/*
 * Decompiled by CFR-JS 0.4.0.
 */
class kl extends hf {
    private long field_O;
    private int field_T;
    private boolean field_N;
    private boolean field_M;
    static nh[] field_R;
    static boolean field_S;
    private int field_Q;
    private int field_L;
    private long field_K;
    private int field_P;
    static int field_J;

    private final int k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = ((kl) this).field_p.length();
        if (((kl) this).field_L == var2) {
          return ((kl) this).field_L;
        } else {
          if (param0 <= -121) {
            var3 = ((kl) this).field_L - -1;
            L0: while (true) {
              if (var2 > var3) {
                if (32 != ((kl) this).field_p.charAt(-1 + var3)) {
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
            return -45;
          }
        }
    }

    private final void k(byte param0) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        va var11 = null;
        em var12 = null;
        va var13 = null;
        em var14 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!((kl) this).field_N) {
          ((kl) this).field_t = 0;
          ((kl) this).field_q = 0;
          return;
        } else {
          if (!(((kl) this).field_l instanceof va)) {
            return;
          } else {
            if (param0 <= -41) {
              var13 = (va) (Object) ((kl) this).field_l;
              var14 = var13.a((vg) this, true);
              var4 = var14.a(-17287);
              var5 = var13.a((vg) this, -120);
              var6 = var13.a((byte) -120) >> -268237535;
              if (var4 >= -var6 + var5) {
                var7 = ((kl) this).field_t - -var14.a(103, ((kl) this).field_L);
                if (-var6 + var5 < var7) {
                  ((kl) this).field_t = -var6 + (var5 + (-var7 + ((kl) this).field_t));
                  if (-1 <= (((kl) this).field_t ^ -1)) {
                    if (((kl) this).field_t < -var5 - -var6) {
                      ((kl) this).field_t = var6 + -var5;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    ((kl) this).field_t = 0;
                    return;
                  }
                } else {
                  if (var6 <= var7) {
                    if (-1 <= (((kl) this).field_t ^ -1)) {
                      if (((kl) this).field_t < -var5 - -var6) {
                        ((kl) this).field_t = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((kl) this).field_t = 0;
                      return;
                    }
                  } else {
                    ((kl) this).field_t = ((kl) this).field_t - (var7 + -var6);
                    if (-1 <= (((kl) this).field_t ^ -1)) {
                      if (((kl) this).field_t < -var5 - -var6) {
                        ((kl) this).field_t = var6 + -var5;
                        return;
                      } else {
                        return;
                      }
                    } else {
                      ((kl) this).field_t = 0;
                      return;
                    }
                  }
                }
              } else {
                ((kl) this).field_q = 0;
                ((kl) this).field_t = 0;
                return;
              }
            } else {
              var9 = null;
              boolean discarded$1 = ((kl) this).a(63, (vg) null, -100, (byte) -115, 14, 55, 25);
              var11 = (va) (Object) ((kl) this).field_l;
              var12 = var11.a((vg) this, true);
              var4 = var12.a(-17287);
              var5 = var11.a((vg) this, -120);
              var6 = var11.a((byte) -120) >> -268237535;
              if (var4 >= -var6 + var5) {
                L0: {
                  var7 = ((kl) this).field_t - -var12.a(103, ((kl) this).field_L);
                  if (-var6 + var5 < var7) {
                    ((kl) this).field_t = -var6 + (var5 + (-var7 + ((kl) this).field_t));
                    break L0;
                  } else {
                    if (var6 > var7) {
                      ((kl) this).field_t = ((kl) this).field_t - (var7 + -var6);
                      break L0;
                    } else {
                      L1: {
                        if (-1 <= (((kl) this).field_t ^ -1)) {
                          if (((kl) this).field_t >= -var5 - -var6) {
                            break L1;
                          } else {
                            ((kl) this).field_t = var6 + -var5;
                            break L1;
                          }
                        } else {
                          ((kl) this).field_t = 0;
                          break L1;
                        }
                      }
                      return;
                    }
                  }
                }
                if (-1 <= (((kl) this).field_t ^ -1)) {
                  if (((kl) this).field_t >= -var5 - -var6) {
                    return;
                  } else {
                    ((kl) this).field_t = var6 + -var5;
                    return;
                  }
                } else {
                  ((kl) this).field_t = 0;
                  return;
                }
              } else {
                ((kl) this).field_q = 0;
                ((kl) this).field_t = 0;
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0, String param1, int param2) {
        int var4 = 0;
        L0: {
          if (param1 != null) {
            break L0;
          } else {
            param1 = "";
            break L0;
          }
        }
        if (param2 == -19116) {
          ((kl) this).field_p = param1;
          var4 = param1.length();
          if (-1 != ((kl) this).field_P) {
            if (var4 <= ((kl) this).field_P) {
              L1: {
                ((kl) this).field_Q = ((kl) this).field_p.length();
                ((kl) this).field_L = ((kl) this).field_p.length();
                if (!param0) {
                  ((kl) this).m((byte) -9);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_P);
                ((kl) this).field_Q = ((kl) this).field_p.length();
                ((kl) this).field_L = ((kl) this).field_p.length();
                if (!param0) {
                  ((kl) this).m((byte) -9);
                  break L2;
                } else {
                  break L2;
                }
              }
              return;
            }
          } else {
            L3: {
              ((kl) this).field_Q = ((kl) this).field_p.length();
              ((kl) this).field_L = ((kl) this).field_p.length();
              if (!param0) {
                ((kl) this).m((byte) -9);
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final void h(byte param0) {
        ((kl) this).field_p = "";
        if (param0 != 88) {
            return;
        }
        ((kl) this).field_L = 0;
        ((kl) this).field_Q = 0;
        ((kl) this).m((byte) -76);
    }

    void m(byte param0) {
        if (!(!(((kl) this).field_u instanceof kd))) {
            ((kd) (Object) ((kl) this).field_u).a(true, (kl) this);
        }
        int var2 = 84 % ((35 - param0) / 33);
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_58_0 = null;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        Object stackIn_109_0 = null;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        Object stackIn_115_0 = null;
        Object stackIn_116_0 = null;
        Object stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        Object stackOut_114_0 = null;
        Object stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        Object stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        Object stackOut_108_0 = null;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        Object stackOut_57_0 = null;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_58_0 = null;
        int stackOut_58_1 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        L0: {
          if (param3 >= 63) {
            break L0;
          } else {
            ((kl) this).field_P = 111;
            break L0;
          }
        }
        ((kl) this).field_K = la.a(false);
        if (param1 != 60) {
          if (param1 != 62) {
            if (param1 >= 32) {
              if (param1 <= 126) {
                if (((kl) this).field_Q == ((kl) this).field_L) {
                  if (((kl) this).field_P == -1) {
                    if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                      ((kl) this).field_p = ((kl) this).field_p + param1;
                      ((kl) this).field_L = ((kl) this).field_p.length();
                      ((kl) this).field_Q = ((kl) this).field_p.length();
                      ((kl) this).m((byte) -102);
                      return true;
                    } else {
                      ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                      ((kl) this).field_L = ((kl) this).field_L + 1;
                      ((kl) this).field_Q = ((kl) this).field_L;
                      ((kl) this).m((byte) -102);
                      return true;
                    }
                  } else {
                    if (((kl) this).field_p.length() >= ((kl) this).field_P) {
                      return true;
                    } else {
                      L1: {
                        if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                          ((kl) this).field_p = ((kl) this).field_p + param1;
                          ((kl) this).field_L = ((kl) this).field_p.length();
                          ((kl) this).field_Q = ((kl) this).field_p.length();
                          break L1;
                        } else {
                          ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                          ((kl) this).field_L = ((kl) this).field_L + 1;
                          ((kl) this).field_Q = ((kl) this).field_L;
                          break L1;
                        }
                      }
                      ((kl) this).m((byte) -102);
                      return true;
                    }
                  }
                } else {
                  L2: {
                    L3: {
                      this.i(63);
                      if (((kl) this).field_P == -1) {
                        break L3;
                      } else {
                        if (((kl) this).field_p.length() >= ((kl) this).field_P) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                      ((kl) this).field_p = ((kl) this).field_p + param1;
                      ((kl) this).field_L = ((kl) this).field_p.length();
                      ((kl) this).field_Q = ((kl) this).field_p.length();
                      ((kl) this).m((byte) -102);
                      break L2;
                    } else {
                      ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
                      ((kl) this).field_L = ((kl) this).field_L + 1;
                      ((kl) this).field_Q = ((kl) this).field_L;
                      ((kl) this).m((byte) -102);
                      break L2;
                    }
                  }
                  return true;
                }
              } else {
                L4: {
                  if (85 != param0) {
                    if (param0 != 101) {
                      if (param0 != -14) {
                        if (param0 == 96) {
                          if (((kl) this).field_L > 0) {
                            L5: {
                              stackOut_114_0 = this;
                              stackIn_116_0 = stackOut_114_0;
                              stackIn_115_0 = stackOut_114_0;
                              if (ck.field_f[82]) {
                                stackOut_116_0 = this;
                                stackOut_116_1 = this.l((byte) 75);
                                stackIn_117_0 = stackOut_116_0;
                                stackIn_117_1 = stackOut_116_1;
                                break L5;
                              } else {
                                stackOut_115_0 = this;
                                stackOut_115_1 = -1 + ((kl) this).field_L;
                                stackIn_117_0 = stackOut_115_0;
                                stackIn_117_1 = stackOut_115_1;
                                break L5;
                              }
                            }
                            this.a(stackIn_117_1, (byte) -59);
                            return true;
                          } else {
                            return false;
                          }
                        } else {
                          if (-98 == param0) {
                            if (((kl) this).field_L < ((kl) this).field_p.length()) {
                              L6: {
                                stackOut_108_0 = this;
                                stackIn_110_0 = stackOut_108_0;
                                stackIn_109_0 = stackOut_108_0;
                                if (ck.field_f[82]) {
                                  stackOut_110_0 = this;
                                  stackOut_110_1 = this.k(-125);
                                  stackIn_111_0 = stackOut_110_0;
                                  stackIn_111_1 = stackOut_110_1;
                                  break L6;
                                } else {
                                  stackOut_109_0 = this;
                                  stackOut_109_1 = ((kl) this).field_L - -1;
                                  stackIn_111_0 = stackOut_109_0;
                                  stackIn_111_1 = stackOut_109_1;
                                  break L6;
                                }
                              }
                              this.a(stackIn_111_1, (byte) -59);
                              return true;
                            } else {
                              return false;
                            }
                          } else {
                            if (param0 != 102) {
                              if (-104 != (param0 ^ -1)) {
                                if ((param0 ^ -1) != -85) {
                                  L7: {
                                    if (!ck.field_f[82]) {
                                      break L7;
                                    } else {
                                      if (param0 != -66) {
                                        break L7;
                                      } else {
                                        this.h(-1);
                                        return true;
                                      }
                                    }
                                  }
                                  if (!ck.field_f[82]) {
                                    if (ck.field_f[82]) {
                                      if (param0 == 67) {
                                        this.g((byte) -53);
                                        return true;
                                      } else {
                                        break L4;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    if (-67 != param0) {
                                      if (ck.field_f[82]) {
                                        if (param0 == 67) {
                                          this.g((byte) -53);
                                          return true;
                                        } else {
                                          return false;
                                        }
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      this.i((byte) 124);
                                      return true;
                                    }
                                  }
                                } else {
                                  this.j(0);
                                  return true;
                                }
                              } else {
                                this.a(((kl) this).field_p.length(), (byte) -59);
                                return true;
                              }
                            } else {
                              this.a(0, (byte) -59);
                              return true;
                            }
                          }
                        }
                      } else {
                        ((kl) this).h((byte) 88);
                        return true;
                      }
                    } else {
                      if (((kl) this).field_Q == ((kl) this).field_L) {
                        if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                          return false;
                        } else {
                          ((kl) this).field_Q = 1 + ((kl) this).field_L;
                          this.i(-108);
                          return true;
                        }
                      } else {
                        this.i(-79);
                        return true;
                      }
                    }
                  } else {
                    if (((kl) this).field_Q == ((kl) this).field_L) {
                      if (((kl) this).field_L > 0) {
                        ((kl) this).field_Q = ((kl) this).field_L + -1;
                        this.i(-117);
                        return true;
                      } else {
                        break L4;
                      }
                    } else {
                      this.i(-48);
                      return true;
                    }
                  }
                }
                return false;
              }
            } else {
              L8: {
                if (85 != param0) {
                  if (param0 != 101) {
                    if (param0 != -14) {
                      if (param0 == 96) {
                        if (((kl) this).field_L <= 0) {
                          return false;
                        } else {
                          L9: {
                            stackOut_57_0 = this;
                            stackIn_59_0 = stackOut_57_0;
                            stackIn_58_0 = stackOut_57_0;
                            if (ck.field_f[82]) {
                              stackOut_59_0 = this;
                              stackOut_59_1 = this.l((byte) 75);
                              stackIn_60_0 = stackOut_59_0;
                              stackIn_60_1 = stackOut_59_1;
                              break L9;
                            } else {
                              stackOut_58_0 = this;
                              stackOut_58_1 = -1 + ((kl) this).field_L;
                              stackIn_60_0 = stackOut_58_0;
                              stackIn_60_1 = stackOut_58_1;
                              break L9;
                            }
                          }
                          this.a(stackIn_60_1, (byte) -59);
                          return true;
                        }
                      } else {
                        if (-98 == param0) {
                          if (((kl) this).field_L >= ((kl) this).field_p.length()) {
                            return false;
                          } else {
                            L10: {
                              stackOut_50_0 = this;
                              stackIn_52_0 = stackOut_50_0;
                              stackIn_51_0 = stackOut_50_0;
                              if (ck.field_f[82]) {
                                stackOut_52_0 = this;
                                stackOut_52_1 = this.k(-125);
                                stackIn_53_0 = stackOut_52_0;
                                stackIn_53_1 = stackOut_52_1;
                                break L10;
                              } else {
                                stackOut_51_0 = this;
                                stackOut_51_1 = ((kl) this).field_L - -1;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                break L10;
                              }
                            }
                            this.a(stackIn_53_1, (byte) -59);
                            return true;
                          }
                        } else {
                          if (param0 != 102) {
                            if (-104 != (param0 ^ -1)) {
                              if ((param0 ^ -1) != -85) {
                                L11: {
                                  if (!ck.field_f[82]) {
                                    break L11;
                                  } else {
                                    if (param0 != -66) {
                                      break L11;
                                    } else {
                                      this.h(-1);
                                      return true;
                                    }
                                  }
                                }
                                if (!ck.field_f[82]) {
                                  if (ck.field_f[82]) {
                                    if (param0 == 67) {
                                      this.g((byte) -53);
                                      return true;
                                    } else {
                                      break L8;
                                    }
                                  } else {
                                    return false;
                                  }
                                } else {
                                  if (-67 != param0) {
                                    if (ck.field_f[82]) {
                                      if (param0 == 67) {
                                        this.g((byte) -53);
                                        return true;
                                      } else {
                                        return false;
                                      }
                                    } else {
                                      return false;
                                    }
                                  } else {
                                    this.i((byte) 124);
                                    return true;
                                  }
                                }
                              } else {
                                this.j(0);
                                return true;
                              }
                            } else {
                              this.a(((kl) this).field_p.length(), (byte) -59);
                              return true;
                            }
                          } else {
                            this.a(0, (byte) -59);
                            return true;
                          }
                        }
                      }
                    } else {
                      ((kl) this).h((byte) 88);
                      return true;
                    }
                  } else {
                    if (((kl) this).field_Q == ((kl) this).field_L) {
                      if (((kl) this).field_L < ((kl) this).field_p.length()) {
                        ((kl) this).field_Q = 1 + ((kl) this).field_L;
                        this.i(-108);
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      this.i(-79);
                      return true;
                    }
                  }
                } else {
                  if (((kl) this).field_Q == ((kl) this).field_L) {
                    if (((kl) this).field_L > 0) {
                      ((kl) this).field_Q = ((kl) this).field_L + -1;
                      this.i(-117);
                      return true;
                    } else {
                      break L8;
                    }
                  } else {
                    this.i(-48);
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

    kl(String param0, fd param1, int param2) {
        super(param0, param1);
        ((kl) this).field_O = 0L;
        ((kl) this).field_M = false;
        ((kl) this).field_T = -1;
        ((kl) this).field_P = param2;
        ((kl) this).field_l = ja.field_Q.field_f;
        ((kl) this).a(true, param0, -19116);
        ((kl) this).field_N = true;
        ((kl) this).field_K = la.a(false);
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        if (((kl) this).field_L != ((kl) this).field_Q) {
            var2 = ((kl) this).field_Q >= ((kl) this).field_L ? ((kl) this).field_L : ((kl) this).field_Q;
            var3 = ((kl) this).field_L <= ((kl) this).field_Q ? ((kl) this).field_Q : ((kl) this).field_L;
            ((kl) this).field_L = var2;
            ((kl) this).field_Q = var2;
            ((kl) this).field_p = ((kl) this).field_p.substring(0, var2) + ((kl) this).field_p.substring(var3, ((kl) this).field_p.length());
            ((kl) this).m((byte) -45);
        }
        var2 = -42 % ((param0 - -1) / 39);
    }

    private final int l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (((kl) this).field_L == 0) {
          return ((kl) this).field_L;
        } else {
          if (param0 == 75) {
            var2 = -1 + ((kl) this).field_L;
            L0: while (true) {
              if (0 < var2) {
                if (((kl) this).field_p.charAt(var2 - 1) != 32) {
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
            return 119;
          }
        }
    }

    void a(vg param0, int param1, int param2, byte param3) {
        int var6 = 0;
        va var7 = null;
        L0: {
          super.a(param0, param1, param2, (byte) -128);
          this.k((byte) -101);
          if (((kl) this).field_y == 1) {
            if (((kl) this).field_l instanceof va) {
              L1: {
                var7 = (va) (Object) ((kl) this).field_l;
                var6 = var7.a((vg) this, param1, param2, ob.field_g, 3, ck.field_c);
                if (var6 == -1) {
                  break L1;
                } else {
                  if (((kl) this).field_M) {
                    L2: {
                      if (((kl) this).field_T <= var6) {
                        break L2;
                      } else {
                        if (var6 > ((kl) this).field_Q) {
                          var6 = ((kl) this).field_T;
                          break L2;
                        } else {
                          ((kl) this).field_L = var6;
                          ((kl) this).field_K = la.a(false);
                          if (param3 > -127) {
                            this.g((byte) 12);
                            return;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    ((kl) this).field_L = var6;
                    break L1;
                  } else {
                    ((kl) this).field_L = var6;
                    ((kl) this).field_K = la.a(false);
                    if (param3 > -127) {
                      this.g((byte) 12);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              ((kl) this).field_K = la.a(false);
              break L0;
            } else {
              ((kl) this).field_K = la.a(false);
              if (param3 <= -127) {
                return;
              } else {
                this.g((byte) 12);
                return;
              }
            }
          } else {
            break L0;
          }
        }
        if (param3 > -127) {
          this.g((byte) 12);
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, byte param1) {
        L0: {
          ((kl) this).field_L = param0;
          if (!ck.field_f[81]) {
            ((kl) this).field_Q = ((kl) this).field_L;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != -59) {
          ((kl) this).field_K = -78L;
          return;
        } else {
          return;
        }
    }

    final boolean a(int param0, vg param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8_int = 0;
        long var8 = 0L;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        if (super.a(param0, param1, param2, (byte) 115, param4, param5, param6)) {
          if (((kl) this).field_l instanceof va) {
            L0: {
              var8_int = ((va) (Object) ((kl) this).field_l).a((vg) this, param5, param6, ob.field_g, 3, ck.field_c);
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (0 != (var8_int ^ -1)) {
                stackOut_12_0 = this;
                stackOut_12_1 = var8_int;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L0;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 0;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L0;
              }
            }
            L1: {
              this.a(stackIn_13_1, (byte) -59);
              var8 = la.a(false);
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (250L <= -((kl) this).field_O + var8) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L1;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L1;
              }
            }
            ((kl) this).field_M = stackIn_16_1 != 0;
            if (((kl) this).field_M) {
              ((kl) this).field_Q = this.l((byte) 75);
              ((kl) this).field_L = this.k(-124);
              if (-1 > (((kl) this).field_L ^ -1)) {
                if (32 != ((kl) this).field_p.charAt(((kl) this).field_L - 1)) {
                  ((kl) this).field_T = ((kl) this).field_L;
                  ((kl) this).field_O = var8;
                  return true;
                } else {
                  ((kl) this).field_L = ((kl) this).field_L - 1;
                  ((kl) this).field_T = ((kl) this).field_L;
                  ((kl) this).field_O = var8;
                  return true;
                }
              } else {
                ((kl) this).field_T = ((kl) this).field_L;
                ((kl) this).field_O = var8;
                return true;
              }
            } else {
              ((kl) this).field_O = var8;
              return true;
            }
          } else {
            if (param3 <= 113) {
              return true;
            } else {
              return false;
            }
          }
        } else {
          if (param3 <= 113) {
            return true;
          } else {
            return false;
          }
        }
    }

    final static String a(String param0, vj param1, int param2, String param3) {
        if (!param1.a(0)) {
          return param0;
        } else {
          L0: {
            if (param2 == 27867) {
              break L0;
            } else {
              field_R = null;
              break L0;
            }
          }
          return param3 + " - " + param1.d((byte) 95) + "%";
        }
    }

    public static void j(byte param0) {
        field_R = null;
        int var1 = 94 % ((25 - param0) / 49);
    }

    private final void j(int param0) {
        if (param0 != 0) {
          L0: {
            field_J = 68;
            if (((kl) this).field_u instanceof kd) {
              ((kd) (Object) ((kl) this).field_u).a((kl) this, (byte) 83);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((kl) this).field_u instanceof kd) {
              ((kd) (Object) ((kl) this).field_u).a((kl) this, (byte) 83);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    private final void i(byte param0) {
        try {
            String var2 = null;
            Object var3 = null;
            var2 = this.b(false);
            if ((var2.length() ^ -1) >= -1) {
              if (param0 <= 54) {
                var3 = null;
                ((kl) this).a((vg) null, 116, 13, (byte) 24);
                return;
              } else {
                return;
              }
            } else {
              java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().setContents((java.awt.datatransfer.Transferable) (Object) new java.awt.datatransfer.StringSelection(this.b(false)), (java.awt.datatransfer.ClipboardOwner) null);
              if (param0 > 54) {
                return;
              } else {
                var3 = null;
                ((kl) this).a((vg) null, 116, 13, (byte) 24);
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final String b(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (((kl) this).field_L > ((kl) this).field_Q) {
            stackOut_2_0 = ((kl) this).field_Q;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((kl) this).field_L;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var2 = stackIn_3_0;
        if (param0) {
          return null;
        } else {
          L1: {
            if (((kl) this).field_Q < ((kl) this).field_L) {
              stackOut_6_0 = ((kl) this).field_L;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            } else {
              stackOut_5_0 = ((kl) this).field_Q;
              stackIn_7_0 = stackOut_5_0;
              break L1;
            }
          }
          var3 = stackIn_7_0;
          return ((kl) this).field_p.substring(var2, var3);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        long var6 = 0L;
        va var8 = null;
        if (param2 == -21) {
          if (null != ((kl) this).field_l) {
            if (0 == param1) {
              ((kl) this).field_l.a(((kl) this).field_E, 102, (vg) this, param3, param0);
              if (((kl) this).field_l instanceof va) {
                var8 = (va) (Object) ((kl) this).field_l;
                if (((kl) this).field_Q == ((kl) this).field_L) {
                  var6 = la.a(false);
                  if (-501L >= ((-((kl) this).field_K + var6) % 1000L ^ -1L)) {
                    return;
                  } else {
                    var8.a(param3, param0, (vg) this, ((kl) this).field_L, (byte) -90);
                    return;
                  }
                } else {
                  L0: {
                    var8.a(((kl) this).field_L, param3, -128, (vg) this, param0, ((kl) this).field_Q);
                    var6 = la.a(false);
                    if (-501L < ((-((kl) this).field_K + var6) % 1000L ^ -1L)) {
                      var8.a(param3, param0, (vg) this, ((kl) this).field_L, (byte) -90);
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return;
                }
              } else {
                return;
              }
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

    private final void g(byte param0) {
        try {
            String var2 = null;
            Exception var2_ref = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            try {
              var2 = (String) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard().getContents((Object) null).getTransferData(java.awt.datatransfer.DataFlavor.stringFlavor);
              var3 = 108 / ((64 - param0) / 44);
              this.i(-122);
              this.a(5, var2);
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

    private final void h(int param0) {
        this.i((byte) 59);
        if (param0 != -1) {
            this.g((byte) 55);
            this.i(-45);
            return;
        }
        this.i(-45);
    }

    private final void a(int param0, String param1) {
        int var3 = 0;
        L0: {
          if (0 != (((kl) this).field_P ^ -1)) {
            var3 = ((kl) this).field_P - ((kl) this).field_p.length();
            if ((var3 ^ -1) <= -1) {
              return;
            } else {
              param1 = param1.substring(0, var3);
              break L0;
            }
          } else {
            break L0;
          }
        }
        if (((kl) this).field_L != ((kl) this).field_p.length()) {
          ((kl) this).field_p = ((kl) this).field_p.substring(0, ((kl) this).field_L) + param1 + ((kl) this).field_p.substring(((kl) this).field_L, ((kl) this).field_p.length());
          if (param0 != 5) {
            return;
          } else {
            ((kl) this).field_L = ((kl) this).field_L + param1.length();
            ((kl) this).field_Q = ((kl) this).field_L;
            ((kl) this).m((byte) 122);
            return;
          }
        } else {
          ((kl) this).field_p = ((kl) this).field_p + param1;
          if (param0 != 5) {
            return;
          } else {
            ((kl) this).field_L = ((kl) this).field_L + param1.length();
            ((kl) this).field_Q = ((kl) this).field_L;
            ((kl) this).m((byte) 122);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = new nh[5];
    }
}
