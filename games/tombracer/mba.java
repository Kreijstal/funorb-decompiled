/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mba extends uq {
    private int field_j;
    static String[] field_g;
    private int field_m;
    private int field_i;
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_n;

    public final int c(byte param0) {
        int discarded$0 = 0;
        if (param0 < 91) {
            discarded$0 = this.e((byte) -93);
            return this.field_e.a(true);
        }
        return this.field_e.a(true);
    }

    private final void h(byte param0) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        int discarded$16 = 0;
        int discarded$17 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (-26 >= (this.field_k ^ -1)) {
          if (50 > this.field_k) {
            this.field_m = 8;
            this.field_m = this.field_m + (2 + this.h(16094)) % 4;
            if (param0 <= 125) {
              discarded$9 = this.c((byte) -70);
              return;
            } else {
              return;
            }
          } else {
            L0: {
              if (this.field_k < 75) {
                this.field_m = 4;
                if (var3 == 0) {
                  break L0;
                } else {
                  this.field_m = 8;
                  this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                  if (param0 <= 125) {
                    discarded$10 = this.c((byte) -70);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                this.field_m = 0;
                if (var3 == 0) {
                  break L0;
                } else {
                  this.field_m = 4;
                  this.field_m = 8;
                  this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                  if (param0 <= 125) {
                    discarded$11 = this.c((byte) -70);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
            this.field_m = this.field_m + (2 + this.h(16094)) % 4;
            if (param0 > 125) {
              return;
            } else {
              discarded$12 = this.c((byte) -70);
              return;
            }
          }
        } else {
          this.field_m = 12;
          if (var3 != 0) {
            if (50 <= this.field_k) {
              L1: {
                if (this.field_k < 75) {
                  break L1;
                } else {
                  this.field_m = 0;
                  if (var3 != 0) {
                    break L1;
                  } else {
                    this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                    if (param0 <= 125) {
                      discarded$13 = this.c((byte) -70);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              this.field_m = 4;
              if (var3 == 0) {
                this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                if (param0 <= 125) {
                  discarded$14 = this.c((byte) -70);
                  return;
                } else {
                  return;
                }
              } else {
                L2: {
                  this.field_m = 8;
                  this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                  if (param0 > 125) {
                    break L2;
                  } else {
                    discarded$15 = this.c((byte) -70);
                    break L2;
                  }
                }
                return;
              }
            } else {
              L3: {
                this.field_m = 8;
                this.field_m = this.field_m + (2 + this.h(16094)) % 4;
                if (param0 > 125) {
                  break L3;
                } else {
                  discarded$16 = this.c((byte) -70);
                  break L3;
                }
              }
              return;
            }
          } else {
            this.field_m = this.field_m + (2 + this.h(16094)) % 4;
            if (param0 <= 125) {
              discarded$17 = this.c((byte) -70);
              return;
            } else {
              return;
            }
          }
        }
    }

    final void g(byte param0) {
        int var2 = 0;
        int var3 = 0;
        uq var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (0 != this.h(16094)) {
          var2 = this.field_e.c((byte) 106) / 2 * 2;
          var3 = this.field_e.f(116) / 2 * 2;
          var4 = this.field_e.a(18641).a(25, var2, var3).b((byte) -95);
          if (!(var4 instanceof mba)) {
            L0: {
              this.field_m = -1;
              this.field_n = 0;
              this.field_i = -1;
              var2 = this.field_h;
              if (var2 != 0) {
                if (var2 == 1) {
                  break L0;
                } else {
                  if (param0 <= -31) {
                    return;
                  } else {
                    this.g(97);
                    return;
                  }
                }
              } else {
                if (var5 == 0) {
                  this.f((byte) -84);
                  if (var5 == 0) {
                    if (param0 <= -31) {
                      return;
                    } else {
                      this.g(97);
                      return;
                    }
                  } else {
                    break L0;
                  }
                } else {
                  if (var2 == 1) {
                    this.a((byte) -93);
                    if (param0 > -31) {
                      this.g(97);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 > -31) {
                      this.g(97);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
            this.a((byte) -93);
            if (param0 <= -31) {
              return;
            } else {
              this.g(97);
              return;
            }
          } else {
            L1: {
              L2: {
                L3: {
                  this.field_k = ((mba) ((Object) var4)).field_k;
                  this.field_m = -1;
                  this.field_n = 0;
                  this.field_i = -1;
                  var2 = this.field_h;
                  if (var2 != 0) {
                    break L3;
                  } else {
                    if (var5 == 0) {
                      this.f((byte) -84);
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                if (var2 == 1) {
                  break L2;
                } else {
                  break L1;
                }
              }
              this.a((byte) -93);
              break L1;
            }
            if (param0 > -31) {
              this.g(97);
              return;
            } else {
              return;
            }
          }
        } else {
          this.field_k = this.a(10685).e(true).a(100, 0);
          if (var5 != 0) {
            var2 = this.field_e.c((byte) 106) / 2 * 2;
            var3 = this.field_e.f(116) / 2 * 2;
            var4 = this.field_e.a(18641).a(25, var2, var3).b((byte) -95);
            if (!(var4 instanceof mba)) {
              this.field_m = -1;
              this.field_n = 0;
              this.field_i = -1;
              var2 = this.field_h;
              if (var2 == 0) {
                if (var5 == 0) {
                  this.f((byte) -84);
                  if (var5 == 0) {
                    L4: {
                      if (param0 <= -31) {
                        break L4;
                      } else {
                        this.g(97);
                        break L4;
                      }
                    }
                    return;
                  } else {
                    this.a((byte) -93);
                    L5: {
                      if (param0 <= -31) {
                        break L5;
                      } else {
                        this.g(97);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  if (var2 != 1) {
                    L6: {
                      if (param0 <= -31) {
                        break L6;
                      } else {
                        this.g(97);
                        break L6;
                      }
                    }
                    return;
                  } else {
                    this.a((byte) -93);
                    L7: {
                      if (param0 <= -31) {
                        break L7;
                      } else {
                        this.g(97);
                        break L7;
                      }
                    }
                    return;
                  }
                }
              } else {
                L8: {
                  if (var2 == 1) {
                    this.a((byte) -93);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (param0 <= -31) {
                    break L9;
                  } else {
                    this.g(97);
                    break L9;
                  }
                }
                return;
              }
            } else {
              L10: {
                L11: {
                  L12: {
                    this.field_k = ((mba) ((Object) var4)).field_k;
                    this.field_m = -1;
                    this.field_n = 0;
                    this.field_i = -1;
                    var2 = this.field_h;
                    if (var2 != 0) {
                      break L12;
                    } else {
                      if (var5 == 0) {
                        this.f((byte) -84);
                        if (var5 == 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      } else {
                        break L12;
                      }
                    }
                  }
                  if (var2 == 1) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
                this.a((byte) -93);
                break L10;
              }
              L13: {
                if (param0 <= -31) {
                  break L13;
                } else {
                  this.g(97);
                  break L13;
                }
              }
              return;
            }
          } else {
            this.field_m = -1;
            this.field_n = 0;
            this.field_i = -1;
            var2 = this.field_h;
            if (var2 != 0) {
              if (var2 != 1) {
                L14: {
                  if (param0 <= -31) {
                    break L14;
                  } else {
                    this.g(97);
                    break L14;
                  }
                }
                return;
              } else {
                L15: {
                  this.a((byte) -93);
                  if (param0 <= -31) {
                    break L15;
                  } else {
                    this.g(97);
                    break L15;
                  }
                }
                return;
              }
            } else {
              if (var5 == 0) {
                this.f((byte) -84);
                if (var5 == 0) {
                  if (param0 > -31) {
                    this.g(97);
                    return;
                  } else {
                    return;
                  }
                } else {
                  L16: {
                    this.a((byte) -93);
                    if (param0 <= -31) {
                      break L16;
                    } else {
                      this.g(97);
                      break L16;
                    }
                  }
                  return;
                }
              } else {
                L17: {
                  if (var2 == 1) {
                    this.a((byte) -93);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0 <= -31) {
                    break L18;
                  } else {
                    this.g(97);
                    break L18;
                  }
                }
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          this.h((byte) -116);
          this.field_l = sw.a(this.field_l, 6);
          this.g((byte) -49);
          return;
        } else {
          this.field_l = sw.a(this.field_l, 6);
          this.g((byte) -49);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        if (param0 == -84) {
          var2 = this.field_e.field_h;
          if (0 == var2) {
            this.h((byte) 127);
            if (TombRacer.field_G) {
              this.b(false);
              return;
            } else {
              return;
            }
          } else {
            if ((var2 ^ -1) != -2) {
              return;
            } else {
              this.b(false);
              return;
            }
          }
        } else {
          this.field_h = 93;
          var2 = this.field_e.field_h;
          if (0 == var2) {
            this.h((byte) 127);
            if (TombRacer.field_G) {
              this.b(false);
              return;
            } else {
              return;
            }
          } else {
            if ((var2 ^ -1) == -2) {
              this.b(false);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != -1) {
            field_g = (String[]) null;
        }
    }

    private final int h(int param0) {
        if (param0 != 16094) {
          field_g = (String[]) null;
          return this.field_e.c((byte) 102) % 2 - -(2 * (this.field_e.f(-77) % 2));
        } else {
          return this.field_e.c((byte) 102) % 2 - -(2 * (this.field_e.f(-77) % 2));
        }
    }

    public final void a(int param0, iq param1) {
        int discarded$1 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        pca var12 = null;
        pca var13 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              var3_int = this.field_e.c((byte) 83);
              var4 = this.field_e.f(111);
              var5 = this.field_e.a(18641).c(31);
              if (param0 >= 103) {
                break L1;
              } else {
                discarded$1 = this.c((byte) 39);
                break L1;
              }
            }
            var6 = 4;
            var7 = var5 - 5;
            if (var6 <= var4) {
              if (var4 >= var7) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L2: {
                  var8 = this.field_e.a((byte) -104);
                  var9 = this.field_e.a(true);
                  if (!this.field_e.b(false)) {
                    L3: {
                      if (-1 != this.field_m) {
                        gqa.a(0, -83584144, var9, var8, gca.field_g[this.field_m], 0);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    if (!hb.d(43)) {
                      break L2;
                    } else {
                      if ((this.field_i ^ -1) != 0) {
                        gqa.a(this.field_n, -83584144, var9, var8, gca.field_g[this.field_i], 0);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  if (hb.d(-81)) {
                    L5: {
                      if (var4 != var6 + 1) {
                        break L5;
                      } else {
                        if (0 >= var3_int) {
                          break L5;
                        } else {
                          if ((var3_int % 2 ^ -1) != -2) {
                            break L5;
                          } else {
                            var12 = this.field_e.a(18641).a(-104, var3_int + -1, var4);
                            if (var12 == null) {
                              break L5;
                            } else {
                              L6: {
                                if (!this.field_e.b(false)) {
                                  break L6;
                                } else {
                                  if (!var12.b(false)) {
                                    break L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              var11 = this.field_e.a(18641).d(-30551) / 2;
                              gqa.a(1024, -83584144, -var11 + var9, var8 + -var11, gca.field_g[25], 65536);
                              break L5;
                            }
                          }
                        }
                      }
                    }
                    if (-1 + var7 != var4) {
                      break L4;
                    } else {
                      if (-1 <= (var3_int ^ -1)) {
                        break L4;
                      } else {
                        if (1 != var3_int % 2) {
                          break L4;
                        } else {
                          var13 = this.field_e.a(18641).a(-100, var3_int - 1, var4);
                          if (var13 == null) {
                            break L4;
                          } else {
                            L7: {
                              if (!this.field_e.b(false)) {
                                break L7;
                              } else {
                                if (var13.b(false)) {
                                  break L4;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            var11 = this.field_e.a(18641).d(-30551) / 2;
                            gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                            break L4;
                          }
                        }
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("mba.DB(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L8;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final boolean d(byte param0) {
        if (param0 != 48) {
            return false;
        }
        return false;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.field_m = -69;
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            this.field_h = -55;
            return 0;
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = -111 % ((-23 - param0) / 53);
        return this.field_e.a((byte) -104);
    }

    private final void a(byte param0) {
        boolean discarded$1 = false;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          this.h((byte) 126);
          if (param0 <= -83) {
            break L0;
          } else {
            discarded$1 = this.c(-10);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = this.field_j;
            if (0 == var2) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        var2 = this.field_l;
                        if (var2 != 0) {
                          break L7;
                        } else {
                          if (var3 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      if (var2 == 4) {
                        break L5;
                      } else {
                        L8: {
                          if (-7 != (var2 ^ -1)) {
                            break L8;
                          } else {
                            if (var3 == 0) {
                              break L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                        if (2 != var2) {
                          break L3;
                        } else {
                          if (var3 == 0) {
                            this.field_n = 0;
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    this.field_n = -512;
                    if (var3 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                  this.field_n = 512;
                  if (var3 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                this.field_n = 1024;
                if (var3 == 0) {
                  break L3;
                } else {
                  this.field_n = 0;
                  break L3;
                }
              }
              this.field_i = 18;
              if (var3 != 0) {
                break L2;
              } else {
                return;
              }
            } else {
              if (var2 == 1) {
                break L2;
              } else {
                if (-3 == (var2 ^ -1)) {
                  break L1;
                } else {
                  return;
                }
              }
            }
          }
          L9: {
            L10: {
              var2 = this.field_l;
              if (-4 != (var2 ^ -1)) {
                break L10;
              } else {
                if (var3 == 0) {
                  this.field_n = 1024;
                  if (var3 != 0) {
                    break L9;
                  } else {
                    this.field_i = 20;
                    return;
                  }
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if ((var2 ^ -1) != -6) {
                break L11;
              } else {
                if (var3 == 0) {
                  break L9;
                } else {
                  break L11;
                }
              }
            }
            L12: {
              if (-2 != (var2 ^ -1)) {
                break L12;
              } else {
                if (var3 == 0) {
                  this.field_n = 512;
                  if (var3 == 0) {
                    this.field_i = 20;
                    if (var3 == 0) {
                      return;
                    } else {
                      break L1;
                    }
                  } else {
                    this.field_n = 0;
                    this.field_i = 20;
                    if (var3 == 0) {
                      return;
                    } else {
                      var2 = this.field_l;
                      if (-4 != (var2 ^ -1)) {
                        if (-6 == (var2 ^ -1)) {
                          this.field_n = 512;
                          if (var3 == 0) {
                            this.field_i = 19;
                            return;
                          } else {
                            this.field_n = -512;
                            this.field_n = 1024;
                            this.field_i = 19;
                            return;
                          }
                        } else {
                          if (-2 == (var2 ^ -1)) {
                            this.field_n = -512;
                            if (var3 == 0) {
                              this.field_i = 19;
                              return;
                            } else {
                              this.field_n = 1024;
                              this.field_i = 19;
                              return;
                            }
                          } else {
                            if ((var2 ^ -1) == -8) {
                              this.field_n = 1024;
                              this.field_i = 19;
                              return;
                            } else {
                              this.field_i = 19;
                              return;
                            }
                          }
                        }
                      } else {
                        L13: {
                          if (-6 == (var2 ^ -1)) {
                            this.field_n = 512;
                            if (var3 == 0) {
                              this.field_i = 19;
                              return;
                            } else {
                              break L13;
                            }
                          } else {
                            if (-2 == (var2 ^ -1)) {
                              break L13;
                            } else {
                              if ((var2 ^ -1) == -8) {
                                this.field_n = 1024;
                                this.field_i = 19;
                                return;
                              } else {
                                this.field_i = 19;
                                return;
                              }
                            }
                          }
                        }
                        this.field_n = -512;
                        if (var3 == 0) {
                          this.field_i = 19;
                          return;
                        } else {
                          this.field_n = 1024;
                          this.field_i = 19;
                          return;
                        }
                      }
                    }
                  }
                } else {
                  break L12;
                }
              }
            }
            if ((var2 ^ -1) == -8) {
              this.field_n = 0;
              this.field_i = 20;
              if (var3 != 0) {
                var2 = this.field_l;
                if (-4 != (var2 ^ -1)) {
                  if (-6 == (var2 ^ -1)) {
                    this.field_n = 512;
                    if (var3 != 0) {
                      this.field_n = -512;
                      this.field_n = 1024;
                      this.field_i = 19;
                      return;
                    } else {
                      this.field_i = 19;
                      return;
                    }
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      this.field_n = -512;
                      if (var3 == 0) {
                        this.field_i = 19;
                        return;
                      } else {
                        this.field_n = 1024;
                        this.field_i = 19;
                        return;
                      }
                    } else {
                      if ((var2 ^ -1) == -8) {
                        this.field_n = 1024;
                        this.field_i = 19;
                        return;
                      } else {
                        this.field_i = 19;
                        return;
                      }
                    }
                  }
                } else {
                  L14: {
                    if (-6 == (var2 ^ -1)) {
                      this.field_n = 512;
                      if (var3 != 0) {
                        break L14;
                      } else {
                        this.field_i = 19;
                        return;
                      }
                    } else {
                      if (-2 == (var2 ^ -1)) {
                        break L14;
                      } else {
                        if ((var2 ^ -1) == -8) {
                          this.field_n = 1024;
                          this.field_i = 19;
                          return;
                        } else {
                          this.field_i = 19;
                          return;
                        }
                      }
                    }
                  }
                  this.field_n = -512;
                  if (var3 != 0) {
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_i = 19;
                    return;
                  }
                }
              } else {
                return;
              }
            } else {
              this.field_i = 20;
              if (var3 != 0) {
                L15: {
                  var2 = this.field_l;
                  if (-4 != (var2 ^ -1)) {
                    break L15;
                  } else {
                    break L15;
                  }
                }
                if (-6 == (var2 ^ -1)) {
                  this.field_n = 512;
                  if (var3 != 0) {
                    this.field_n = -512;
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_i = 19;
                    return;
                  }
                } else {
                  if (-2 != (var2 ^ -1)) {
                    if ((var2 ^ -1) == -8) {
                      this.field_n = 1024;
                      this.field_i = 19;
                      return;
                    } else {
                      this.field_i = 19;
                      return;
                    }
                  } else {
                    this.field_n = -512;
                    if (var3 == 0) {
                      this.field_i = 19;
                      return;
                    } else {
                      this.field_n = 1024;
                      this.field_i = 19;
                      return;
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
          this.field_n = -512;
          if (var3 != 0) {
            L16: {
              this.field_n = 512;
              if (var3 == 0) {
                break L16;
              } else {
                this.field_n = 0;
                break L16;
              }
            }
            this.field_i = 20;
            if (var3 != 0) {
              L17: {
                var2 = this.field_l;
                if (-4 != (var2 ^ -1)) {
                  break L17;
                } else {
                  break L17;
                }
              }
              if (-6 == (var2 ^ -1)) {
                this.field_n = 512;
                if (var3 != 0) {
                  this.field_n = -512;
                  this.field_n = 1024;
                  this.field_i = 19;
                  return;
                } else {
                  this.field_i = 19;
                  return;
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  this.field_n = -512;
                  if (var3 != 0) {
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_i = 19;
                    return;
                  }
                } else {
                  if ((var2 ^ -1) == -8) {
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_i = 19;
                    return;
                  }
                }
              }
            } else {
              return;
            }
          } else {
            this.field_i = 20;
            return;
          }
        }
        L18: {
          var2 = this.field_l;
          if (-4 != (var2 ^ -1)) {
            if (-6 == (var2 ^ -1)) {
              break L18;
            } else {
              if (-2 == (var2 ^ -1)) {
                this.field_n = -512;
                if (var3 == 0) {
                  this.field_i = 19;
                  return;
                } else {
                  this.field_n = 1024;
                  this.field_i = 19;
                  return;
                }
              } else {
                if ((var2 ^ -1) == -8) {
                  this.field_n = 1024;
                  this.field_i = 19;
                  return;
                } else {
                  this.field_i = 19;
                  return;
                }
              }
            }
          } else {
            if (var3 == 0) {
              this.field_n = 0;
              if (var3 == 0) {
                this.field_i = 19;
                return;
              } else {
                break L18;
              }
            } else {
              if (-6 == (var2 ^ -1)) {
                this.field_n = 512;
                if (var3 == 0) {
                  this.field_i = 19;
                  return;
                } else {
                  this.field_n = -512;
                  this.field_n = 1024;
                  this.field_i = 19;
                  return;
                }
              } else {
                if (-2 == (var2 ^ -1)) {
                  this.field_n = -512;
                  if (var3 == 0) {
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  }
                } else {
                  if ((var2 ^ -1) == -8) {
                    this.field_n = 1024;
                    this.field_i = 19;
                    return;
                  } else {
                    this.field_i = 19;
                    return;
                  }
                }
              }
            }
          }
        }
        this.field_n = 512;
        if (var3 == 0) {
          this.field_i = 19;
          return;
        } else {
          this.field_n = -512;
          this.field_n = 1024;
          this.field_i = 19;
          return;
        }
    }

    final static boolean e(int param0) {
        boolean discarded$2 = false;
        lqa var1 = null;
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        if (param0 == -22766) {
          var1 = uv.b(false);
          if (var1 == null) {
            return false;
          } else {
            L0: {
              L1: {
                if (jc.field_M) {
                  break L1;
                } else {
                  if (!var1.field_k) {
                    break L1;
                  } else {
                    stackOut_12_0 = 1;
                    stackIn_14_0 = stackOut_12_0;
                    break L0;
                  }
                }
              }
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
            return stackIn_14_0 != 0;
          }
        } else {
          discarded$2 = mba.e(85);
          var1 = uv.b(false);
          if (var1 != null) {
            if (!jc.field_M) {
              if (!var1.field_k) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final void g(int param0) {
        this.field_h = 0;
        if (param0 != -23801) {
            this.a((byte) 74);
        }
    }

    private final void b(boolean param0) {
        if (-51 >= (this.field_k ^ -1)) {
          this.field_m = 17;
          if (!param0) {
            return;
          } else {
            this.h((byte) -45);
            return;
          }
        } else {
          this.field_m = 16;
          if (!TombRacer.field_G) {
            if (param0) {
              this.h((byte) -45);
              return;
            } else {
              return;
            }
          } else {
            this.field_m = 17;
            if (!param0) {
              return;
            } else {
              this.h((byte) -45);
              return;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != 73) {
          this.a((byte) -40);
          this.field_h = param0;
          this.field_j = param2;
          this.field_l = param1;
          return;
        } else {
          this.field_h = param0;
          this.field_j = param2;
          this.field_l = param1;
          return;
        }
    }

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -2) {
          L0: {
            this.a((byte) -97);
            if ((this.field_e.field_h ^ -1) != -2) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((this.field_e.field_h ^ -1) != -2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    mba() {
    }

    static {
    }
}
