/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class haa extends kj {
    private int field_g;
    private boolean field_f;

    final boolean b(int param0) {
        if (20 == this.field_g) {
            jja.a(48, -1, 41);
        }
        int fieldTemp$0 = this.field_g - 1;
        this.field_g = this.field_g - 1;
        if (-1 < (fieldTemp$0 ^ -1)) {
            this.field_e.field_h.b((byte) -72, 38, this.field_d, this.field_c);
            this.field_e.field_h.field_a[this.field_d][this.field_c].field_j = this.field_f ? 1 : 0;
            return true;
        }
        if (param0 < 21) {
            this.field_f = true;
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            this.field_g = -66;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            return;
        }
        int var4 = this.field_d * this.field_c % 3;
        ee var5 = cba.field_c[var4];
        int var6 = via.a(6 * this.field_g * (13 + (15 & this.field_d * 3 - -(this.field_c * 4))), (byte) 118) >> -584075037;
        var5.a(var5.field_a << 1544289283, -40 + var5.field_b << 1008991907, ((param2 << 1117444833) + 128 << -1022495549) + (-var6 >> -1805461020), 64 + (param0 - (2 * this.field_g + 20) << 1221328737) << -1174373117, var6, 4096);
    }

    haa(gj param0, int param1, int param2, boolean param3) {
        super(param0, param1, param2);
        try {
            this.field_f = param3 ? true : false;
            this.field_g = 150;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "haa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static int[][] b(int param0, int param1, int param2) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[][] var7 = null;
        int[][] var8 = null;
        var6 = BachelorFridge.field_y;
        if (param0 == 1) {
          var8 = new int[17][17];
          var7 = var8;
          var3 = var7;
          var4 = 0;
          L0: while (true) {
            if (var4 >= 17) {
              L1: {
                var8[8][8] = 0;
                if (param1 != 0) {
                  if (param1 != 1) {
                    if (2 != param1) {
                      if (param1 == 3) {
                        if (param2 != 2) {
                          if (param2 != 1) {
                            if (4 == param2) {
                              var4 = 12;
                              L2: while (true) {
                                if (var4 > 14) {
                                  var8[13][7] = 1;
                                  var8[13][9] = 1;
                                  break L1;
                                } else {
                                  var8[var4][8] = 1;
                                  var4++;
                                  continue L2;
                                }
                              }
                            } else {
                              if (3 != param2) {
                                break L1;
                              } else {
                                var4 = 12;
                                L3: while (true) {
                                  if (var4 > 14) {
                                    var8[7][13] = 1;
                                    var8[9][13] = 1;
                                    break L1;
                                  } else {
                                    var8[8][var4] = 1;
                                    var4++;
                                    continue L3;
                                  }
                                }
                              }
                            }
                          } else {
                            var4 = 4;
                            L4: while (true) {
                              if (2 > var4) {
                                var8[7][3] = 1;
                                var8[9][3] = 1;
                                break L1;
                              } else {
                                var8[8][var4] = 1;
                                var4--;
                                continue L4;
                              }
                            }
                          }
                        } else {
                          var4 = 4;
                          L5: while (true) {
                            if (var4 < 2) {
                              var8[3][7] = 1;
                              var8[3][9] = 1;
                              break L1;
                            } else {
                              var8[var4][8] = 1;
                              var4--;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        if (4 == param1) {
                          var8[8][7] = 1;
                          var8[7][8] = 1;
                          var8[8][9] = 1;
                          var8[9][8] = 1;
                          break L1;
                        } else {
                          if (5 != param1) {
                            if (param1 == 19) {
                              var8[7][7] = 1;
                              var8[8][7] = 1;
                              var8[7][8] = 1;
                              var8[9][7] = 1;
                              var8[9][8] = 1;
                              var8[7][9] = 1;
                              var8[8][9] = 1;
                              var8[9][9] = 1;
                              break L1;
                            } else {
                              if (param1 != 6) {
                                if (param1 != 7) {
                                  if (param1 != 8) {
                                    if (param1 != 9) {
                                      if (param1 == 10) {
                                        if (param2 == 2) {
                                          var8[4][9] = 1;
                                          var8[3][8] = 1;
                                          var8[4][7] = 1;
                                          var8[5][8] = 1;
                                          break L1;
                                        } else {
                                          if (param2 == 4) {
                                            var8[12][9] = 1;
                                            var8[11][8] = 1;
                                            var8[12][7] = 1;
                                            var8[13][8] = 1;
                                            break L1;
                                          } else {
                                            if (1 == param2) {
                                              var8[7][4] = 1;
                                              var8[8][5] = 1;
                                              var8[8][3] = 1;
                                              var8[9][4] = 1;
                                              break L1;
                                            } else {
                                              if (param2 != 3) {
                                                break L1;
                                              } else {
                                                var8[8][11] = 1;
                                                var8[7][12] = 1;
                                                var8[8][13] = 1;
                                                var8[9][12] = 1;
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (param1 == 11) {
                                          if (param2 != 2) {
                                            if (param2 != 4) {
                                              if (param2 == 1) {
                                                var8[7][3] = 1;
                                                var8[6][3] = 1;
                                                var8[9][3] = 1;
                                                var8[8][4] = 1;
                                                var8[8][1] = 1;
                                                var8[8][5] = 1;
                                                var8[10][3] = 1;
                                                var8[8][2] = 1;
                                                var8[7][2] = 1;
                                                var8[7][4] = 1;
                                                var8[9][2] = 1;
                                                var8[9][4] = 1;
                                                break L1;
                                              } else {
                                                if (param2 != 3) {
                                                  break L1;
                                                } else {
                                                  var8[7][13] = 1;
                                                  var8[6][13] = 1;
                                                  var8[9][13] = 1;
                                                  var8[8][12] = 1;
                                                  var8[10][13] = 1;
                                                  var8[8][14] = 1;
                                                  var8[8][15] = 1;
                                                  var8[8][11] = 1;
                                                  var8[7][12] = 1;
                                                  var8[9][12] = 1;
                                                  var8[7][14] = 1;
                                                  var8[9][14] = 1;
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              var8[13][6] = 1;
                                              var8[12][8] = 1;
                                              var8[13][10] = 1;
                                              var8[13][7] = 1;
                                              var8[13][9] = 1;
                                              var8[11][8] = 1;
                                              var8[14][8] = 1;
                                              var8[12][9] = 1;
                                              var8[15][8] = 1;
                                              var8[12][7] = 1;
                                              var8[14][7] = 1;
                                              var8[14][9] = 1;
                                              break L1;
                                            }
                                          } else {
                                            var8[3][9] = 1;
                                            var8[3][10] = 1;
                                            var8[3][6] = 1;
                                            var8[3][7] = 1;
                                            var8[2][8] = 1;
                                            var8[1][8] = 1;
                                            var8[4][8] = 1;
                                            var8[5][8] = 1;
                                            var8[2][7] = 1;
                                            var8[2][9] = 1;
                                            var8[4][9] = 1;
                                            var8[4][7] = 1;
                                            break L1;
                                          }
                                        } else {
                                          if (20 == param1) {
                                            var8[8][7] = 1;
                                            var8[8][9] = 1;
                                            var8[7][8] = 1;
                                            var8[9][8] = 1;
                                            var8[8][8] = 1;
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    } else {
                                      if (param2 != 2) {
                                        if (param2 != 1) {
                                          if (param2 != 4) {
                                            if (param2 == 3) {
                                              var4 = 9;
                                              L6: while (true) {
                                                if (var4 > 15) {
                                                  break L1;
                                                } else {
                                                  var8[8][var4] = 1;
                                                  var4++;
                                                  continue L6;
                                                }
                                              }
                                            } else {
                                              break L1;
                                            }
                                          } else {
                                            var4 = 9;
                                            L7: while (true) {
                                              if (var4 > 15) {
                                                break L1;
                                              } else {
                                                var8[var4][8] = 1;
                                                var4++;
                                                continue L7;
                                              }
                                            }
                                          }
                                        } else {
                                          var4 = 7;
                                          L8: while (true) {
                                            if (1 > var4) {
                                              break L1;
                                            } else {
                                              var8[8][var4] = 1;
                                              var4--;
                                              continue L8;
                                            }
                                          }
                                        }
                                      } else {
                                        var4 = 7;
                                        L9: while (true) {
                                          if (1 > var4) {
                                            break L1;
                                          } else {
                                            var8[var4][8] = 1;
                                            var4--;
                                            continue L9;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (param2 != 2) {
                                      if (param2 != 1) {
                                        if (param2 == 4) {
                                          var4 = 9;
                                          L10: while (true) {
                                            if (var4 > 12) {
                                              break L1;
                                            } else {
                                              var8[var4][8] = 1;
                                              var4++;
                                              continue L10;
                                            }
                                          }
                                        } else {
                                          if (param2 == 3) {
                                            var4 = 9;
                                            L11: while (true) {
                                              if (var4 > 12) {
                                                break L1;
                                              } else {
                                                var8[8][var4] = 1;
                                                var4++;
                                                continue L11;
                                              }
                                            }
                                          } else {
                                            break L1;
                                          }
                                        }
                                      } else {
                                        var4 = 7;
                                        L12: while (true) {
                                          if (var4 < 4) {
                                            break L1;
                                          } else {
                                            var8[8][var4] = 1;
                                            var4--;
                                            continue L12;
                                          }
                                        }
                                      }
                                    } else {
                                      var4 = 7;
                                      L13: while (true) {
                                        if (4 > var4) {
                                          break L1;
                                        } else {
                                          var8[var4][8] = 1;
                                          var4--;
                                          continue L13;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  if (2 == param2) {
                                    var8[7][8] = 1;
                                    var8[7][7] = 1;
                                    var8[7][9] = 1;
                                    break L1;
                                  } else {
                                    if (param2 == 1) {
                                      var8[8][7] = 1;
                                      var8[7][7] = 1;
                                      var8[9][7] = 1;
                                      break L1;
                                    } else {
                                      if (param2 == 4) {
                                        var8[9][8] = 1;
                                        var8[9][7] = 1;
                                        var8[9][9] = 1;
                                        break L1;
                                      } else {
                                        if (param2 != 3) {
                                          break L1;
                                        } else {
                                          var8[8][9] = 1;
                                          var8[7][9] = 1;
                                          var8[9][9] = 1;
                                          break L1;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (param2 == 2) {
                                  var8[7][8] = 1;
                                  var8[6][8] = 1;
                                  var8[6][9] = 1;
                                  var8[5][8] = 1;
                                  var8[6][7] = 1;
                                  var8[5][10] = 1;
                                  var8[5][7] = 1;
                                  var8[5][9] = 1;
                                  var8[5][6] = 1;
                                  break L1;
                                } else {
                                  if (1 != param2) {
                                    if (param2 == 4) {
                                      var8[9][8] = 1;
                                      var8[10][8] = 1;
                                      var8[11][8] = 1;
                                      var8[10][7] = 1;
                                      var8[10][9] = 1;
                                      var8[11][10] = 1;
                                      var8[11][6] = 1;
                                      var8[11][9] = 1;
                                      var8[11][7] = 1;
                                      break L1;
                                    } else {
                                      if (param2 == 3) {
                                        var8[8][9] = 1;
                                        var8[8][10] = 1;
                                        var8[8][11] = 1;
                                        var8[7][10] = 1;
                                        var8[7][11] = 1;
                                        var8[9][10] = 1;
                                        var8[6][11] = 1;
                                        var8[9][11] = 1;
                                        var8[10][11] = 1;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    var8[8][6] = 1;
                                    var8[8][7] = 1;
                                    var8[8][5] = 1;
                                    var8[7][6] = 1;
                                    var8[9][6] = 1;
                                    var8[7][5] = 1;
                                    var8[6][5] = 1;
                                    var8[9][5] = 1;
                                    var8[10][5] = 1;
                                    break L1;
                                  }
                                }
                              }
                            }
                          } else {
                            var8[8][7] = 1;
                            var8[8][10] = 1;
                            var8[7][8] = 1;
                            var8[8][9] = 1;
                            var8[8][6] = 1;
                            var8[6][8] = 1;
                            var8[9][8] = 1;
                            var8[7][9] = 1;
                            var8[10][8] = 1;
                            var8[7][7] = 1;
                            var8[9][7] = 1;
                            var8[9][9] = 1;
                            break L1;
                          }
                        }
                      }
                    } else {
                      if (2 == param2) {
                        var4 = 4;
                        L14: while (true) {
                          if (var4 < 0) {
                            break L1;
                          } else {
                            var8[var4][8] = 1;
                            var4--;
                            continue L14;
                          }
                        }
                      } else {
                        if (param2 != 1) {
                          if (param2 == 4) {
                            var4 = 12;
                            L15: while (true) {
                              if (var4 > 16) {
                                break L1;
                              } else {
                                var8[var4][8] = 1;
                                var4++;
                                continue L15;
                              }
                            }
                          } else {
                            if (param2 != 3) {
                              break L1;
                            } else {
                              var4 = 12;
                              L16: while (true) {
                                if (var4 > 16) {
                                  break L1;
                                } else {
                                  var8[8][var4] = 1;
                                  var4++;
                                  continue L16;
                                }
                              }
                            }
                          }
                        } else {
                          var4 = 4;
                          L17: while (true) {
                            if (0 > var4) {
                              break L1;
                            } else {
                              var8[8][var4] = 1;
                              var4--;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    if (param2 != 2) {
                      if (1 != param2) {
                        if (param2 == 4) {
                          var4 = 11;
                          L18: while (true) {
                            if (var4 > 13) {
                              break L1;
                            } else {
                              var8[var4][8] = 1;
                              var4++;
                              continue L18;
                            }
                          }
                        } else {
                          if (param2 == 3) {
                            var4 = 11;
                            L19: while (true) {
                              if (var4 > 13) {
                                break L1;
                              } else {
                                var8[8][var4] = 1;
                                var4++;
                                continue L19;
                              }
                            }
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        var4 = 5;
                        L20: while (true) {
                          if (3 > var4) {
                            break L1;
                          } else {
                            var8[8][var4] = 1;
                            var4--;
                            continue L20;
                          }
                        }
                      }
                    } else {
                      var4 = 5;
                      L21: while (true) {
                        if (var4 < 3) {
                          break L1;
                        } else {
                          var8[var4][8] = 1;
                          var4--;
                          continue L21;
                        }
                      }
                    }
                  }
                } else {
                  if (param2 != 2) {
                    if (param2 != 1) {
                      if (param2 != 4) {
                        if (3 != param2) {
                          break L1;
                        } else {
                          var8[8][9] = 1;
                          break L1;
                        }
                      } else {
                        var8[9][8] = 1;
                        break L1;
                      }
                    } else {
                      var8[8][7] = 1;
                      break L1;
                    }
                  } else {
                    var8[7][8] = 1;
                    break L1;
                  }
                }
              }
              return var3;
            } else {
              var5 = 0;
              L22: while (true) {
                if (17 <= var5) {
                  var4++;
                  continue L0;
                } else {
                  var8[var4][var5] = -1;
                  var5++;
                  continue L22;
                }
              }
            }
          }
        } else {
          return (int[][]) null;
        }
    }

    static {
    }
}
