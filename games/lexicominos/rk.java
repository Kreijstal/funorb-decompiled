/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk extends tb {
    static ee field_c;
    private int field_e;
    static volatile boolean field_m;
    static int field_g;
    private long field_j;
    private int field_l;
    private long field_h;
    private long[] field_f;
    static aj field_n;
    private long field_i;
    static aj field_d;
    static String field_k;

    final void a(byte param0) {
        ((rk) this).field_i = 0L;
        if (param0 == 50) {
          if (((rk) this).field_h < ((rk) this).field_j) {
            ((rk) this).field_h = ((rk) this).field_h + (((rk) this).field_j - ((rk) this).field_h);
            return;
          } else {
            return;
          }
        } else {
          field_c = null;
          if (((rk) this).field_h >= ((rk) this).field_j) {
            return;
          } else {
            ((rk) this).field_h = ((rk) this).field_h + (((rk) this).field_j - ((rk) this).field_h);
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_k = null;
        field_n = null;
        if (!param0) {
            return;
        }
        field_c = null;
    }

    final long b(int param0) {
        if (param0 == 255) {
          ((rk) this).field_h = ((rk) this).field_h + this.c(10);
          if (((rk) this).field_j > ((rk) this).field_h) {
            return (((rk) this).field_j - ((rk) this).field_h) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_m = true;
          ((rk) this).field_h = ((rk) this).field_h + this.c(10);
          if (((rk) this).field_j > ((rk) this).field_h) {
            return (((rk) this).field_j - ((rk) this).field_h) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 - ((rk) this).field_i;
        ((rk) this).field_i = var2;
        if (var4 > -5000000000L) {
          if (5000000000L > var4) {
            ((rk) this).field_f[((rk) this).field_e] = var4;
            ((rk) this).field_e = (((rk) this).field_e + 1) % 10;
            if ((((rk) this).field_l ^ -1) <= -2) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((rk) this).field_l < var8) {
                  if (param0 != 10) {
                    return -86L;
                  } else {
                    return var6 / (long)((rk) this).field_l;
                  }
                } else {
                  var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((rk) this).field_l = ((rk) this).field_l + 1;
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (((rk) this).field_l < var8) {
                  if (param0 != 10) {
                    return -86L;
                  } else {
                    return var6 / (long)((rk) this).field_l;
                  }
                } else {
                  var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((rk) this).field_l < var8) {
                if (param0 != 10) {
                  return -86L;
                } else {
                  return var6 / (long)((rk) this).field_l;
                }
              } else {
                var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((rk) this).field_l < var8) {
              if (param0 != 10) {
                return -86L;
              } else {
                return var6 / (long)((rk) this).field_l;
              }
            } else {
              var6 = var6 + ((rk) this).field_f[(((rk) this).field_e - (var8 + -10)) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = Lexicominos.field_L ? 1 : 0;
        if (param1 > 113) {
          if (((rk) this).field_h >= ((rk) this).field_j) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((rk) this).field_j = ((rk) this).field_j + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L1;
                } else {
                  if ((((rk) this).field_j ^ -1L) > (((rk) this).field_h ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if ((((rk) this).field_j ^ -1L) > (((rk) this).field_h ^ -1L)) {
                  ((rk) this).field_j = ((rk) this).field_h;
                  break L2;
                } else {
                  break L2;
                }
              }
              return var4;
            }
          } else {
            ((rk) this).field_i = ((rk) this).field_i + (-((rk) this).field_h + ((rk) this).field_j);
            ((rk) this).field_h = ((rk) this).field_h + (-((rk) this).field_h + ((rk) this).field_j);
            ((rk) this).field_j = ((rk) this).field_j + param0;
            return 1;
          }
        } else {
          field_g = -117;
          if (((rk) this).field_h >= ((rk) this).field_j) {
            var4 = 0;
            L3: while (true) {
              L4: {
                ((rk) this).field_j = ((rk) this).field_j + param0;
                var4++;
                if ((var4 ^ -1) <= -11) {
                  break L4;
                } else {
                  if ((((rk) this).field_j ^ -1L) > (((rk) this).field_h ^ -1L)) {
                    continue L3;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if ((((rk) this).field_j ^ -1L) > (((rk) this).field_h ^ -1L)) {
                  ((rk) this).field_j = ((rk) this).field_h;
                  break L5;
                } else {
                  break L5;
                }
              }
              return var4;
            }
          } else {
            ((rk) this).field_i = ((rk) this).field_i + (-((rk) this).field_h + ((rk) this).field_j);
            ((rk) this).field_h = ((rk) this).field_h + (-((rk) this).field_h + ((rk) this).field_j);
            ((rk) this).field_j = ((rk) this).field_j + param0;
            return 1;
          }
        }
    }

    final static boolean a(int param0, boolean param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = Lexicominos.field_L ? 1 : 0;
        if (param1) {
          if (param0 >= 2) {
            if (param0 <= 36) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L0: while (true) {
                if (var7 > var8) {
                  L1: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L1;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L0;
                      } else {
                        if (var9 != 43) {
                          break L1;
                        } else {
                          if (!param3) {
                            break L1;
                          } else {
                            var8++;
                            continue L0;
                          }
                        }
                      }
                    }
                  }
                  L2: {
                    L3: {
                      if (var9 < 48) {
                        break L3;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (var9 < 65) {
                        break L4;
                      } else {
                        if (var9 > 90) {
                          break L4;
                        } else {
                          var9 -= 55;
                          break L2;
                        }
                      }
                    }
                    L5: {
                      if (var9 < 97) {
                        break L5;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param0) {
                    L6: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var6 == var10 / param0) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L0;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        } else {
          rk.a(true);
          if (param0 >= 2) {
            if (param0 <= 36) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L7: while (true) {
                if (var7 > var8) {
                  L8: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L8;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L7;
                      } else {
                        if (var9 != 43) {
                          break L8;
                        } else {
                          if (!param3) {
                            break L8;
                          } else {
                            var8++;
                            continue L7;
                          }
                        }
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if (var9 < 48) {
                        break L10;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var9 < 65) {
                        break L11;
                      } else {
                        if (var9 > 90) {
                          break L11;
                        } else {
                          var9 -= 55;
                          break L9;
                        }
                      }
                    }
                    L12: {
                      if (var9 < 97) {
                        break L12;
                      } else {
                        if (var9 <= 122) {
                          var9 -= 87;
                          break L9;
                        } else {
                          break L12;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param0) {
                    L13: {
                      if (var4 != 0) {
                        var9 = -var9;
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    var10 = var9 + param0 * var6;
                    if (var6 == var10 / param0) {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L7;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  return var5 != 0;
                }
              }
            } else {
              throw new IllegalArgumentException("" + param0);
            }
          } else {
            throw new IllegalArgumentException("" + param0);
          }
        }
    }

    rk() {
        ((rk) this).field_j = 0L;
        ((rk) this).field_h = 0L;
        ((rk) this).field_f = new long[10];
        ((rk) this).field_e = 0;
        ((rk) this).field_i = 0L;
        ((rk) this).field_l = 1;
        ((rk) this).field_h = System.nanoTime();
        ((rk) this).field_j = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = true;
        field_n = new aj(2, 4, 4, 0);
        field_d = new aj(6, 0, 4, 2);
        field_k = "2 of 4";
    }
}
