/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends cr {
    cr field_Lb;
    static int field_Mb;
    cr field_Nb;
    ie field_Hb;
    static String field_Ib;
    static int field_Kb;
    static String field_Ob;
    static mp field_Jb;

    public static void k(int param0) {
        if (param0 != -23936) {
          field_Ob = (String) null;
          field_Ob = null;
          field_Jb = null;
          field_Ib = null;
          return;
        } else {
          field_Ob = null;
          field_Jb = null;
          field_Ib = null;
          return;
        }
    }

    final boolean a(int param0, int param1, boolean param2, boolean param3, int param4, int param5) {
        if (param4 >= 0) {
            field_Jb = (mp) null;
            return this.a(param3, this.field_Lb.field_db, param5, param1, param2, 22, param0);
        }
        return this.a(param3, this.field_Lb.field_db, param5, param1, param2, 22, param0);
    }

    final static int a(byte param0) {
        if (qc.field_A >= 2) {
          if (np.field_Lb != 0) {
            if (null != qc.field_B) {
              if (!qc.field_B.b(0)) {
                return 14;
              } else {
                if (!qc.field_B.b("", -1)) {
                  return 29;
                } else {
                  if (qc.field_B.c("", 0)) {
                    if (!ke.field_b.b(0)) {
                      return 43;
                    } else {
                      if (!ke.field_b.c("commonui", 0)) {
                        return 57;
                      } else {
                        if (la.field_e.b(0)) {
                          if (la.field_e.c("commonui", 0)) {
                            if (!kb.field_b.b(0)) {
                              return 82;
                            } else {
                              if (kb.field_b.a((byte) -112)) {
                                if (param0 >= -6) {
                                  return -85;
                                } else {
                                  return 100;
                                }
                              } else {
                                return 86;
                              }
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      }
                    }
                  } else {
                    return 29;
                  }
                }
              }
            } else {
              if (!ke.field_b.b(0)) {
                return 43;
              } else {
                if (!ke.field_b.c("commonui", 0)) {
                  return 57;
                } else {
                  if (la.field_e.b(0)) {
                    if (la.field_e.c("commonui", 0)) {
                      if (!kb.field_b.b(0)) {
                        return 82;
                      } else {
                        if (kb.field_b.a((byte) -112)) {
                          if (param0 >= -6) {
                            return -85;
                          } else {
                            return 100;
                          }
                        } else {
                          return 86;
                        }
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                }
              }
            }
          } else {
            if (!ke.field_b.b(0)) {
              return 20;
            } else {
              if (ke.field_b.c("commonui", 0)) {
                if (!la.field_e.b(0)) {
                  return 50;
                } else {
                  if (la.field_e.c("commonui", 0)) {
                    if (kb.field_b.b(0)) {
                      if (kb.field_b.a((byte) -112)) {
                        if (param0 >= -6) {
                          return -85;
                        } else {
                          return 100;
                        }
                      } else {
                        return 80;
                      }
                    } else {
                      return 70;
                    }
                  } else {
                    return 60;
                  }
                }
              } else {
                return 40;
              }
            }
          }
        } else {
          return 0;
        }
    }

    private final boolean a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var8 = 0;
        if (param5 < 1) {
            return false;
        }
        if (!param0) {
            if (!this.field_pb) {
                var8 = 0;
                this.field_Nb.a(this.field_Lb.field_db, 0, param3, var8 != 0);
                this.a(false, true, param2, param6, param1);
                return var8 != 0;
            }
            if (param4) {
                var8 = 0;
                this.field_Nb.a(this.field_Lb.field_db, 0, param3, var8 != 0);
                this.a(false, true, param2, param6, param1);
                return var8 != 0;
            }
            var8 = 1;
            this.field_Nb.a(this.field_Lb.field_db, 0, param3, var8 != 0);
            this.a(false, true, param2, param6, param1);
            return var8 != 0;
        }
        var8 = 1;
        this.field_Nb.a(this.field_Lb.field_db, 0, param3, var8 != 0);
        this.a(false, true, param2, param6, param1);
        return var8 != 0;
    }

    private final void a(int param0, int param1, int param2) {
        this.field_Nb.field_wb = 0;
        this.field_Lb.field_Fb = -param1 + this.field_Fb - param2;
        if (param0 != 1899) {
            field_Ob = (String) null;
            this.field_Lb.field_db = this.field_db;
            this.field_Nb.field_Fb = this.field_Fb - param1 + -param2;
            this.field_Hb.a(this.field_db, param1, 0, (byte) 102, -this.field_Nb.field_N, this.field_Nb.field_db, -param1 + this.field_Fb, this.field_Lb.field_db);
            return;
        }
        this.field_Lb.field_db = this.field_db;
        this.field_Nb.field_Fb = this.field_Fb - param1 + -param2;
        this.field_Hb.a(this.field_db, param1, 0, (byte) 102, -this.field_Nb.field_N, this.field_Nb.field_db, -param1 + this.field_Fb, this.field_Lb.field_db);
    }

    private final void a(boolean param0, boolean param1, int param2, int param3, int param4) {
        if (!this.field_Hb.p(-109)) {
          if (!this.field_Hb.m(70)) {
            L0: {
              if (this.field_Hb.l(-117)) {
                this.field_Nb.field_L = this.field_Nb.field_L + param4;
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              if (this.field_Hb.n(-22155)) {
                this.field_Nb.field_L = this.field_Nb.field_L - param4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_pb) {
                this.field_Nb.field_L = this.field_Nb.field_L - param3;
                break L2;
              } else {
                break L2;
              }
            }
            if (param1) {
              L3: {
                if (!param0) {
                  L4: {
                    if (-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb) < -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                      this.field_Nb.field_L = -(-this.field_Lb.field_db + this.field_Nb.field_kb + this.field_Nb.field_db) + -this.field_Nb.field_N;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if ((-(this.field_Nb.field_N + this.field_Nb.field_L) ^ -1) > -1) {
                    this.field_Nb.field_L = -this.field_Nb.field_N;
                    break L3;
                  } else {
                    if (!this.field_Hb.k(0)) {
                      this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                      return;
                    } else {
                      this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                      this.field_Nb.field_L = 0;
                      this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                      return;
                    }
                  }
                } else {
                  L5: {
                    if (0 > -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                      this.field_Nb.field_L = -this.field_Nb.field_N;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (-(this.field_Nb.field_L + this.field_Nb.field_N) <= this.field_Nb.field_db - -this.field_Nb.field_kb - this.field_Lb.field_db) {
                    break L3;
                  } else {
                    this.field_Nb.field_L = -this.field_Nb.field_N + -(-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb));
                    if (!this.field_Hb.k(0)) {
                      this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                      return;
                    } else {
                      this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                      this.field_Nb.field_L = 0;
                      this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                      return;
                    }
                  }
                }
              }
              if (!this.field_Hb.k(0)) {
                this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                return;
              } else {
                this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                this.field_Nb.field_L = 0;
                this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                return;
              }
            } else {
              return;
            }
          } else {
            L6: {
              this.field_Nb.field_L = this.field_Nb.field_L - param2;
              if (this.field_Hb.l(-117)) {
                this.field_Nb.field_L = this.field_Nb.field_L + param4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (this.field_Hb.n(-22155)) {
                this.field_Nb.field_L = this.field_Nb.field_L - param4;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (this.field_pb) {
                this.field_Nb.field_L = this.field_Nb.field_L - param3;
                break L8;
              } else {
                break L8;
              }
            }
            if (param1) {
              L9: {
                if (!param0) {
                  L10: {
                    if (-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb) < -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                      this.field_Nb.field_L = -(-this.field_Lb.field_db + this.field_Nb.field_kb + this.field_Nb.field_db) + -this.field_Nb.field_N;
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  if ((-(this.field_Nb.field_N + this.field_Nb.field_L) ^ -1) > -1) {
                    this.field_Nb.field_L = -this.field_Nb.field_N;
                    break L9;
                  } else {
                    break L9;
                  }
                } else {
                  L11: {
                    if (0 > -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                      this.field_Nb.field_L = -this.field_Nb.field_N;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  if (-(this.field_Nb.field_L + this.field_Nb.field_N) > this.field_Nb.field_db - -this.field_Nb.field_kb - this.field_Lb.field_db) {
                    this.field_Nb.field_L = -this.field_Nb.field_N + -(-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb));
                    break L9;
                  } else {
                    L12: {
                      if (!this.field_Hb.k(0)) {
                        break L12;
                      } else {
                        this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                        this.field_Nb.field_L = 0;
                        break L12;
                      }
                    }
                    this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                    return;
                  }
                }
              }
              if (this.field_Hb.k(0)) {
                this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                this.field_Nb.field_L = 0;
                this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                return;
              } else {
                this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
                return;
              }
            } else {
              return;
            }
          }
        } else {
          L13: {
            this.field_Nb.field_L = this.field_Nb.field_L + param2;
            if (!this.field_Hb.m(70)) {
              break L13;
            } else {
              this.field_Nb.field_L = this.field_Nb.field_L - param2;
              break L13;
            }
          }
          L14: {
            if (this.field_Hb.l(-117)) {
              this.field_Nb.field_L = this.field_Nb.field_L + param4;
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (this.field_Hb.n(-22155)) {
              this.field_Nb.field_L = this.field_Nb.field_L - param4;
              break L15;
            } else {
              break L15;
            }
          }
          L16: {
            if (this.field_pb) {
              this.field_Nb.field_L = this.field_Nb.field_L - param3;
              break L16;
            } else {
              break L16;
            }
          }
          if (param1) {
            L17: {
              if (!param0) {
                L18: {
                  if (-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb) < -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                    this.field_Nb.field_L = -(-this.field_Lb.field_db + this.field_Nb.field_kb + this.field_Nb.field_db) + -this.field_Nb.field_N;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                if ((-(this.field_Nb.field_N + this.field_Nb.field_L) ^ -1) > -1) {
                  this.field_Nb.field_L = -this.field_Nb.field_N;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                L19: {
                  if (0 > -(this.field_Nb.field_L + this.field_Nb.field_N)) {
                    this.field_Nb.field_L = -this.field_Nb.field_N;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                if (-(this.field_Nb.field_L + this.field_Nb.field_N) <= this.field_Nb.field_db - -this.field_Nb.field_kb - this.field_Lb.field_db) {
                  break L17;
                } else {
                  this.field_Nb.field_L = -this.field_Nb.field_N + -(-this.field_Lb.field_db + (this.field_Nb.field_db + this.field_Nb.field_kb));
                  break L17;
                }
              }
            }
            L20: {
              if (!this.field_Hb.k(0)) {
                break L20;
              } else {
                this.field_Nb.field_N = -this.field_Hb.a(this.field_Nb.field_db, true, param0, this.field_Lb.field_db);
                this.field_Nb.field_L = 0;
                break L20;
              }
            }
            this.field_Hb.a(this.field_Nb.field_db, -this.field_Nb.field_N, (byte) -87, this.field_Lb.field_db);
            return;
          } else {
            return;
          }
        }
    }

    final void a(int param0, boolean param1, int param2, int param3) {
        if (param2 != -1) {
            return;
        }
        this.a(param1, true, param0, param3, this.field_Lb.field_db);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this.field_wb = param4;
        this.field_db = param3;
        this.field_Fb = param5;
        this.field_N = param0;
        this.a(1899, param2, param1);
        if (param6 != 3124) {
            field_Ib = (String) null;
        }
    }

    od(long param0, cr param1, cr param2, ie param3) {
        super(param0, (cr) null);
        try {
            this.field_Lb = new cr(0L, param2);
            this.field_Hb = new ie(0L, param3);
            this.b(this.field_Lb, 125);
            this.b(this.field_Hb, 124);
            this.field_Nb = param1;
            this.field_Lb.b(param1, 124);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "od.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_Mb = 97;
        field_Ib = "Players: ";
        field_Ob = "Waiting for <%0> to start the game...";
    }
}
