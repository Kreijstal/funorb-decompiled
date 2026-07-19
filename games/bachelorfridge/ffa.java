/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ffa extends kj {
    static String field_i;
    private int field_g;
    static String[][] field_j;
    private rb field_f;
    static String field_h;

    final boolean b(int param0) {
        int fieldTemp$8 = 0;
        boolean discarded$9 = false;
        int fieldTemp$10 = 0;
        boolean discarded$11 = false;
        int fieldTemp$12 = 0;
        boolean discarded$13 = false;
        int fieldTemp$14 = 0;
        boolean discarded$15 = false;
        if (this.field_g != 60) {
          if (param0 > 21) {
            fieldTemp$8 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (-1 < (fieldTemp$8 ^ -1)) {
              jja.a(256, -1, 19);
              discarded$9 = dha.a(-120, this.field_f, this.field_e);
              return true;
            } else {
              return false;
            }
          } else {
            field_j = (String[][]) null;
            fieldTemp$10 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (-1 < (fieldTemp$10 ^ -1)) {
              jja.a(256, -1, 19);
              discarded$11 = dha.a(-120, this.field_f, this.field_e);
              return true;
            } else {
              return false;
            }
          }
        } else {
          jja.a(192, -1, 25);
          if (param0 <= 21) {
            field_j = (String[][]) null;
            fieldTemp$12 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (-1 < (fieldTemp$12 ^ -1)) {
              jja.a(256, -1, 19);
              discarded$13 = dha.a(-120, this.field_f, this.field_e);
              return true;
            } else {
              return false;
            }
          } else {
            fieldTemp$14 = this.field_g - 1;
            this.field_g = this.field_g - 1;
            if (-1 < (fieldTemp$14 ^ -1)) {
              jja.a(256, -1, 19);
              discarded$15 = dha.a(-120, this.field_f, this.field_e);
              return true;
            } else {
              return false;
            }
          }
        }
    }

    ffa(gj param0, rb param1, int param2, int param3) {
        super(param0, param2, param3);
        try {
            this.field_f = param1;
            this.field_g = 80;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ffa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static k a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var2 = param1;
        if (var2 != 0) {
          if (var2 != 1) {
            if (var2 != 2) {
              if (3 != var2) {
                if ((var2 ^ -1) != -5) {
                  if (5 != var2) {
                    if (-7 != (var2 ^ -1)) {
                      if (var2 != 7) {
                        if ((var2 ^ -1) != -9) {
                          if (var2 != 9) {
                            if ((var2 ^ -1) != -11) {
                              if (11 != var2) {
                                if (-13 != (var2 ^ -1)) {
                                  if ((var2 ^ -1) != -14) {
                                    if ((var2 ^ -1) != -15) {
                                      if ((var2 ^ -1) != -16) {
                                        if (var2 != 16) {
                                          if (var2 != 17) {
                                            if (18 != var2) {
                                              if (var2 != 19) {
                                                if (20 != var2) {
                                                  if (21 != var2) {
                                                    if (-23 != (var2 ^ -1)) {
                                                      if (var2 != 23) {
                                                        if (24 != var2) {
                                                          if (var2 != 25) {
                                                            if (var2 != 26) {
                                                              if (-28 != (var2 ^ -1)) {
                                                                if ((var2 ^ -1) != -29) {
                                                                  if (-30 != (var2 ^ -1)) {
                                                                    if (30 != var2) {
                                                                      if (-32 != (var2 ^ -1)) {
                                                                        if (32 != var2) {
                                                                          if ((var2 ^ -1) != -34) {
                                                                            if (-35 != (var2 ^ -1)) {
                                                                              if (35 != var2) {
                                                                                if ((var2 ^ -1) != -37) {
                                                                                  if (var2 == 37) {
                                                                                    return (k) ((Object) new lfa());
                                                                                  } else {
                                                                                    if (38 == var2) {
                                                                                      return (k) ((Object) new qca());
                                                                                    } else {
                                                                                      if ((var2 ^ -1) != -40) {
                                                                                        if (param0 != -16) {
                                                                                          field_i = (String) null;
                                                                                          return null;
                                                                                        } else {
                                                                                          return null;
                                                                                        }
                                                                                      } else {
                                                                                        return (k) ((Object) new qb());
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  return (k) ((Object) new kma());
                                                                                }
                                                                              } else {
                                                                                return (k) ((Object) new qk());
                                                                              }
                                                                            } else {
                                                                              return (k) ((Object) new dc());
                                                                            }
                                                                          } else {
                                                                            return (k) ((Object) new qna());
                                                                          }
                                                                        } else {
                                                                          return (k) ((Object) new fn());
                                                                        }
                                                                      } else {
                                                                        return (k) ((Object) new oj());
                                                                      }
                                                                    } else {
                                                                      return (k) ((Object) new ef());
                                                                    }
                                                                  } else {
                                                                    return (k) ((Object) new ama());
                                                                  }
                                                                } else {
                                                                  return (k) ((Object) new gt());
                                                                }
                                                              } else {
                                                                return (k) ((Object) new hda());
                                                              }
                                                            } else {
                                                              return (k) ((Object) new wr());
                                                            }
                                                          } else {
                                                            return (k) ((Object) new wla());
                                                          }
                                                        } else {
                                                          return (k) ((Object) new sj());
                                                        }
                                                      } else {
                                                        return (k) ((Object) new aea());
                                                      }
                                                    } else {
                                                      return (k) ((Object) new rc());
                                                    }
                                                  } else {
                                                    return (k) ((Object) new jq());
                                                  }
                                                } else {
                                                  return (k) ((Object) new ag());
                                                }
                                              } else {
                                                return (k) ((Object) new kba());
                                              }
                                            } else {
                                              return (k) ((Object) new an());
                                            }
                                          } else {
                                            return (k) ((Object) new wt());
                                          }
                                        } else {
                                          return (k) ((Object) new sk());
                                        }
                                      } else {
                                        return (k) ((Object) new bh());
                                      }
                                    } else {
                                      return (k) ((Object) new jh());
                                    }
                                  } else {
                                    return (k) ((Object) new qa());
                                  }
                                } else {
                                  return (k) ((Object) new et());
                                }
                              } else {
                                return (k) ((Object) new wq());
                              }
                            } else {
                              return (k) ((Object) new ada());
                            }
                          } else {
                            return (k) ((Object) new oba());
                          }
                        } else {
                          return (k) ((Object) new afa());
                        }
                      } else {
                        return (k) ((Object) new ska());
                      }
                    } else {
                      return (k) ((Object) new cd());
                    }
                  } else {
                    return (k) ((Object) new jia());
                  }
                } else {
                  return (k) ((Object) new ig());
                }
              } else {
                return (k) ((Object) new pe());
              }
            } else {
              return (k) ((Object) new uv());
            }
          } else {
            return (k) ((Object) new pma());
          }
        } else {
          return (k) ((Object) new kfa());
        }
    }

    final static void a(String param0, int param1) {
        try {
            re.field_D = param0;
            ep.a(param1, 8192);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ffa.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        var4 = (400 - -(-(this.field_g * 655360) + 52428800 >> 136562704)) * this.field_g / 80;
        if (!param1) {
          return;
        } else {
          hr.field_c.a(param2, param0 + (-var4 + -64), 192);
          return;
        }
    }

    public static void c(int param0) {
        field_j = (String[][]) null;
        field_h = null;
        field_i = null;
        if (param0 != 22533) {
            String var2 = (String) null;
            ffa.a((String) null, -3);
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            this.a(-61, 93, 65);
        }
    }

    static {
        field_i = "Only show game chat from my friends";
        field_h = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
