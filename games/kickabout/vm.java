/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends lq {
    private int field_n;
    private int field_t;
    private int field_q;
    private int field_k;
    private boolean field_m;
    private int field_s;
    private int field_u;
    private int field_w;
    private int field_l;
    private int field_o;
    private int field_i;
    private int field_j;
    private int field_r;
    private int field_p;
    private int field_v;

    final synchronized int m() {
        return ((vm) this).field_j == -2147483648 ? 0 : ((vm) this).field_j;
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vm param10, int param11, int param12) {
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 - param4 + param11 - 257) / param11;
              if (param5 + (param9 - param4 + param11 - 257) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11 - 1) / param11;
                  if (param5 + (param9 - param4 + param11 - 1) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param1 = param12;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_l = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param11;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            int incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    final lq c() {
        return null;
    }

    private final int a(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((vm) this).field_k <= 0) {
            L1: {
              if (((vm) this).field_r != 256) {
                break L1;
              } else {
                if ((((vm) this).field_l & 255) != 0) {
                  break L1;
                } else {
                  if (uh.field_o) {
                    return vm.b(0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, 0, param3, param2, (vm) this);
                  } else {
                    return vm.b(((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, 0, param3, param2, (vm) this);
                  }
                }
              }
            }
            if (uh.field_o) {
              return vm.b(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, 0, param3, param2, (vm) this, ((vm) this).field_r, param4);
            } else {
              return vm.b(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, 0, param3, param2, (vm) this, ((vm) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((vm) this).field_k;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((vm) this).field_k = ((vm) this).field_k + param1;
                if (((vm) this).field_r != 256) {
                  break L4;
                } else {
                  if ((((vm) this).field_l & 255) != 0) {
                    break L4;
                  } else {
                    if (!uh.field_o) {
                      param1 = vm.a(((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, ((vm) this).field_t, 0, var6, param2, (vm) this);
                      break L3;
                    } else {
                      param1 = vm.a(0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, ((vm) this).field_o, ((vm) this).field_w, 0, var6, param2, (vm) this);
                      break L3;
                    }
                  }
                }
              }
              if (!uh.field_o) {
                param1 = vm.d(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, ((vm) this).field_t, 0, var6, param2, (vm) this, ((vm) this).field_r, param4);
                break L3;
              } else {
                param1 = vm.b(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, ((vm) this).field_o, ((vm) this).field_w, 0, var6, param2, (vm) this, ((vm) this).field_r, param4);
                break L3;
              }
            }
            ((vm) this).field_k = ((vm) this).field_k - param1;
            if (((vm) this).field_k == 0) {
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

    final synchronized boolean f() {
        return ((vm) this).field_l < 0 || ((vm) this).field_l >= ((to) (Object) ((vm) this).field_h).field_i.length << 8;
    }

    final lq b() {
        return null;
    }

    private final void h() {
        ((vm) this).field_v = ((vm) this).field_j;
        ((vm) this).field_s = vm.a(((vm) this).field_j, ((vm) this).field_i);
        ((vm) this).field_q = vm.d(((vm) this).field_j, ((vm) this).field_i);
    }

    private final static int a(int param0, int param1) {
        return param1 < 0 ? param0 : (int)((double)param0 * Math.sqrt((double)(16384 - param1) * 0.0001220703125) + 0.5);
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vm param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param2 - (param7 - 1);
        if (param3 + param2 - (param7 - 1) > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            int incrementValue$0 = param3;
            param3++;
            int incrementValue$1 = param2;
            param2--;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            int incrementValue$2 = param3;
            param3++;
            int incrementValue$3 = param2;
            param2--;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            int incrementValue$4 = param3;
            param3++;
            int incrementValue$5 = param2;
            param2--;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            int incrementValue$6 = param3;
            param3++;
            int incrementValue$7 = param2;
            param2--;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            int incrementValue$8 = param3;
            param3++;
            int incrementValue$9 = param2;
            param2--;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_l = param2 << 8;
        return param3;
    }

    final synchronized void a(boolean param0) {
        ((vm) this).field_r = (((vm) this).field_r ^ ((vm) this).field_r >> 31) + (((vm) this).field_r >>> 31);
        if (param0) {
          ((vm) this).field_r = -((vm) this).field_r;
          return;
        } else {
          return;
        }
    }

    private final int b(int[] param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        L0: while (true) {
          if (((vm) this).field_k <= 0) {
            L1: {
              if (((vm) this).field_r != -256) {
                break L1;
              } else {
                if ((((vm) this).field_l & 255) != 0) {
                  break L1;
                } else {
                  if (uh.field_o) {
                    return vm.a(0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, 0, param3, param2, (vm) this);
                  } else {
                    return vm.a(((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, 0, param3, param2, (vm) this);
                  }
                }
              }
            }
            if (uh.field_o) {
              return vm.a(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, 0, param3, param2, (vm) this, ((vm) this).field_r, param4);
            } else {
              return vm.a(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, 0, param3, param2, (vm) this, ((vm) this).field_r, param4);
            }
          } else {
            L2: {
              var6 = param1 + ((vm) this).field_k;
              if (var6 <= param3) {
                break L2;
              } else {
                var6 = param3;
                break L2;
              }
            }
            L3: {
              L4: {
                ((vm) this).field_k = ((vm) this).field_k + param1;
                if (((vm) this).field_r != -256) {
                  break L4;
                } else {
                  if ((((vm) this).field_l & 255) != 0) {
                    break L4;
                  } else {
                    if (!uh.field_o) {
                      param1 = vm.b(((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, ((vm) this).field_t, 0, var6, param2, (vm) this);
                      break L3;
                    } else {
                      param1 = vm.b(0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, ((vm) this).field_o, ((vm) this).field_w, 0, var6, param2, (vm) this);
                      break L3;
                    }
                  }
                }
              }
              if (!uh.field_o) {
                param1 = vm.c(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_v, ((vm) this).field_t, 0, var6, param2, (vm) this, ((vm) this).field_r, param4);
                break L3;
              } else {
                param1 = vm.a(0, 0, ((to) (Object) ((vm) this).field_h).field_i, param0, ((vm) this).field_l, param1, ((vm) this).field_s, ((vm) this).field_q, ((vm) this).field_o, ((vm) this).field_w, 0, var6, param2, (vm) this, ((vm) this).field_r, param4);
                break L3;
              }
            }
            ((vm) this).field_k = ((vm) this).field_k - param1;
            if (((vm) this).field_k == 0) {
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

    final synchronized void a(int[] param0, int param1, int param2) {
        to var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          if (((vm) this).field_j != 0) {
            break L0;
          } else {
            if (((vm) this).field_k != 0) {
              break L0;
            } else {
              ((vm) this).a(param2);
              return;
            }
          }
        }
        L1: {
          var4 = (to) (Object) ((vm) this).field_h;
          var5 = ((vm) this).field_n << 8;
          var6 = ((vm) this).field_u << 8;
          var7 = var4.field_i.length << 8;
          var8 = var6 - var5;
          if (var8 > 0) {
            break L1;
          } else {
            ((vm) this).field_p = 0;
            break L1;
          }
        }
        L2: {
          var9 = param1;
          param2 = param2 + param1;
          if (((vm) this).field_l >= 0) {
            break L2;
          } else {
            if (((vm) this).field_r <= 0) {
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              ((vm) this).field_l = 0;
              break L2;
            }
          }
        }
        L3: {
          if (((vm) this).field_l < var7) {
            break L3;
          } else {
            if (((vm) this).field_r >= 0) {
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              ((vm) this).field_l = var7 - 1;
              break L3;
            }
          }
        }
        if (((vm) this).field_p >= 0) {
          L4: {
            if (((vm) this).field_p <= 0) {
              break L4;
            } else {
              if (!((vm) this).field_m) {
                if (((vm) this).field_r >= 0) {
                  L5: while (true) {
                    var9 = this.a(param0, var9, var6, param2, (int) var4.field_i[((vm) this).field_n]);
                    if (((vm) this).field_l >= var6) {
                      var10 = (((vm) this).field_l - var5) / var8;
                      if (var10 < ((vm) this).field_p) {
                        ((vm) this).field_l = ((vm) this).field_l - var8 * var10;
                        ((vm) this).field_p = ((vm) this).field_p - var10;
                        continue L5;
                      } else {
                        ((vm) this).field_l = ((vm) this).field_l - var8 * ((vm) this).field_p;
                        ((vm) this).field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  L6: while (true) {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_u - 1]);
                    if (((vm) this).field_l < var5) {
                      var10 = (var6 - 1 - ((vm) this).field_l) / var8;
                      if (var10 < ((vm) this).field_p) {
                        ((vm) this).field_l = ((vm) this).field_l + var8 * var10;
                        ((vm) this).field_p = ((vm) this).field_p - var10;
                        continue L6;
                      } else {
                        ((vm) this).field_l = ((vm) this).field_l + var8 * ((vm) this).field_p;
                        ((vm) this).field_p = 0;
                        break L4;
                      }
                    } else {
                      return;
                    }
                  }
                }
              } else {
                L7: {
                  if (((vm) this).field_r >= 0) {
                    break L7;
                  } else {
                    var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_n]);
                    if (((vm) this).field_l < var5) {
                      ((vm) this).field_l = var5 + var5 - 1 - ((vm) this).field_l;
                      ((vm) this).field_r = -((vm) this).field_r;
                      int fieldTemp$5 = ((vm) this).field_p - 1;
                      ((vm) this).field_p = ((vm) this).field_p - 1;
                      if (fieldTemp$5 != 0) {
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
                  var9 = this.a(param0, var9, var6, param2, (int) var4.field_i[((vm) this).field_u - 1]);
                  if (((vm) this).field_l >= var6) {
                    ((vm) this).field_l = var6 + var6 - 1 - ((vm) this).field_l;
                    ((vm) this).field_r = -((vm) this).field_r;
                    int fieldTemp$6 = ((vm) this).field_p - 1;
                    ((vm) this).field_p = ((vm) this).field_p - 1;
                    if (fieldTemp$6 != 0) {
                      var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_n]);
                      if (((vm) this).field_l < var5) {
                        ((vm) this).field_l = var5 + var5 - 1 - ((vm) this).field_l;
                        ((vm) this).field_r = -((vm) this).field_r;
                        int fieldTemp$7 = ((vm) this).field_p - 1;
                        ((vm) this).field_p = ((vm) this).field_p - 1;
                        if (fieldTemp$7 != 0) {
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
          if (((vm) this).field_r < 0) {
            int discarded$8 = this.b(param0, var9, 0, param2, 0);
            if (((vm) this).field_l < 0) {
              ((vm) this).field_l = -1;
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              int discarded$9 = this.a(param0, var9, var7, param2, 0);
              if (((vm) this).field_l < var7) {
                break L9;
              } else {
                ((vm) this).field_l = var7;
                this.l();
                ((vm) this).c((byte) -109);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((vm) this).field_m) {
            if (((vm) this).field_r >= 0) {
              L10: while (true) {
                var9 = this.a(param0, var9, var6, param2, (int) var4.field_i[((vm) this).field_n]);
                if (((vm) this).field_l >= var6) {
                  ((vm) this).field_l = var5 + (((vm) this).field_l - var5) % var8;
                  continue L10;
                } else {
                  return;
                }
              }
            } else {
              L11: while (true) {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_u - 1]);
                if (((vm) this).field_l < var5) {
                  ((vm) this).field_l = var6 - 1 - (var6 - 1 - ((vm) this).field_l) % var8;
                  continue L11;
                } else {
                  return;
                }
              }
            }
          } else {
            L12: {
              if (((vm) this).field_r >= 0) {
                break L12;
              } else {
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_n]);
                if (((vm) this).field_l < var5) {
                  ((vm) this).field_l = var5 + var5 - 1 - ((vm) this).field_l;
                  ((vm) this).field_r = -((vm) this).field_r;
                  break L12;
                } else {
                  return;
                }
              }
            }
            L13: while (true) {
              var9 = this.a(param0, var9, var6, param2, (int) var4.field_i[((vm) this).field_u - 1]);
              if (((vm) this).field_l >= var6) {
                ((vm) this).field_l = var6 + var6 - 1 - ((vm) this).field_l;
                ((vm) this).field_r = -((vm) this).field_r;
                var9 = this.b(param0, var9, var5, param2, (int) var4.field_i[((vm) this).field_n]);
                if (((vm) this).field_l < var5) {
                  ((vm) this).field_l = var5 + var5 - 1 - ((vm) this).field_l;
                  ((vm) this).field_r = -((vm) this).field_r;
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

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vm param11, int param12, int param13) {
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
                param11.field_l = param4;
                return param5 >> 1;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int c(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vm param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_o * param5;
            param11.field_q = param11.field_q - param11.field_w * param5;
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
                param11.field_s = param11.field_s + param11.field_o * param5;
                param11.field_q = param11.field_q + param11.field_w * param5;
                param11.field_v = param6;
                param11.field_l = param4;
                return param5;
              } else {
                int incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            int incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vm param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_v = param13.field_v - param13.field_t * param5;
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
                param13.field_v = param13.field_v + param13.field_t * param5;
                param13.field_s = param6;
                param13.field_q = param7;
                param13.field_l = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vm param12) {
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
        param12.field_v = param12.field_v + param12.field_t * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_q = param6 >> 2;
                param12.field_l = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    private final boolean j() {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var1 = ((vm) this).field_j;
          if (var1 != -2147483648) {
            var2 = vm.a(var1, ((vm) this).field_i);
            var3 = vm.d(var1, ((vm) this).field_i);
            break L0;
          } else {
            var3 = 0;
            var2 = 0;
            var1 = 0;
            break L0;
          }
        }
        L1: {
          if (((vm) this).field_v != var1) {
            break L1;
          } else {
            if (((vm) this).field_s != var2) {
              break L1;
            } else {
              if (((vm) this).field_q == var3) {
                if (((vm) this).field_j == -2147483648) {
                  ((vm) this).field_j = 0;
                  ((vm) this).field_q = 0;
                  ((vm) this).field_s = 0;
                  ((vm) this).field_v = 0;
                  ((vm) this).c((byte) -109);
                  return true;
                } else {
                  this.h();
                  return false;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          if (((vm) this).field_v >= var1) {
            if (((vm) this).field_v <= var1) {
              ((vm) this).field_t = 0;
              break L2;
            } else {
              ((vm) this).field_t = -1;
              ((vm) this).field_k = ((vm) this).field_v - var1;
              break L2;
            }
          } else {
            ((vm) this).field_t = 1;
            ((vm) this).field_k = var1 - ((vm) this).field_v;
            break L2;
          }
        }
        L3: {
          if (((vm) this).field_s >= var2) {
            if (((vm) this).field_s <= var2) {
              ((vm) this).field_o = 0;
              break L3;
            } else {
              L4: {
                ((vm) this).field_o = -1;
                if (((vm) this).field_k == 0) {
                  break L4;
                } else {
                  if (((vm) this).field_k <= ((vm) this).field_s - var2) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((vm) this).field_k = ((vm) this).field_s - var2;
              break L3;
            }
          } else {
            L5: {
              ((vm) this).field_o = 1;
              if (((vm) this).field_k == 0) {
                break L5;
              } else {
                if (((vm) this).field_k <= var2 - ((vm) this).field_s) {
                  break L3;
                } else {
                  break L5;
                }
              }
            }
            ((vm) this).field_k = var2 - ((vm) this).field_s;
            break L3;
          }
        }
        if (((vm) this).field_q < var3) {
          ((vm) this).field_w = 1;
          if (((vm) this).field_k != 0) {
            if (((vm) this).field_k > var3 - ((vm) this).field_q) {
              ((vm) this).field_k = var3 - ((vm) this).field_q;
              return false;
            } else {
              return false;
            }
          } else {
            ((vm) this).field_k = var3 - ((vm) this).field_q;
            return false;
          }
        } else {
          L6: {
            if (((vm) this).field_q <= var3) {
              ((vm) this).field_w = 0;
              break L6;
            } else {
              L7: {
                ((vm) this).field_w = -1;
                if (((vm) this).field_k == 0) {
                  break L7;
                } else {
                  if (((vm) this).field_k <= ((vm) this).field_q - var3) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ((vm) this).field_k = ((vm) this).field_q - var3;
              break L6;
            }
          }
          return false;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, vm param12) {
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
        param12.field_v = param12.field_v + param12.field_t * (param9 - param4);
        param4 = param4 << 1;
        param9 = param9 << 1;
        param9 -= 6;
        L1: while (true) {
          if (param4 >= param9) {
            param9 += 6;
            L2: while (true) {
              if (param4 >= param9) {
                param12.field_s = param5 >> 2;
                param12.field_q = param6 >> 2;
                param12.field_l = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                param5 = param5 + param7;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                param6 = param6 + param8;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            param6 = param6 + param8;
            int incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            param5 = param5 + param7;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            param6 = param6 + param8;
            continue L1;
          }
        }
    }

    final synchronized void e(int param0) {
        int var2 = 0;
        if (param0 != 0) {
          if (((vm) this).field_s == 0) {
            if (((vm) this).field_q == 0) {
              ((vm) this).field_k = 0;
              ((vm) this).field_j = 0;
              ((vm) this).field_v = 0;
              ((vm) this).c((byte) -109);
              return;
            } else {
              L0: {
                var2 = -((vm) this).field_v;
                if (((vm) this).field_v <= var2) {
                  break L0;
                } else {
                  var2 = ((vm) this).field_v;
                  break L0;
                }
              }
              L1: {
                if (-((vm) this).field_s <= var2) {
                  break L1;
                } else {
                  var2 = -((vm) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((vm) this).field_s <= var2) {
                  break L2;
                } else {
                  var2 = ((vm) this).field_s;
                  break L2;
                }
              }
              L3: {
                if (-((vm) this).field_q <= var2) {
                  break L3;
                } else {
                  var2 = -((vm) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((vm) this).field_q <= var2) {
                  break L4;
                } else {
                  var2 = ((vm) this).field_q;
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
              ((vm) this).field_k = param0;
              ((vm) this).field_j = -2147483648;
              ((vm) this).field_t = -((vm) this).field_v / param0;
              ((vm) this).field_o = -((vm) this).field_s / param0;
              ((vm) this).field_w = -((vm) this).field_q / param0;
              return;
            }
          } else {
            L6: {
              var2 = -((vm) this).field_v;
              if (((vm) this).field_v <= var2) {
                break L6;
              } else {
                var2 = ((vm) this).field_v;
                break L6;
              }
            }
            L7: {
              if (-((vm) this).field_s <= var2) {
                break L7;
              } else {
                var2 = -((vm) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((vm) this).field_s <= var2) {
                break L8;
              } else {
                var2 = ((vm) this).field_s;
                break L8;
              }
            }
            L9: {
              if (-((vm) this).field_q <= var2) {
                break L9;
              } else {
                var2 = -((vm) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((vm) this).field_q <= var2) {
                break L10;
              } else {
                var2 = ((vm) this).field_q;
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
            ((vm) this).field_k = param0;
            ((vm) this).field_j = -2147483648;
            ((vm) this).field_t = -((vm) this).field_v / param0;
            ((vm) this).field_o = -((vm) this).field_s / param0;
            ((vm) this).field_w = -((vm) this).field_q / param0;
            return;
          }
        } else {
          ((vm) this).b(0);
          ((vm) this).c((byte) -109);
          return;
        }
    }

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, vm param8) {
        param2 = param2 >> 8;
        param7 = param7 >> 8;
        param4 = param4 << 2;
        param5 = param3 + param7 - param2;
        if (param3 + param7 - param2 > param6) {
            param5 = param6;
        }
        param5 -= 3;
        while (param3 < param5) {
            int incrementValue$0 = param3;
            param3++;
            int incrementValue$1 = param2;
            param2++;
            param1[incrementValue$0] = param1[incrementValue$0] + param0[incrementValue$1] * param4;
            int incrementValue$2 = param3;
            param3++;
            int incrementValue$3 = param2;
            param2++;
            param1[incrementValue$2] = param1[incrementValue$2] + param0[incrementValue$3] * param4;
            int incrementValue$4 = param3;
            param3++;
            int incrementValue$5 = param2;
            param2++;
            param1[incrementValue$4] = param1[incrementValue$4] + param0[incrementValue$5] * param4;
            int incrementValue$6 = param3;
            param3++;
            int incrementValue$7 = param2;
            param2++;
            param1[incrementValue$6] = param1[incrementValue$6] + param0[incrementValue$7] * param4;
        }
        param5 += 3;
        while (param3 < param5) {
            int incrementValue$8 = param3;
            param3++;
            int incrementValue$9 = param2;
            param2++;
            param1[incrementValue$8] = param1[incrementValue$8] + param0[incrementValue$9] * param4;
        }
        param8.field_l = param2 << 8;
        return param3;
    }

    final synchronized int g() {
        return ((vm) this).field_l >> 8;
    }

    private final static int b(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vm param10) {
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
                param10.field_l = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3++;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3++;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            int incrementValue$21 = param3;
            param3++;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            int incrementValue$24 = param3;
            param3++;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            int incrementValue$27 = param3;
            param3++;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, vm param10, int param11, int param12) {
        L0: {
          L1: {
            if (param11 == 0) {
              break L1;
            } else {
              param7 = param5 + (param9 + 256 - param4 + param11) / param11;
              if (param5 + (param9 + 256 - param4 + param11) / param11 <= param8) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          param7 = param8;
          break L0;
        }
        L2: while (true) {
          if (param5 >= param7) {
            L3: {
              L4: {
                if (param11 == 0) {
                  break L4;
                } else {
                  param7 = param5 + (param9 - param4 + param11) / param11;
                  if (param5 + (param9 - param4 + param11) / param11 <= param8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              param7 = param8;
              break L3;
            }
            param0 = param12;
            param1 = param11;
            L5: while (true) {
              if (param5 >= param7) {
                param10.field_l = param4;
                return param5;
              } else {
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (((param0 << 8) + (param2[param4 >> 8] - param0) * (param4 & 255)) * param6 >> 6);
                param4 = param4 + param1;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            int incrementValue$5 = param5;
            param5++;
            param3[incrementValue$5] = param3[incrementValue$5] + (((param0 << 8) + (param2[param1] - param0) * (param4 & 255)) * param6 >> 6);
            param4 = param4 + param11;
            continue L2;
          }
        }
    }

    final synchronized int k() {
        return ((vm) this).field_i < 0 ? -1 : ((vm) this).field_i;
    }

    private final void l() {
        if (((vm) this).field_k != 0) {
            if (((vm) this).field_j == -2147483648) {
                ((vm) this).field_j = 0;
            }
            ((vm) this).field_k = 0;
            this.h();
            return;
        }
    }

    final synchronized void c(int param0, int param1) {
        ((vm) this).a(param0, param1, ((vm) this).k());
    }

    final int d() {
        if (((vm) this).field_j == 0) {
            if (((vm) this).field_k == 0) {
                return 0;
            }
        }
        return 1;
    }

    final synchronized void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 0) {
          var4 = vm.a(param1, param2);
          var5 = vm.d(param1, param2);
          if (((vm) this).field_s == var4) {
            if (((vm) this).field_q == var5) {
              ((vm) this).field_k = 0;
              return;
            } else {
              L0: {
                var6 = param1 - ((vm) this).field_v;
                if (((vm) this).field_v - param1 <= var6) {
                  break L0;
                } else {
                  var6 = ((vm) this).field_v - param1;
                  break L0;
                }
              }
              L1: {
                if (var4 - ((vm) this).field_s <= var6) {
                  break L1;
                } else {
                  var6 = var4 - ((vm) this).field_s;
                  break L1;
                }
              }
              L2: {
                if (((vm) this).field_s - var4 <= var6) {
                  break L2;
                } else {
                  var6 = ((vm) this).field_s - var4;
                  break L2;
                }
              }
              L3: {
                if (var5 - ((vm) this).field_q <= var6) {
                  break L3;
                } else {
                  var6 = var5 - ((vm) this).field_q;
                  break L3;
                }
              }
              L4: {
                if (((vm) this).field_q - var5 <= var6) {
                  break L4;
                } else {
                  var6 = ((vm) this).field_q - var5;
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
              ((vm) this).field_k = param0;
              ((vm) this).field_j = param1;
              ((vm) this).field_i = param2;
              ((vm) this).field_t = (param1 - ((vm) this).field_v) / param0;
              ((vm) this).field_o = (var4 - ((vm) this).field_s) / param0;
              ((vm) this).field_w = (var5 - ((vm) this).field_q) / param0;
              return;
            }
          } else {
            L6: {
              var6 = param1 - ((vm) this).field_v;
              if (((vm) this).field_v - param1 <= var6) {
                break L6;
              } else {
                var6 = ((vm) this).field_v - param1;
                break L6;
              }
            }
            L7: {
              if (var4 - ((vm) this).field_s <= var6) {
                break L7;
              } else {
                var6 = var4 - ((vm) this).field_s;
                break L7;
              }
            }
            L8: {
              if (((vm) this).field_s - var4 <= var6) {
                break L8;
              } else {
                var6 = ((vm) this).field_s - var4;
                break L8;
              }
            }
            L9: {
              if (var5 - ((vm) this).field_q <= var6) {
                break L9;
              } else {
                var6 = var5 - ((vm) this).field_q;
                break L9;
              }
            }
            L10: {
              if (((vm) this).field_q - var5 <= var6) {
                break L10;
              } else {
                var6 = ((vm) this).field_q - var5;
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
            ((vm) this).field_k = param0;
            ((vm) this).field_j = param1;
            ((vm) this).field_i = param2;
            ((vm) this).field_t = (param1 - ((vm) this).field_v) / param0;
            ((vm) this).field_o = (var4 - ((vm) this).field_s) / param0;
            ((vm) this).field_w = (var5 - ((vm) this).field_q) / param0;
            return;
          }
        } else {
          this.b(param1, param2);
          return;
        }
    }

    private final static int d(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vm param11, int param12, int param13) {
        L0: {
          L1: {
            param11.field_s = param11.field_s - param11.field_o * param5;
            param11.field_q = param11.field_q - param11.field_w * param5;
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
                param11.field_s = param11.field_s + param11.field_o * param5;
                param11.field_q = param11.field_q + param11.field_w * param5;
                param11.field_v = param6;
                param11.field_l = param4;
                return param5;
              } else {
                param0 = param2[param4 >> 8];
                int incrementValue$2 = param5;
                param5++;
                param3[incrementValue$2] = param3[incrementValue$2] + (((param0 << 8) + (param1 - param0) * (param4 & 255)) * param6 >> 6);
                param6 = param6 + param7;
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            int incrementValue$3 = param5;
            param5++;
            param3[incrementValue$3] = param3[incrementValue$3] + (((param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255)) * param6 >> 6);
            param6 = param6 + param7;
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final static int b(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, vm param11, int param12, int param13) {
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
                param11.field_l = param4;
                return param5 >> 1;
              } else {
                param0 = param2[param4 >> 8];
                param0 = (param0 << 8) + (param1 - param0) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param4 = param4 + param12;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1];
            param0 = (param0 << 8) + (param2[param1 + 1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param4 = param4 + param12;
            continue L2;
          }
        }
    }

    private final synchronized void b(int param0, int param1) {
        ((vm) this).field_j = param0;
        ((vm) this).field_i = param1;
        ((vm) this).field_k = 0;
        this.h();
    }

    final synchronized void i() {
        ((vm) this).field_r = (((vm) this).field_r ^ ((vm) this).field_r >> 31) + (((vm) this).field_r >>> 31);
        ((vm) this).field_r = -((vm) this).field_r;
        ((vm) this).field_l = ((to) (Object) ((vm) this).field_h).field_i.length - 1 << 8;
    }

    final synchronized void i(int param0) {
        int var2 = ((to) (Object) ((vm) this).field_h).field_i.length << 8;
        if (param0 < -1) {
            param0 = -1;
        }
        if (param0 > var2) {
            param0 = var2;
        }
        ((vm) this).field_l = param0;
    }

    private final static int a(int param0, int param1, byte[] param2, int[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, vm param13, int param14, int param15) {
        L0: {
          L1: {
            param13.field_v = param13.field_v - param13.field_t * param5;
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
                param13.field_v = param13.field_v + param13.field_t * param5;
                param13.field_s = param6;
                param13.field_q = param7;
                param13.field_l = param4;
                return param5;
              } else {
                param0 = (param1 << 8) + (param2[param4 >> 8] - param1) * (param4 & 255);
                int incrementValue$4 = param5;
                param5++;
                param3[incrementValue$4] = param3[incrementValue$4] + (param0 * param6 >> 6);
                param6 = param6 + param8;
                int incrementValue$5 = param5;
                param5++;
                param3[incrementValue$5] = param3[incrementValue$5] + (param0 * param7 >> 6);
                param7 = param7 + param9;
                param4 = param4 + param14;
                continue L5;
              }
            }
          } else {
            param1 = param4 >> 8;
            param0 = param2[param1 - 1];
            param0 = (param0 << 8) + (param2[param1] - param0) * (param4 & 255);
            int incrementValue$6 = param5;
            param5++;
            param3[incrementValue$6] = param3[incrementValue$6] + (param0 * param6 >> 6);
            param6 = param6 + param8;
            int incrementValue$7 = param5;
            param5++;
            param3[incrementValue$7] = param3[incrementValue$7] + (param0 * param7 >> 6);
            param7 = param7 + param9;
            param4 = param4 + param14;
            continue L2;
          }
        }
    }

    final static vm a(to param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new vm(param0, (int)((long)param0.field_f * 256L * (long)param1 / (long)(100 * uh.field_i)), param2 << 6, param3 << 6);
          }
        } else {
          return null;
        }
    }

    private final static int a(int param0, byte[] param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, vm param10) {
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
                param10.field_l = param3 << 8;
                return param4 >> 1;
              } else {
                int incrementValue$15 = param3;
                param3--;
                param0 = param1[incrementValue$15];
                int incrementValue$16 = param4;
                param4++;
                param2[incrementValue$16] = param2[incrementValue$16] + param0 * param5;
                int incrementValue$17 = param4;
                param4++;
                param2[incrementValue$17] = param2[incrementValue$17] + param0 * param6;
                continue L2;
              }
            }
          } else {
            int incrementValue$18 = param3;
            param3--;
            param0 = param1[incrementValue$18];
            int incrementValue$19 = param4;
            param4++;
            param2[incrementValue$19] = param2[incrementValue$19] + param0 * param5;
            int incrementValue$20 = param4;
            param4++;
            param2[incrementValue$20] = param2[incrementValue$20] + param0 * param6;
            int incrementValue$21 = param3;
            param3--;
            param0 = param1[incrementValue$21];
            int incrementValue$22 = param4;
            param4++;
            param2[incrementValue$22] = param2[incrementValue$22] + param0 * param5;
            int incrementValue$23 = param4;
            param4++;
            param2[incrementValue$23] = param2[incrementValue$23] + param0 * param6;
            int incrementValue$24 = param3;
            param3--;
            param0 = param1[incrementValue$24];
            int incrementValue$25 = param4;
            param4++;
            param2[incrementValue$25] = param2[incrementValue$25] + param0 * param5;
            int incrementValue$26 = param4;
            param4++;
            param2[incrementValue$26] = param2[incrementValue$26] + param0 * param6;
            int incrementValue$27 = param3;
            param3--;
            param0 = param1[incrementValue$27];
            int incrementValue$28 = param4;
            param4++;
            param2[incrementValue$28] = param2[incrementValue$28] + param0 * param5;
            int incrementValue$29 = param4;
            param4++;
            param2[incrementValue$29] = param2[incrementValue$29] + param0 * param6;
            continue L1;
          }
        }
    }

    private final static int d(int param0, int param1) {
        return param1 < 0 ? -param0 : (int)((double)param0 * Math.sqrt((double)param1 * 0.0001220703125) + 0.5);
    }

    final int a() {
        int var1 = ((vm) this).field_v * 3 >> 6;
        var1 = (var1 ^ var1 >> 31) + (var1 >>> 31);
        if (((vm) this).field_p == 0) {
            var1 = var1 - var1 * ((vm) this).field_l / (((to) (Object) ((vm) this).field_h).field_i.length << 8);
        } else {
            if (((vm) this).field_p >= 0) {
                var1 = var1 - var1 * ((vm) this).field_n / ((to) (Object) ((vm) this).field_h).field_i.length;
            }
        }
        return var1 > 255 ? 255 : var1;
    }

    final synchronized void b(int param0) {
        this.b(param0, ((vm) this).k());
    }

    final synchronized void a(int param0) {
        to var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          if (((vm) this).field_k <= 0) {
            break L0;
          } else {
            if (param0 < ((vm) this).field_k) {
              ((vm) this).field_v = ((vm) this).field_v + ((vm) this).field_t * param0;
              ((vm) this).field_s = ((vm) this).field_s + ((vm) this).field_o * param0;
              ((vm) this).field_q = ((vm) this).field_q + ((vm) this).field_w * param0;
              ((vm) this).field_k = ((vm) this).field_k - param0;
              break L0;
            } else {
              L1: {
                if (((vm) this).field_j != -2147483648) {
                  break L1;
                } else {
                  ((vm) this).field_j = 0;
                  ((vm) this).field_q = 0;
                  ((vm) this).field_s = 0;
                  ((vm) this).field_v = 0;
                  ((vm) this).c((byte) -109);
                  param0 = ((vm) this).field_k;
                  break L1;
                }
              }
              ((vm) this).field_k = 0;
              this.h();
              break L0;
            }
          }
        }
        L2: {
          var2 = (to) (Object) ((vm) this).field_h;
          var3 = ((vm) this).field_n << 8;
          var4 = ((vm) this).field_u << 8;
          var5 = var2.field_i.length << 8;
          var6 = var4 - var3;
          if (var6 > 0) {
            break L2;
          } else {
            ((vm) this).field_p = 0;
            break L2;
          }
        }
        L3: {
          if (((vm) this).field_l >= 0) {
            break L3;
          } else {
            if (((vm) this).field_r <= 0) {
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              ((vm) this).field_l = 0;
              break L3;
            }
          }
        }
        L4: {
          if (((vm) this).field_l < var5) {
            break L4;
          } else {
            if (((vm) this).field_r >= 0) {
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              ((vm) this).field_l = var5 - 1;
              break L4;
            }
          }
        }
        ((vm) this).field_l = ((vm) this).field_l + ((vm) this).field_r * param0;
        if (((vm) this).field_p >= 0) {
          L5: {
            if (((vm) this).field_p <= 0) {
              break L5;
            } else {
              if (!((vm) this).field_m) {
                L6: {
                  if (((vm) this).field_r >= 0) {
                    if (((vm) this).field_l >= var4) {
                      var7 = (((vm) this).field_l - var3) / var6;
                      if (var7 < ((vm) this).field_p) {
                        ((vm) this).field_l = ((vm) this).field_l - var6 * var7;
                        ((vm) this).field_p = ((vm) this).field_p - var7;
                        break L6;
                      } else {
                        ((vm) this).field_l = ((vm) this).field_l - var6 * ((vm) this).field_p;
                        ((vm) this).field_p = 0;
                        break L5;
                      }
                    } else {
                      return;
                    }
                  } else {
                    if (((vm) this).field_l < var3) {
                      var7 = (var4 - 1 - ((vm) this).field_l) / var6;
                      if (var7 < ((vm) this).field_p) {
                        ((vm) this).field_l = ((vm) this).field_l + var6 * var7;
                        ((vm) this).field_p = ((vm) this).field_p - var7;
                        break L6;
                      } else {
                        ((vm) this).field_l = ((vm) this).field_l + var6 * ((vm) this).field_p;
                        ((vm) this).field_p = 0;
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
                  if (((vm) this).field_r >= 0) {
                    break L7;
                  } else {
                    if (((vm) this).field_l < var3) {
                      ((vm) this).field_l = var3 + var3 - 1 - ((vm) this).field_l;
                      ((vm) this).field_r = -((vm) this).field_r;
                      int fieldTemp$3 = ((vm) this).field_p - 1;
                      ((vm) this).field_p = ((vm) this).field_p - 1;
                      if (fieldTemp$3 != 0) {
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
                  if (((vm) this).field_l >= var4) {
                    ((vm) this).field_l = var4 + var4 - 1 - ((vm) this).field_l;
                    ((vm) this).field_r = -((vm) this).field_r;
                    int fieldTemp$4 = ((vm) this).field_p - 1;
                    ((vm) this).field_p = ((vm) this).field_p - 1;
                    if (fieldTemp$4 != 0) {
                      if (((vm) this).field_l < var3) {
                        ((vm) this).field_l = var3 + var3 - 1 - ((vm) this).field_l;
                        ((vm) this).field_r = -((vm) this).field_r;
                        int fieldTemp$5 = ((vm) this).field_p - 1;
                        ((vm) this).field_p = ((vm) this).field_p - 1;
                        if (fieldTemp$5 != 0) {
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
          if (((vm) this).field_r < 0) {
            if (((vm) this).field_l < 0) {
              ((vm) this).field_l = -1;
              this.l();
              ((vm) this).c((byte) -109);
              return;
            } else {
              return;
            }
          } else {
            L9: {
              if (((vm) this).field_l < var5) {
                break L9;
              } else {
                ((vm) this).field_l = var5;
                this.l();
                ((vm) this).c((byte) -109);
                break L9;
              }
            }
            return;
          }
        } else {
          if (!((vm) this).field_m) {
            if (((vm) this).field_r >= 0) {
              if (((vm) this).field_l < var4) {
                return;
              } else {
                ((vm) this).field_l = var3 + (((vm) this).field_l - var3) % var6;
                return;
              }
            } else {
              if (((vm) this).field_l < var3) {
                ((vm) this).field_l = var4 - 1 - (var4 - 1 - ((vm) this).field_l) % var6;
                return;
              } else {
                return;
              }
            }
          } else {
            L10: {
              if (((vm) this).field_r >= 0) {
                break L10;
              } else {
                if (((vm) this).field_l < var3) {
                  ((vm) this).field_l = var3 + var3 - 1 - ((vm) this).field_l;
                  ((vm) this).field_r = -((vm) this).field_r;
                  break L10;
                } else {
                  return;
                }
              }
            }
            L11: while (true) {
              if (((vm) this).field_l >= var4) {
                ((vm) this).field_l = var4 + var4 - 1 - ((vm) this).field_l;
                ((vm) this).field_r = -((vm) this).field_r;
                if (((vm) this).field_l < var3) {
                  ((vm) this).field_l = var3 + var3 - 1 - ((vm) this).field_l;
                  ((vm) this).field_r = -((vm) this).field_r;
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

    private final static int b(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vm param9) {
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
        param9.field_s = param9.field_s + param9.field_o * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_w * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_v = param4 >> 2;
                param9.field_l = param2 << 8;
                return param3;
              } else {
                int incrementValue$10 = param3;
                param3++;
                int incrementValue$11 = param2;
                param2--;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            int incrementValue$12 = param3;
            param3++;
            int incrementValue$13 = param2;
            param2--;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            int incrementValue$14 = param3;
            param3++;
            int incrementValue$15 = param2;
            param2--;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            int incrementValue$16 = param3;
            param3++;
            int incrementValue$17 = param2;
            param2--;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            int incrementValue$18 = param3;
            param3++;
            int incrementValue$19 = param2;
            param2--;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final static vm b(to param0, int param1, int param2, int param3) {
        if (param0.field_i != null) {
          if (param0.field_i.length == 0) {
            return null;
          } else {
            return new vm(param0, param1, param2, param3);
          }
        } else {
          return null;
        }
    }

    private final static int a(byte[] param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, vm param9) {
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
        param9.field_s = param9.field_s + param9.field_o * (param6 - param3);
        param9.field_q = param9.field_q + param9.field_w * (param6 - param3);
        param6 -= 3;
        L1: while (true) {
          if (param3 >= param6) {
            param6 += 3;
            L2: while (true) {
              if (param3 >= param6) {
                param9.field_v = param4 >> 2;
                param9.field_l = param2 << 8;
                return param3;
              } else {
                int incrementValue$10 = param3;
                param3++;
                int incrementValue$11 = param2;
                param2++;
                param1[incrementValue$10] = param1[incrementValue$10] + param0[incrementValue$11] * param4;
                param4 = param4 + param5;
                continue L2;
              }
            }
          } else {
            int incrementValue$12 = param3;
            param3++;
            int incrementValue$13 = param2;
            param2++;
            param1[incrementValue$12] = param1[incrementValue$12] + param0[incrementValue$13] * param4;
            param4 = param4 + param5;
            int incrementValue$14 = param3;
            param3++;
            int incrementValue$15 = param2;
            param2++;
            param1[incrementValue$14] = param1[incrementValue$14] + param0[incrementValue$15] * param4;
            param4 = param4 + param5;
            int incrementValue$16 = param3;
            param3++;
            int incrementValue$17 = param2;
            param2++;
            param1[incrementValue$16] = param1[incrementValue$16] + param0[incrementValue$17] * param4;
            param4 = param4 + param5;
            int incrementValue$18 = param3;
            param3++;
            int incrementValue$19 = param2;
            param2++;
            param1[incrementValue$18] = param1[incrementValue$18] + param0[incrementValue$19] * param4;
            param4 = param4 + param5;
            continue L1;
          }
        }
    }

    final synchronized boolean n() {
        return ((vm) this).field_k != 0;
    }

    final synchronized void h(int param0) {
        if (((vm) this).field_r < 0) {
            ((vm) this).field_r = -param0;
        } else {
            ((vm) this).field_r = param0;
        }
    }

    final synchronized void f(int param0) {
        this.b(param0 << 6, ((vm) this).k());
    }

    final synchronized void g(int param0) {
        ((vm) this).field_p = param0;
    }

    final synchronized int e() {
        return ((vm) this).field_r < 0 ? -((vm) this).field_r : ((vm) this).field_r;
    }

    private vm(to param0, int param1, int param2, int param3) {
        ((vm) this).field_h = (dm) (Object) param0;
        ((vm) this).field_n = param0.field_h;
        ((vm) this).field_u = param0.field_j;
        ((vm) this).field_m = param0.field_g;
        ((vm) this).field_r = param1;
        ((vm) this).field_j = param2;
        ((vm) this).field_i = param3;
        ((vm) this).field_l = 0;
        this.h();
    }
}
