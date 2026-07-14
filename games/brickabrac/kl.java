/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl extends qd {
    private int field_p;
    private int field_u;
    private int field_w;
    private int field_m;
    private int field_A;
    private int field_z;
    private int field_o;
    private int field_x;
    private int field_n;
    private int field_v;
    private int field_q;
    private int field_y;
    private int field_s;
    private int field_r;
    private boolean field_t;

    final int b() {
        if (((kl) this).field_w == 0) {
            if (((kl) this).field_x == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized void a(int param0) {
        oe var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((kl) this).field_x <= 0) {
            break L0;
          } else {
            if (param0 < ((kl) this).field_x) {
              ((kl) this).field_A = ((kl) this).field_A + ((kl) this).field_u * param0;
              ((kl) this).field_q = ((kl) this).field_q + ((kl) this).field_v * param0;
              ((kl) this).field_o = ((kl) this).field_o + ((kl) this).field_z * param0;
              ((kl) this).field_x = ((kl) this).field_x - param0;
              break L0;
            } else {
              L1: {
                if (((kl) this).field_w != -2147483648) {
                  break L1;
                } else {
                  ((kl) this).field_w = 0;
                  ((kl) this).field_o = 0;
                  ((kl) this).field_q = 0;
                  ((kl) this).field_A = 0;
                  ((kl) this).b((byte) 111);
                  param0 = ((kl) this).field_x;
                  break L1;
                }
              }
              ((kl) this).field_x = 0;
              this.m();
              break L0;
            }
          }
        }
        L2: {
          var2 = (oe) (Object) ((kl) this).field_k;
          var3 = ((kl) this).field_m << 8;
          var4 = ((kl) this).field_y << 8;
          var5 = var2.field_m.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((kl) this).field_s = 0;
            break L2;
          }
        }
        L3: {
          if (((kl) this).field_r >= 0) {
            break L3;
          } else {
            if (((kl) this).field_p <= 0) {
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              ((kl) this).field_r = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((kl) this).field_r < var5) {
            break L4;
          } else {
            if (((kl) this).field_p >= 0) {
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              ((kl) this).field_r = var5 - 1;
              break L4;
            }
          }
        }
        ((kl) this).field_r = ((kl) this).field_r + ((kl) this).field_p * param0;
        if (((kl) this).field_s >= 0) {
          L5: {
            if (((kl) this).field_s <= 0) {
              break L5;
            } else {
              if (!((kl) this).field_t) {
                L6: {
                  if (((kl) this).field_p >= 0) {
                    if (((kl) this).field_r >= var4) {
                      var7 = (((kl) this).field_r - var3) / var6;
                      if (var7 < ((kl) this).field_s) {
                        ((kl) this).field_r = ((kl) this).field_r - var6 * var7;
                        ((kl) this).field_s = ((kl) this).field_s - var7;
                        break L6;
                      } else {
                        ((kl) this).field_r = ((kl) this).field_r - var6 * ((kl) this).field_s;
                        ((kl) this).field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((kl) this).field_r < var3) {
                      var7 = (var4 - 1 - ((kl) this).field_r) / var6;
                      if (var7 < ((kl) this).field_s) {
                        ((kl) this).field_r = ((kl) this).field_r + var6 * var7;
                        ((kl) this).field_s = ((kl) this).field_s - var7;
                        break L6;
                      } else {
                        ((kl) this).field_r = ((kl) this).field_r + var6 * ((kl) this).field_s;
                        ((kl) this).field_s = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                return;
              } else {
                L7: {
                  if (((kl) this).field_p >= 0) {
                    break L7;
                  } else {
                    if (((kl) this).field_r < var3) {
                      ((kl) this).field_r = var3 + var3 - 1 - ((kl) this).field_r;
                      ((kl) this).field_p = -((kl) this).field_p;
                      ((kl) this).field_s = ((kl) this).field_s - 1;
                      if (((kl) this).field_s - 1 != 0) {
                        break L7;
                      } else {
                        break L5;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  if (((kl) this).field_r >= var4) {
                    ((kl) this).field_r = var4 + var4 - 1 - ((kl) this).field_r;
                    ((kl) this).field_p = -((kl) this).field_p;
                    ((kl) this).field_s = ((kl) this).field_s - 1;
                    if (((kl) this).field_s - 1 != 0) {
                      if (((kl) this).field_r < var3) {
                        ((kl) this).field_r = var3 + var3 - 1 - ((kl) this).field_r;
                        ((kl) this).field_p = -((kl) this).field_p;
                        ((kl) this).field_s = ((kl) this).field_s - 1;
                        if (((kl) this).field_s - 1 != 0) {
                          continue L8;
                        } else {
                          break L5;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L5;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (((kl) this).field_p < 0) {
            if (((kl) this).field_r < 0) {
              ((kl) this).field_r = -1;
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((kl) this).field_r < var5) {
                break L9;
              } else {
                ((kl) this).field_r = var5;
                this.i();
                ((kl) this).b((byte) 111);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((kl) this).field_t) {
            if (((kl) this).field_p >= 0) {
              if (((kl) this).field_r < var4) {
                return;
              } else {
                ((kl) this).field_r = var3 + (((kl) this).field_r - var3) % var6;
                return;
              }
            } else {
              if (((kl) this).field_r < var3) {
                ((kl) this).field_r = var4 - 1 - (var4 - 1 - ((kl) this).field_r) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((kl) this).field_p >= 0) {
                break L10;
              } else {
                if (((kl) this).field_r < var3) {
                  ((kl) this).field_r = var3 + var3 - 1 - ((kl) this).field_r;
                  ((kl) this).field_p = -((kl) this).field_p;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((kl) this).field_r >= var4) {
                ((kl) this).field_r = var4 + var4 - 1 - ((kl) this).field_r;
                ((kl) this).field_p = -((kl) this).field_p;
                if (((kl) this).field_r < var3) {
                  ((kl) this).field_r = var3 + var3 - 1 - ((kl) this).field_r;
                  ((kl) this).field_p = -((kl) this).field_p;
                  continue L11;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final synchronized void h(int param0) {
        int var2 = ((oe) (Object) ((kl) this).field_k).field_m.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((kl) this).field_r = param0;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final synchronized int h() {
        return ((kl) this).field_w == -2147483648 ? 0 : ((kl) this).field_w + 32 >> 6;
    }

    private final boolean j() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((kl) this).field_w;
          if (var1 != -2147483648) {
            var2 = kl.b(var1, ((kl) this).field_n);
            var3 = kl.d(var1, ((kl) this).field_n);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((kl) this).field_A != var1) {
            break L1;
          } else {
            if (((kl) this).field_q != var2) {
              break L1;
            } else {
              if (((kl) this).field_o == var3) {
                if (((kl) this).field_w == -2147483648) {
                  ((kl) this).field_w = 0;
                  ((kl) this).field_o = 0;
                  ((kl) this).field_q = 0;
                  ((kl) this).field_A = 0;
                  ((kl) this).b((byte) 111);
                  return true;
                } else {
                  this.m();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((kl) this).field_A >= var1) {
            if (((kl) this).field_A <= var1) {
              ((kl) this).field_u = 0;
              break L2;
            } else {
              ((kl) this).field_u = -1;
              ((kl) this).field_x = ((kl) this).field_A - var1;
              break L2;
            }
          } else {
            ((kl) this).field_u = 1;
            ((kl) this).field_x = var1 - ((kl) this).field_A;
            break L2;
          }
        }
        L3: {
          if (((kl) this).field_q >= var2) {
            if (((kl) this).field_q <= var2) {
              ((kl) this).field_v = 0;
              break L3;
            } else {
              L4: {
                ((kl) this).field_v = -1;
                if (((kl) this).field_x == 0) {
                  break L4;
                } else {
                  if (((kl) this).field_x <= ((kl) this).field_q - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((kl) this).field_x = ((kl) this).field_q - var2;
              break L3;
            }
          } else {
            L5: {
              ((kl) this).field_v = 1;
              if (((kl) this).field_x == 0) {
                break L5;
              } else {
                if (((kl) this).field_x <= var2 - ((kl) this).field_q) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((kl) this).field_x = var2 - ((kl) this).field_q;
            break L3;
          }
        }
        if (((kl) this).field_o < var3) {
          ((kl) this).field_z = 1;
          if (((kl) this).field_x != 0) {
            if (((kl) this).field_x > var3 - ((kl) this).field_o) {
              ((kl) this).field_x = var3 - ((kl) this).field_o;
              return false;
            } else {
              return false;
            }
          } else {
            ((kl) this).field_x = var3 - ((kl) this).field_o;
            return false;
          }
        } else {
          L6: {
            if (((kl) this).field_o <= var3) {
              ((kl) this).field_z = 0;
              break L6;
            } else {
              L7: {
                ((kl) this).field_z = -1;
                if (((kl) this).field_x == 0) {
                  break L7;
                } else {
                  if (((kl) this).field_x <= ((kl) this).field_o - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((kl) this).field_x = ((kl) this).field_o - var3;
              break L6;
            }
          }
          return false;
        }
    }

    final synchronized int g() {
        return ((kl) this).field_w == -2147483648 ? 0 : ((kl) this).field_w;
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kl param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param8.field_r = param2 << 8;
        return param3;
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, kl param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
        }
        param8.field_r = param2 << 8;
        return param3;
    }

    final static kl b(oe param0, int param1, int param2) {
        if (param0.field_m != null) {
          if (param0.field_m.length == 0) {
            return null;
          } else {
            return new kl(param0, (int)((long)param0.field_l * 256L * (long)param1 / (long)(100 * tj.field_q)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    private final synchronized void c(int param0, int param1) {
        ((kl) this).field_w = param0;
        ((kl) this).field_n = param1;
        ((kl) this).field_x = 0;
        this.m();
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kl param11, int param12, int param13) {
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_r = param4;
                return param5 >> 1;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, kl param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_A = param13.field_A - param13.field_u * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 - param4 + param14 - 257) / param14;
              if (param5 + (param12 - param4 + param14 - 257) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14 - 1) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14 - 1) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_A = param13.field_A + param13.field_u * param5;
                param13.field_q = param6;
                param13.field_o = param7;
                param13.field_r = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    final synchronized boolean l() {
        return ((kl) this).field_r < 0 || ((kl) this).field_r >= ((oe) (Object) ((kl) this).field_k).field_m.length << 8;
    }

    final synchronized void g(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((kl) this).field_q == 0) {
            if (((kl) this).field_o == 0) {
              ((kl) this).field_x = 0;
              ((kl) this).field_w = 0;
              ((kl) this).field_A = 0;
              ((kl) this).b((byte) 111);
              return;
            } else {
              L0: {
                var2 = -((kl) this).field_A;
                if (((kl) this).field_A <= var2) {
                  break L0;
                } else {
                  var2 = ((kl) this).field_A;
                  break L0;
                }
              }
              L1: {
                if (-((kl) this).field_q <= var2) {
                  break L1;
                } else {
                  var2 = -((kl) this).field_q;
                  break L1;
                }
              }
              L2: {
                if (((kl) this).field_q <= var2) {
                  break L2;
                } else {
                  var2 = ((kl) this).field_q;
                  break L2;
                }
              }
              L3: {
                if (-((kl) this).field_o <= var2) {
                  break L3;
                } else {
                  var2 = -((kl) this).field_o;
                  break L3;
                }
              }
              L4: {
                if (((kl) this).field_o <= var2) {
                  break L4;
                } else {
                  var2 = ((kl) this).field_o;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var2) {
                  break L5;
                } else {
                  param0 = var2;
                  break L5;
                }
              }
              ((kl) this).field_x = param0;
              ((kl) this).field_w = -2147483648;
              ((kl) this).field_u = -((kl) this).field_A / param0;
              ((kl) this).field_v = -((kl) this).field_q / param0;
              ((kl) this).field_z = -((kl) this).field_o / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((kl) this).field_A;
              if (((kl) this).field_A <= var2) {
                break L6;
              } else {
                var2 = ((kl) this).field_A;
                break L6;
              }
            }
            L7: {
              if (-((kl) this).field_q <= var2) {
                break L7;
              } else {
                var2 = -((kl) this).field_q;
                break L7;
              }
            }
            L8: {
              if (((kl) this).field_q <= var2) {
                break L8;
              } else {
                var2 = ((kl) this).field_q;
                break L8;
              }
            }
            L9: {
              if (-((kl) this).field_o <= var2) {
                break L9;
              } else {
                var2 = -((kl) this).field_o;
                break L9;
              }
            }
            L10: {
              if (((kl) this).field_o <= var2) {
                break L10;
              } else {
                var2 = ((kl) this).field_o;
                break L10;
              }
            }
            L11: {
              if (param0 <= var2) {
                break L11;
              } else {
                param0 = var2;
                break L11;
              }
            }
            ((kl) this).field_x = param0;
            ((kl) this).field_w = -2147483648;
            ((kl) this).field_u = -((kl) this).field_A / param0;
            ((kl) this).field_v = -((kl) this).field_q / param0;
            ((kl) this).field_z = -((kl) this).field_o / param0;
            return;
          }
        } else {
          ((kl) this).e(0);
          ((kl) this).b((byte) 111);
          return;
        }
    }

    final synchronized void d(int param0) {
        this.c(param0 << 6, ((kl) this).f());
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, kl param12) {
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param11 - param3;
          if (param4 + param11 - param3 <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_A = param12.field_A + param12.field_u * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_q = param5 >> 2;
                param12.field_o = param6 >> 2;
                param12.field_r = param3 << 8;
                return param4 >> 1;
              } else {
                param3++;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param5 = param5 + param7;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    final int c() {
        int var1 = ((kl) this).field_A * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((kl) this).field_s == 0) {
            var1 = var1 - var1 * ((kl) this).field_r / (((oe) (Object) ((kl) this).field_k).field_m.length << 8);
        } else {
            if (((kl) this).field_s >= 0) {
                var1 = var1 - var1 * ((kl) this).field_m / ((oe) (Object) ((kl) this).field_k).field_m.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void a(int param0, int param1) {
        ((kl) this).a(param0, param1, ((kl) this).f());
    }

    final synchronized void c(int param0) {
        if (((kl) this).field_p < 0) {
            ((kl) this).field_p = -param0;
        } else {
            ((kl) this).field_p = param0;
        }
    }

    final static kl a(oe param0, int param1, int param2) {
        if (param0.field_m != null) {
          if (param0.field_m.length == 0) {
            return null;
          } else {
            return new kl(param0, param1, param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = kl.b(param1, param2);
          var5 = kl.d(param1, param2);
          if (((kl) this).field_q == var4) {
            if (((kl) this).field_o == var5) {
              ((kl) this).field_x = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((kl) this).field_A;
                if (((kl) this).field_A - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((kl) this).field_A - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((kl) this).field_q <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((kl) this).field_q;
                  break L1;
                }
              }
              L2: {
                if (((kl) this).field_q - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((kl) this).field_q - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((kl) this).field_o <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((kl) this).field_o;
                  break L3;
                }
              }
              L4: {
                if (((kl) this).field_o - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((kl) this).field_o - var5;
                  break L4;
                }
              }
              L5: {
                if (param0 <= var6) {
                  break L5;
                } else {
                  param0 = var6;
                  break L5;
                }
              }
              ((kl) this).field_x = param0;
              ((kl) this).field_w = param1;
              ((kl) this).field_n = param2;
              ((kl) this).field_u = (param1 - ((kl) this).field_A) / param0;
              ((kl) this).field_v = (var4 - ((kl) this).field_q) / param0;
              ((kl) this).field_z = (var5 - ((kl) this).field_o) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((kl) this).field_A;
              if (((kl) this).field_A - param1 <= var6) {
                break L6;
              } else {
                var6 = ((kl) this).field_A - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((kl) this).field_q <= var6) {
                break L7;
              } else {
                var6 = var4 - ((kl) this).field_q;
                break L7;
              }
            }
            L8: {
              if (((kl) this).field_q - var4 <= var6) {
                break L8;
              } else {
                var6 = ((kl) this).field_q - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((kl) this).field_o <= var6) {
                break L9;
              } else {
                var6 = var5 - ((kl) this).field_o;
                break L9;
              }
            }
            L10: {
              if (((kl) this).field_o - var5 <= var6) {
                break L10;
              } else {
                var6 = ((kl) this).field_o - var5;
                break L10;
              }
            }
            L11: {
              if (param0 <= var6) {
                break L11;
              } else {
                param0 = var6;
                break L11;
              }
            }
            ((kl) this).field_x = param0;
            ((kl) this).field_w = param1;
            ((kl) this).field_n = param2;
            ((kl) this).field_u = (param1 - ((kl) this).field_A) / param0;
            ((kl) this).field_v = (var4 - ((kl) this).field_q) / param0;
            ((kl) this).field_z = (var5 - ((kl) this).field_o) / param0;
            return;
          }
        } else {
          this.c(param1, param2);
          return;
        }
    }

    private final void i() {
        if (((kl) this).field_x != 0) {
            if (((kl) this).field_w == -2147483648) {
                ((kl) this).field_w = 0;
            }
            ((kl) this).field_x = 0;
            this.m();
            return;
        }
    }

    final synchronized void f(int param0) {
        ((kl) this).field_s = param0;
    }

    final synchronized int f() {
        return ((kl) this).field_n < 0 ? -1 : ((kl) this).field_n;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, kl param10) {
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param3 - (param9 - 1);
          if (param4 + param3 - (param9 - 1) <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_r = param3 << 8;
                return param4 >> 1;
              } else {
                param3--;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                continue L2;
              }
            }
          } else {
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            continue L1;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kl param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_q = param11.field_q - param11.field_v * param5;
            param11.field_o = param11.field_o - param11.field_z * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12 - 1) / param12;
                  if (param5 + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_q = param11.field_q + param11.field_v * param5;
                param11.field_o = param11.field_o + param11.field_z * param5;
                param11.field_A = param6;
                param11.field_r = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kl param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_q = param11.field_q - param11.field_v * param5;
            param11.field_o = param11.field_o - param11.field_z * param5;
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 + 256 - param4 + param12) / param12;
              if (param5 + (param10 + 256 - param4 + param12) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = param5 + (param10 - param4 + param12) / param12;
                  if (param5 + (param10 - param4 + param12) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param0 = param13;
            param1 = param12;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_q = param11.field_q + param11.field_v * param5;
                param11.field_o = param11.field_o + param11.field_z * param5;
                param11.field_A = param6;
                param11.field_r = param4;
                return param5;
              } else {
                param5++;
                param3[param5] = param3[param5] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    final qd a() {
        return null;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((kl) this).field_x <= 0) {
            L1: {
              if (((kl) this).field_p != 256) {
                break L1;
              } else {
                if ((((kl) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (tj.field_g) {
                    return kl.b(0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, 0, param3, param2, (kl) this);
                  } else {
                    return kl.a(((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, 0, param3, param2, (kl) this);
                  }
                }
              }
            }
            if (tj.field_g) {
              return kl.c(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, 0, param3, param2, (kl) this, ((kl) this).field_p, param4);
            } else {
              return kl.b(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, 0, param3, param2, (kl) this, ((kl) this).field_p, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((kl) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((kl) this).field_x = ((kl) this).field_x + param1;
                if (((kl) this).field_p != 256) {
                  break L4;
                } else {
                  if ((((kl) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!tj.field_g) {
                      param1 = kl.b(((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, ((kl) this).field_u, 0, var6, param2, (kl) this);
                      break L3;
                    } else {
                      param1 = kl.b(0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, ((kl) this).field_v, ((kl) this).field_z, 0, var6, param2, (kl) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tj.field_g) {
                param1 = kl.a(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, ((kl) this).field_u, 0, var6, param2, (kl) this, ((kl) this).field_p, param4);
                break L3;
              } else {
                param1 = kl.a(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, ((kl) this).field_v, ((kl) this).field_z, 0, var6, param2, (kl) this, ((kl) this).field_p, param4);
                break L3;
              }
            }
            ((kl) this).field_x = ((kl) this).field_x - param1;
            if (((kl) this).field_x == 0) {
              if (!this.j()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    final static kl a(oe param0, int param1, int param2, int param3) {
        if (param0.field_m != null) {
          if (param0.field_m.length == 0) {
            return null;
          } else {
            return new kl(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final qd d() {
        return null;
    }

    final synchronized void b(boolean param0) {
        ((kl) this).field_p = (((kl) this).field_p ^ ((kl) this).field_p >> 31) + (((kl) this).field_p >>> 31);
        if (param0) {
          ((kl) this).field_p = -((kl) this).field_p;
          return;
        } else {
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, kl param9) {
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param8 - param2;
          if (param3 + param8 - param2 <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_q = param9.field_q + param9.field_v * (param6 - param3);
        param9.field_o = param9.field_o + param9.field_z * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_A = param4 >> 2;
                param9.field_r = param2 << 8;
                return param3;
              } else {
                param3++;
                param2++;
                param1[param3] = param1[param3] + param0[param2] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2++;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, kl param10) {
        L0: {
          param3 = param3 >> 8;
          param9 = param9 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param4 + param9 - param3;
          if (param4 + param9 - param3 <= param8) {
            break L0;
          } else {
            param7 = param8;
            break L0;
          }
        }
        param4 = param4 << 1;
        param7 = param7 << 1;
        param7 -= 6;
        L1: while (true) {
          if (param4 >= param7) {
            param7 += 6;
            L2: while (true) {
              if (param4 >= param7) {
                param10.field_r = param3 << 8;
                return param4 >> 1;
              } else {
                param3++;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                continue L2;
              }
            }
          } else {
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param3++;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            continue L1;
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        oe var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((kl) this).field_w != 0) {
            break L0;
          } else {
            if (((kl) this).field_x != 0) {
              break L0;
            } else {
              ((kl) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (oe) (Object) ((kl) this).field_k;
          var5 = ((kl) this).field_m << 8;
          var6 = ((kl) this).field_y << 8;
          var7 = var4.field_m.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((kl) this).field_s = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((kl) this).field_r >= 0) {
            break L2;
          } else {
            if (((kl) this).field_p <= 0) {
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              ((kl) this).field_r = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((kl) this).field_r < var7) {
            break L3;
          } else {
            if (((kl) this).field_p >= 0) {
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              ((kl) this).field_r = var7 - 1;
              break L3;
            }
          }
        }
        if (((kl) this).field_s >= 0) {
          L4: {
            if (((kl) this).field_s <= 0) {
              break L4;
            } else {
              if (!((kl) this).field_t) {
                if (((kl) this).field_p >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_m[((kl) this).field_m]);
                    if (((kl) this).field_r >= var6) {
                      var10 = (((kl) this).field_r - var5) / var8;
                      if (var10 < ((kl) this).field_s) {
                        ((kl) this).field_r = ((kl) this).field_r - var8 * var10;
                        ((kl) this).field_s = ((kl) this).field_s - var10;
                        continue L5;
                      } else {
                        ((kl) this).field_r = ((kl) this).field_r - var8 * ((kl) this).field_s;
                        ((kl) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_y - 1]);
                    if (((kl) this).field_r < var5) {
                      var10 = (var6 - 1 - ((kl) this).field_r) / var8;
                      if (var10 < ((kl) this).field_s) {
                        ((kl) this).field_r = ((kl) this).field_r + var8 * var10;
                        ((kl) this).field_s = ((kl) this).field_s - var10;
                        continue L6;
                      } else {
                        ((kl) this).field_r = ((kl) this).field_r + var8 * ((kl) this).field_s;
                        ((kl) this).field_s = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((kl) this).field_p >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_m]);
                    if (((kl) this).field_r < var5) {
                      ((kl) this).field_r = var5 + var5 - 1 - ((kl) this).field_r;
                      ((kl) this).field_p = -((kl) this).field_p;
                      ((kl) this).field_s = ((kl) this).field_s - 1;
                      if (((kl) this).field_s - 1 != 0) {
                        break L7;
                      } else {
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
                L8: while (true) {
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_m[((kl) this).field_y - 1]);
                  if (((kl) this).field_r >= var6) {
                    ((kl) this).field_r = var6 + var6 - 1 - ((kl) this).field_r;
                    ((kl) this).field_p = -((kl) this).field_p;
                    ((kl) this).field_s = ((kl) this).field_s - 1;
                    if (((kl) this).field_s - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_m]);
                      if (((kl) this).field_r < var5) {
                        ((kl) this).field_r = var5 + var5 - 1 - ((kl) this).field_r;
                        ((kl) this).field_p = -((kl) this).field_p;
                        ((kl) this).field_s = ((kl) this).field_s - 1;
                        if (((kl) this).field_s - 1 != 0) {
                          continue L8;
                        } else {
                          break L4;
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
          if (((kl) this).field_p < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((kl) this).field_r < 0) {
              ((kl) this).field_r = -1;
              this.i();
              ((kl) this).b((byte) 111);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((kl) this).field_r < var7) {
                break L9;
              } else {
                ((kl) this).field_r = var7;
                this.i();
                ((kl) this).b((byte) 111);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((kl) this).field_t) {
            if (((kl) this).field_p >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_m[((kl) this).field_m]);
                if (((kl) this).field_r >= var6) {
                  ((kl) this).field_r = var5 + (((kl) this).field_r - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_y - 1]);
                if (((kl) this).field_r < var5) {
                  ((kl) this).field_r = var6 - 1 - (var6 - 1 - ((kl) this).field_r) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((kl) this).field_p >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_m]);
                if (((kl) this).field_r < var5) {
                  ((kl) this).field_r = var5 + var5 - 1 - ((kl) this).field_r;
                  ((kl) this).field_p = -((kl) this).field_p;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_m[((kl) this).field_y - 1]);
              if (((kl) this).field_r >= var6) {
                ((kl) this).field_r = var6 + var6 - 1 - ((kl) this).field_r;
                ((kl) this).field_p = -((kl) this).field_p;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_m[((kl) this).field_m]);
                if (((kl) this).field_r < var5) {
                  ((kl) this).field_r = var5 + var5 - 1 - ((kl) this).field_r;
                  ((kl) this).field_p = -((kl) this).field_p;
                  continue L13;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, kl param11, int param12, int param13) {
        L0: {
          L1: {
            if (param12 == 0) {
              break L1;
            } else {
              param8 = param5 + (param10 - param4 + param12 - 257) / param12;
              if (param5 + (param10 - param4 + param12 - 257) / param12 <= param9) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param8 = param9;
          break L0;
        }
        param5 = param5 << 1;
        param8 = param8 << 1;
        L2: while (true) {
          if (param5 >= param8) {
            L3: {
              L4: {
                if (param12 == 0) {
                  break L4;
                } else {
                  param8 = (param5 >> 1) + (param10 - param4 + param12 - 1) / param12;
                  if ((param5 >> 1) + (param10 - param4 + param12 - 1) / param12 <= param9) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param8 = param9;
              break L3;
            }
            param8 = param8 << 1;
            param1 = param13;
            L5: while (true) {
              if (param5 >= param8) {
                param11.field_r = param4;
                return param5 >> 1;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, kl param9) {
        L0: {
          param2 = param2 >> 8;
          param8 = param8 >> 8;
          param4 = param4 << 2;
          param5 = param5 << 2;
          param6 = param3 + param2 - (param8 - 1);
          if (param3 + param2 - (param8 - 1) <= param7) {
            break L0;
          } else {
            param6 = param7;
            break L0;
          }
        }
        param9.field_q = param9.field_q + param9.field_v * (param6 - param3);
        param9.field_o = param9.field_o + param9.field_z * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_A = param4 >> 2;
                param9.field_r = param2 << 8;
                return param3;
              } else {
                param3++;
                param2--;
                param1[param3] = param1[param3] + param0[param2] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            param3++;
            param2--;
            param1[param3] = param1[param3] + param0[param2] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final synchronized int e() {
        return ((kl) this).field_p < 0 ? -((kl) this).field_p : ((kl) this).field_p;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((kl) this).field_x <= 0) {
            L1: {
              if (((kl) this).field_p != -256) {
                break L1;
              } else {
                if ((((kl) this).field_r & 255) != 0) {
                  break L1;
                } else {
                  if (tj.field_g) {
                    return kl.a(0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, 0, param3, param2, (kl) this);
                  } else {
                    return kl.b(((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, 0, param3, param2, (kl) this);
                  }
                }
              }
            }
            if (tj.field_g) {
              return kl.d(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, 0, param3, param2, (kl) this, ((kl) this).field_p, param4);
            } else {
              return kl.a(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, 0, param3, param2, (kl) this, ((kl) this).field_p, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((kl) this).field_x;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((kl) this).field_x = ((kl) this).field_x + param1;
                if (((kl) this).field_p != -256) {
                  break L4;
                } else {
                  if ((((kl) this).field_r & 255) != 0) {
                    break L4;
                  } else {
                    if (!tj.field_g) {
                      param1 = kl.a(((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, ((kl) this).field_u, 0, var6, param2, (kl) this);
                      break L3;
                    } else {
                      param1 = kl.a(0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, ((kl) this).field_v, ((kl) this).field_z, 0, var6, param2, (kl) this);
                      break L3;
                    }
                  }
                }
              }
              if (!tj.field_g) {
                param1 = kl.b(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_A, ((kl) this).field_u, 0, var6, param2, (kl) this, ((kl) this).field_p, param4);
                break L3;
              } else {
                param1 = kl.b(0, 0, ((oe) (Object) ((kl) this).field_k).field_m, param0, ((kl) this).field_r, param1, ((kl) this).field_q, ((kl) this).field_o, ((kl) this).field_v, ((kl) this).field_z, 0, var6, param2, (kl) this, ((kl) this).field_p, param4);
                break L3;
              }
            }
            ((kl) this).field_x = ((kl) this).field_x - param1;
            if (((kl) this).field_x == 0) {
              if (!this.j()) {
                continue L0;
              } else {
                return param3;
              }
            } else {
              return param1;
            }
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, kl param10, int param11, int param12) {
        if (param11 != 0) {
            param7 = param5 + (param9 + 256 - param4 + param11) / param11;
            // if_icmple L38
        }
        param7 = param8;
        while (param5 < param7) {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11) / param11;
            // if_icmple L131
        }
        param7 = param8;
        param0 = param12;
        param1 = param11;
        while (param5 < param7) {
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param1;
        }
        param10.field_r = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, kl param12) {
        L0: {
          param3 = param3 >> 8;
          param11 = param11 >> 8;
          param5 = param5 << 2;
          param6 = param6 << 2;
          param7 = param7 << 2;
          param8 = param8 << 2;
          param9 = param4 + param3 - (param11 - 1);
          if (param4 + param3 - (param11 - 1) <= param10) {
            break L0;
          } else {
            param9 = param10;
            break L0;
          }
        }
        param12.field_A = param12.field_A + param12.field_u * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_q = param5 >> 2;
                param12.field_o = param6 >> 2;
                param12.field_r = param3 << 8;
                return param4 >> 1;
              } else {
                param3--;
                param0 = param1[param3];
                param4++;
                param2[param4] = param2[param4] + param0 * param5;
                param5 = param5 + param7;
                param4++;
                param2[param4] = param2[param4] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            param3--;
            param0 = param1[param3];
            param4++;
            param2[param4] = param2[param4] + param0 * param5;
            param5 = param5 + param7;
            param4++;
            param2[param4] = param2[param4] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    final synchronized void e(int param0) {
        this.c(param0, ((kl) this).f());
    }

    final synchronized boolean k() {
        return ((kl) this).field_x != 0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, kl param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_A = param13.field_A - param13.field_u * param5;
            if (param14 == 0) {
              break L1;
            } else {
              param10 = param5 + (param12 + 256 - param4 + param14) / param14;
              if (param5 + (param12 + 256 - param4 + param14) / param14 <= param11) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param10 = param11;
          break L0;
        }
        param5 = param5 << 1;
        param10 = param10 << 1;
        L2: while (true) {
          if (param5 >= param10) {
            L3: {
              L4: {
                if (param14 == 0) {
                  break L4;
                } else {
                  param10 = (param5 >> 1) + (param12 - param4 + param14) / param14;
                  if ((param5 >> 1) + (param12 - param4 + param14) / param14 <= param11) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param10 = param11;
              break L3;
            }
            param10 = param10 << 1;
            param1 = param15;
            L5: while (true) {
              if (param5 >= param10) {
                param5 = param5 >> 1;
                param13.field_A = param13.field_A + param13.field_u * param5;
                param13.field_q = param6;
                param13.field_o = param7;
                param13.field_r = param4;
                return param5;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                param5++;
                param3[param5] = param3[param5] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                param5++;
                param3[param5] = param3[param5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            param5++;
            param3[param5] = param3[param5] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            param5++;
            param3[param5] = param3[param5] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final void m() {
        ((kl) this).field_A = ((kl) this).field_w;
        ((kl) this).field_q = kl.b(((kl) this).field_w, ((kl) this).field_n);
        ((kl) this).field_o = kl.d(((kl) this).field_w, ((kl) this).field_n);
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, kl param10, int param11, int param12) {
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 257) / param11;
            // if_icmple L38
        }
        param7 = param8;
        while (param5 < param7) {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        if (param11 != 0) {
            param7 = param5 + (param9 - param4 + param11 - 1) / param11;
            // if_icmple L133
        }
        param7 = param8;
        param1 = param12;
        while (param5 < param7) {
            param0 = param2[param4 >> 8];
            param5++;
            param3[param5] = param3[param5] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
        }
        param10.field_r = param4;
        return param5;
    }

    private kl(oe param0, int param1, int param2) {
        ((kl) this).field_k = (el) (Object) param0;
        ((kl) this).field_m = param0.field_n;
        ((kl) this).field_y = param0.field_k;
        ((kl) this).field_t = param0.field_j;
        ((kl) this).field_p = param1;
        ((kl) this).field_w = param2;
        ((kl) this).field_n = 8192;
        ((kl) this).field_r = 0;
        this.m();
    }

    private kl(oe param0, int param1, int param2, int param3) {
        ((kl) this).field_k = (el) (Object) param0;
        ((kl) this).field_m = param0.field_n;
        ((kl) this).field_y = param0.field_k;
        ((kl) this).field_t = param0.field_j;
        ((kl) this).field_p = param1;
        ((kl) this).field_w = param2;
        ((kl) this).field_n = param3;
        ((kl) this).field_r = 0;
        this.m();
    }
}
