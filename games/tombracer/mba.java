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
        if (param0 < 91) {
            int discarded$0 = ((mba) this).e((byte) -93);
            return ((mba) this).field_e.a(true);
        }
        return ((mba) this).field_e.a(true);
    }

    private final void h(byte param0) {
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        if (-26 >= (((mba) this).field_k ^ -1)) {
          if (50 > ((mba) this).field_k) {
            ((mba) this).field_m = 8;
            ((mba) this).field_m = ((mba) this).field_m + (2 + this.h(16094)) % 4;
            if (param0 <= 125) {
              int discarded$4 = ((mba) this).c((byte) -70);
              return;
            } else {
              return;
            }
          } else {
            if (((mba) this).field_k < 75) {
              ((mba) this).field_m = 4;
              ((mba) this).field_m = ((mba) this).field_m + (2 + this.h(16094)) % 4;
              if (param0 <= 125) {
                int discarded$5 = ((mba) this).c((byte) -70);
                return;
              } else {
                return;
              }
            } else {
              ((mba) this).field_m = 0;
              ((mba) this).field_m = ((mba) this).field_m + (2 + this.h(16094)) % 4;
              if (param0 > 125) {
                return;
              } else {
                int discarded$6 = ((mba) this).c((byte) -70);
                return;
              }
            }
          }
        } else {
          ((mba) this).field_m = 12;
          ((mba) this).field_m = ((mba) this).field_m + (2 + this.h(16094)) % 4;
          if (param0 > 125) {
            return;
          } else {
            int discarded$7 = ((mba) this).c((byte) -70);
            return;
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
          var2 = ((mba) this).field_e.c((byte) 106) / 2 * 2;
          var3 = ((mba) this).field_e.f(116) / 2 * 2;
          var4 = ((mba) this).field_e.a(18641).a(25, var2, var3).b((byte) -95);
          if (!(var4 instanceof mba)) {
            ((mba) this).field_m = -1;
            ((mba) this).field_n = 0;
            ((mba) this).field_i = -1;
            var2 = ((mba) this).field_h;
            if (var2 != 0) {
              if (var2 == 1) {
                this.a((byte) -93);
                if (param0 > -31) {
                  ((mba) this).g(97);
                  return;
                } else {
                  return;
                }
              } else {
                if (param0 > -31) {
                  ((mba) this).g(97);
                  return;
                } else {
                  return;
                }
              }
            } else {
              this.f((byte) -84);
              if (param0 > -31) {
                ((mba) this).g(97);
                return;
              } else {
                return;
              }
            }
          } else {
            L0: {
              ((mba) this).field_k = ((mba) (Object) var4).field_k;
              ((mba) this).field_m = -1;
              ((mba) this).field_n = 0;
              ((mba) this).field_i = -1;
              var2 = ((mba) this).field_h;
              if (var2 != 0) {
                if (var2 == 1) {
                  this.a((byte) -93);
                  break L0;
                } else {
                  break L0;
                }
              } else {
                this.f((byte) -84);
                break L0;
              }
            }
            if (param0 <= -31) {
              return;
            } else {
              ((mba) this).g(97);
              return;
            }
          }
        } else {
          L1: {
            ((mba) this).field_k = ((mba) this).a(10685).e(true).a(100, 0);
            ((mba) this).field_m = -1;
            ((mba) this).field_n = 0;
            ((mba) this).field_i = -1;
            var2 = ((mba) this).field_h;
            if (var2 != 0) {
              if (var2 == 1) {
                this.a((byte) -93);
                break L1;
              } else {
                break L1;
              }
            } else {
              this.f((byte) -84);
              break L1;
            }
          }
          if (param0 <= -31) {
            return;
          } else {
            ((mba) this).g(97);
            return;
          }
        }
    }

    final void a(boolean param0) {
        if (!param0) {
          this.h((byte) -116);
          ((mba) this).field_l = sw.a(((mba) this).field_l, 6);
          ((mba) this).g((byte) -49);
          return;
        } else {
          ((mba) this).field_l = sw.a(((mba) this).field_l, 6);
          ((mba) this).g((byte) -49);
          return;
        }
    }

    private final void f(byte param0) {
        int var2 = 0;
        if (param0 == -84) {
          var2 = ((mba) this).field_e.field_h;
          if (0 != var2) {
            if ((var2 ^ -1) != -2) {
              return;
            } else {
              this.b(false);
              return;
            }
          } else {
            this.h((byte) 127);
            return;
          }
        } else {
          ((mba) this).field_h = 93;
          var2 = ((mba) this).field_e.field_h;
          if (0 != var2) {
            if ((var2 ^ -1) != -2) {
              return;
            } else {
              this.b(false);
              return;
            }
          } else {
            this.h((byte) 127);
            return;
          }
        }
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 != -1) {
            field_g = null;
        }
    }

    private final int h(int param0) {
        if (param0 != 16094) {
          field_g = null;
          return ((mba) this).field_e.c((byte) 102) % 2 - -(2 * (((mba) this).field_e.f(-77) % 2));
        } else {
          return ((mba) this).field_e.c((byte) 102) % 2 - -(2 * (((mba) this).field_e.f(-77) % 2));
        }
    }

    public final void a(int param0, iq param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        pca var12 = null;
        pca var14 = null;
        pca var15 = null;
        pca var16 = null;
        pca var17 = null;
        pca var18 = null;
        pca var19 = null;
        pca var20 = null;
        L0: {
          var3 = ((mba) this).field_e.c((byte) 83);
          var4 = ((mba) this).field_e.f(111);
          var5 = ((mba) this).field_e.a(18641).c(31);
          if (param0 >= 103) {
            break L0;
          } else {
            int discarded$1 = ((mba) this).c((byte) 39);
            break L0;
          }
        }
        var6 = 4;
        var7 = var5 - 5;
        if (var6 <= var4) {
          if (var4 >= var7) {
            return;
          } else {
            L1: {
              var8 = ((mba) this).field_e.a((byte) -104);
              var9 = ((mba) this).field_e.a(true);
              if (!((mba) this).field_e.b(false)) {
                L2: {
                  if (-1 != ((mba) this).field_m) {
                    gqa.a(0, -83584144, var9, var8, gca.field_g[((mba) this).field_m], 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                if (!hb.d(43)) {
                  break L1;
                } else {
                  if ((((mba) this).field_i ^ -1) != 0) {
                    gqa.a(((mba) this).field_n, -83584144, var9, var8, gca.field_g[((mba) this).field_i], 0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                break L1;
              }
            }
            if (hb.d(-81)) {
              if (var4 == var6 + 1) {
                if (0 < var3) {
                  if (var3 % 2 == -2) {
                    var12 = ((mba) this).field_e.a(18641).a(-104, var3 + -1, var4);
                    if (var12 != null) {
                      if (!((mba) this).field_e.b(false)) {
                        L3: {
                          var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                          gqa.a(1024, -83584144, -var11 + var9, var8 + -var11, gca.field_g[25], 65536);
                          if (-1 + var7 != var4) {
                            break L3;
                          } else {
                            if (-1 <= (var3 ^ -1)) {
                              break L3;
                            } else {
                              if (1 != var3 % 2) {
                                break L3;
                              } else {
                                var19 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                                if (var19 == null) {
                                  break L3;
                                } else {
                                  if (!((mba) this).field_e.b(false)) {
                                    var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                    gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                    return;
                                  } else {
                                    if (var19.b(false)) {
                                      break L3;
                                    } else {
                                      var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                      gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                      return;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        return;
                      } else {
                        if (!var12.b(false)) {
                          L4: {
                            var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                            gqa.a(1024, -83584144, -var11 + var9, var8 + -var11, gca.field_g[25], 65536);
                            if (-1 + var7 != var4) {
                              break L4;
                            } else {
                              if (-1 <= (var3 ^ -1)) {
                                break L4;
                              } else {
                                if (1 != var3 % 2) {
                                  break L4;
                                } else {
                                  var20 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                                  if (var20 == null) {
                                    break L4;
                                  } else {
                                    if (!((mba) this).field_e.b(false)) {
                                      var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                      gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                      return;
                                    } else {
                                      if (var20.b(false)) {
                                        break L4;
                                      } else {
                                        var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                        gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return;
                        } else {
                          L5: {
                            if (-1 + var7 != var4) {
                              break L5;
                            } else {
                              if (-1 <= (var3 ^ -1)) {
                                break L5;
                              } else {
                                if (1 != var3 % 2) {
                                  break L5;
                                } else {
                                  var18 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                                  if (var18 == null) {
                                    break L5;
                                  } else {
                                    if (!((mba) this).field_e.b(false)) {
                                      var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                      gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                      return;
                                    } else {
                                      if (var18.b(false)) {
                                        break L5;
                                      } else {
                                        var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                        gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                        return;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          return;
                        }
                      }
                    } else {
                      if (-1 + var7 == var4) {
                        if (-1 > (var3 ^ -1)) {
                          if (1 == var3 % 2) {
                            var17 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                            if (var17 != null) {
                              if (!((mba) this).field_e.b(false)) {
                                var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                return;
                              } else {
                                if (var17.b(false)) {
                                  return;
                                } else {
                                  var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                  gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                  return;
                                }
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
                  } else {
                    if (-1 + var7 == var4) {
                      if (-1 < var3) {
                        if (1 == var3 % 2) {
                          var16 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                          if (var16 != null) {
                            if (!((mba) this).field_e.b(false)) {
                              var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                              gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                              return;
                            } else {
                              if (!var16.b(false)) {
                                var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                                gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                                return;
                              } else {
                                return;
                              }
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
                } else {
                  if (-1 + var7 == var4) {
                    if (-1 > (var3 ^ -1)) {
                      if (1 == var3 % 2) {
                        var15 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                        if (var15 != null) {
                          if (((mba) this).field_e.b(false)) {
                            if (var15.b(false)) {
                              return;
                            } else {
                              var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                              gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                              return;
                            }
                          } else {
                            var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                            gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
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
              } else {
                if (-1 + var7 == var4) {
                  if (-1 > (var3 ^ -1)) {
                    if (1 == var3 % 2) {
                      var14 = ((mba) this).field_e.a(18641).a(-100, var3 - 1, var4);
                      if (var14 != null) {
                        if (((mba) this).field_e.b(false)) {
                          if (!var14.b(false)) {
                            var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                            gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          var11 = ((mba) this).field_e.a(18641).d(-30551) / 2;
                          gqa.a(0, -83584144, var9 + -var11, -var11 + var8, gca.field_g[25], 65536);
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
            } else {
              return;
            }
          }
        } else {
          return;
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
            ((mba) this).field_m = -69;
        }
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            ((mba) this).field_h = -55;
            return 0;
        }
        return 0;
    }

    public final int b(byte param0) {
        int var2 = -111 % ((-23 - param0) / 53);
        return ((mba) this).field_e.a((byte) -104);
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        this.h((byte) 126);
        if (param0 > -83) {
          boolean discarded$1 = ((mba) this).c(-10);
          var2 = ((mba) this).field_j;
          if (0 == var2) {
            var2 = ((mba) this).field_l;
            if (var2 != 0) {
              if (var2 == 4) {
                ((mba) this).field_n = 512;
                ((mba) this).field_i = 18;
                return;
              } else {
                if (-7 != var2) {
                  if (2 != var2) {
                    ((mba) this).field_i = 18;
                    return;
                  } else {
                    ((mba) this).field_n = 0;
                    ((mba) this).field_i = 18;
                    return;
                  }
                } else {
                  ((mba) this).field_n = 1024;
                  ((mba) this).field_i = 18;
                  return;
                }
              }
            } else {
              ((mba) this).field_n = -512;
              ((mba) this).field_i = 18;
              return;
            }
          } else {
            if (var2 == 1) {
              var2 = ((mba) this).field_l;
              if (-4 != (var2 ^ -1)) {
                if (var2 != -6) {
                  if (-2 != var2) {
                    if ((var2 ^ -1) != -8) {
                      ((mba) this).field_i = 20;
                      return;
                    } else {
                      ((mba) this).field_n = 0;
                      ((mba) this).field_i = 20;
                      return;
                    }
                  } else {
                    ((mba) this).field_n = 512;
                    ((mba) this).field_i = 20;
                    return;
                  }
                } else {
                  ((mba) this).field_n = -512;
                  ((mba) this).field_i = 20;
                  return;
                }
              } else {
                ((mba) this).field_n = 1024;
                ((mba) this).field_i = 20;
                return;
              }
            } else {
              if (-3 == var2) {
                var2 = ((mba) this).field_l;
                if (-4 != var2) {
                  if (-6 != var2) {
                    if (-2 != (var2 ^ -1)) {
                      if ((var2 ^ -1) != -8) {
                        ((mba) this).field_i = 19;
                        return;
                      } else {
                        ((mba) this).field_n = 1024;
                        ((mba) this).field_i = 19;
                        return;
                      }
                    } else {
                      ((mba) this).field_n = -512;
                      ((mba) this).field_i = 19;
                      return;
                    }
                  } else {
                    ((mba) this).field_n = 512;
                    ((mba) this).field_i = 19;
                    return;
                  }
                } else {
                  ((mba) this).field_n = 0;
                  ((mba) this).field_i = 19;
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L0: {
            var2 = ((mba) this).field_j;
            if (0 == var2) {
              var2 = ((mba) this).field_l;
              if (var2 != 0) {
                if (var2 == 4) {
                  ((mba) this).field_n = 512;
                  ((mba) this).field_i = 18;
                  break L0;
                } else {
                  if (-7 != var2) {
                    if (2 != var2) {
                      ((mba) this).field_i = 18;
                      break L0;
                    } else {
                      ((mba) this).field_n = 0;
                      ((mba) this).field_i = 18;
                      break L0;
                    }
                  } else {
                    ((mba) this).field_n = 1024;
                    ((mba) this).field_i = 18;
                    break L0;
                  }
                }
              } else {
                ((mba) this).field_n = -512;
                ((mba) this).field_i = 18;
                break L0;
              }
            } else {
              if (var2 == 1) {
                L1: {
                  var2 = ((mba) this).field_l;
                  if (-4 != (var2 ^ -1)) {
                    if (var2 != -6) {
                      if (-2 != var2) {
                        if ((var2 ^ -1) == -8) {
                          ((mba) this).field_n = 0;
                          ((mba) this).field_i = 20;
                          return;
                        } else {
                          break L1;
                        }
                      } else {
                        ((mba) this).field_n = 512;
                        break L1;
                      }
                    } else {
                      ((mba) this).field_n = -512;
                      break L1;
                    }
                  } else {
                    ((mba) this).field_n = 1024;
                    break L1;
                  }
                }
                ((mba) this).field_i = 20;
                return;
              } else {
                if (-3 == var2) {
                  var2 = ((mba) this).field_l;
                  if (-4 != var2) {
                    if (-6 != var2) {
                      if (-2 != (var2 ^ -1)) {
                        if ((var2 ^ -1) != -8) {
                          ((mba) this).field_i = 19;
                          return;
                        } else {
                          ((mba) this).field_n = 1024;
                          ((mba) this).field_i = 19;
                          return;
                        }
                      } else {
                        ((mba) this).field_n = -512;
                        ((mba) this).field_i = 19;
                        return;
                      }
                    } else {
                      ((mba) this).field_n = 512;
                      ((mba) this).field_i = 19;
                      return;
                    }
                  } else {
                    ((mba) this).field_n = 0;
                    ((mba) this).field_i = 19;
                    return;
                  }
                } else {
                  break L0;
                }
              }
            }
          }
          return;
        }
    }

    final static boolean e(int param0) {
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
          boolean discarded$2 = mba.e(85);
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
        ((mba) this).field_h = 0;
        if (param0 != -23801) {
            this.a((byte) 74);
        }
    }

    private final void b(boolean param0) {
        if (-51 >= (((mba) this).field_k ^ -1)) {
          ((mba) this).field_m = 17;
          if (!param0) {
            return;
          } else {
            this.h((byte) -45);
            return;
          }
        } else {
          ((mba) this).field_m = 16;
          if (!param0) {
            return;
          } else {
            this.h((byte) -45);
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        if (param3 != 73) {
          this.a((byte) -40);
          ((mba) this).field_h = param0;
          ((mba) this).field_j = param2;
          ((mba) this).field_l = param1;
          return;
        } else {
          ((mba) this).field_h = param0;
          ((mba) this).field_j = param2;
          ((mba) this).field_l = param1;
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
            if ((((mba) this).field_e.field_h ^ -1) != -2) {
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
            if ((((mba) this).field_e.field_h ^ -1) != -2) {
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
