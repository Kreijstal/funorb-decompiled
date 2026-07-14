/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc extends um {
    private int field_A;
    private int field_B;
    private int field_E;
    private int field_F;
    private int field_w;
    private int field_D;
    private boolean field_x;
    private int field_z;
    private int field_u;
    private int field_v;
    private int field_r;
    private int field_s;
    private int field_t;
    private int field_C;
    private int field_y;

    private final void l() {
        if (((rc) this).field_z != 0) {
            if (((rc) this).field_w == -2147483648) {
                ((rc) this).field_w = 0;
            }
            ((rc) this).field_z = 0;
            this.g();
            return;
        }
    }

    final um b() {
        return null;
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, rc param11, int param12, int param13) {
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
                param11.field_t = param4;
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

    final synchronized void f(int param0) {
        this.a(param0, ((rc) this).e());
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, rc param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, rc param10, int param11, int param12) {
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
        param10.field_t = param4;
        return param5;
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, rc param12) {
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
        param12.field_D = param12.field_D + param12.field_y * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_C = param6 >> 2;
                param12.field_t = param3 << 8;
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

    final int d() {
        if (((rc) this).field_w == 0) {
            if (((rc) this).field_z == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((rc) this).field_z <= 0) {
            L1: {
              if (((rc) this).field_r != 256) {
                break L1;
              } else {
                if ((((rc) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (fj.field_u) {
                    return rc.b(0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, 0, param3, param2, (rc) this);
                  } else {
                    return rc.b(((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, 0, param3, param2, (rc) this);
                  }
                }
              }
            }
            if (fj.field_u) {
              return rc.d(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, 0, param3, param2, (rc) this, ((rc) this).field_r, param4);
            } else {
              return rc.a(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, 0, param3, param2, (rc) this, ((rc) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((rc) this).field_z;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((rc) this).field_z = ((rc) this).field_z + param1;
                if (((rc) this).field_r != 256) {
                  break L4;
                } else {
                  if ((((rc) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!fj.field_u) {
                      param1 = rc.b(((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, ((rc) this).field_y, 0, var6, param2, (rc) this);
                      break L3;
                    } else {
                      param1 = rc.b(0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, ((rc) this).field_B, ((rc) this).field_F, 0, var6, param2, (rc) this);
                      break L3;
                    }
                  }
                }
              }
              if (!fj.field_u) {
                param1 = rc.b(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, ((rc) this).field_y, 0, var6, param2, (rc) this, ((rc) this).field_r, param4);
                break L3;
              } else {
                param1 = rc.b(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, ((rc) this).field_B, ((rc) this).field_F, 0, var6, param2, (rc) this, ((rc) this).field_r, param4);
                break L3;
              }
            }
            ((rc) this).field_z = ((rc) this).field_z - param1;
            if (((rc) this).field_z == 0) {
              if (!this.f()) {
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, rc param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_D = param13.field_D - param13.field_y * param5;
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
                param13.field_D = param13.field_D + param13.field_y * param5;
                param13.field_s = param6;
                param13.field_C = param7;
                param13.field_t = param4;
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

    final static rc a(ji param0, int param1, int param2, int param3) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new rc(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final synchronized void a(int param0, int param1) {
        ((rc) this).field_w = param0;
        ((rc) this).field_E = param1;
        ((rc) this).field_z = 0;
        this.g();
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, rc param8) {
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
        param8.field_t = param2 << 8;
        return param3;
    }

    final synchronized void e(int param0) {
        int var2 = ((ji) (Object) ((rc) this).field_q).field_r.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((rc) this).field_t = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = rc.b(param1, param2);
          var5 = rc.d(param1, param2);
          if (((rc) this).field_s == var4) {
            if (((rc) this).field_C == var5) {
              ((rc) this).field_z = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((rc) this).field_D;
                if (((rc) this).field_D - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((rc) this).field_D - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((rc) this).field_s <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((rc) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((rc) this).field_s - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((rc) this).field_s - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((rc) this).field_C <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((rc) this).field_C;
                  break L3;
                }
              }
              L4: {
                if (((rc) this).field_C - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((rc) this).field_C - var5;
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
              ((rc) this).field_z = param0;
              ((rc) this).field_w = param1;
              ((rc) this).field_E = param2;
              ((rc) this).field_y = (param1 - ((rc) this).field_D) / param0;
              ((rc) this).field_B = (var4 - ((rc) this).field_s) / param0;
              ((rc) this).field_F = (var5 - ((rc) this).field_C) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((rc) this).field_D;
              if (((rc) this).field_D - param1 <= var6) {
                break L6;
              } else {
                var6 = ((rc) this).field_D - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((rc) this).field_s <= var6) {
                break L7;
              } else {
                var6 = var4 - ((rc) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((rc) this).field_s - var4 <= var6) {
                break L8;
              } else {
                var6 = ((rc) this).field_s - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((rc) this).field_C <= var6) {
                break L9;
              } else {
                var6 = var5 - ((rc) this).field_C;
                break L9;
              }
            }
            L10: {
              if (((rc) this).field_C - var5 <= var6) {
                break L10;
              } else {
                var6 = ((rc) this).field_C - var5;
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
            ((rc) this).field_z = param0;
            ((rc) this).field_w = param1;
            ((rc) this).field_E = param2;
            ((rc) this).field_y = (param1 - ((rc) this).field_D) / param0;
            ((rc) this).field_B = (var4 - ((rc) this).field_s) / param0;
            ((rc) this).field_F = (var5 - ((rc) this).field_C) / param0;
            return;
          }
        } else {
          this.a(param1, param2);
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, rc param9) {
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
        param9.field_s = param9.field_s + param9.field_B * (param6 - param3);
        param9.field_C = param9.field_C + param9.field_F * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_D = param4 >> 2;
                param9.field_t = param2 << 8;
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

    final synchronized int i() {
        return ((rc) this).field_w == -2147483648 ? 0 : ((rc) this).field_w;
    }

    final int a() {
        int var1 = ((rc) this).field_D * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((rc) this).field_u == 0) {
            var1 = var1 - var1 * ((rc) this).field_t / (((ji) (Object) ((rc) this).field_q).field_r.length << 8);
        } else {
            if (((rc) this).field_u >= 0) {
                var1 = var1 - var1 * ((rc) this).field_A / ((ji) (Object) ((rc) this).field_q).field_r.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void h(int param0) {
        if (((rc) this).field_r < 0) {
            ((rc) this).field_r = -param0;
        } else {
            ((rc) this).field_r = param0;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, rc param9) {
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
        param9.field_s = param9.field_s + param9.field_B * (param6 - param3);
        param9.field_C = param9.field_C + param9.field_F * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_D = param4 >> 2;
                param9.field_t = param2 << 8;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, rc param12) {
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
        param12.field_D = param12.field_D + param12.field_y * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_C = param6 >> 2;
                param12.field_t = param3 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, rc param11, int param12, int param13) {
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
                param11.field_t = param4;
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

    final synchronized void c(int param0, int param1) {
        ((rc) this).a(param0, param1, ((rc) this).e());
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, rc param10) {
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
                param10.field_t = param3 << 8;
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

    final synchronized void a(int[] param0, int param1, int param2) {
        ji var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((rc) this).field_w != 0) {
            break L0;
          } else {
            if (((rc) this).field_z != 0) {
              break L0;
            } else {
              ((rc) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (ji) (Object) ((rc) this).field_q;
          var5 = ((rc) this).field_A << 8;
          var6 = ((rc) this).field_v << 8;
          var7 = var4.field_r.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((rc) this).field_u = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((rc) this).field_t >= 0) {
            break L2;
          } else {
            if (((rc) this).field_r <= 0) {
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              ((rc) this).field_t = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((rc) this).field_t < var7) {
            break L3;
          } else {
            if (((rc) this).field_r >= 0) {
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              ((rc) this).field_t = var7 - 1;
              break L3;
            }
          }
        }
        if (((rc) this).field_u >= 0) {
          L4: {
            if (((rc) this).field_u <= 0) {
              break L4;
            } else {
              if (!((rc) this).field_x) {
                if (((rc) this).field_r >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_r[((rc) this).field_A]);
                    if (((rc) this).field_t >= var6) {
                      var10 = (((rc) this).field_t - var5) / var8;
                      if (var10 < ((rc) this).field_u) {
                        ((rc) this).field_t = ((rc) this).field_t - var8 * var10;
                        ((rc) this).field_u = ((rc) this).field_u - var10;
                        continue L5;
                      } else {
                        ((rc) this).field_t = ((rc) this).field_t - var8 * ((rc) this).field_u;
                        ((rc) this).field_u = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_v - 1]);
                    if (((rc) this).field_t < var5) {
                      var10 = (var6 - 1 - ((rc) this).field_t) / var8;
                      if (var10 < ((rc) this).field_u) {
                        ((rc) this).field_t = ((rc) this).field_t + var8 * var10;
                        ((rc) this).field_u = ((rc) this).field_u - var10;
                        continue L6;
                      } else {
                        ((rc) this).field_t = ((rc) this).field_t + var8 * ((rc) this).field_u;
                        ((rc) this).field_u = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((rc) this).field_r >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_A]);
                    if (((rc) this).field_t < var5) {
                      ((rc) this).field_t = var5 + var5 - 1 - ((rc) this).field_t;
                      ((rc) this).field_r = -((rc) this).field_r;
                      ((rc) this).field_u = ((rc) this).field_u - 1;
                      if (((rc) this).field_u - 1 != 0) {
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_r[((rc) this).field_v - 1]);
                  if (((rc) this).field_t >= var6) {
                    ((rc) this).field_t = var6 + var6 - 1 - ((rc) this).field_t;
                    ((rc) this).field_r = -((rc) this).field_r;
                    ((rc) this).field_u = ((rc) this).field_u - 1;
                    if (((rc) this).field_u - 1 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_A]);
                      if (((rc) this).field_t < var5) {
                        ((rc) this).field_t = var5 + var5 - 1 - ((rc) this).field_t;
                        ((rc) this).field_r = -((rc) this).field_r;
                        ((rc) this).field_u = ((rc) this).field_u - 1;
                        if (((rc) this).field_u - 1 != 0) {
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
          if (((rc) this).field_r < 0) {
            int discarded$2 = this.b(param0, var9, 0, param2, 0);
            if (((rc) this).field_t < 0) {
              ((rc) this).field_t = -1;
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.a(param0, var9, var7, param2, 0);
              if (((rc) this).field_t < var7) {
                break L9;
              } else {
                ((rc) this).field_t = var7;
                this.l();
                ((rc) this).b(34);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((rc) this).field_x) {
            if (((rc) this).field_r >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_r[((rc) this).field_A]);
                if (((rc) this).field_t >= var6) {
                  ((rc) this).field_t = var5 + (((rc) this).field_t - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_v - 1]);
                if (((rc) this).field_t < var5) {
                  ((rc) this).field_t = var6 - 1 - (var6 - 1 - ((rc) this).field_t) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((rc) this).field_r >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_A]);
                if (((rc) this).field_t < var5) {
                  ((rc) this).field_t = var5 + var5 - 1 - ((rc) this).field_t;
                  ((rc) this).field_r = -((rc) this).field_r;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_r[((rc) this).field_v - 1]);
              if (((rc) this).field_t >= var6) {
                ((rc) this).field_t = var6 + var6 - 1 - ((rc) this).field_t;
                ((rc) this).field_r = -((rc) this).field_r;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_r[((rc) this).field_A]);
                if (((rc) this).field_t < var5) {
                  ((rc) this).field_t = var5 + var5 - 1 - ((rc) this).field_t;
                  ((rc) this).field_r = -((rc) this).field_r;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, rc param10) {
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
                param10.field_t = param3 << 8;
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

    final synchronized void i(int param0) {
        ((rc) this).field_u = param0;
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    final um c() {
        return null;
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized int e() {
        return ((rc) this).field_E < 0 ? -1 : ((rc) this).field_E;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, rc param10, int param11, int param12) {
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
        param10.field_t = param4;
        return param5;
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((rc) this).field_z <= 0) {
            L1: {
              if (((rc) this).field_r != -256) {
                break L1;
              } else {
                if ((((rc) this).field_t & 255) != 0) {
                  break L1;
                } else {
                  if (fj.field_u) {
                    return rc.a(0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, 0, param3, param2, (rc) this);
                  } else {
                    return rc.a(((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, 0, param3, param2, (rc) this);
                  }
                }
              }
            }
            if (fj.field_u) {
              return rc.a(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, 0, param3, param2, (rc) this, ((rc) this).field_r, param4);
            } else {
              return rc.b(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, 0, param3, param2, (rc) this, ((rc) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((rc) this).field_z;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((rc) this).field_z = ((rc) this).field_z + param1;
                if (((rc) this).field_r != -256) {
                  break L4;
                } else {
                  if ((((rc) this).field_t & 255) != 0) {
                    break L4;
                  } else {
                    if (!fj.field_u) {
                      param1 = rc.a(((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, ((rc) this).field_y, 0, var6, param2, (rc) this);
                      break L3;
                    } else {
                      param1 = rc.a(0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, ((rc) this).field_B, ((rc) this).field_F, 0, var6, param2, (rc) this);
                      break L3;
                    }
                  }
                }
              }
              if (!fj.field_u) {
                param1 = rc.c(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_D, ((rc) this).field_y, 0, var6, param2, (rc) this, ((rc) this).field_r, param4);
                break L3;
              } else {
                param1 = rc.a(0, 0, ((ji) (Object) ((rc) this).field_q).field_r, param0, ((rc) this).field_t, param1, ((rc) this).field_s, ((rc) this).field_C, ((rc) this).field_B, ((rc) this).field_F, 0, var6, param2, (rc) this, ((rc) this).field_r, param4);
                break L3;
              }
            }
            ((rc) this).field_z = ((rc) this).field_z - param1;
            if (((rc) this).field_z == 0) {
              if (!this.f()) {
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

    final static rc a(ji param0, int param1, int param2) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new rc(param0, (int)((long)param0.field_s * 256L * (long)param1 / (long)(100 * fj.field_r)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized boolean k() {
        return ((rc) this).field_t < 0 || ((rc) this).field_t >= ((ji) (Object) ((rc) this).field_q).field_r.length << 8;
    }

    final synchronized void a(int param0) {
        ji var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((rc) this).field_z <= 0) {
            break L0;
          } else {
            if (param0 < ((rc) this).field_z) {
              ((rc) this).field_D = ((rc) this).field_D + ((rc) this).field_y * param0;
              ((rc) this).field_s = ((rc) this).field_s + ((rc) this).field_B * param0;
              ((rc) this).field_C = ((rc) this).field_C + ((rc) this).field_F * param0;
              ((rc) this).field_z = ((rc) this).field_z - param0;
              break L0;
            } else {
              L1: {
                if (((rc) this).field_w != -2147483648) {
                  break L1;
                } else {
                  ((rc) this).field_w = 0;
                  ((rc) this).field_C = 0;
                  ((rc) this).field_s = 0;
                  ((rc) this).field_D = 0;
                  ((rc) this).b(34);
                  param0 = ((rc) this).field_z;
                  break L1;
                }
              }
              ((rc) this).field_z = 0;
              this.g();
              break L0;
            }
          }
        }
        L2: {
          var2 = (ji) (Object) ((rc) this).field_q;
          var3 = ((rc) this).field_A << 8;
          var4 = ((rc) this).field_v << 8;
          var5 = var2.field_r.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((rc) this).field_u = 0;
            break L2;
          }
        }
        L3: {
          if (((rc) this).field_t >= 0) {
            break L3;
          } else {
            if (((rc) this).field_r <= 0) {
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              ((rc) this).field_t = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((rc) this).field_t < var5) {
            break L4;
          } else {
            if (((rc) this).field_r >= 0) {
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              ((rc) this).field_t = var5 - 1;
              break L4;
            }
          }
        }
        ((rc) this).field_t = ((rc) this).field_t + ((rc) this).field_r * param0;
        if (((rc) this).field_u >= 0) {
          L5: {
            if (((rc) this).field_u <= 0) {
              break L5;
            } else {
              if (!((rc) this).field_x) {
                L6: {
                  if (((rc) this).field_r >= 0) {
                    if (((rc) this).field_t >= var4) {
                      var7 = (((rc) this).field_t - var3) / var6;
                      if (var7 < ((rc) this).field_u) {
                        ((rc) this).field_t = ((rc) this).field_t - var6 * var7;
                        ((rc) this).field_u = ((rc) this).field_u - var7;
                        break L6;
                      } else {
                        ((rc) this).field_t = ((rc) this).field_t - var6 * ((rc) this).field_u;
                        ((rc) this).field_u = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((rc) this).field_t < var3) {
                      var7 = (var4 - 1 - ((rc) this).field_t) / var6;
                      if (var7 < ((rc) this).field_u) {
                        ((rc) this).field_t = ((rc) this).field_t + var6 * var7;
                        ((rc) this).field_u = ((rc) this).field_u - var7;
                        break L6;
                      } else {
                        ((rc) this).field_t = ((rc) this).field_t + var6 * ((rc) this).field_u;
                        ((rc) this).field_u = 0;
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
                  if (((rc) this).field_r >= 0) {
                    break L7;
                  } else {
                    if (((rc) this).field_t < var3) {
                      ((rc) this).field_t = var3 + var3 - 1 - ((rc) this).field_t;
                      ((rc) this).field_r = -((rc) this).field_r;
                      ((rc) this).field_u = ((rc) this).field_u - 1;
                      if (((rc) this).field_u - 1 != 0) {
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
                  if (((rc) this).field_t >= var4) {
                    ((rc) this).field_t = var4 + var4 - 1 - ((rc) this).field_t;
                    ((rc) this).field_r = -((rc) this).field_r;
                    ((rc) this).field_u = ((rc) this).field_u - 1;
                    if (((rc) this).field_u - 1 != 0) {
                      if (((rc) this).field_t < var3) {
                        ((rc) this).field_t = var3 + var3 - 1 - ((rc) this).field_t;
                        ((rc) this).field_r = -((rc) this).field_r;
                        ((rc) this).field_u = ((rc) this).field_u - 1;
                        if (((rc) this).field_u - 1 != 0) {
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
          if (((rc) this).field_r < 0) {
            if (((rc) this).field_t < 0) {
              ((rc) this).field_t = -1;
              this.l();
              ((rc) this).b(34);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((rc) this).field_t < var5) {
                break L9;
              } else {
                ((rc) this).field_t = var5;
                this.l();
                ((rc) this).b(34);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((rc) this).field_x) {
            if (((rc) this).field_r >= 0) {
              if (((rc) this).field_t < var4) {
                return;
              } else {
                ((rc) this).field_t = var3 + (((rc) this).field_t - var3) % var6;
                return;
              }
            } else {
              if (((rc) this).field_t < var3) {
                ((rc) this).field_t = var4 - 1 - (var4 - 1 - ((rc) this).field_t) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((rc) this).field_r >= 0) {
                break L10;
              } else {
                if (((rc) this).field_t < var3) {
                  ((rc) this).field_t = var3 + var3 - 1 - ((rc) this).field_t;
                  ((rc) this).field_r = -((rc) this).field_r;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((rc) this).field_t >= var4) {
                ((rc) this).field_t = var4 + var4 - 1 - ((rc) this).field_t;
                ((rc) this).field_r = -((rc) this).field_r;
                if (((rc) this).field_t < var3) {
                  ((rc) this).field_t = var3 + var3 - 1 - ((rc) this).field_t;
                  ((rc) this).field_r = -((rc) this).field_r;
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

    final synchronized int h() {
        return ((rc) this).field_r < 0 ? -((rc) this).field_r : ((rc) this).field_r;
    }

    private final void g() {
        ((rc) this).field_D = ((rc) this).field_w;
        ((rc) this).field_s = rc.b(((rc) this).field_w, ((rc) this).field_E);
        ((rc) this).field_C = rc.d(((rc) this).field_w, ((rc) this).field_E);
    }

    final static rc b(ji param0, int param1, int param2, int param3) {
        if (param0.field_r != null) {
          if (param0.field_r.length == 0) {
            return null;
          } else {
            return new rc(param0, (int)((long)param0.field_s * 256L * (long)param1 / (long)(100 * fj.field_r)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, rc param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_B * param5;
            param11.field_C = param11.field_C - param11.field_F * param5;
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
                param11.field_s = param11.field_s + param11.field_B * param5;
                param11.field_C = param11.field_C + param11.field_F * param5;
                param11.field_D = param6;
                param11.field_t = param4;
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

    final synchronized boolean j() {
        return ((rc) this).field_z != 0;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, rc param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_D = param13.field_D - param13.field_y * param5;
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
                param13.field_D = param13.field_D + param13.field_y * param5;
                param13.field_s = param6;
                param13.field_C = param7;
                param13.field_t = param4;
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

    final synchronized void g(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((rc) this).field_s == 0) {
            if (((rc) this).field_C == 0) {
              ((rc) this).field_z = 0;
              ((rc) this).field_w = 0;
              ((rc) this).field_D = 0;
              ((rc) this).b(34);
              return;
            } else {
              L0: {
                var2 = -((rc) this).field_D;
                if (((rc) this).field_D <= var2) {
                  break L0;
                } else {
                  var2 = ((rc) this).field_D;
                  break L0;
                }
              }
              L1: {
                if (-((rc) this).field_s <= var2) {
                  break L1;
                } else {
                  var2 = -((rc) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((rc) this).field_s <= var2) {
                  break L2;
                } else {
                  var2 = ((rc) this).field_s;
                  break L2;
                }
              }
              L3: {
                if (-((rc) this).field_C <= var2) {
                  break L3;
                } else {
                  var2 = -((rc) this).field_C;
                  break L3;
                }
              }
              L4: {
                if (((rc) this).field_C <= var2) {
                  break L4;
                } else {
                  var2 = ((rc) this).field_C;
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
              ((rc) this).field_z = param0;
              ((rc) this).field_w = -2147483648;
              ((rc) this).field_y = -((rc) this).field_D / param0;
              ((rc) this).field_B = -((rc) this).field_s / param0;
              ((rc) this).field_F = -((rc) this).field_C / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((rc) this).field_D;
              if (((rc) this).field_D <= var2) {
                break L6;
              } else {
                var2 = ((rc) this).field_D;
                break L6;
              }
            }
            L7: {
              if (-((rc) this).field_s <= var2) {
                break L7;
              } else {
                var2 = -((rc) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((rc) this).field_s <= var2) {
                break L8;
              } else {
                var2 = ((rc) this).field_s;
                break L8;
              }
            }
            L9: {
              if (-((rc) this).field_C <= var2) {
                break L9;
              } else {
                var2 = -((rc) this).field_C;
                break L9;
              }
            }
            L10: {
              if (((rc) this).field_C <= var2) {
                break L10;
              } else {
                var2 = ((rc) this).field_C;
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
            ((rc) this).field_z = param0;
            ((rc) this).field_w = -2147483648;
            ((rc) this).field_y = -((rc) this).field_D / param0;
            ((rc) this).field_B = -((rc) this).field_s / param0;
            ((rc) this).field_F = -((rc) this).field_C / param0;
            return;
          }
        } else {
          ((rc) this).f(0);
          ((rc) this).b(34);
          return;
        }
    }

    private final boolean f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((rc) this).field_w;
          if (var1 != -2147483648) {
            var2 = rc.b(var1, ((rc) this).field_E);
            var3 = rc.d(var1, ((rc) this).field_E);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((rc) this).field_D != var1) {
            break L1;
          } else {
            if (((rc) this).field_s != var2) {
              break L1;
            } else {
              if (((rc) this).field_C == var3) {
                if (((rc) this).field_w == -2147483648) {
                  ((rc) this).field_w = 0;
                  ((rc) this).field_C = 0;
                  ((rc) this).field_s = 0;
                  ((rc) this).field_D = 0;
                  ((rc) this).b(34);
                  return true;
                } else {
                  this.g();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((rc) this).field_D >= var1) {
            if (((rc) this).field_D <= var1) {
              ((rc) this).field_y = 0;
              break L2;
            } else {
              ((rc) this).field_y = -1;
              ((rc) this).field_z = ((rc) this).field_D - var1;
              break L2;
            }
          } else {
            ((rc) this).field_y = 1;
            ((rc) this).field_z = var1 - ((rc) this).field_D;
            break L2;
          }
        }
        L3: {
          if (((rc) this).field_s >= var2) {
            if (((rc) this).field_s <= var2) {
              ((rc) this).field_B = 0;
              break L3;
            } else {
              L4: {
                ((rc) this).field_B = -1;
                if (((rc) this).field_z == 0) {
                  break L4;
                } else {
                  if (((rc) this).field_z <= ((rc) this).field_s - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((rc) this).field_z = ((rc) this).field_s - var2;
              break L3;
            }
          } else {
            L5: {
              ((rc) this).field_B = 1;
              if (((rc) this).field_z == 0) {
                break L5;
              } else {
                if (((rc) this).field_z <= var2 - ((rc) this).field_s) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((rc) this).field_z = var2 - ((rc) this).field_s;
            break L3;
          }
        }
        if (((rc) this).field_C < var3) {
          ((rc) this).field_F = 1;
          if (((rc) this).field_z != 0) {
            if (((rc) this).field_z > var3 - ((rc) this).field_C) {
              ((rc) this).field_z = var3 - ((rc) this).field_C;
              return false;
            } else {
              return false;
            }
          } else {
            ((rc) this).field_z = var3 - ((rc) this).field_C;
            return false;
          }
        } else {
          L6: {
            if (((rc) this).field_C <= var3) {
              ((rc) this).field_F = 0;
              break L6;
            } else {
              L7: {
                ((rc) this).field_F = -1;
                if (((rc) this).field_z == 0) {
                  break L7;
                } else {
                  if (((rc) this).field_z <= ((rc) this).field_C - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((rc) this).field_z = ((rc) this).field_C - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, rc param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_B * param5;
            param11.field_C = param11.field_C - param11.field_F * param5;
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
                param11.field_s = param11.field_s + param11.field_B * param5;
                param11.field_C = param11.field_C + param11.field_F * param5;
                param11.field_D = param6;
                param11.field_t = param4;
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

    private rc(ji param0, int param1, int param2) {
        ((rc) this).field_q = (gg) (Object) param0;
        ((rc) this).field_A = param0.field_q;
        ((rc) this).field_v = param0.field_o;
        ((rc) this).field_x = param0.field_p;
        ((rc) this).field_r = param1;
        ((rc) this).field_w = param2;
        ((rc) this).field_E = 8192;
        ((rc) this).field_t = 0;
        this.g();
    }

    final synchronized void a(boolean param0) {
        ((rc) this).field_r = (((rc) this).field_r ^ ((rc) this).field_r >> 31) + (((rc) this).field_r >>> 31);
        if (param0) {
          ((rc) this).field_r = -((rc) this).field_r;
          return;
        } else {
          return;
        }
    }

    private rc(ji param0, int param1, int param2, int param3) {
        ((rc) this).field_q = (gg) (Object) param0;
        ((rc) this).field_A = param0.field_q;
        ((rc) this).field_v = param0.field_o;
        ((rc) this).field_x = param0.field_p;
        ((rc) this).field_r = param1;
        ((rc) this).field_w = param2;
        ((rc) this).field_E = param3;
        ((rc) this).field_t = 0;
        this.g();
    }
}
