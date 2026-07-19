/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee {
    static w field_i;
    private int[] field_f;
    static ui[] field_a;
    private int field_c;
    static ud field_g;
    private int field_j;
    private int field_e;
    private int field_h;
    static int[] field_b;
    private int[] field_d;

    public static void a(byte param0) {
        field_b = null;
        field_g = null;
        field_a = null;
        field_i = null;
        if (param0 == -78) {
            return;
        }
        field_a = (ui[]) null;
    }

    final int a(boolean param0) {
        int fieldTemp$2 = 0;
        L0: {
          if (0 == this.field_e) {
            this.b(-1);
            this.field_e = 256;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0) {
          return 55;
        } else {
          fieldTemp$2 = this.field_e - 1;
          this.field_e = this.field_e - 1;
          return this.field_d[fieldTemp$2];
        }
    }

    private final void b(int param0) {
        int fieldTemp$6 = 0;
        int dupTemp$7 = 0;
        int dupTemp$8 = 0;
        int fieldTemp$9 = 0;
        int dupTemp$10 = 0;
        int dupTemp$11 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = client.field_A ? 1 : 0;
        if (param0 == -1) {
          fieldTemp$6 = this.field_h + 1;
          this.field_h = this.field_h + 1;
          this.field_j = this.field_j + fieldTemp$6;
          var2 = 0;
          L0: while (true) {
            if (256 > var2) {
              var3 = this.field_f[var2];
              if (var5 == 0) {
                L1: {
                  L2: {
                    if (0 == (var2 & 2)) {
                      break L2;
                    } else {
                      L3: {
                        if ((var2 & 1) == 0) {
                          break L3;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> 29915184;
                          if (var5 == 0) {
                            break L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -1034970558;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if ((var2 & 1) != 0) {
                      break L4;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 499832653;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L4;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> 1482730214;
                  break L1;
                }
                this.field_c = this.field_c + this.field_f[128 + var2 & 255];
                dupTemp$7 = this.field_j + this.field_c + this.field_f[lb.a(1020, var3) >> 346011810];
                var4 = dupTemp$7;
                this.field_f[var2] = dupTemp$7;
                dupTemp$8 = var3 + this.field_f[lb.a(255, var4 >> 1542245672 >> 212130562)];
                this.field_j = dupTemp$8;
                this.field_d[var2] = dupTemp$8;
                var2++;
                if (var5 == 0) {
                  continue L0;
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
        } else {
          this.field_f = (int[]) null;
          fieldTemp$9 = this.field_h + 1;
          this.field_h = this.field_h + 1;
          this.field_j = this.field_j + fieldTemp$9;
          var2 = 0;
          L5: while (true) {
            if (256 > var2) {
              var3 = this.field_f[var2];
              if (var5 == 0) {
                L6: {
                  L7: {
                    if (0 == (var2 & 2)) {
                      break L7;
                    } else {
                      L8: {
                        if ((var2 & 1) == 0) {
                          break L8;
                        } else {
                          this.field_c = this.field_c ^ this.field_c >>> 29915184;
                          if (var5 == 0) {
                            break L6;
                          } else {
                            break L8;
                          }
                        }
                      }
                      this.field_c = this.field_c ^ this.field_c << -1034970558;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if ((var2 & 1) != 0) {
                      break L9;
                    } else {
                      this.field_c = this.field_c ^ this.field_c << 499832653;
                      if (var5 == 0) {
                        break L6;
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_c = this.field_c ^ this.field_c >>> 1482730214;
                  break L6;
                }
                this.field_c = this.field_c + this.field_f[128 + var2 & 255];
                dupTemp$10 = this.field_j + this.field_c + this.field_f[lb.a(1020, var3) >> 346011810];
                var4 = dupTemp$10;
                this.field_f[var2] = dupTemp$10;
                dupTemp$11 = var3 + this.field_f[lb.a(255, var4 >> 1542245672 >> 212130562)];
                this.field_j = dupTemp$11;
                this.field_d[var2] = dupTemp$11;
                var2++;
                if (var5 == 0) {
                  continue L5;
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
        }
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        if (0 < param1) {
          var3 = -(int)(4294967296L % (long)param1) + 2147483647;
          if (param0 >= 71) {
            L0: while (true) {
              var4 = this.a(false);
              if (var4 <= var3) {
                return oi.a(param1, 83, var4);
              } else {
                continue L0;
              }
            }
          } else {
            field_a = (ui[]) null;
            L1: while (true) {
              var4 = this.a(false);
              if (var4 <= var3) {
                return oi.a(param1, 83, var4);
              } else {
                continue L1;
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = client.field_A ? 1 : 0;
          var6 = -1640531527;
          var7 = -1640531527;
          var4 = -1640531527;
          var5 = -1640531527;
          if (param0 == 8388607) {
            break L0;
          } else {
            this.field_j = -27;
            break L0;
          }
        }
        var10 = -1640531527;
        var3 = -1640531527;
        var8 = -1640531527;
        var9 = -1640531527;
        var2 = 0;
        L1: while (true) {
          L2: {
            if (4 <= var2) {
              var2 = 0;
              break L2;
            } else {
              var3 = var3 ^ var4 << 182743371;
              var4 = var4 + var5;
              var6 = var6 + var3;
              var4 = var4 ^ var5 >>> -623949854;
              var7 = var7 + var4;
              var5 = var5 + var6;
              var5 = var5 ^ var6 << -1392054424;
              var8 = var8 + var5;
              var6 = var6 + var7;
              var6 = var6 ^ var7 >>> 475147376;
              var9 = var9 + var6;
              var7 = var7 + var8;
              var7 = var7 ^ var8 << 1588146762;
              var10 = var10 + var7;
              var8 = var8 + var9;
              var8 = var8 ^ var9 >>> 1290212708;
              var3 = var3 + var8;
              var9 = var9 + var10;
              var9 = var9 ^ var10 << -996545496;
              var4 = var4 + var9;
              var10 = var10 + var3;
              var10 = var10 ^ var3 >>> -1633094391;
              var5 = var5 + var10;
              var3 = var3 + var4;
              var2++;
              if (var11 != 0) {
                break L2;
              } else {
                if (var11 == 0) {
                  continue L1;
                } else {
                  var2 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var2 >= 256) {
                          break L5;
                        } else {
                          var10 = var10 + this.field_d[7 + var2];
                          var6 = var6 + this.field_d[3 + var2];
                          var9 = var9 + this.field_d[6 + var2];
                          var7 = var7 + this.field_d[4 + var2];
                          var4 = var4 + this.field_d[var2 - -1];
                          var8 = var8 + this.field_d[5 + var2];
                          var3 = var3 + this.field_d[var2];
                          var5 = var5 + this.field_d[2 + var2];
                          var3 = var3 ^ var4 << -816264853;
                          var6 = var6 + var3;
                          var4 = var4 + var5;
                          var4 = var4 ^ var5 >>> -125735902;
                          var7 = var7 + var4;
                          var5 = var5 + var6;
                          var5 = var5 ^ var6 << -938954040;
                          var6 = var6 + var7;
                          var8 = var8 + var5;
                          var6 = var6 ^ var7 >>> -922820208;
                          var9 = var9 + var6;
                          var7 = var7 + var8;
                          var7 = var7 ^ var8 << -1991636022;
                          var10 = var10 + var7;
                          var8 = var8 + var9;
                          var8 = var8 ^ var9 >>> 1365830244;
                          var3 = var3 + var8;
                          var9 = var9 + var10;
                          var9 = var9 ^ var10 << -1429514072;
                          var4 = var4 + var9;
                          var10 = var10 + var3;
                          var10 = var10 ^ var3 >>> -1116988567;
                          var3 = var3 + var4;
                          var5 = var5 + var10;
                          this.field_f[var2] = var3;
                          this.field_f[var2 + 1] = var4;
                          this.field_f[var2 + 2] = var5;
                          this.field_f[3 + var2] = var6;
                          this.field_f[4 + var2] = var7;
                          this.field_f[5 + var2] = var8;
                          this.field_f[var2 - -6] = var9;
                          this.field_f[var2 - -7] = var10;
                          var2 += 8;
                          if (var11 != 0) {
                            break L4;
                          } else {
                            if (var11 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2 = 0;
                      break L4;
                    }
                    L6: while (true) {
                      if (var2 < 256) {
                        var10 = var10 + this.field_f[var2 + 7];
                        var6 = var6 + this.field_f[3 + var2];
                        var4 = var4 + this.field_f[1 + var2];
                        var3 = var3 + this.field_f[var2];
                        var8 = var8 + this.field_f[5 + var2];
                        var5 = var5 + this.field_f[var2 + 2];
                        var9 = var9 + this.field_f[6 + var2];
                        var7 = var7 + this.field_f[4 + var2];
                        var3 = var3 ^ var4 << 641295979;
                        var6 = var6 + var3;
                        var4 = var4 + var5;
                        var4 = var4 ^ var5 >>> 1651212194;
                        var7 = var7 + var4;
                        var5 = var5 + var6;
                        var5 = var5 ^ var6 << -366006168;
                        var6 = var6 + var7;
                        var8 = var8 + var5;
                        var6 = var6 ^ var7 >>> -191059248;
                        var7 = var7 + var8;
                        var9 = var9 + var6;
                        var7 = var7 ^ var8 << -587601654;
                        var10 = var10 + var7;
                        var8 = var8 + var9;
                        var8 = var8 ^ var9 >>> -469009724;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << 1547957672;
                        var10 = var10 + var3;
                        var4 = var4 + var9;
                        var10 = var10 ^ var3 >>> -1641952215;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_f[var2] = var3;
                        this.field_f[1 + var2] = var4;
                        this.field_f[var2 + 2] = var5;
                        this.field_f[3 + var2] = var6;
                        this.field_f[var2 - -4] = var7;
                        this.field_f[5 + var2] = var8;
                        this.field_f[6 + var2] = var9;
                        this.field_f[7 + var2] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L6;
                        } else {
                          return;
                        }
                      } else {
                        this.b(-1);
                        this.field_e = 256;
                        return;
                      }
                    }
                  }
                }
              }
            }
          }
          L7: while (true) {
            L8: {
              if (var2 >= 256) {
                var2 = 0;
                break L8;
              } else {
                var10 = var10 + this.field_d[7 + var2];
                var6 = var6 + this.field_d[3 + var2];
                var9 = var9 + this.field_d[6 + var2];
                var7 = var7 + this.field_d[4 + var2];
                var4 = var4 + this.field_d[var2 - -1];
                var8 = var8 + this.field_d[5 + var2];
                var3 = var3 + this.field_d[var2];
                var5 = var5 + this.field_d[2 + var2];
                var3 = var3 ^ var4 << -816264853;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> -125735902;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -938954040;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -922820208;
                var9 = var9 + var6;
                var7 = var7 + var8;
                var7 = var7 ^ var8 << -1991636022;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> 1365830244;
                var3 = var3 + var8;
                var9 = var9 + var10;
                var9 = var9 ^ var10 << -1429514072;
                var4 = var4 + var9;
                var10 = var10 + var3;
                var10 = var10 ^ var3 >>> -1116988567;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_f[var2] = var3;
                this.field_f[var2 + 1] = var4;
                this.field_f[var2 + 2] = var5;
                this.field_f[3 + var2] = var6;
                this.field_f[4 + var2] = var7;
                this.field_f[5 + var2] = var8;
                this.field_f[var2 - -6] = var9;
                this.field_f[var2 - -7] = var10;
                var2 += 8;
                if (var11 != 0) {
                  break L8;
                } else {
                  if (var11 == 0) {
                    continue L7;
                  } else {
                    var2 = 0;
                    L9: while (true) {
                      if (var2 < 256) {
                        var10 = var10 + this.field_f[var2 + 7];
                        var6 = var6 + this.field_f[3 + var2];
                        var4 = var4 + this.field_f[1 + var2];
                        var3 = var3 + this.field_f[var2];
                        var8 = var8 + this.field_f[5 + var2];
                        var5 = var5 + this.field_f[var2 + 2];
                        var9 = var9 + this.field_f[6 + var2];
                        var7 = var7 + this.field_f[4 + var2];
                        var3 = var3 ^ var4 << 641295979;
                        var6 = var6 + var3;
                        var4 = var4 + var5;
                        var4 = var4 ^ var5 >>> 1651212194;
                        var7 = var7 + var4;
                        var5 = var5 + var6;
                        var5 = var5 ^ var6 << -366006168;
                        var6 = var6 + var7;
                        var8 = var8 + var5;
                        var6 = var6 ^ var7 >>> -191059248;
                        var7 = var7 + var8;
                        var9 = var9 + var6;
                        var7 = var7 ^ var8 << -587601654;
                        var10 = var10 + var7;
                        var8 = var8 + var9;
                        var8 = var8 ^ var9 >>> -469009724;
                        var9 = var9 + var10;
                        var3 = var3 + var8;
                        var9 = var9 ^ var10 << 1547957672;
                        var10 = var10 + var3;
                        var4 = var4 + var9;
                        var10 = var10 ^ var3 >>> -1641952215;
                        var3 = var3 + var4;
                        var5 = var5 + var10;
                        this.field_f[var2] = var3;
                        this.field_f[1 + var2] = var4;
                        this.field_f[var2 + 2] = var5;
                        this.field_f[3 + var2] = var6;
                        this.field_f[var2 - -4] = var7;
                        this.field_f[5 + var2] = var8;
                        this.field_f[6 + var2] = var9;
                        this.field_f[7 + var2] = var10;
                        var2 += 8;
                        if (var11 == 0) {
                          continue L9;
                        } else {
                          return;
                        }
                      } else {
                        this.b(-1);
                        this.field_e = 256;
                        return;
                      }
                    }
                  }
                }
              }
            }
            L10: while (true) {
              if (var2 < 256) {
                var10 = var10 + this.field_f[var2 + 7];
                var6 = var6 + this.field_f[3 + var2];
                var4 = var4 + this.field_f[1 + var2];
                var3 = var3 + this.field_f[var2];
                var8 = var8 + this.field_f[5 + var2];
                var5 = var5 + this.field_f[var2 + 2];
                var9 = var9 + this.field_f[6 + var2];
                var7 = var7 + this.field_f[4 + var2];
                var3 = var3 ^ var4 << 641295979;
                var6 = var6 + var3;
                var4 = var4 + var5;
                var4 = var4 ^ var5 >>> 1651212194;
                var7 = var7 + var4;
                var5 = var5 + var6;
                var5 = var5 ^ var6 << -366006168;
                var6 = var6 + var7;
                var8 = var8 + var5;
                var6 = var6 ^ var7 >>> -191059248;
                var7 = var7 + var8;
                var9 = var9 + var6;
                var7 = var7 ^ var8 << -587601654;
                var10 = var10 + var7;
                var8 = var8 + var9;
                var8 = var8 ^ var9 >>> -469009724;
                var9 = var9 + var10;
                var3 = var3 + var8;
                var9 = var9 ^ var10 << 1547957672;
                var10 = var10 + var3;
                var4 = var4 + var9;
                var10 = var10 ^ var3 >>> -1641952215;
                var3 = var3 + var4;
                var5 = var5 + var10;
                this.field_f[var2] = var3;
                this.field_f[1 + var2] = var4;
                this.field_f[var2 + 2] = var5;
                this.field_f[3 + var2] = var6;
                this.field_f[var2 - -4] = var7;
                this.field_f[5 + var2] = var8;
                this.field_f[6 + var2] = var9;
                this.field_f[7 + var2] = var10;
                var2 += 8;
                if (var11 == 0) {
                  continue L10;
                } else {
                  return;
                }
              } else {
                this.b(-1);
                this.field_e = 256;
                return;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        if (param1) {
          if (ad.field_i[param3] >= ad.field_i[param2]) {
            if (ad.field_i[param2] < ad.field_i[param3]) {
              return false;
            } else {
              if (cc.field_h[param3] >= cc.field_h[param2]) {
                if (cc.field_h[param3] <= cc.field_h[param2]) {
                  var4 = ln.field_a[param3] + (oa.field_e[param3] - -mk.field_b[param3]);
                  var5 = mk.field_b[param2] + ln.field_a[param2] + oa.field_e[param2];
                  if (var5 <= var4) {
                    if (var4 <= var5) {
                      if (param0 <= 97) {
                        return false;
                      } else {
                        L0: {
                          if (param3 >= param2) {
                            stackOut_27_0 = 0;
                            stackIn_28_0 = stackOut_27_0;
                            break L0;
                          } else {
                            stackOut_26_0 = 1;
                            stackIn_28_0 = stackOut_26_0;
                            break L0;
                          }
                        }
                        return stackIn_28_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          if (cc.field_h[param3] < cc.field_h[param2]) {
            return true;
          } else {
            if (cc.field_h[param3] > cc.field_h[param2]) {
              return false;
            } else {
              if (ad.field_i[param3] >= ad.field_i[param2]) {
                if (ad.field_i[param3] <= ad.field_i[param2]) {
                  var4 = ln.field_a[param3] + (oa.field_e[param3] - -mk.field_b[param3]);
                  var5 = mk.field_b[param2] + ln.field_a[param2] + oa.field_e[param2];
                  if (var5 <= var4) {
                    if (var4 <= var5) {
                      if (param0 <= 97) {
                        return false;
                      } else {
                        L1: {
                          if (param3 >= param2) {
                            stackOut_38_0 = 0;
                            stackIn_39_0 = stackOut_38_0;
                            break L1;
                          } else {
                            stackOut_37_0 = 1;
                            stackIn_39_0 = stackOut_37_0;
                            break L1;
                          }
                        }
                        return stackIn_39_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          }
        }
    }

    ee(int[] param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            this.field_f = new int[256];
            this.field_d = new int[256];
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var2_int >= param0.length) {
                    break L3;
                  } else {
                    this.field_d[var2_int] = param0[var2_int];
                    var2_int++;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                this.a(8388607);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (runtimeException);
            stackOut_7_1 = new StringBuilder().append("ee.<init>(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L4;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    static {
        field_a = new ui[4];
        field_b = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
