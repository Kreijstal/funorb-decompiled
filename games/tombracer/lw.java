/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lw {
    static String field_i;
    private int field_e;
    private boolean field_c;
    private int field_h;
    static jea field_a;
    boolean field_b;
    private int field_f;
    private bua field_d;
    static int[] field_g;

    final void a(int param0, int param1, int param2) {
        this.field_e = param2 << -534051952;
        if (param0 >= -98) {
            return;
        }
        this.field_f = param1 << -810200752;
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (oj.field_tb[kda.field_hd]) {
            stackOut_4_0 = -1;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          } else {
            if (oj.field_tb[mf.field_a]) {
              stackOut_3_0 = 1;
              stackIn_5_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 0;
              stackIn_5_0 = stackOut_2_0;
              break L0;
            }
          }
        }
        L1: {
          var2 = stackIn_5_0;
          if (!oj.field_tb[mi.field_k]) {
            if (!oj.field_tb[fp.field_a]) {
              stackOut_9_0 = 0;
              stackIn_10_0 = stackOut_9_0;
              break L1;
            } else {
              stackOut_8_0 = 1;
              stackIn_10_0 = stackOut_8_0;
              break L1;
            }
          } else {
            stackOut_6_0 = -1;
            stackIn_10_0 = stackOut_6_0;
            break L1;
          }
        }
        L2: {
          var3 = stackIn_10_0;
          if (var2 != 0) {
            break L2;
          } else {
            if (var3 != 0) {
              break L2;
            } else {
              if (this.field_b) {
                this.field_d.a(0, false, 0, 0, true);
                this.field_h = 0;
                this.field_b = false;
                if (var4 != 0) {
                  break L2;
                } else {
                  this.field_d.a(param0 ^ param0);
                  return;
                }
              } else {
                this.field_d.a(param0 ^ param0);
                return;
              }
            }
          }
        }
        if (!this.field_c) {
          if (!oj.field_tb[hra.field_b]) {
            if (!this.field_c) {
              if (!this.field_b) {
                L3: {
                  L4: {
                    this.field_d.a(0, false, 0, 1, true);
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L4;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L3;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              } else {
                L5: {
                  L6: {
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L6;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L5;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              }
            } else {
              if (oj.field_tb[hra.field_b]) {
                if (this.field_b) {
                  L7: {
                    L8: {
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L8;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L7;
                        } else {
                          break L8;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L7;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                } else {
                  L9: {
                    L10: {
                      this.field_d.a(0, false, 0, 1, true);
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L10;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L9;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                }
              } else {
                L11: {
                  L12: {
                    this.field_d.a(0, false, 0, 1, true);
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L12;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L11;
                      } else {
                        break L12;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L11;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              }
            }
          } else {
            this.field_d.a(0, false, 0, 24, true);
            if (var4 != 0) {
              if (!this.field_c) {
                if (this.field_b) {
                  L13: {
                    L14: {
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L14;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L13;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                } else {
                  L15: {
                    L16: {
                      this.field_d.a(0, false, 0, 1, true);
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L16;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L15;
                        } else {
                          break L16;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L15;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                }
              } else {
                if (oj.field_tb[hra.field_b]) {
                  L17: {
                    if (!this.field_b) {
                      this.field_d.a(0, false, 0, 1, true);
                      break L17;
                    } else {
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L19;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L18;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                } else {
                  L20: {
                    L21: {
                      this.field_d.a(0, false, 0, 1, true);
                      this.field_c = oj.field_tb[hra.field_b];
                      this.field_b = true;
                      if (this.field_c) {
                        break L21;
                      } else {
                        var2 = var2 << 17;
                        var3 = var3 << 17;
                        if (var4 == 0) {
                          break L20;
                        } else {
                          break L21;
                        }
                      }
                    }
                    var2 = var2 << 14;
                    var3 = var3 << 14;
                    break L20;
                  }
                  this.field_f = this.field_f + var3;
                  this.field_e = this.field_e + var2;
                  this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                  this.field_d.a(param0 ^ param0);
                  return;
                }
              }
            } else {
              L22: {
                L23: {
                  this.field_c = oj.field_tb[hra.field_b];
                  this.field_b = true;
                  if (this.field_c) {
                    break L23;
                  } else {
                    var2 = var2 << 17;
                    var3 = var3 << 17;
                    if (var4 == 0) {
                      break L22;
                    } else {
                      break L23;
                    }
                  }
                }
                var2 = var2 << 14;
                var3 = var3 << 14;
                break L22;
              }
              this.field_f = this.field_f + var3;
              this.field_e = this.field_e + var2;
              this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
              this.field_d.a(param0 ^ param0);
              return;
            }
          }
        } else {
          if (this.field_b) {
            if (!this.field_c) {
              if (this.field_b) {
                L24: {
                  L25: {
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L25;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L24;
                      } else {
                        break L25;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L24;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              } else {
                L26: {
                  L27: {
                    this.field_d.a(0, false, 0, 1, true);
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L27;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L26;
                      } else {
                        break L27;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L26;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              }
            } else {
              if (oj.field_tb[hra.field_b]) {
                L28: {
                  if (!this.field_b) {
                    this.field_d.a(0, false, 0, 1, true);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                L29: {
                  L30: {
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L30;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L29;
                      } else {
                        break L30;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L29;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              } else {
                L31: {
                  L32: {
                    this.field_d.a(0, false, 0, 1, true);
                    this.field_c = oj.field_tb[hra.field_b];
                    this.field_b = true;
                    if (this.field_c) {
                      break L32;
                    } else {
                      var2 = var2 << 17;
                      var3 = var3 << 17;
                      if (var4 == 0) {
                        break L31;
                      } else {
                        break L32;
                      }
                    }
                  }
                  var2 = var2 << 14;
                  var3 = var3 << 14;
                  break L31;
                }
                this.field_f = this.field_f + var3;
                this.field_e = this.field_e + var2;
                this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
                this.field_d.a(param0 ^ param0);
                return;
              }
            }
          } else {
            L33: {
              L34: {
                if (!oj.field_tb[hra.field_b]) {
                  break L34;
                } else {
                  this.field_d.a(0, false, 0, 24, true);
                  if (var4 == 0) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              L35: {
                if (!this.field_c) {
                  break L35;
                } else {
                  if (!oj.field_tb[hra.field_b]) {
                    this.field_d.a(0, false, 0, 1, true);
                    break L33;
                  } else {
                    break L35;
                  }
                }
              }
              if (!this.field_b) {
                this.field_d.a(0, false, 0, 1, true);
                break L33;
              } else {
                break L33;
              }
            }
            L36: {
              L37: {
                this.field_c = oj.field_tb[hra.field_b];
                this.field_b = true;
                if (this.field_c) {
                  break L37;
                } else {
                  var2 = var2 << 17;
                  var3 = var3 << 17;
                  if (var4 == 0) {
                    break L36;
                  } else {
                    break L37;
                  }
                }
              }
              var2 = var2 << 14;
              var3 = var3 << 14;
              break L36;
            }
            this.field_f = this.field_f + var3;
            this.field_e = this.field_e + var2;
            this.field_h = -512 + (tia.a(var3 << -874987736, var2 << -1323877112, -29543) >> -2031702782);
            this.field_d.a(param0 ^ param0);
            return;
          }
        }
    }

    public static void b(int param0) {
        field_a = null;
        int var1 = 17 % ((param0 - -37) / 60);
        field_i = null;
        field_g = null;
    }

    final void a(byte param0, int param1, int param2) {
        if (param0 <= 11) {
          this.field_b = false;
          ura.a(-10985);
          hp.a(2048, this.field_h, 1900, this.field_d.b((byte) 74), -1918106173, (this.field_f >> 1553198736) + param1, param2 - -(this.field_e >> -701028368));
          se.f((byte) -6);
          return;
        } else {
          ura.a(-10985);
          hp.a(2048, this.field_h, 1900, this.field_d.b((byte) 74), -1918106173, (this.field_f >> 1553198736) + param1, param2 - -(this.field_e >> -701028368));
          se.f((byte) -6);
          return;
        }
    }

    final int a(int param0) {
        if (param0 < 68) {
            this.c(-38);
            return this.field_f >> 1714948976;
        }
        return this.field_f >> 1714948976;
    }

    final int a(byte param0) {
        if (param0 > -85) {
            return -6;
        }
        return this.field_e >> -1863525776;
    }

    lw() {
        this.field_d = new bua(0, 0, 1);
        this.field_d.a(0, false, 0, 0, true);
        this.field_b = false;
    }

    final static int a(int param0, byte param1) {
        int discarded$6 = 0;
        if (param1 <= -49) {
          if (0 <= param0) {
            if (-1 > (param0 ^ -1)) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return -1;
          }
        } else {
          discarded$6 = lw.a(-18, (byte) 73);
          if (0 <= param0) {
            if (-1 > (param0 ^ -1)) {
              return 1;
            } else {
              return 0;
            }
          } else {
            return -1;
          }
        }
    }

    static {
        field_i = "Message game";
        field_g = new int[]{0, 4096, 5793, 7094, 8192, 9159, 10033, 10837, 11585, 12288, 12953, 13585, 14189, 14768, 15326, 15864, 16384, 16888, 17378, 17854, 18318, 18770, 19212, 19644, 20066, 20480, 20886, 21283, 21674, 22058, 22435, 22806, 23170, 23530, 23884, 24232, 24576, 24915, 25249, 25580, 25905, 26227, 26545, 26859, 27170, 27477, 27780, 28081, 28378, 28672, 28963, 29251, 29537, 29819, 30099, 30377, 30652, 30924, 31194, 31462, 31727, 31991, 32252, 32511, 32768, 33023, 33276, 33527, 33776, 34024, 34270, 34514, 34756, 34996, 35235, 35472, 35708, 35942, 36175, 36406, 36636, 36864, 37091, 37316, 37540, 37763, 37985, 38205, 38424, 38642, 38858, 39073, 39287, 39500, 39712, 39923, 40132, 40341, 40548, 40755, 40960, 41164, 41368, 41570, 41771, 41972, 42171, 42369, 42567, 42763, 42959, 43154, 43348, 43541, 43733, 43925, 44115, 44305, 44494, 44682, 44869, 45056, 45242, 45427, 45611, 45795, 45977, 46160, 46341, 46522, 46702, 46881, 47059, 47237, 47415, 47591, 47767, 47942, 48117, 48291, 48465, 48637, 48809, 48981, 49152, 49322, 49492, 49661, 49830, 49998, 50166, 50332, 50499, 50665, 50830, 50995, 51159, 51323, 51486, 51649, 51811, 51972, 52134, 52294, 52454, 52614, 52773, 52932, 53090, 53248, 53405, 53562, 53719, 53874, 54030, 54185, 54340, 54494, 54647, 54801, 54954, 55106, 55258, 55410, 55561, 55712, 55862, 56012, 56162, 56311, 56459, 56608, 56756, 56903, 57051, 57198, 57344, 57490, 57636, 57781, 57926, 58071, 58215, 58359, 58503, 58646, 58789, 58931, 59073, 59215, 59357, 59498, 59639, 59779, 59919, 60059, 60199, 60338, 60477, 60615, 60753, 60891, 61029, 61166, 61303, 61440, 61576, 61712, 61848, 61984, 62119, 62254, 62388, 62523, 62657, 62790, 62924, 63057, 63190, 63323, 63455, 63587, 63719, 63850, 63982, 64113, 64243, 64374, 64504, 64634, 64763, 64893, 65022, 65151, 65279, 65408};
    }
}
