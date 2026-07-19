/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sna {
    private qh field_l;
    private boolean field_m;
    private int field_g;
    private boolean field_j;
    private vna field_c;
    private boolean field_d;
    private boolean field_h;
    private boolean field_b;
    private boolean field_f;
    private boolean field_i;
    private int field_a;
    private boolean field_k;
    private int field_e;

    final void a(int param0) {
        la var3 = null;
        int var4 = 0;
        fsa[] var5_ref_fsa__ = null;
        int var5 = 0;
        fsa[] var6_ref_fsa__ = null;
        int var6 = 0;
        int var7 = 0;
        fsa var8 = null;
        int var9 = 0;
        hca var10 = null;
        boolean stackIn_85_0 = false;
        int stackIn_98_0 = 0;
        boolean stackOut_84_0 = false;
        int stackOut_97_0 = 0;
        L0: {
          var9 = TombRacer.field_G ? 1 : 0;
          var10 = this.field_l.field_k.field_H[this.field_l.field_x];
          var3 = var10.f((byte) -106);
          var4 = this.field_l.field_k.i(1, this.field_l.field_x);
          if (param0 == 9981) {
            break L0;
          } else {
            this.a(77);
            break L0;
          }
        }
        L1: {
          L2: {
            if (var4 != this.field_g) {
              L3: {
                this.field_g = var4;
                if (0 == this.field_g) {
                  this.a(fk.field_j, new wq(), 50, param0 ^ -9907);
                  break L3;
                } else {
                  break L3;
                }
              }
              var5_ref_fsa__ = var3.n(16);
              var6_ref_fsa__ = var5_ref_fsa__;
              var7 = 0;
              L4: while (true) {
                if (var7 < var6_ref_fsa__.length) {
                  var8 = var6_ref_fsa__[var7];
                  stackOut_84_0 = this.field_h;
                  stackIn_98_0 = stackOut_84_0 ? 1 : 0;
                  stackIn_85_0 = stackOut_84_0;
                  if (var9 != 0) {
                    break L1;
                  } else {
                    L5: {
                      if (stackIn_85_0) {
                        break L5;
                      } else {
                        if (var8.s((byte) -119)) {
                          this.field_h = true;
                          this.a(vh.field_c, (ms) null, 25, -89);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (this.field_i) {
                        break L6;
                      } else {
                        if (-2 == (var8.E((byte) 3) ^ -1)) {
                          this.field_i = true;
                          this.a(wqa.field_F, new jia(), 25, param0 + -10059);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (this.field_m) {
                        break L7;
                      } else {
                        if (3 != var8.E((byte) 3)) {
                          break L7;
                        } else {
                          this.field_m = true;
                          this.a(gca.field_l, (ms) null, 25, -61);
                          break L7;
                        }
                      }
                    }
                    var7++;
                    if (var9 == 0) {
                      continue L4;
                    } else {
                      break L2;
                    }
                  }
                } else {
                  L8: {
                    var5 = var10.r((byte) -102);
                    if (this.field_e == var5) {
                      break L8;
                    } else {
                      this.field_a = 0;
                      this.field_e = var5;
                      var6 = fe.field_C[4] + -10;
                      if (1 == this.field_e) {
                        this.a(tha.field_A, (ms) null, var6, param0 ^ -9888);
                        break L8;
                      } else {
                        L9: {
                          this.field_k = var10.M(-107);
                          if (this.field_d) {
                            if (this.field_f) {
                              break L9;
                            } else {
                              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                                break L9;
                              } else {
                                this.field_f = true;
                                this.a(lja.field_a, (ms) null, 5, -74);
                                break L9;
                              }
                            }
                          } else {
                            if (this.field_f) {
                              break L9;
                            } else {
                              if (-1 <= (var10.a(393216, 2) ^ -1)) {
                                break L9;
                              } else {
                                this.field_f = true;
                                this.a(lja.field_a, (ms) null, 5, -74);
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          if (!this.field_f) {
                            break L10;
                          } else {
                            L11: {
                              if (var10.a(393216, 2) != 0) {
                                break L11;
                              } else {
                                this.field_a = this.field_a + 1;
                                if (this.field_j) {
                                  break L10;
                                } else {
                                  if (500 < this.field_a) {
                                    this.field_j = true;
                                    this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                                    if (var9 == 0) {
                                      break L10;
                                    } else {
                                      break L11;
                                    }
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            this.field_a = 0;
                            break L10;
                          }
                        }
                        L12: {
                          if (this.field_b) {
                            break L12;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L12;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              break L12;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L13: {
                    this.field_k = var10.M(-107);
                    if (this.field_d) {
                      break L13;
                    } else {
                      if (this.field_k) {
                        this.field_d = true;
                        this.a(uw.field_b, (ms) null, 5, -88);
                        break L13;
                      } else {
                        L14: {
                          if (this.field_f) {
                            break L14;
                          } else {
                            if (-1 <= (var10.a(393216, 2) ^ -1)) {
                              break L14;
                            } else {
                              this.field_f = true;
                              this.a(lja.field_a, (ms) null, 5, -74);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (!this.field_f) {
                            break L15;
                          } else {
                            L16: {
                              if (var10.a(393216, 2) != 0) {
                                break L16;
                              } else {
                                this.field_a = this.field_a + 1;
                                if (this.field_j) {
                                  break L15;
                                } else {
                                  if (500 < this.field_a) {
                                    this.field_j = true;
                                    this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                                    if (var9 == 0) {
                                      break L15;
                                    } else {
                                      break L16;
                                    }
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                            }
                            this.field_a = 0;
                            break L15;
                          }
                        }
                        L17: {
                          if (this.field_b) {
                            break L17;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L17;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              break L17;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L18: {
                    if (this.field_f) {
                      break L18;
                    } else {
                      if (-1 <= (var10.a(393216, 2) ^ -1)) {
                        break L18;
                      } else {
                        L19: {
                          this.field_f = true;
                          this.a(lja.field_a, (ms) null, 5, -74);
                          if (!this.field_f) {
                            break L19;
                          } else {
                            L20: {
                              if (var10.a(393216, 2) != 0) {
                                break L20;
                              } else {
                                this.field_a = this.field_a + 1;
                                if (this.field_j) {
                                  break L19;
                                } else {
                                  if (500 < this.field_a) {
                                    this.field_j = true;
                                    this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                                    if (var9 == 0) {
                                      break L19;
                                    } else {
                                      break L20;
                                    }
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            this.field_a = 0;
                            break L19;
                          }
                        }
                        L21: {
                          if (this.field_b) {
                            break L21;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L21;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              break L21;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  L22: {
                    if (!this.field_f) {
                      break L22;
                    } else {
                      if (var10.a(393216, 2) == 0) {
                        this.field_a = this.field_a + 1;
                        if (this.field_j) {
                          break L22;
                        } else {
                          if (500 < this.field_a) {
                            this.field_j = true;
                            this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                            if (var9 == 0) {
                              break L22;
                            } else {
                              L23: {
                                this.field_a = 0;
                                if (this.field_b) {
                                  break L23;
                                } else {
                                  if (-2 != (var10.u((byte) 127) ^ -1)) {
                                    break L23;
                                  } else {
                                    this.field_b = true;
                                    this.a(uj.field_f, (ms) null, 5, -108);
                                    break L23;
                                  }
                                }
                              }
                              return;
                            }
                          } else {
                            L24: {
                              if (this.field_b) {
                                break L24;
                              } else {
                                if (-2 != (var10.u((byte) 127) ^ -1)) {
                                  break L24;
                                } else {
                                  this.field_b = true;
                                  this.a(uj.field_f, (ms) null, 5, -108);
                                  break L24;
                                }
                              }
                            }
                            return;
                          }
                        }
                      } else {
                        L25: {
                          this.field_a = 0;
                          if (this.field_b) {
                            break L25;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L25;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              break L25;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                  if (!this.field_b) {
                    if (-2 == (var10.u((byte) 127) ^ -1)) {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              }
            } else {
              break L2;
            }
          }
          stackOut_97_0 = var10.r((byte) -102);
          stackIn_98_0 = stackOut_97_0;
          break L1;
        }
        L26: {
          var5 = stackIn_98_0;
          if (this.field_e == var5) {
            break L26;
          } else {
            this.field_a = 0;
            this.field_e = var5;
            var6 = fe.field_C[4] + -10;
            if (1 == this.field_e) {
              this.a(tha.field_A, (ms) null, var6, param0 ^ -9888);
              break L26;
            } else {
              this.field_k = var10.M(-107);
              if (this.field_d) {
                L27: {
                  if (this.field_f) {
                    break L27;
                  } else {
                    if (-1 <= (var10.a(393216, 2) ^ -1)) {
                      break L27;
                    } else {
                      this.field_f = true;
                      this.a(lja.field_a, (ms) null, 5, -74);
                      break L27;
                    }
                  }
                }
                L28: {
                  if (!this.field_f) {
                    break L28;
                  } else {
                    L29: {
                      if (var10.a(393216, 2) != 0) {
                        break L29;
                      } else {
                        this.field_a = this.field_a + 1;
                        if (this.field_j) {
                          break L28;
                        } else {
                          if (500 < this.field_a) {
                            this.field_j = true;
                            this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                            if (var9 == 0) {
                              break L28;
                            } else {
                              break L29;
                            }
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    this.field_a = 0;
                    break L28;
                  }
                }
                L30: {
                  if (this.field_b) {
                    break L30;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L30;
                    } else {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      break L30;
                    }
                  }
                }
                return;
              } else {
                L31: {
                  if (this.field_k) {
                    this.field_d = true;
                    this.a(uw.field_b, (ms) null, 5, -88);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (this.field_f) {
                    break L32;
                  } else {
                    if (-1 <= (var10.a(393216, 2) ^ -1)) {
                      break L32;
                    } else {
                      this.field_f = true;
                      this.a(lja.field_a, (ms) null, 5, -74);
                      break L32;
                    }
                  }
                }
                L33: {
                  if (!this.field_f) {
                    break L33;
                  } else {
                    L34: {
                      if (var10.a(393216, 2) != 0) {
                        break L34;
                      } else {
                        this.field_a = this.field_a + 1;
                        if (this.field_j) {
                          break L33;
                        } else {
                          if (500 < this.field_a) {
                            this.field_j = true;
                            this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                            if (var9 == 0) {
                              break L33;
                            } else {
                              break L34;
                            }
                          } else {
                            break L33;
                          }
                        }
                      }
                    }
                    this.field_a = 0;
                    break L33;
                  }
                }
                L35: {
                  if (this.field_b) {
                    break L35;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L35;
                    } else {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      break L35;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        L36: {
          this.field_k = var10.M(-107);
          if (this.field_d) {
            break L36;
          } else {
            if (this.field_k) {
              this.field_d = true;
              this.a(uw.field_b, (ms) null, 5, -88);
              break L36;
            } else {
              L37: {
                if (this.field_f) {
                  break L37;
                } else {
                  if (-1 <= (var10.a(393216, 2) ^ -1)) {
                    break L37;
                  } else {
                    this.field_f = true;
                    this.a(lja.field_a, (ms) null, 5, -74);
                    break L37;
                  }
                }
              }
              L38: {
                if (!this.field_f) {
                  break L38;
                } else {
                  L39: {
                    if (var10.a(393216, 2) != 0) {
                      break L39;
                    } else {
                      this.field_a = this.field_a + 1;
                      if (this.field_j) {
                        break L38;
                      } else {
                        if (500 < this.field_a) {
                          this.field_j = true;
                          this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                          if (var9 == 0) {
                            break L38;
                          } else {
                            break L39;
                          }
                        } else {
                          break L38;
                        }
                      }
                    }
                  }
                  this.field_a = 0;
                  break L38;
                }
              }
              if (!this.field_b) {
                if (-2 == (var10.u((byte) 127) ^ -1)) {
                  this.field_b = true;
                  this.a(uj.field_f, (ms) null, 5, -108);
                  return;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        if (!this.field_f) {
          if (-1 > (var10.a(393216, 2) ^ -1)) {
            L40: {
              this.field_f = true;
              this.a(lja.field_a, (ms) null, 5, -74);
              if (!this.field_f) {
                break L40;
              } else {
                L41: {
                  if (var10.a(393216, 2) != 0) {
                    break L41;
                  } else {
                    this.field_a = this.field_a + 1;
                    if (this.field_j) {
                      break L40;
                    } else {
                      if (500 < this.field_a) {
                        this.field_j = true;
                        this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                        if (var9 == 0) {
                          break L40;
                        } else {
                          break L41;
                        }
                      } else {
                        L42: {
                          if (this.field_b) {
                            break L42;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L42;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L43: {
                  this.field_a = 0;
                  if (this.field_b) {
                    break L43;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L43;
                    } else {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      return;
                    }
                  }
                }
                return;
              }
            }
            L44: {
              if (this.field_b) {
                break L44;
              } else {
                if (-2 != (var10.u((byte) 127) ^ -1)) {
                  break L44;
                } else {
                  this.field_b = true;
                  this.a(uj.field_f, (ms) null, 5, -108);
                  return;
                }
              }
            }
            return;
          } else {
            L45: {
              if (!this.field_f) {
                break L45;
              } else {
                L46: {
                  if (var10.a(393216, 2) != 0) {
                    break L46;
                  } else {
                    this.field_a = this.field_a + 1;
                    if (this.field_j) {
                      break L45;
                    } else {
                      if (500 < this.field_a) {
                        this.field_j = true;
                        this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                        if (var9 == 0) {
                          break L45;
                        } else {
                          break L46;
                        }
                      } else {
                        L47: {
                          if (this.field_b) {
                            break L47;
                          } else {
                            if (-2 != (var10.u((byte) 127) ^ -1)) {
                              break L47;
                            } else {
                              this.field_b = true;
                              this.a(uj.field_f, (ms) null, 5, -108);
                              return;
                            }
                          }
                        }
                        return;
                      }
                    }
                  }
                }
                L48: {
                  this.field_a = 0;
                  if (this.field_b) {
                    break L48;
                  } else {
                    if (-2 != (var10.u((byte) 127) ^ -1)) {
                      break L48;
                    } else {
                      this.field_b = true;
                      this.a(uj.field_f, (ms) null, 5, -108);
                      return;
                    }
                  }
                }
                return;
              }
            }
            L49: {
              if (this.field_b) {
                break L49;
              } else {
                if (-2 != (var10.u((byte) 127) ^ -1)) {
                  break L49;
                } else {
                  this.field_b = true;
                  this.a(uj.field_f, (ms) null, 5, -108);
                  return;
                }
              }
            }
            return;
          }
        } else {
          L50: {
            if (!this.field_f) {
              break L50;
            } else {
              L51: {
                if (var10.a(393216, 2) != 0) {
                  break L51;
                } else {
                  this.field_a = this.field_a + 1;
                  if (this.field_j) {
                    break L50;
                  } else {
                    if (500 < this.field_a) {
                      this.field_j = true;
                      this.a(wd.field_a, (ms) null, 25, param0 ^ -9867);
                      if (var9 == 0) {
                        break L50;
                      } else {
                        break L51;
                      }
                    } else {
                      if (!this.field_b) {
                        if (-2 == (var10.u((byte) 127) ^ -1)) {
                          this.field_b = true;
                          this.a(uj.field_f, (ms) null, 5, -108);
                          return;
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
              L52: {
                this.field_a = 0;
                if (this.field_b) {
                  break L52;
                } else {
                  if (-2 != (var10.u((byte) 127) ^ -1)) {
                    break L52;
                  } else {
                    this.field_b = true;
                    this.a(uj.field_f, (ms) null, 5, -108);
                    return;
                  }
                }
              }
              return;
            }
          }
          L53: {
            if (this.field_b) {
              break L53;
            } else {
              if (-2 != (var10.u((byte) 127) ^ -1)) {
                break L53;
              } else {
                this.field_b = true;
                this.a(uj.field_f, (ms) null, 5, -108);
                return;
              }
            }
          }
          return;
        }
    }

    private final void a(String param0, ms param1, int param2, int param3) {
        dl var5 = null;
        try {
            if (param3 > -56) {
                this.b((byte) 111);
            }
            var5 = new dl(this.field_l, param1);
            var5.a(tea.field_a, param0, vda.field_n, (byte) 21);
            this.field_c.b((byte) -125, new mga(var5, param2));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sna.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0) {
        mga var2 = null;
        int var3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        int stackOut_2_0 = 0;
        byte stackOut_9_0 = 0;
        var3 = TombRacer.field_G ? 1 : 0;
        var2 = (mga) ((Object) this.field_c.f(-80));
        L0: while (true) {
          L1: {
            L2: {
              if (var2 == null) {
                break L2;
              } else {
                stackOut_2_0 = var2.field_k;
                stackIn_10_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  L3: {
                    L4: {
                      if (stackIn_3_0 > 0) {
                        break L4;
                      } else {
                        if (this.field_l.d(0)) {
                          break L3;
                        } else {
                          this.field_l.a(var2.field_h, param0 ^ 644);
                          var2.p(param0 ^ 18);
                          if (var3 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var2.field_k = var2.field_k - 1;
                    break L3;
                  }
                  var2 = (mga) ((Object) this.field_c.e(108));
                  if (var3 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            stackOut_9_0 = param0;
            stackIn_10_0 = stackOut_9_0;
            break L1;
          }
          if (stackIn_10_0 != 44) {
            this.a(1);
            return;
          } else {
            return;
          }
        }
    }

    final void b(byte param0) {
        if (param0 != -121) {
            this.field_a = -88;
        }
    }

    sna(qh param0) {
        this.field_m = false;
        this.field_d = false;
        this.field_g = -1;
        this.field_h = false;
        this.field_j = false;
        this.field_b = false;
        this.field_i = false;
        this.field_f = false;
        this.field_a = 0;
        this.field_k = false;
        this.field_e = 0;
        this.field_c = new vna();
        try {
            this.field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "sna.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
