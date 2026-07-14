/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ep extends c implements fo, ffa, t {
    private int field_j;
    private boolean field_p;
    private int field_u;
    private int field_w;
    private boolean field_l;
    private int field_s;
    private boolean field_F;
    private boolean field_C;
    private int field_x;
    private int field_J;
    private int field_y;
    private int field_E;
    private int field_i;
    static ss field_k;
    private la field_z;
    private int field_H;
    private int field_K;
    private up field_t;
    private boolean field_B;
    private int field_G;
    static nh field_n;
    static jea field_r;
    private int field_v;
    private int field_o;
    private int field_I;
    private on field_q;
    private int field_D;
    int field_m;

    final int g(int param0) {
        if (param0 != -1) {
            return 72;
        }
        return ((ep) this).field_x;
    }

    final void a(int param0, int param1) {
        int var3 = -21 % ((20 - param1) / 42);
        ((ep) this).field_i = param0;
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((ep) this).field_z = null;
            return ((ep) this).field_G;
        }
        return ((ep) this).field_G;
    }

    public final int a(byte param0) {
        if (param0 != 55) {
            Object var3 = null;
            ((ep) this).a((uw) null, -69);
            return ((ep) this).field_o;
        }
        return ((ep) this).field_o;
    }

    final int k(int param0) {
        int var2 = -72 / ((param0 - -24) / 39);
        return ((ep) this).field_s;
    }

    public final boolean j(byte param0) {
        if (param0 >= -102) {
            field_n = null;
            return true;
        }
        return true;
    }

    private final void a(int param0, int param1, byte param2) {
        if (param2 <= 17) {
          this.a(65, (byte) -64, 122, false);
          ((ep) this).field_u = param0;
          ((ep) this).field_K = param1;
          return;
        } else {
          ((ep) this).field_u = param0;
          ((ep) this).field_K = param1;
          return;
        }
    }

    final void a(la param0, int param1) {
        ((ep) this).field_u = param0.a(((ep) this).field_u, (byte) 71);
        ((ep) this).field_s = -((ep) this).field_s;
        ((ep) this).field_H = dfa.a(-((ep) this).field_H, 8192, 105);
        if (param1 >= -16) {
            ((ep) this).field_I = 44;
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((ep) this).field_K = param2;
        ((ep) this).field_G = param3;
        ((ep) this).field_u = param0;
        if (param1 != -78) {
            boolean discarded$0 = ((ep) this).a(53);
        }
    }

    final boolean h(int param0) {
        if (param0 != 18407) {
            ((ep) this).a(false, true);
            return ((ep) this).field_F;
        }
        return ((ep) this).field_F;
    }

    private final void b(boolean param0, boolean param1) {
        if (param0) {
          L0: {
            ((ep) this).field_z.a(((ep) this).field_K, ((ep) this).field_u, ((ep) this).field_m, ((ep) this).field_G, (byte) 6);
            if (!((ep) this).field_B) {
              break L0;
            } else {
              if (-1 == (((ep) this).field_s ^ -1)) {
                if (((ep) this).field_y == 0) {
                  break L0;
                } else {
                  ((ep) this).field_s = 0;
                  ((ep) this).field_B = false;
                  ((ep) this).field_J = ((ep) this).field_J * 2;
                  ((ep) this).field_y = 0;
                  ((ep) this).field_C = false;
                  return;
                }
              } else {
                ((ep) this).field_s = 0;
                ((ep) this).field_B = false;
                ((ep) this).field_J = ((ep) this).field_J * 2;
                ((ep) this).field_y = 0;
                ((ep) this).field_C = false;
                return;
              }
            }
          }
          this.h((byte) 32);
          if (!param1) {
            ((ep) this).field_I = ((ep) this).field_I - 1;
            if (((ep) this).field_I > 0) {
              if (((ep) this).field_C) {
                ((ep) this).field_t.field_g = null;
                return;
              } else {
                return;
              }
            } else {
              this.a(true, 0);
              if (((ep) this).field_C) {
                ((ep) this).field_t.field_g = null;
                return;
              } else {
                return;
              }
            }
          } else {
            this.a(true, 0);
            if (((ep) this).field_C) {
              ((ep) this).field_t.field_g = null;
              return;
            } else {
              return;
            }
          }
        } else {
          ((ep) this).field_o = -115;
          ((ep) this).field_z.a(((ep) this).field_K, ((ep) this).field_u, ((ep) this).field_m, ((ep) this).field_G, (byte) 6);
          if (((ep) this).field_B) {
            if (-1 == (((ep) this).field_s ^ -1)) {
              if (((ep) this).field_y == 0) {
                this.h((byte) 32);
                if (!param1) {
                  ((ep) this).field_I = ((ep) this).field_I - 1;
                  if (((ep) this).field_I > 0) {
                    if (((ep) this).field_C) {
                      ((ep) this).field_t.field_g = null;
                      return;
                    } else {
                      return;
                    }
                  } else {
                    L1: {
                      this.a(true, 0);
                      if (!((ep) this).field_C) {
                        break L1;
                      } else {
                        ((ep) this).field_t.field_g = null;
                        break L1;
                      }
                    }
                    return;
                  }
                } else {
                  this.a(true, 0);
                  if (((ep) this).field_C) {
                    ((ep) this).field_t.field_g = null;
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                ((ep) this).field_s = 0;
                ((ep) this).field_B = false;
                ((ep) this).field_J = ((ep) this).field_J * 2;
                ((ep) this).field_y = 0;
                ((ep) this).field_C = false;
                return;
              }
            } else {
              ((ep) this).field_s = 0;
              ((ep) this).field_B = false;
              ((ep) this).field_J = ((ep) this).field_J * 2;
              ((ep) this).field_y = 0;
              ((ep) this).field_C = false;
              return;
            }
          } else {
            L2: {
              this.h((byte) 32);
              if (!param1) {
                ((ep) this).field_I = ((ep) this).field_I - 1;
                if (((ep) this).field_I > 0) {
                  break L2;
                } else {
                  this.a(true, 0);
                  break L2;
                }
              } else {
                this.a(true, 0);
                break L2;
              }
            }
            L3: {
              if (!((ep) this).field_C) {
                break L3;
              } else {
                ((ep) this).field_t.field_g = null;
                break L3;
              }
            }
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var5 = 0;
          if (param3) {
            L1: {
              var6 = 0;
              var7 = ((ep) this).field_u;
              if (0 <= param0) {
                if (-1 > (param0 ^ -1)) {
                  var6 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var6 = 1;
                ((ep) this).field_u = ((ep) this).field_u + param0;
                break L1;
              }
            }
            L2: {
              var8 = ((ep) this).field_K;
              if (var6 == 0) {
                break L2;
              } else {
                if (!this.c(0, param0, 98)) {
                  break L2;
                } else {
                  var5 = 1;
                  this.b(true, false);
                  ((ep) this).field_s = -((ep) this).field_s;
                  ((ep) this).field_u = var7;
                  break L2;
                }
              }
            }
            L3: {
              var6 = 0;
              if (-1 < (param2 ^ -1)) {
                var6 = 1;
                ((ep) this).field_K = ((ep) this).field_K + param2;
                break L3;
              } else {
                if (0 < param2) {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var6 = 1;
                  if (var6 != 0) {
                    L4: {
                      if (this.c(param2, 0, 111)) {
                        var5 = 1;
                        this.b(true, false);
                        ((ep) this).field_y = -((ep) this).field_y;
                        ((ep) this).field_K = var8;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    if (param1 >= -51) {
                      var10 = null;
                      ((ep) this).a(81, (up) null);
                      if (var5 == 0) {
                        L5: {
                          if (param3) {
                            break L5;
                          } else {
                            if (((ep) this).field_t.field_j != 0) {
                              break L5;
                            } else {
                              return;
                            }
                          }
                        }
                        L6: {
                          if (((ep) this).field_t.field_j != 3) {
                            break L6;
                          } else {
                            int discarded$8 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                            break L6;
                          }
                        }
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      if (var5 == 0) {
                        L7: {
                          if (param3) {
                            break L7;
                          } else {
                            if (((ep) this).field_t.field_j != 0) {
                              break L7;
                            } else {
                              return;
                            }
                          }
                        }
                        L8: {
                          if (((ep) this).field_t.field_j != 3) {
                            break L8;
                          } else {
                            int discarded$9 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                            break L8;
                          }
                        }
                        var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                        if (var6 > 0) {
                          this.b(true, true);
                          return;
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    }
                  } else {
                    L9: {
                      if (param1 < -51) {
                        break L9;
                      } else {
                        var10 = null;
                        ((ep) this).a(81, (up) null);
                        break L9;
                      }
                    }
                    if (var5 == 0) {
                      L10: {
                        if (param3) {
                          break L10;
                        } else {
                          if (((ep) this).field_t.field_j != 0) {
                            break L10;
                          } else {
                            return;
                          }
                        }
                      }
                      L11: {
                        if (((ep) this).field_t.field_j != 3) {
                          break L11;
                        } else {
                          int discarded$10 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                          break L11;
                        }
                      }
                      var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                      if (var6 > 0) {
                        this.b(true, true);
                        return;
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            if (var6 == 0) {
              break L0;
            } else {
              if (this.c(param2, 0, 111)) {
                var5 = 1;
                this.b(true, false);
                ((ep) this).field_y = -((ep) this).field_y;
                ((ep) this).field_K = var8;
                break L0;
              } else {
                L12: {
                  if (param1 < -51) {
                    break L12;
                  } else {
                    var10 = null;
                    ((ep) this).a(81, (up) null);
                    break L12;
                  }
                }
                if (var5 == 0) {
                  L13: {
                    if (param3) {
                      break L13;
                    } else {
                      if (((ep) this).field_t.field_j != 0) {
                        break L13;
                      } else {
                        return;
                      }
                    }
                  }
                  if (((ep) this).field_t.field_j != 3) {
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                    if (var6 > 0) {
                      this.b(true, true);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    int discarded$11 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                    var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                    if (var6 > 0) {
                      this.b(true, true);
                      return;
                    } else {
                      return;
                    }
                  }
                } else {
                  return;
                }
              }
            }
          } else {
            break L0;
          }
        }
        if (param1 < -51) {
          if (var5 == 0) {
            if (param3) {
              if (((ep) this).field_t.field_j != 3) {
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              } else {
                int discarded$12 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (((ep) this).field_t.field_j != 0) {
                if (((ep) this).field_t.field_j != 3) {
                  var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  int discarded$13 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                  var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
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
        } else {
          var10 = null;
          ((ep) this).a(81, (up) null);
          if (var5 == 0) {
            if (param3) {
              if (((ep) this).field_t.field_j != 3) {
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              } else {
                int discarded$14 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                if (var6 > 0) {
                  this.b(true, true);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (((ep) this).field_t.field_j != 0) {
                if (((ep) this).field_t.field_j != 3) {
                  var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
                  } else {
                    return;
                  }
                } else {
                  int discarded$15 = ((ep) this).field_z.a(-40, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, 2 * ((ep) this).field_o, ((ep) this).field_u);
                  var6 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if (var6 > 0) {
                    this.b(true, true);
                    return;
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
    }

    private final void h(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        if (param0 >= 0) {
          var3 = ((ep) this).field_t.field_j;
          if (-5 != var3) {
            if (-6 != var3) {
              if (var3 != -4) {
                if (-1 == var3) {
                  var2 = qva.a((byte) -35, ((ep) this).field_y, ((ep) this).field_s) + 4096;
                  ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -83, 5, ((ep) this).field_G, 3, var2, 10, 262144, ((ep) this).field_u, 16, 8);
                  return;
                } else {
                  return;
                }
              } else {
                ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -121, 4, ((ep) this).field_G, 1, 0, 20, 0, ((ep) this).field_u, ((ep) this).field_o >> -702490446, ((ep) this).field_o >> 132496145);
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          on discarded$1 = ((ep) this).c(true);
          var3 = ((ep) this).field_t.field_j;
          if (-5 != var3) {
            if (-6 != var3) {
              if (var3 != -4) {
                if (-1 != var3) {
                  return;
                } else {
                  var2 = qva.a((byte) -35, ((ep) this).field_y, ((ep) this).field_s) + 4096;
                  ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -83, 5, ((ep) this).field_G, 3, var2, 10, 262144, ((ep) this).field_u, 16, 8);
                  return;
                }
              } else {
                ((ep) this).field_z.b(false).a(((ep) this).field_K, (byte) -121, 4, ((ep) this).field_G, 1, 0, 20, 0, ((ep) this).field_u, ((ep) this).field_o >> -702490446, ((ep) this).field_o >> 132496145);
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

    private final int b(int param0, up param1) {
        int var3 = 0;
        if (param0 >= 100) {
          if (-5 != (((ep) this).field_t.field_j ^ -1)) {
            if (((ep) this).field_t.field_j != 3) {
              if (3 != ((ep) this).field_t.field_j) {
                if (3 == param1.field_j) {
                  var3 = 1 + param1.field_b / 2;
                  if (0 >= var3) {
                    return 0;
                  } else {
                    if ((((ep) this).field_t.field_j ^ -1) != -5) {
                      if (((ep) this).field_t.field_j == 5) {
                        L0: {
                          var3 = 0;
                          if ((var3 ^ -1) < -1) {
                            L1: {
                              if (!((ep) this).field_t.d(6734)) {
                                ((ep) this).field_i = 4;
                                break L1;
                              } else {
                                break L1;
                              }
                            }
                            ((ep) this).field_t.a(29525, param1.b(-344));
                            break L0;
                          } else {
                            break L0;
                          }
                        }
                        return 0;
                      } else {
                        L2: {
                          if ((var3 ^ -1) < -1) {
                            L3: {
                              if (!((ep) this).field_t.d(6734)) {
                                ((ep) this).field_i = 4;
                                break L3;
                              } else {
                                break L3;
                              }
                            }
                            ((ep) this).field_t.a(29525, param1.b(-344));
                            break L2;
                          } else {
                            break L2;
                          }
                        }
                        return 0;
                      }
                    } else {
                      L4: {
                        var3 = 0;
                        if ((var3 ^ -1) < -1) {
                          L5: {
                            if (!((ep) this).field_t.d(6734)) {
                              ((ep) this).field_i = 4;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          ((ep) this).field_t.a(29525, param1.b(-344));
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return 0;
                    }
                  }
                } else {
                  return 0;
                }
              } else {
                return 0;
              }
            } else {
              L6: {
                if (-5 == (param1.field_j ^ -1)) {
                  break L6;
                } else {
                  if ((param1.field_j ^ -1) == -6) {
                    break L6;
                  } else {
                    if (3 != ((ep) this).field_t.field_j) {
                      if (3 == param1.field_j) {
                        var3 = 1 + param1.field_b / 2;
                        if (0 >= var3) {
                          return 0;
                        } else {
                          if ((((ep) this).field_t.field_j ^ -1) != -5) {
                            if (((ep) this).field_t.field_j != 5) {
                              L7: {
                                if ((var3 ^ -1) < -1) {
                                  L8: {
                                    if (!((ep) this).field_t.d(6734)) {
                                      ((ep) this).field_i = 4;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  ((ep) this).field_t.a(29525, param1.b(-344));
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              return 0;
                            } else {
                              L9: {
                                var3 = 0;
                                if ((var3 ^ -1) < -1) {
                                  L10: {
                                    if (!((ep) this).field_t.d(6734)) {
                                      ((ep) this).field_i = 4;
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                  ((ep) this).field_t.a(29525, param1.b(-344));
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              return 0;
                            }
                          } else {
                            L11: {
                              var3 = 0;
                              if ((var3 ^ -1) < -1) {
                                L12: {
                                  if (!((ep) this).field_t.d(6734)) {
                                    ((ep) this).field_i = 4;
                                    break L12;
                                  } else {
                                    break L12;
                                  }
                                }
                                ((ep) this).field_t.a(29525, param1.b(-344));
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      return 0;
                    }
                  }
                }
              }
              this.a(false, 0);
              ((ep) this).field_z.b(false).c(((ep) this).field_u, 93, ((ep) this).field_y, ((ep) this).field_G, ((ep) this).field_s, ((ep) this).field_K);
              if (5 == param1.field_j) {
                boolean discarded$4 = ((ep) this).field_z.b(30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u);
                return 0;
              } else {
                return 0;
              }
            }
          } else {
            if (5 != param1.field_j) {
              if (((ep) this).field_t.field_j == 3) {
                if (-5 != (param1.field_j ^ -1)) {
                  if ((param1.field_j ^ -1) == -6) {
                    this.a(false, 0);
                    ((ep) this).field_z.b(false).c(((ep) this).field_u, 93, ((ep) this).field_y, ((ep) this).field_G, ((ep) this).field_s, ((ep) this).field_K);
                    if (5 == param1.field_j) {
                      boolean discarded$5 = ((ep) this).field_z.b(30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u);
                      return 0;
                    } else {
                      return 0;
                    }
                  } else {
                    if (3 != ((ep) this).field_t.field_j) {
                      if (3 == param1.field_j) {
                        var3 = 1 + param1.field_b / 2;
                        if (0 >= var3) {
                          return 0;
                        } else {
                          if ((((ep) this).field_t.field_j ^ -1) != -5) {
                            if (((ep) this).field_t.field_j == 5) {
                              L13: {
                                var3 = 0;
                                if ((var3 ^ -1) < -1) {
                                  L14: {
                                    if (!((ep) this).field_t.d(6734)) {
                                      ((ep) this).field_i = 4;
                                      break L14;
                                    } else {
                                      break L14;
                                    }
                                  }
                                  ((ep) this).field_t.a(29525, param1.b(-344));
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              return 0;
                            } else {
                              L15: {
                                if ((var3 ^ -1) < -1) {
                                  L16: {
                                    if (!((ep) this).field_t.d(6734)) {
                                      ((ep) this).field_i = 4;
                                      break L16;
                                    } else {
                                      break L16;
                                    }
                                  }
                                  ((ep) this).field_t.a(29525, param1.b(-344));
                                  break L15;
                                } else {
                                  break L15;
                                }
                              }
                              return 0;
                            }
                          } else {
                            L17: {
                              var3 = 0;
                              if ((var3 ^ -1) < -1) {
                                L18: {
                                  if (!((ep) this).field_t.d(6734)) {
                                    ((ep) this).field_i = 4;
                                    break L18;
                                  } else {
                                    break L18;
                                  }
                                }
                                ((ep) this).field_t.a(29525, param1.b(-344));
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            return 0;
                          }
                        }
                      } else {
                        return 0;
                      }
                    } else {
                      return 0;
                    }
                  }
                } else {
                  L19: {
                    this.a(false, 0);
                    ((ep) this).field_z.b(false).c(((ep) this).field_u, 93, ((ep) this).field_y, ((ep) this).field_G, ((ep) this).field_s, ((ep) this).field_K);
                    if (5 != param1.field_j) {
                      break L19;
                    } else {
                      boolean discarded$6 = ((ep) this).field_z.b(30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u);
                      break L19;
                    }
                  }
                  return 0;
                }
              } else {
                if (3 != ((ep) this).field_t.field_j) {
                  if (3 == param1.field_j) {
                    var3 = 1 + param1.field_b / 2;
                    if (0 >= var3) {
                      return 0;
                    } else {
                      L20: {
                        L21: {
                          if ((((ep) this).field_t.field_j ^ -1) == -5) {
                            break L21;
                          } else {
                            if (((ep) this).field_t.field_j != 5) {
                              break L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        var3 = 0;
                        break L20;
                      }
                      if ((var3 ^ -1) >= -1) {
                        return 0;
                      } else {
                        L22: {
                          if (!((ep) this).field_t.d(6734)) {
                            ((ep) this).field_i = 4;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                        ((ep) this).field_t.a(29525, param1.b(-344));
                        return 0;
                      }
                    }
                  } else {
                    return 0;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              this.a(false, 0);
              boolean discarded$7 = ((ep) this).field_z.b(30097, 1048576, 1, ((ep) this).field_K, ((ep) this).field_u);
              return 0;
            }
          }
        } else {
          return 115;
        }
    }

    public final boolean a(int param0, gma param1, int param2, pc param3) {
        if (param0 != -1) {
            Object var6 = null;
            ((ep) this).a(63, (iq) null);
            return false;
        }
        return false;
    }

    public final int d(int param0) {
        if (param0 != 3) {
            ((ep) this).field_F = true;
            return ((ep) this).field_u;
        }
        return ((ep) this).field_u;
    }

    final int f(boolean param0) {
        if (!param0) {
            int discarded$0 = ((ep) this).a(42, (byte) 84);
            return ((ep) this).field_H;
        }
        return ((ep) this).field_H;
    }

    public final String toString() {
        return "Projectile (x=" + ((ep) this).field_u + ", y=" + ((ep) this).field_K + ", vx=" + ((ep) this).field_s + ", vy=" + ((ep) this).field_y + ", " + "angle=" + ((ep) this).field_H + ", endSize=" + ((ep) this).field_v + ")";
    }

    final void c(boolean param0, boolean param1) {
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        if (!param0) {
          L0: {
            ((ep) this).field_D = 124;
            stackOut_5_0 = this;
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (!param1) {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L0;
            } else {
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
          }
          ((ep) this).field_B = stackIn_8_1 != 0;
          return;
        } else {
          L1: {
            stackOut_1_0 = this;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = this;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = this;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((ep) this).field_B = stackIn_4_1 != 0;
          return;
        }
    }

    public final boolean a(byte param0, boolean param1) {
        if (param0 != -55) {
            return false;
        }
        return false;
    }

    final void b(boolean param0, int param1) {
        ((ep) this).field_C = param0 ? true : false;
        int var3 = 43 / ((param1 - 14) / 38);
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var5 = 0;
        if (param3 != 0) {
          L0: {
            ((ep) this).field_w = -54;
            if (param1) {
              L1: {
                if (0 > param0) {
                  var5 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L1;
                } else {
                  if (0 < param0) {
                    var5 = 1;
                    ((ep) this).field_u = ((ep) this).field_u + param0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              if (0 <= param2) {
                if (param2 <= 0) {
                  break L0;
                } else {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var5 = 1;
                  break L0;
                }
              } else {
                ((ep) this).field_K = ((ep) this).field_K + param2;
                var5 = 1;
                var6 = 0;
                if (param1) {
                  L2: {
                    if (-4 == (((ep) this).field_t.field_j ^ -1)) {
                      int discarded$6 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                    if ((var7 ^ -1) < -1) {
                      var6 = 1;
                      this.b(true, true);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (var5 != 0) {
                      if (this.c(param2, param0, 122)) {
                        if (var6 == 0) {
                          this.b(true, true);
                          break L4;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                  return;
                } else {
                  L5: {
                    if (-1 != ((ep) this).field_t.field_j) {
                      L6: {
                        if (-4 == ((ep) this).field_t.field_j) {
                          int discarded$7 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                      if ((var7 ^ -1) < -1) {
                        var6 = 1;
                        this.b(true, true);
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if (var5 != 0) {
                      if (this.c(param2, param0, 122)) {
                        if (var6 == 0) {
                          this.b(true, true);
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    } else {
                      break L7;
                    }
                  }
                  return;
                }
              }
            } else {
              break L0;
            }
          }
          var6 = 0;
          if (!param1) {
            if (-1 == ((ep) this).field_t.field_j) {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              L8: {
                if (-4 == ((ep) this).field_t.field_j) {
                  int discarded$8 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                  break L8;
                } else {
                  break L8;
                }
              }
              var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
              if ((var7 ^ -1) < -1) {
                var6 = 1;
                this.b(true, true);
                if (var5 != 0) {
                  if (this.c(param2, param0, 122)) {
                    if (var6 != 0) {
                      return;
                    } else {
                      this.b(true, true);
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                if (var5 != 0) {
                  if (this.c(param2, param0, 122)) {
                    if (var6 != 0) {
                      return;
                    } else {
                      this.b(true, true);
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
          } else {
            L9: {
              if (-4 == (((ep) this).field_t.field_j ^ -1)) {
                int discarded$9 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                break L9;
              } else {
                break L9;
              }
            }
            var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
            if ((var7 ^ -1) < -1) {
              var6 = 1;
              this.b(true, true);
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 != 0) {
                    return;
                  } else {
                    this.b(true, true);
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
        } else {
          L10: {
            if (param1) {
              L11: {
                if (0 > param0) {
                  var5 = 1;
                  ((ep) this).field_u = ((ep) this).field_u + param0;
                  break L11;
                } else {
                  if (0 < param0) {
                    var5 = 1;
                    ((ep) this).field_u = ((ep) this).field_u + param0;
                    break L11;
                  } else {
                    break L11;
                  }
                }
              }
              if (0 <= param2) {
                if (param2 <= 0) {
                  break L10;
                } else {
                  ((ep) this).field_K = ((ep) this).field_K + param2;
                  var5 = 1;
                  break L10;
                }
              } else {
                L12: {
                  L13: {
                    ((ep) this).field_K = ((ep) this).field_K + param2;
                    var5 = 1;
                    var6 = 0;
                    if (param1) {
                      break L13;
                    } else {
                      if (-1 != ((ep) this).field_t.field_j) {
                        break L13;
                      } else {
                        break L12;
                      }
                    }
                  }
                  L14: {
                    if (-4 == ((ep) this).field_t.field_j) {
                      int discarded$10 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
                  if ((var7 ^ -1) < -1) {
                    var6 = 1;
                    this.b(true, true);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L15: {
                  if (var5 != 0) {
                    if (this.c(param2, param0, 122)) {
                      if (var6 == 0) {
                        this.b(true, true);
                        break L15;
                      } else {
                        break L15;
                      }
                    } else {
                      break L15;
                    }
                  } else {
                    break L15;
                  }
                }
                return;
              }
            } else {
              break L10;
            }
          }
          L16: {
            var6 = 0;
            if (param1) {
              break L16;
            } else {
              if (-1 != (((ep) this).field_t.field_j ^ -1)) {
                break L16;
              } else {
                L17: {
                  if (var5 != 0) {
                    if (this.c(param2, param0, 122)) {
                      if (var6 == 0) {
                        this.b(true, true);
                        break L17;
                      } else {
                        break L17;
                      }
                    } else {
                      break L17;
                    }
                  } else {
                    break L17;
                  }
                }
                return;
              }
            }
          }
          L18: {
            if (-4 == (((ep) this).field_t.field_j ^ -1)) {
              int discarded$11 = ((ep) this).field_z.a(param3 + -31, ((ep) this).field_K, th.field_o, 2 * ((ep) this).field_o, ((ep) this).field_o * 2, ((ep) this).field_u);
              break L18;
            } else {
              break L18;
            }
          }
          var7 = ((ep) this).field_z.a((ep) this, -16164, ((ep) this).field_t);
          if ((var7 ^ -1) < -1) {
            var6 = 1;
            this.b(true, true);
            if (var5 != 0) {
              if (this.c(param2, param0, 122)) {
                if (var6 != 0) {
                  return;
                } else {
                  this.b(true, true);
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            L19: {
              if (var5 != 0) {
                if (this.c(param2, param0, 122)) {
                  if (var6 == 0) {
                    this.b(true, true);
                    break L19;
                  } else {
                    break L19;
                  }
                } else {
                  break L19;
                }
              } else {
                break L19;
              }
            }
            return;
          }
        }
    }

    final c d(boolean param0) {
        if (!param0) {
            return null;
        }
        return (c) (Object) new ep();
    }

    public final int a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        if (!param0) {
            int discarded$0 = ((ep) this).e((byte) -115);
            return 0;
        }
        return 0;
    }

    public final int b(int param0) {
        int var2 = -24 / ((param0 - 1) / 45);
        return 0;
    }

    final int l(int param0) {
        if (param0 != 5) {
            return 53;
        }
        return ((ep) this).field_E;
    }

    public final int c(int param0) {
        if (param0 >= -11) {
            return 67;
        }
        return ((ep) this).field_o;
    }

    public final int e(int param0) {
        if (param0 != 9648) {
            return -95;
        }
        return ((ep) this).field_K;
    }

    private final boolean f(byte param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 < -114) {
          if (!(((ep) this).field_t.field_g instanceof hca)) {
            if (((ep) this).field_t.field_c instanceof hca) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          ((ep) this).c(false, false);
          if (((ep) this).field_t.field_g instanceof hca) {
            return true;
          } else {
            L0: {
              if (!(((ep) this).field_t.field_c instanceof hca)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        if (param0) {
          if ((((ep) this).field_t.field_j ^ -1) == -5) {
            if (!((ep) this).field_z.b(param1 ^ 30097, 1048576, 0, ((ep) this).field_K, ((ep) this).field_u)) {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              this.h((byte) 100);
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            }
          } else {
            if ((((ep) this).field_t.field_j ^ -1) == -6) {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            } else {
              ((ep) this).field_F = true;
              ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
              if (param1 != 0) {
                ((ep) this).field_m = 81;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          ((ep) this).field_F = true;
          ((ep) this).field_z.field_u.a((ffa) this, (byte) 123);
          if (param1 != 0) {
            ((ep) this).field_m = 81;
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
        return ((ep) this).field_F;
    }

    public static void j(int param0) {
        if (param0 <= 95) {
          ep.j(-85);
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        } else {
          field_n = null;
          field_k = null;
          field_r = null;
          return;
        }
    }

    final void b(int param0, int param1, byte param2) {
        ((ep) this).field_s = param0;
        ((ep) this).field_y = param1;
        int var4 = 118 / ((-51 - param2) / 40);
        ((ep) this).field_H = qva.a((byte) -29, param1, param0);
    }

    final void b(int param0, boolean param1) {
        ((ep) this).field_p = param1 ? true : false;
        if (param0 != -1) {
            int discarded$0 = ((ep) this).b(false);
        }
    }

    public final void a(int param0, int param1, int param2) {
        ((ep) this).field_z.field_u.a((ffa) this, (byte) 98);
        this.a(param1, param0, (byte) 114);
        this.g((byte) -99);
        ((ep) this).field_t.field_g = null;
        if (param2 != 2) {
          int discarded$2 = ((ep) this).d(107);
          ((ep) this).field_z.field_u.b((ffa) this, param2 + 7071);
          return;
        } else {
          ((ep) this).field_z.field_u.b((ffa) this, param2 + 7071);
          return;
        }
    }

    final void a(int param0, la param1, int param2, int param3, int param4, int param5) {
        ((ep) this).field_y = 0;
        ((ep) this).field_E = param4;
        ((ep) this).field_l = false;
        ((ep) this).field_J = param0 * 2;
        ((ep) this).field_H = 0;
        int var7 = -121 / ((-17 - param3) / 49);
        ((ep) this).field_p = false;
        ((ep) this).field_B = false;
        ((ep) this).field_v = 2 * param2;
        ((ep) this).field_C = false;
        ((ep) this).field_j = param5;
        ((ep) this).field_w = 0;
        ((ep) this).field_F = false;
        ((ep) this).field_z = param1;
        ((ep) this).field_i = -1;
        ((ep) this).field_s = 0;
        ((ep) this).field_x = 0;
        ((ep) this).field_o = ((ep) this).field_J;
        ((ep) this).field_t = null;
        ((ep) this).field_I = 0;
        ((ep) this).field_q.b((byte) 93);
    }

    final int b(boolean param0) {
        if (param0) {
            ((ep) this).field_i = -106;
            return ((ep) this).field_y;
        }
        return ((ep) this).field_y;
    }

    final void a(int param0, up param1) {
        ((ep) this).field_t = param1;
        if (param0 > -122) {
            ((ep) this).field_u = -12;
            ((ep) this).field_I = 5;
            return;
        }
        ((ep) this).field_I = 5;
    }

    public final boolean a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        if (param0 < 68) {
            ((ep) this).field_s = -53;
            return false;
        }
        return false;
    }

    public final int b(byte param0) {
        int var2 = 40 % ((-23 - param0) / 53);
        return ((ep) this).field_u;
    }

    final void a(boolean param0, boolean param1) {
        ((ep) this).field_l = param1 ? true : false;
        if (!param0) {
            c discarded$0 = ((ep) this).d(true);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        if (param2 >= 92) {
          L0: {
            if (!((ep) this).field_C) {
              var4 = 1;
              break L0;
            } else {
              var4 = 3;
              break L0;
            }
          }
          if (((ep) this).field_p) {
            L1: {
              if (-1 == (((ep) this).field_z.a((ffa) this, ((ep) this).field_t.field_g, var4, ((ep) this).field_J, param0 / 4, 12, ((ep) this).field_J, ((ep) this).field_u, 1, param1 / 4, ((ep) this).field_K, 0, false) ^ -1)) {
                stackOut_9_0 = 0;
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = 1;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            return stackIn_10_0 != 0;
          } else {
            return ((ep) this).field_z.a((ffa) this, ((ep) this).field_J, 2, var4, ((ep) this).field_K, ((ep) this).field_u, false, ((ep) this).field_t.field_g, ((ep) this).field_J);
          }
        } else {
          return true;
        }
    }

    final int i(int param0) {
        if (param0 != -1) {
            ((ep) this).field_q = null;
            return ((ep) this).field_o;
        }
        return ((ep) this).field_o;
    }

    final void a(uw param0, int param1) {
        if (param1 == 5465) {
          if (((ep) this).field_G < 0) {
            param0.a((byte) -128, 2, (fo) this);
            return;
          } else {
            param0.a((byte) -116, 7, (fo) this);
            return;
          }
        } else {
          boolean discarded$7 = ((ep) this).a((byte) 21, true);
          if (((ep) this).field_G < 0) {
            param0.a((byte) -128, 2, (fo) this);
            return;
          } else {
            param0.a((byte) -116, 7, (fo) this);
            return;
          }
        }
    }

    public final on c(boolean param0) {
        if (param0) {
            ((ep) this).field_I = -9;
            return ((ep) this).field_q;
        }
        return ((ep) this).field_q;
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((ep) this).field_q = null;
        }
    }

    public final boolean a(int param0) {
        int var2 = 61 % ((param0 - 6) / 46);
        return false;
    }

    final void b(int param0, int param1, int param2) {
        ((ep) this).field_w = param1;
        if (param0 != 7) {
            return;
        }
        ((ep) this).field_H = param2;
    }

    public final boolean a(int param0, gma param1) {
        if (param0 > -77) {
            ((ep) this).field_v = 120;
            return false;
        }
        return false;
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        hr var8 = null;
        hr var10 = null;
        hr var12 = null;
        hr var13 = null;
        int stackIn_81_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          this.g((byte) -99);
          ((ep) this).field_q.a(param0 + 87);
          if (param1) {
            if (this.f((byte) -118)) {
              L1: {
                var3 = 1;
                ((ep) this).field_H = ((ep) this).field_H + ((ep) this).field_w;
                if (var3 != 0) {
                  ((ep) this).field_x = ((ep) this).field_x + 1;
                  if (((ep) this).field_x >= ((ep) this).field_j) {
                    this.a(true, param0 + 1);
                    if (!((ep) this).field_F) {
                      break L1;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (!((ep) this).field_F) {
                L2: {
                  if (((ep) this).field_C) {
                    this.a(((ep) this).field_s, (byte) -127, ((ep) this).field_y, var3 != 0);
                    break L2;
                  } else {
                    this.a(((ep) this).field_s, var3 != 0, ((ep) this).field_y, param0 ^ -1);
                    break L2;
                  }
                }
                if (((ep) this).field_F) {
                  L3: {
                    L4: {
                      if (!((ep) this).field_B) {
                        break L4;
                      } else {
                        if (((ep) this).field_s != 0) {
                          break L4;
                        } else {
                          if (((ep) this).field_y == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                    break L3;
                  }
                  L5: {
                    if (var3 == 0) {
                      break L5;
                    } else {
                      if ((((ep) this).field_i ^ -1) != 0) {
                        var10 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                        var5 = 131072;
                        var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                        var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                        var10.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                        var10.b(121, var7, var6);
                        var10.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (((ep) this).field_u < 0) {
                      ((ep) this).field_F = true;
                      break L6;
                    } else {
                      if (-1 < (((ep) this).field_K ^ -1)) {
                        ((ep) this).field_F = true;
                        break L6;
                      } else {
                        if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                          ((ep) this).field_F = true;
                          break L6;
                        } else {
                          if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                            break L6;
                          } else {
                            ((ep) this).field_F = true;
                            break L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (param0 == -1) {
                      break L7;
                    } else {
                      ((ep) this).field_t = null;
                      break L7;
                    }
                  }
                  return;
                } else {
                  L8: {
                    L9: {
                      ((ep) this).field_z.field_u.a((ffa) this, -66);
                      ((ep) this).field_z.field_u.b((ffa) this, 7073);
                      if (!((ep) this).field_B) {
                        break L9;
                      } else {
                        if (((ep) this).field_s != 0) {
                          break L9;
                        } else {
                          if (((ep) this).field_y == 0) {
                            break L8;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                    break L8;
                  }
                  L10: {
                    if (var3 == 0) {
                      break L10;
                    } else {
                      if ((((ep) this).field_i ^ -1) != 0) {
                        var12 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                        var5 = 131072;
                        var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                        var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                        var12.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                        var12.b(121, var7, var6);
                        var12.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                  L11: {
                    if (((ep) this).field_u < 0) {
                      ((ep) this).field_F = true;
                      break L11;
                    } else {
                      if (-1 < (((ep) this).field_K ^ -1)) {
                        ((ep) this).field_F = true;
                        break L11;
                      } else {
                        if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                          ((ep) this).field_F = true;
                          break L11;
                        } else {
                          if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                            break L11;
                          } else {
                            ((ep) this).field_F = true;
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  L12: {
                    if (param0 == -1) {
                      break L12;
                    } else {
                      ((ep) this).field_t = null;
                      break L12;
                    }
                  }
                  return;
                }
              } else {
                L13: {
                  if (((ep) this).field_F) {
                    break L13;
                  } else {
                    ((ep) this).field_z.field_u.a((ffa) this, -66);
                    ((ep) this).field_z.field_u.b((ffa) this, 7073);
                    break L13;
                  }
                }
                L14: {
                  L15: {
                    if (!((ep) this).field_B) {
                      break L15;
                    } else {
                      if (((ep) this).field_s != 0) {
                        break L15;
                      } else {
                        if (((ep) this).field_y == 0) {
                          break L14;
                        } else {
                          break L15;
                        }
                      }
                    }
                  }
                  ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
                  break L14;
                }
                L16: {
                  if (var3 == 0) {
                    break L16;
                  } else {
                    if ((((ep) this).field_i ^ -1) != 0) {
                      var8 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
                      var5 = 131072;
                      var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
                      var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
                      var8.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
                      var8.b(121, var7, var6);
                      var8.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
                L17: {
                  if (((ep) this).field_u < 0) {
                    ((ep) this).field_F = true;
                    break L17;
                  } else {
                    if (-1 < (((ep) this).field_K ^ -1)) {
                      ((ep) this).field_F = true;
                      break L17;
                    } else {
                      if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                        ((ep) this).field_F = true;
                        break L17;
                      } else {
                        if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                          break L17;
                        } else {
                          ((ep) this).field_F = true;
                          break L17;
                        }
                      }
                    }
                  }
                }
                L18: {
                  if (param0 == -1) {
                    break L18;
                  } else {
                    ((ep) this).field_t = null;
                    break L18;
                  }
                }
                return;
              }
            } else {
              stackOut_3_0 = 0;
              stackIn_81_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 1;
            stackIn_81_0 = stackOut_1_0;
            break L0;
          }
        }
        L19: {
          var3 = stackIn_81_0;
          ((ep) this).field_H = ((ep) this).field_H + ((ep) this).field_w;
          if (var3 != 0) {
            ((ep) this).field_x = ((ep) this).field_x + 1;
            if (((ep) this).field_x >= ((ep) this).field_j) {
              this.a(true, param0 + 1);
              if (!((ep) this).field_F) {
                break L19;
              } else {
                return;
              }
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L20: {
          if (((ep) this).field_F) {
            break L20;
          } else {
            if (((ep) this).field_C) {
              this.a(((ep) this).field_s, (byte) -127, ((ep) this).field_y, var3 != 0);
              break L20;
            } else {
              this.a(((ep) this).field_s, var3 != 0, ((ep) this).field_y, param0 ^ -1);
              break L20;
            }
          }
        }
        L21: {
          if (((ep) this).field_F) {
            break L21;
          } else {
            ((ep) this).field_z.field_u.a((ffa) this, -66);
            ((ep) this).field_z.field_u.b((ffa) this, 7073);
            break L21;
          }
        }
        L22: {
          L23: {
            if (!((ep) this).field_B) {
              break L23;
            } else {
              if (((ep) this).field_s != 0) {
                break L23;
              } else {
                if (((ep) this).field_y == 0) {
                  break L22;
                } else {
                  break L23;
                }
              }
            }
          }
          ((ep) this).field_o = ((ep) this).field_x * (-((ep) this).field_J + ((ep) this).field_v) / ((ep) this).field_j + ((ep) this).field_J;
          break L22;
        }
        L24: {
          if (var3 == 0) {
            break L24;
          } else {
            if (((ep) this).field_i != 0) {
              var13 = ((ep) this).field_z.a(((ep) this).field_u, ((ep) this).field_K, (byte) 100, ((ep) this).field_G);
              var5 = 131072;
              var6 = -(var5 / 2) + uca.field_c.a(var5, 0);
              var7 = uca.field_c.a(var5, param0 ^ -1) - var5 / 2;
              var13.a(false, 24, ((ep) this).field_i, 4, 10 + uca.field_c.a(10, 0));
              var13.b(121, var7, var6);
              var13.a(uca.field_c.a(8192, 0), -128 + uca.field_c.a(256, 0), param0 + -84);
              break L24;
            } else {
              L25: {
                if (((ep) this).field_u < 0) {
                  ((ep) this).field_F = true;
                  break L25;
                } else {
                  if (-1 > ((ep) this).field_K) {
                    ((ep) this).field_F = true;
                    break L25;
                  } else {
                    if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
                      ((ep) this).field_F = true;
                      break L25;
                    } else {
                      if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                        if (param0 != -1) {
                          ((ep) this).field_t = null;
                          return;
                        } else {
                          return;
                        }
                      } else {
                        L26: {
                          ((ep) this).field_F = true;
                          if (param0 == -1) {
                            break L26;
                          } else {
                            ((ep) this).field_t = null;
                            break L26;
                          }
                        }
                        return;
                      }
                    }
                  }
                }
              }
              if (param0 != -1) {
                ((ep) this).field_t = null;
                return;
              } else {
                return;
              }
            }
          }
        }
        if (((ep) this).field_u < 0) {
          ((ep) this).field_F = true;
          if (param0 != -1) {
            ((ep) this).field_t = null;
            return;
          } else {
            return;
          }
        } else {
          if (-1 < (((ep) this).field_K ^ -1)) {
            ((ep) this).field_F = true;
            if (param0 != -1) {
              ((ep) this).field_t = null;
              return;
            } else {
              return;
            }
          } else {
            if (((ep) this).field_u >= ((ep) this).field_z.m((byte) -86)) {
              ((ep) this).field_F = true;
              if (param0 != -1) {
                ((ep) this).field_t = null;
                return;
              } else {
                return;
              }
            } else {
              if (((ep) this).field_K < ((ep) this).field_z.s(-121)) {
                if (param0 == -1) {
                  return;
                } else {
                  ((ep) this).field_t = null;
                  return;
                }
              } else {
                ((ep) this).field_F = true;
                if (param0 != -1) {
                  ((ep) this).field_t = null;
                  return;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    public final boolean a(gma param0, int param1) {
        if (param1 != 0) {
            field_r = null;
            return false;
        }
        return false;
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((ep) this).field_q = null;
            return ((ep) this).field_K;
        }
        return ((ep) this).field_K;
    }

    public final int a(up param0, int param1, int param2, int param3, int param4, int param5) {
        if (((ep) this).field_l) {
          return 0;
        } else {
          if (io.a(param1, ((ep) this).field_K, (byte) -90, param5, ((ep) this).field_u, param4, ((ep) this).field_o, ((ep) this).field_o, param2)) {
            if (param3 != 0) {
              ((ep) this).field_m = -65;
              return this.b(109, param0);
            } else {
              return this.b(109, param0);
            }
          } else {
            return 0;
          }
        }
    }

    public final int a(up param0, ep param1, int param2) {
        if (param2 >= -97) {
          ((ep) this).field_B = false;
          return ((ep) this).a(param0, param1.field_o, param1.field_u, 0, param1.field_K, param1.field_o);
        } else {
          return ((ep) this).a(param0, param1.field_o, param1.field_u, 0, param1.field_K, param1.field_o);
        }
    }

    public final void a(int param0, iq param1) {
        dea.field_a.a(param1, false, (ep) this);
        if (param0 < 103) {
            Object var4 = null;
            boolean discarded$0 = ((ep) this).a(40, (gma) null, -76, 70, -19, (ffa) null, -19, 65);
        }
    }

    public final int a(up param0, int param1, pc param2) {
        if (!((ep) this).field_l) {
          if (-1 < (eha.a(((ep) this).field_o, param1, ((ep) this).field_K, ((ep) this).field_o, param2, ((ep) this).field_u, 2) ^ -1)) {
            return 0;
          } else {
            return this.b(115, param0);
          }
        } else {
          return 0;
        }
    }

    final int a(int param0, byte param1) {
        param0 = fs.a((byte) 88, param0, ((ep) this).field_u);
        param0 = fs.a((byte) 30, param0, ((ep) this).field_K);
        if (param1 != -39) {
          boolean discarded$1 = this.f((byte) 2);
          param0 = fs.a((byte) 32, param0, ((ep) this).field_s);
          param0 = fs.a((byte) 120, param0, ((ep) this).field_y);
          param0 = fs.a((byte) 58, param0, ((ep) this).field_v);
          param0 = fs.a((byte) 85, param0, ((ep) this).field_H);
          return param0;
        } else {
          param0 = fs.a((byte) 32, param0, ((ep) this).field_s);
          param0 = fs.a((byte) 120, param0, ((ep) this).field_y);
          param0 = fs.a((byte) 58, param0, ((ep) this).field_v);
          param0 = fs.a((byte) 85, param0, ((ep) this).field_H);
          return param0;
        }
    }

    public final int a(boolean param0) {
        Object var3 = null;
        if (!param0) {
          var3 = null;
          ((ep) this).a(-80, (up) null);
          return 7 + 7 * ((ep) this).field_D;
        } else {
          return 7 + 7 * ((ep) this).field_D;
        }
    }

    final int e(boolean param0) {
        if (param0) {
            int discarded$0 = ((ep) this).c((byte) 40);
            return ((ep) this).field_j;
        }
        return ((ep) this).field_j;
    }

    public final boolean a(int param0, gma param1, int param2, int param3, int param4, ffa param5, int param6, int param7) {
        if (param2 < 55) {
            return true;
        }
        return false;
    }

    private final void g(byte param0) {
        if (param0 != -99) {
            ((ep) this).field_y = 18;
        }
    }

    ep() {
        ((ep) this).field_i = -1;
        ((ep) this).field_q = new on();
        sd.field_G = sd.field_G + 1;
        ((ep) this).field_D = sd.field_G;
    }

    static {
    }
}
