/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends hn {
    private int field_B;
    private int field_s;
    private int field_w;
    private int field_u;
    private int field_z;
    private int field_A;
    private int field_x;
    private int field_o;
    private int field_t;
    private int field_v;
    private int field_y;
    private int field_p;
    private int field_r;
    private boolean field_q;
    private int field_C;

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, aa param9) {
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
        param9.field_C = param9.field_C + param9.field_A * (param6 - param3);
        param9.field_t = param9.field_t + param9.field_p * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_z = param2 << 8;
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

    final synchronized void e(int param0) {
        if (((aa) this).field_o < 0) {
            ((aa) this).field_o = -param0;
        } else {
            ((aa) this).field_o = param0;
        }
    }

    final static aa a(sn param0, int param1, int param2, int param3) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new aa(param0, (int)((long)param0.field_p * 256L * (long)param1 / (long)(100 * rc.field_d)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, aa param10) {
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
                param10.field_z = param3 << 8;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, aa param10, int param11, int param12) {
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
        param10.field_z = param4;
        return param5;
    }

    final hn b() {
        return null;
    }

    final int c() {
        if (((aa) this).field_y == 0) {
            if (((aa) this).field_s == 0) {
                return 0;
            }
        }
        return 1;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, aa param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_C = param11.field_C - param11.field_A * param5;
            param11.field_t = param11.field_t - param11.field_p * param5;
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
                param11.field_C = param11.field_C + param11.field_A * param5;
                param11.field_t = param11.field_t + param11.field_p * param5;
                param11.field_u = param6;
                param11.field_z = param4;
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

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, aa param11, int param12, int param13) {
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
                param11.field_z = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_w * param5;
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
                param13.field_u = param13.field_u + param13.field_w * param5;
                param13.field_C = param6;
                param13.field_t = param7;
                param13.field_z = param4;
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

    private final synchronized void e(int param0, int param1) {
        ((aa) this).field_y = param0;
        ((aa) this).field_v = param1;
        ((aa) this).field_s = 0;
        this.j();
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, aa param8) {
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
        param8.field_z = param2 << 8;
        return param3;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        sn var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((aa) this).field_y != 0) {
            break L0;
          } else {
            if (((aa) this).field_s != 0) {
              break L0;
            } else {
              ((aa) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (sn) (Object) ((aa) this).field_m;
          var5 = ((aa) this).field_r << 8;
          var6 = ((aa) this).field_B << 8;
          var7 = var4.field_o.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((aa) this).field_x = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((aa) this).field_z >= 0) {
            break L2;
          } else {
            if (((aa) this).field_o <= 0) {
              this.g();
              ((aa) this).d(-119);
              return;
            } else {
              ((aa) this).field_z = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((aa) this).field_z < var7) {
            break L3;
          } else {
            if (((aa) this).field_o >= 0) {
              this.g();
              ((aa) this).d(33);
              return;
            } else {
              ((aa) this).field_z = var7 - 1;
              break L3;
            }
          }
        }
        if (((aa) this).field_x >= 0) {
          L4: {
            if (((aa) this).field_x <= 0) {
              break L4;
            } else {
              if (!((aa) this).field_q) {
                if (((aa) this).field_o >= 0) {
                  L5: while (true) {
                    var9 = this.b(param0, var9, var6, param2, (int) var4.field_o[((aa) this).field_r]);
                    if (((aa) this).field_z >= var6) {
                      var10 = (((aa) this).field_z - var5) / var8;
                      if (var10 < ((aa) this).field_x) {
                        ((aa) this).field_z = ((aa) this).field_z - var8 * var10;
                        ((aa) this).field_x = ((aa) this).field_x - var10;
                        continue L5;
                      } else {
                        ((aa) this).field_z = ((aa) this).field_z - var8 * ((aa) this).field_x;
                        ((aa) this).field_x = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_B - 1]);
                    if (((aa) this).field_z < var5) {
                      var10 = (var6 - 1 - ((aa) this).field_z) / var8;
                      if (var10 < ((aa) this).field_x) {
                        ((aa) this).field_z = ((aa) this).field_z + var8 * var10;
                        ((aa) this).field_x = ((aa) this).field_x - var10;
                        continue L6;
                      } else {
                        ((aa) this).field_z = ((aa) this).field_z + var8 * ((aa) this).field_x;
                        ((aa) this).field_x = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((aa) this).field_o >= 0) {
                    break L7;
                  } else {
                    var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_r]);
                    if (((aa) this).field_z < var5) {
                      ((aa) this).field_z = var5 + var5 - 1 - ((aa) this).field_z;
                      ((aa) this).field_o = -((aa) this).field_o;
                      ((aa) this).field_x = ((aa) this).field_x - 1;
                      if (((aa) this).field_x - 1 != 0) {
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
                  var9 = this.b(param0, var9, var6, param2, (int) var4.field_o[((aa) this).field_B - 1]);
                  if (((aa) this).field_z >= var6) {
                    ((aa) this).field_z = var6 + var6 - 1 - ((aa) this).field_z;
                    ((aa) this).field_o = -((aa) this).field_o;
                    ((aa) this).field_x = ((aa) this).field_x - 1;
                    if (((aa) this).field_x - 1 != 0) {
                      var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_r]);
                      if (((aa) this).field_z < var5) {
                        ((aa) this).field_z = var5 + var5 - 1 - ((aa) this).field_z;
                        ((aa) this).field_o = -((aa) this).field_o;
                        ((aa) this).field_x = ((aa) this).field_x - 1;
                        if (((aa) this).field_x - 1 != 0) {
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
          if (((aa) this).field_o < 0) {
            int discarded$2 = this.a(param0, var9, 0, param2, 0);
            if (((aa) this).field_z < 0) {
              ((aa) this).field_z = -1;
              this.g();
              ((aa) this).d(105);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$3 = this.b(param0, var9, var7, param2, 0);
              if (((aa) this).field_z < var7) {
                break L9;
              } else {
                ((aa) this).field_z = var7;
                this.g();
                ((aa) this).d(-127);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((aa) this).field_q) {
            if (((aa) this).field_o >= 0) {
              L10: while (true) {
                var9 = this.b(param0, var9, var6, param2, (int) var4.field_o[((aa) this).field_r]);
                if (((aa) this).field_z >= var6) {
                  ((aa) this).field_z = var5 + (((aa) this).field_z - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_B - 1]);
                if (((aa) this).field_z < var5) {
                  ((aa) this).field_z = var6 - 1 - (var6 - 1 - ((aa) this).field_z) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((aa) this).field_o >= 0) {
                break L12;
              } else {
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_r]);
                if (((aa) this).field_z < var5) {
                  ((aa) this).field_z = var5 + var5 - 1 - ((aa) this).field_z;
                  ((aa) this).field_o = -((aa) this).field_o;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.b(param0, var9, var6, param2, (int) var4.field_o[((aa) this).field_B - 1]);
              if (((aa) this).field_z >= var6) {
                ((aa) this).field_z = var6 + var6 - 1 - ((aa) this).field_z;
                ((aa) this).field_o = -((aa) this).field_o;
                var9 = this.a(param0, var9, var5, param2, (int) var4.field_o[((aa) this).field_r]);
                if (((aa) this).field_z < var5) {
                  ((aa) this).field_z = var5 + var5 - 1 - ((aa) this).field_z;
                  ((aa) this).field_o = -((aa) this).field_o;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12) {
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
        param12.field_u = param12.field_u + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_C = param5 >> 2;
                param12.field_t = param6 >> 2;
                param12.field_z = param3 << 8;
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

    private final boolean f() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((aa) this).field_y;
          if (var1 != -2147483648) {
            var2 = aa.b(var1, ((aa) this).field_v);
            var3 = aa.c(var1, ((aa) this).field_v);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((aa) this).field_u != var1) {
            break L1;
          } else {
            if (((aa) this).field_C != var2) {
              break L1;
            } else {
              if (((aa) this).field_t == var3) {
                if (((aa) this).field_y == -2147483648) {
                  ((aa) this).field_y = 0;
                  ((aa) this).field_t = 0;
                  ((aa) this).field_C = 0;
                  ((aa) this).field_u = 0;
                  ((aa) this).d(73);
                  return true;
                } else {
                  this.j();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((aa) this).field_u >= var1) {
            if (((aa) this).field_u <= var1) {
              ((aa) this).field_w = 0;
              break L2;
            } else {
              ((aa) this).field_w = -1;
              ((aa) this).field_s = ((aa) this).field_u - var1;
              break L2;
            }
          } else {
            ((aa) this).field_w = 1;
            ((aa) this).field_s = var1 - ((aa) this).field_u;
            break L2;
          }
        }
        L3: {
          if (((aa) this).field_C >= var2) {
            if (((aa) this).field_C <= var2) {
              ((aa) this).field_A = 0;
              break L3;
            } else {
              L4: {
                ((aa) this).field_A = -1;
                if (((aa) this).field_s == 0) {
                  break L4;
                } else {
                  if (((aa) this).field_s <= ((aa) this).field_C - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((aa) this).field_s = ((aa) this).field_C - var2;
              break L3;
            }
          } else {
            L5: {
              ((aa) this).field_A = 1;
              if (((aa) this).field_s == 0) {
                break L5;
              } else {
                if (((aa) this).field_s <= var2 - ((aa) this).field_C) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((aa) this).field_s = var2 - ((aa) this).field_C;
            break L3;
          }
        }
        if (((aa) this).field_t < var3) {
          ((aa) this).field_p = 1;
          if (((aa) this).field_s != 0) {
            if (((aa) this).field_s > var3 - ((aa) this).field_t) {
              ((aa) this).field_s = var3 - ((aa) this).field_t;
              return false;
            } else {
              return false;
            }
          } else {
            ((aa) this).field_s = var3 - ((aa) this).field_t;
            return false;
          }
        } else {
          L6: {
            if (((aa) this).field_t <= var3) {
              ((aa) this).field_p = 0;
              break L6;
            } else {
              L7: {
                ((aa) this).field_p = -1;
                if (((aa) this).field_s == 0) {
                  break L7;
                } else {
                  if (((aa) this).field_s <= ((aa) this).field_t - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((aa) this).field_s = ((aa) this).field_t - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, aa param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_u = param13.field_u - param13.field_w * param5;
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
                param13.field_u = param13.field_u + param13.field_w * param5;
                param13.field_C = param6;
                param13.field_t = param7;
                param13.field_z = param4;
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

    final synchronized int l() {
        return ((aa) this).field_y == -2147483648 ? 0 : ((aa) this).field_y;
    }

    final synchronized int k() {
        return ((aa) this).field_v < 0 ? -1 : ((aa) this).field_v;
    }

    final int d() {
        int var1 = ((aa) this).field_u * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((aa) this).field_x == 0) {
            var1 = var1 - var1 * ((aa) this).field_z / (((sn) (Object) ((aa) this).field_m).field_o.length << 8);
        } else {
            if (((aa) this).field_x >= 0) {
                var1 = var1 - var1 * ((aa) this).field_r / ((sn) (Object) ((aa) this).field_m).field_o.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized boolean e() {
        return ((aa) this).field_s != 0;
    }

    final static aa a(sn param0, int param1, int param2) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new aa(param0, (int)((long)param0.field_p * 256L * (long)param1 / (long)(100 * rc.field_d)), param2 << 6);
          }
        } else {
          return null;
        }
    }

    final synchronized void a(boolean param0) {
        ((aa) this).field_o = (((aa) this).field_o ^ ((aa) this).field_o >> 31) + (((aa) this).field_o >>> 31);
        if (param0) {
          ((aa) this).field_o = -((aa) this).field_o;
          return;
        } else {
          return;
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, aa param11, int param12, int param13) {
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
                param11.field_z = param4;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, aa param10, int param11, int param12) {
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
        param10.field_z = param4;
        return param5;
    }

    private final void g() {
        if (((aa) this).field_s != 0) {
            if (((aa) this).field_y == -2147483648) {
                ((aa) this).field_y = 0;
            }
            ((aa) this).field_s = 0;
            this.j();
            return;
        }
    }

    final hn a() {
        return null;
    }

    final synchronized void h(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((aa) this).field_C == 0) {
            if (((aa) this).field_t == 0) {
              ((aa) this).field_s = 0;
              ((aa) this).field_y = 0;
              ((aa) this).field_u = 0;
              ((aa) this).d(86);
              return;
            } else {
              L0: {
                var2 = -((aa) this).field_u;
                if (((aa) this).field_u <= var2) {
                  break L0;
                } else {
                  var2 = ((aa) this).field_u;
                  break L0;
                }
              }
              L1: {
                if (-((aa) this).field_C <= var2) {
                  break L1;
                } else {
                  var2 = -((aa) this).field_C;
                  break L1;
                }
              }
              L2: {
                if (((aa) this).field_C <= var2) {
                  break L2;
                } else {
                  var2 = ((aa) this).field_C;
                  break L2;
                }
              }
              L3: {
                if (-((aa) this).field_t <= var2) {
                  break L3;
                } else {
                  var2 = -((aa) this).field_t;
                  break L3;
                }
              }
              L4: {
                if (((aa) this).field_t <= var2) {
                  break L4;
                } else {
                  var2 = ((aa) this).field_t;
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
              ((aa) this).field_s = param0;
              ((aa) this).field_y = -2147483648;
              ((aa) this).field_w = -((aa) this).field_u / param0;
              ((aa) this).field_A = -((aa) this).field_C / param0;
              ((aa) this).field_p = -((aa) this).field_t / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((aa) this).field_u;
              if (((aa) this).field_u <= var2) {
                break L6;
              } else {
                var2 = ((aa) this).field_u;
                break L6;
              }
            }
            L7: {
              if (-((aa) this).field_C <= var2) {
                break L7;
              } else {
                var2 = -((aa) this).field_C;
                break L7;
              }
            }
            L8: {
              if (((aa) this).field_C <= var2) {
                break L8;
              } else {
                var2 = ((aa) this).field_C;
                break L8;
              }
            }
            L9: {
              if (-((aa) this).field_t <= var2) {
                break L9;
              } else {
                var2 = -((aa) this).field_t;
                break L9;
              }
            }
            L10: {
              if (((aa) this).field_t <= var2) {
                break L10;
              } else {
                var2 = ((aa) this).field_t;
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
            ((aa) this).field_s = param0;
            ((aa) this).field_y = -2147483648;
            ((aa) this).field_w = -((aa) this).field_u / param0;
            ((aa) this).field_A = -((aa) this).field_C / param0;
            ((aa) this).field_p = -((aa) this).field_t / param0;
            return;
          }
        } else {
          ((aa) this).i(0);
          ((aa) this).d(61);
          return;
        }
    }

    final static aa b(sn param0, int param1, int param2, int param3) {
        if (param0.field_o != null) {
          if (param0.field_o.length == 0) {
            return null;
          } else {
            return new aa(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    final synchronized void f(int param0) {
        ((aa) this).field_x = param0;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = aa.b(param1, param2);
          var5 = aa.c(param1, param2);
          if (((aa) this).field_C == var4) {
            if (((aa) this).field_t == var5) {
              ((aa) this).field_s = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((aa) this).field_u;
                if (((aa) this).field_u - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((aa) this).field_u - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((aa) this).field_C <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((aa) this).field_C;
                  break L1;
                }
              }
              L2: {
                if (((aa) this).field_C - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((aa) this).field_C - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((aa) this).field_t <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((aa) this).field_t;
                  break L3;
                }
              }
              L4: {
                if (((aa) this).field_t - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((aa) this).field_t - var5;
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
              ((aa) this).field_s = param0;
              ((aa) this).field_y = param1;
              ((aa) this).field_v = param2;
              ((aa) this).field_w = (param1 - ((aa) this).field_u) / param0;
              ((aa) this).field_A = (var4 - ((aa) this).field_C) / param0;
              ((aa) this).field_p = (var5 - ((aa) this).field_t) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((aa) this).field_u;
              if (((aa) this).field_u - param1 <= var6) {
                break L6;
              } else {
                var6 = ((aa) this).field_u - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((aa) this).field_C <= var6) {
                break L7;
              } else {
                var6 = var4 - ((aa) this).field_C;
                break L7;
              }
            }
            L8: {
              if (((aa) this).field_C - var4 <= var6) {
                break L8;
              } else {
                var6 = ((aa) this).field_C - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((aa) this).field_t <= var6) {
                break L9;
              } else {
                var6 = var5 - ((aa) this).field_t;
                break L9;
              }
            }
            L10: {
              if (((aa) this).field_t - var5 <= var6) {
                break L10;
              } else {
                var6 = ((aa) this).field_t - var5;
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
            ((aa) this).field_s = param0;
            ((aa) this).field_y = param1;
            ((aa) this).field_v = param2;
            ((aa) this).field_w = (param1 - ((aa) this).field_u) / param0;
            ((aa) this).field_A = (var4 - ((aa) this).field_C) / param0;
            ((aa) this).field_p = (var5 - ((aa) this).field_t) / param0;
            return;
          }
        } else {
          this.e(param1, param2);
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, aa param8) {
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
        param8.field_z = param2 << 8;
        return param3;
    }

    private final static int c(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final synchronized boolean i() {
        return ((aa) this).field_z < 0 || ((aa) this).field_z >= ((sn) (Object) ((aa) this).field_m).field_o.length << 8;
    }

    final synchronized void a(int param0) {
        sn var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((aa) this).field_s <= 0) {
            break L0;
          } else {
            if (param0 < ((aa) this).field_s) {
              ((aa) this).field_u = ((aa) this).field_u + ((aa) this).field_w * param0;
              ((aa) this).field_C = ((aa) this).field_C + ((aa) this).field_A * param0;
              ((aa) this).field_t = ((aa) this).field_t + ((aa) this).field_p * param0;
              ((aa) this).field_s = ((aa) this).field_s - param0;
              break L0;
            } else {
              L1: {
                if (((aa) this).field_y != -2147483648) {
                  break L1;
                } else {
                  ((aa) this).field_y = 0;
                  ((aa) this).field_t = 0;
                  ((aa) this).field_C = 0;
                  ((aa) this).field_u = 0;
                  ((aa) this).d(41);
                  param0 = ((aa) this).field_s;
                  break L1;
                }
              }
              ((aa) this).field_s = 0;
              this.j();
              break L0;
            }
          }
        }
        L2: {
          var2 = (sn) (Object) ((aa) this).field_m;
          var3 = ((aa) this).field_r << 8;
          var4 = ((aa) this).field_B << 8;
          var5 = var2.field_o.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((aa) this).field_x = 0;
            break L2;
          }
        }
        L3: {
          if (((aa) this).field_z >= 0) {
            break L3;
          } else {
            if (((aa) this).field_o <= 0) {
              this.g();
              ((aa) this).d(127);
              return;
            } else {
              ((aa) this).field_z = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((aa) this).field_z < var5) {
            break L4;
          } else {
            if (((aa) this).field_o >= 0) {
              this.g();
              ((aa) this).d(73);
              return;
            } else {
              ((aa) this).field_z = var5 - 1;
              break L4;
            }
          }
        }
        ((aa) this).field_z = ((aa) this).field_z + ((aa) this).field_o * param0;
        if (((aa) this).field_x >= 0) {
          L5: {
            if (((aa) this).field_x <= 0) {
              break L5;
            } else {
              if (!((aa) this).field_q) {
                L6: {
                  if (((aa) this).field_o >= 0) {
                    if (((aa) this).field_z >= var4) {
                      var7 = (((aa) this).field_z - var3) / var6;
                      if (var7 < ((aa) this).field_x) {
                        ((aa) this).field_z = ((aa) this).field_z - var6 * var7;
                        ((aa) this).field_x = ((aa) this).field_x - var7;
                        break L6;
                      } else {
                        ((aa) this).field_z = ((aa) this).field_z - var6 * ((aa) this).field_x;
                        ((aa) this).field_x = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((aa) this).field_z < var3) {
                      var7 = (var4 - 1 - ((aa) this).field_z) / var6;
                      if (var7 < ((aa) this).field_x) {
                        ((aa) this).field_z = ((aa) this).field_z + var6 * var7;
                        ((aa) this).field_x = ((aa) this).field_x - var7;
                        break L6;
                      } else {
                        ((aa) this).field_z = ((aa) this).field_z + var6 * ((aa) this).field_x;
                        ((aa) this).field_x = 0;
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
                  if (((aa) this).field_o >= 0) {
                    break L7;
                  } else {
                    if (((aa) this).field_z < var3) {
                      ((aa) this).field_z = var3 + var3 - 1 - ((aa) this).field_z;
                      ((aa) this).field_o = -((aa) this).field_o;
                      ((aa) this).field_x = ((aa) this).field_x - 1;
                      if (((aa) this).field_x - 1 != 0) {
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
                  if (((aa) this).field_z >= var4) {
                    ((aa) this).field_z = var4 + var4 - 1 - ((aa) this).field_z;
                    ((aa) this).field_o = -((aa) this).field_o;
                    ((aa) this).field_x = ((aa) this).field_x - 1;
                    if (((aa) this).field_x - 1 != 0) {
                      if (((aa) this).field_z < var3) {
                        ((aa) this).field_z = var3 + var3 - 1 - ((aa) this).field_z;
                        ((aa) this).field_o = -((aa) this).field_o;
                        ((aa) this).field_x = ((aa) this).field_x - 1;
                        if (((aa) this).field_x - 1 != 0) {
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
          if (((aa) this).field_o < 0) {
            if (((aa) this).field_z < 0) {
              ((aa) this).field_z = -1;
              this.g();
              ((aa) this).d(81);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((aa) this).field_z < var5) {
                break L9;
              } else {
                ((aa) this).field_z = var5;
                this.g();
                ((aa) this).d(-117);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((aa) this).field_q) {
            if (((aa) this).field_o >= 0) {
              if (((aa) this).field_z < var4) {
                return;
              } else {
                ((aa) this).field_z = var3 + (((aa) this).field_z - var3) % var6;
                return;
              }
            } else {
              if (((aa) this).field_z < var3) {
                ((aa) this).field_z = var4 - 1 - (var4 - 1 - ((aa) this).field_z) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((aa) this).field_o >= 0) {
                break L10;
              } else {
                if (((aa) this).field_z < var3) {
                  ((aa) this).field_z = var3 + var3 - 1 - ((aa) this).field_z;
                  ((aa) this).field_o = -((aa) this).field_o;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((aa) this).field_z >= var4) {
                ((aa) this).field_z = var4 + var4 - 1 - ((aa) this).field_z;
                ((aa) this).field_o = -((aa) this).field_o;
                if (((aa) this).field_z < var3) {
                  ((aa) this).field_z = var3 + var3 - 1 - ((aa) this).field_z;
                  ((aa) this).field_o = -((aa) this).field_o;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, aa param9) {
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
        param9.field_C = param9.field_C + param9.field_A * (param6 - param3);
        param9.field_t = param9.field_t + param9.field_p * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_u = param4 >> 2;
                param9.field_z = param2 << 8;
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

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, aa param10) {
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
                param10.field_z = param3 << 8;
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

    final synchronized void g(int param0) {
        int var2 = ((sn) (Object) ((aa) this).field_m).field_o.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((aa) this).field_z = param0;
    }

    private final void j() {
        ((aa) this).field_u = ((aa) this).field_y;
        ((aa) this).field_C = aa.b(((aa) this).field_y, ((aa) this).field_v);
        ((aa) this).field_t = aa.c(((aa) this).field_y, ((aa) this).field_v);
    }

    private final static int b(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((aa) this).field_s <= 0) {
            L1: {
              if (((aa) this).field_o != -256) {
                break L1;
              } else {
                if ((((aa) this).field_z & 255) != 0) {
                  break L1;
                } else {
                  if (rc.field_q) {
                    return aa.b(0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, 0, param3, param2, (aa) this);
                  } else {
                    return aa.a(((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, 0, param3, param2, (aa) this);
                  }
                }
              }
            }
            if (rc.field_q) {
              return aa.c(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, 0, param3, param2, (aa) this, ((aa) this).field_o, param4);
            } else {
              return aa.a(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, 0, param3, param2, (aa) this, ((aa) this).field_o, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((aa) this).field_s;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((aa) this).field_s = ((aa) this).field_s + param1;
                if (((aa) this).field_o != -256) {
                  break L4;
                } else {
                  if ((((aa) this).field_z & 255) != 0) {
                    break L4;
                  } else {
                    if (!rc.field_q) {
                      param1 = aa.b(((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, ((aa) this).field_w, 0, var6, param2, (aa) this);
                      break L3;
                    } else {
                      param1 = aa.b(0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, ((aa) this).field_A, ((aa) this).field_p, 0, var6, param2, (aa) this);
                      break L3;
                    }
                  }
                }
              }
              if (!rc.field_q) {
                param1 = aa.a(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, ((aa) this).field_w, 0, var6, param2, (aa) this, ((aa) this).field_o, param4);
                break L3;
              } else {
                param1 = aa.b(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, ((aa) this).field_A, ((aa) this).field_p, 0, var6, param2, (aa) this, ((aa) this).field_o, param4);
                break L3;
              }
            }
            ((aa) this).field_s = ((aa) this).field_s - param1;
            if (((aa) this).field_s == 0) {
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

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((aa) this).field_s <= 0) {
            L1: {
              if (((aa) this).field_o != 256) {
                break L1;
              } else {
                if ((((aa) this).field_z & 255) != 0) {
                  break L1;
                } else {
                  if (rc.field_q) {
                    return aa.a(0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, 0, param3, param2, (aa) this);
                  } else {
                    return aa.b(((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, 0, param3, param2, (aa) this);
                  }
                }
              }
            }
            if (rc.field_q) {
              return aa.d(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, 0, param3, param2, (aa) this, ((aa) this).field_o, param4);
            } else {
              return aa.b(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, 0, param3, param2, (aa) this, ((aa) this).field_o, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((aa) this).field_s;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((aa) this).field_s = ((aa) this).field_s + param1;
                if (((aa) this).field_o != 256) {
                  break L4;
                } else {
                  if ((((aa) this).field_z & 255) != 0) {
                    break L4;
                  } else {
                    if (!rc.field_q) {
                      param1 = aa.a(((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, ((aa) this).field_w, 0, var6, param2, (aa) this);
                      break L3;
                    } else {
                      param1 = aa.a(0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, ((aa) this).field_A, ((aa) this).field_p, 0, var6, param2, (aa) this);
                      break L3;
                    }
                  }
                }
              }
              if (!rc.field_q) {
                param1 = aa.b(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_u, ((aa) this).field_w, 0, var6, param2, (aa) this, ((aa) this).field_o, param4);
                break L3;
              } else {
                param1 = aa.a(0, 0, ((sn) (Object) ((aa) this).field_m).field_o, param0, ((aa) this).field_z, param1, ((aa) this).field_C, ((aa) this).field_t, ((aa) this).field_A, ((aa) this).field_p, 0, var6, param2, (aa) this, ((aa) this).field_o, param4);
                break L3;
              }
            }
            ((aa) this).field_s = ((aa) this).field_s - param1;
            if (((aa) this).field_s == 0) {
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

    final synchronized int h() {
        return ((aa) this).field_o < 0 ? -((aa) this).field_o : ((aa) this).field_o;
    }

    final synchronized void i(int param0) {
        this.e(param0, ((aa) this).k());
    }

    final synchronized void d(int param0, int param1) {
        ((aa) this).a(param0, param1, ((aa) this).k());
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, aa param12) {
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
        param12.field_u = param12.field_u + param12.field_w * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_C = param5 >> 2;
                param12.field_t = param6 >> 2;
                param12.field_z = param3 << 8;
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

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, aa param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_C = param11.field_C - param11.field_A * param5;
            param11.field_t = param11.field_t - param11.field_p * param5;
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
                param11.field_C = param11.field_C + param11.field_A * param5;
                param11.field_t = param11.field_t + param11.field_p * param5;
                param11.field_u = param6;
                param11.field_z = param4;
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

    private aa(sn param0, int param1, int param2) {
        ((aa) this).field_m = (ow) (Object) param0;
        ((aa) this).field_r = param0.field_m;
        ((aa) this).field_B = param0.field_n;
        ((aa) this).field_q = param0.field_l;
        ((aa) this).field_o = param1;
        ((aa) this).field_y = param2;
        ((aa) this).field_v = 8192;
        ((aa) this).field_z = 0;
        this.j();
    }

    private aa(sn param0, int param1, int param2, int param3) {
        ((aa) this).field_m = (ow) (Object) param0;
        ((aa) this).field_r = param0.field_m;
        ((aa) this).field_B = param0.field_n;
        ((aa) this).field_q = param0.field_l;
        ((aa) this).field_o = param1;
        ((aa) this).field_y = param2;
        ((aa) this).field_v = param3;
        ((aa) this).field_z = 0;
        this.j();
    }
}
