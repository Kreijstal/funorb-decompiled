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
        if (((ffa) this).field_g != 60) {
          if (param0 > 21) {
            int fieldTemp$8 = ((ffa) this).field_g - 1;
            ((ffa) this).field_g = ((ffa) this).field_g - 1;
            if (fieldTemp$8 < 0) {
              jja.a(256, -1, 19);
              boolean discarded$9 = dha.a(-120, (bca) (Object) ((ffa) this).field_f, ((ffa) this).field_e);
              return true;
            } else {
              return false;
            }
          } else {
            field_j = null;
            int fieldTemp$10 = ((ffa) this).field_g - 1;
            ((ffa) this).field_g = ((ffa) this).field_g - 1;
            if (fieldTemp$10 < 0) {
              jja.a(256, -1, 19);
              boolean discarded$11 = dha.a(-120, (bca) (Object) ((ffa) this).field_f, ((ffa) this).field_e);
              return true;
            } else {
              return false;
            }
          }
        } else {
          jja.a(192, -1, 25);
          if (param0 <= 21) {
            field_j = null;
            int fieldTemp$12 = ((ffa) this).field_g - 1;
            ((ffa) this).field_g = ((ffa) this).field_g - 1;
            if (fieldTemp$12 < 0) {
              jja.a(256, -1, 19);
              boolean discarded$13 = dha.a(-120, (bca) (Object) ((ffa) this).field_f, ((ffa) this).field_e);
              return true;
            } else {
              return false;
            }
          } else {
            int fieldTemp$14 = ((ffa) this).field_g - 1;
            ((ffa) this).field_g = ((ffa) this).field_g - 1;
            if (fieldTemp$14 < 0) {
              jja.a(256, -1, 19);
              boolean discarded$15 = dha.a(-120, (bca) (Object) ((ffa) this).field_f, ((ffa) this).field_e);
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
            ((ffa) this).field_f = param1;
            ((ffa) this).field_g = 80;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ffa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static k a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        var2 = param1;
        if (var2 == 0) {
          return (k) (Object) new kfa();
        } else {
          if (var2 == 1) {
            return (k) (Object) new pma();
          } else {
            if (var2 == 2) {
              return (k) (Object) new uv();
            } else {
              if (3 == var2) {
                return (k) (Object) new pe();
              } else {
                if (var2 == 4) {
                  return (k) (Object) new ig();
                } else {
                  if (5 == var2) {
                    return (k) (Object) new jia();
                  } else {
                    if (var2 == 6) {
                      return (k) (Object) new cd();
                    } else {
                      if (var2 != 7) {
                        if (var2 != 8) {
                          if (var2 == 9) {
                            return (k) (Object) new oba();
                          } else {
                            if (var2 != 10) {
                              if (11 == var2) {
                                return (k) (Object) new wq();
                              } else {
                                if (var2 == 12) {
                                  return (k) (Object) new et();
                                } else {
                                  if (var2 != 13) {
                                    if (var2 != 14) {
                                      if (var2 != 15) {
                                        if (var2 == 16) {
                                          return (k) (Object) new sk();
                                        } else {
                                          if (var2 == 17) {
                                            return (k) (Object) new wt();
                                          } else {
                                            if (18 != var2) {
                                              if (var2 == 19) {
                                                return (k) (Object) new kba();
                                              } else {
                                                if (20 == var2) {
                                                  return (k) (Object) new ag();
                                                } else {
                                                  if (21 != var2) {
                                                    if (var2 == 22) {
                                                      return (k) (Object) new rc();
                                                    } else {
                                                      if (var2 != 23) {
                                                        if (24 != var2) {
                                                          if (var2 == 25) {
                                                            return (k) (Object) new wla();
                                                          } else {
                                                            if (var2 == 26) {
                                                              return (k) (Object) new wr();
                                                            } else {
                                                              if (var2 == 27) {
                                                                return (k) (Object) new hda();
                                                              } else {
                                                                if (var2 == 28) {
                                                                  return (k) (Object) new gt();
                                                                } else {
                                                                  if (var2 != 29) {
                                                                    if (30 == var2) {
                                                                      return (k) (Object) new ef();
                                                                    } else {
                                                                      if (var2 != 31) {
                                                                        if (32 == var2) {
                                                                          return (k) (Object) new fn();
                                                                        } else {
                                                                          if (var2 == 33) {
                                                                            return (k) (Object) new qna();
                                                                          } else {
                                                                            if (var2 == 34) {
                                                                              return (k) (Object) new dc();
                                                                            } else {
                                                                              if (35 == var2) {
                                                                                return (k) (Object) new qk();
                                                                              } else {
                                                                                if (var2 != 36) {
                                                                                  if (var2 == 37) {
                                                                                    return (k) (Object) new lfa();
                                                                                  } else {
                                                                                    if (38 == var2) {
                                                                                      return (k) (Object) new qca();
                                                                                    } else {
                                                                                      if (var2 == 39) {
                                                                                        return (k) (Object) new qb();
                                                                                      } else {
                                                                                        return null;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                } else {
                                                                                  return (k) (Object) new kma();
                                                                                }
                                                                              }
                                                                            }
                                                                          }
                                                                        }
                                                                      } else {
                                                                        return (k) (Object) new oj();
                                                                      }
                                                                    }
                                                                  } else {
                                                                    return (k) (Object) new ama();
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          return (k) (Object) new sj();
                                                        }
                                                      } else {
                                                        return (k) (Object) new aea();
                                                      }
                                                    }
                                                  } else {
                                                    return (k) (Object) new jq();
                                                  }
                                                }
                                              }
                                            } else {
                                              return (k) (Object) new an();
                                            }
                                          }
                                        }
                                      } else {
                                        return (k) (Object) new bh();
                                      }
                                    } else {
                                      return (k) (Object) new jh();
                                    }
                                  } else {
                                    return (k) (Object) new qa();
                                  }
                                }
                              }
                            } else {
                              return (k) (Object) new ada();
                            }
                          }
                        } else {
                          return (k) (Object) new afa();
                        }
                      } else {
                        return (k) (Object) new ska();
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    final static void a(String param0) {
        try {
            re.field_D = param0;
            ep.a(12, 8192);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ffa.C(" + (param0 != null ? "{...}" : "null") + ',' + 12 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2) {
        int var4 = 0;
        var4 = (400 - -(-(((ffa) this).field_g * 655360) + 52428800 >> 16)) * ((ffa) this).field_g / 80;
        if (!param1) {
          return;
        } else {
          hr.field_c.a(param2, param0 + (-var4 + -64), 192);
          return;
        }
    }

    public static void c() {
        field_j = null;
        field_h = null;
        field_i = null;
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((ffa) this).a(-61, 93, 65);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Only show game chat from my friends";
        field_h = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
