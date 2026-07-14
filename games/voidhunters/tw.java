/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tw implements ntb {
    boa field_a;
    so field_d;
    twa field_e;
    static caa[] field_f;
    int field_b;
    dv field_c;

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        tw var5_ref = null;
        L0: {
          var5 = null;
          var5_ref = (tw) (Object) param0;
          if (var5_ref.field_d == null) {
            break L0;
          } else {
            if (var5_ref.field_d != null) {
              var5_ref.field_d.a((tv) (Object) var5_ref.field_d, -52);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (var5_ref.field_e == null) {
            break L1;
          } else {
            if (var5_ref.field_e != null) {
              var5_ref.field_e.a((tv) (Object) var5_ref.field_e, -93);
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (null == var5_ref.field_c) {
            break L2;
          } else {
            if (null == var5_ref.field_c) {
              break L2;
            } else {
              L3: {
                var5_ref.field_c.a((tv) (Object) var5_ref.field_c, -60);
                if (var5_ref.field_a == null) {
                  break L3;
                } else {
                  if (null == var5_ref.field_a) {
                    break L3;
                  } else {
                    var5_ref.field_a.a((tv) (Object) var5_ref.field_a, -68);
                    break L3;
                  }
                }
              }
              L4: {
                var4 = 0;
                if (var5_ref.field_b == var5_ref.field_b) {
                  break L4;
                } else {
                  System.out.println("int ordertype has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                  var4 = 1;
                  break L4;
                }
              }
              so discarded$24 = var5_ref.field_d;
              L5: {
                if (var5_ref.field_d == null) {
                  if (param1 < -19) {
                    break L5;
                  } else {
                    ((tw) this).field_b = 9;
                    break L5;
                  }
                } else {
                  if (!var5_ref.field_d.a((byte) -80, (tv) (Object) var5_ref.field_d)) {
                    if (param1 < -19) {
                      break L5;
                    } else {
                      ((tw) this).field_b = 9;
                      break L5;
                    }
                  } else {
                    var4 = 1;
                    System.out.println("SettingsChange settings_change has changed. before=" + var5_ref.field_d + ", now=" + var5_ref.field_d);
                    if (param1 < -19) {
                      break L5;
                    } else {
                      ((tw) this).field_b = 9;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                twa discarded$25 = var5_ref.field_e;
                if (var5_ref.field_e == null) {
                  break L6;
                } else {
                  if (!var5_ref.field_e.a((byte) -64, (tv) (Object) var5_ref.field_e)) {
                    break L6;
                  } else {
                    var4 = 1;
                    System.out.println("SpawnChoice spawnchoice has changed. before=" + var5_ref.field_e + ", now=" + var5_ref.field_e);
                    break L6;
                  }
                }
              }
              dv discarded$26 = var5_ref.field_c;
              L7: {
                if (var5_ref.field_c == null) {
                  break L7;
                } else {
                  if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                    break L7;
                  } else {
                    var4 = 1;
                    System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                    break L7;
                  }
                }
              }
              L8: {
                boa discarded$27 = var5_ref.field_a;
                if (null == var5_ref.field_a) {
                  break L8;
                } else {
                  if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                    break L8;
                  } else {
                    System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                    var4 = 1;
                    break L8;
                  }
                }
              }
              L9: {
                if (var4 == 0) {
                  break L9;
                } else {
                  System.out.println("This instance of SpecialOrderSubmessage has changed");
                  break L9;
                }
              }
              return;
            }
          }
        }
        L10: {
          if (var5_ref.field_a == null) {
            break L10;
          } else {
            if (null == var5_ref.field_a) {
              break L10;
            } else {
              L11: {
                var5_ref.field_a.a((tv) (Object) var5_ref.field_a, -68);
                var4 = 0;
                if (var5_ref.field_b == var5_ref.field_b) {
                  break L11;
                } else {
                  System.out.println("int ordertype has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
                  var4 = 1;
                  break L11;
                }
              }
              so discarded$28 = var5_ref.field_d;
              L12: {
                if (var5_ref.field_d == null) {
                  break L12;
                } else {
                  if (!var5_ref.field_d.a((byte) -80, (tv) (Object) var5_ref.field_d)) {
                    break L12;
                  } else {
                    var4 = 1;
                    System.out.println("SettingsChange settings_change has changed. before=" + var5_ref.field_d + ", now=" + var5_ref.field_d);
                    break L12;
                  }
                }
              }
              L13: {
                if (param1 < -19) {
                  break L13;
                } else {
                  ((tw) this).field_b = 9;
                  break L13;
                }
              }
              twa discarded$29 = var5_ref.field_e;
              L14: {
                if (var5_ref.field_e == null) {
                  break L14;
                } else {
                  if (!var5_ref.field_e.a((byte) -64, (tv) (Object) var5_ref.field_e)) {
                    break L14;
                  } else {
                    var4 = 1;
                    System.out.println("SpawnChoice spawnchoice has changed. before=" + var5_ref.field_e + ", now=" + var5_ref.field_e);
                    break L14;
                  }
                }
              }
              dv discarded$30 = var5_ref.field_c;
              L15: {
                if (var5_ref.field_c == null) {
                  break L15;
                } else {
                  if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                    break L15;
                  } else {
                    var4 = 1;
                    System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                    break L15;
                  }
                }
              }
              boa discarded$31 = var5_ref.field_a;
              L16: {
                if (null == var5_ref.field_a) {
                  break L16;
                } else {
                  if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                    break L16;
                  } else {
                    System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                    var4 = 1;
                    break L16;
                  }
                }
              }
              L17: {
                if (var4 == 0) {
                  break L17;
                } else {
                  System.out.println("This instance of SpecialOrderSubmessage has changed");
                  break L17;
                }
              }
              return;
            }
          }
        }
        L18: {
          var4 = 0;
          if (var5_ref.field_b == var5_ref.field_b) {
            break L18;
          } else {
            System.out.println("int ordertype has changed. before=" + var5_ref.field_b + ", now=" + var5_ref.field_b);
            var4 = 1;
            break L18;
          }
        }
        so discarded$32 = var5_ref.field_d;
        L19: {
          if (var5_ref.field_d == null) {
            break L19;
          } else {
            if (var5_ref.field_d.a((byte) -80, (tv) (Object) var5_ref.field_d)) {
              var4 = 1;
              System.out.println("SettingsChange settings_change has changed. before=" + var5_ref.field_d + ", now=" + var5_ref.field_d);
              break L19;
            } else {
              L20: {
                if (param1 < -19) {
                  break L20;
                } else {
                  ((tw) this).field_b = 9;
                  break L20;
                }
              }
              twa discarded$33 = var5_ref.field_e;
              L21: {
                if (var5_ref.field_e == null) {
                  break L21;
                } else {
                  if (!var5_ref.field_e.a((byte) -64, (tv) (Object) var5_ref.field_e)) {
                    break L21;
                  } else {
                    var4 = 1;
                    System.out.println("SpawnChoice spawnchoice has changed. before=" + var5_ref.field_e + ", now=" + var5_ref.field_e);
                    break L21;
                  }
                }
              }
              dv discarded$34 = var5_ref.field_c;
              L22: {
                if (var5_ref.field_c == null) {
                  break L22;
                } else {
                  if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                    break L22;
                  } else {
                    var4 = 1;
                    System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                    break L22;
                  }
                }
              }
              boa discarded$35 = var5_ref.field_a;
              L23: {
                if (null == var5_ref.field_a) {
                  break L23;
                } else {
                  if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                    break L23;
                  } else {
                    System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                    var4 = 1;
                    break L23;
                  }
                }
              }
              L24: {
                if (var4 == 0) {
                  break L24;
                } else {
                  System.out.println("This instance of SpecialOrderSubmessage has changed");
                  break L24;
                }
              }
              return;
            }
          }
        }
        if (param1 < -19) {
          twa discarded$36 = var5_ref.field_e;
          L25: {
            if (var5_ref.field_e == null) {
              break L25;
            } else {
              if (var5_ref.field_e.a((byte) -64, (tv) (Object) var5_ref.field_e)) {
                var4 = 1;
                System.out.println("SpawnChoice spawnchoice has changed. before=" + var5_ref.field_e + ", now=" + var5_ref.field_e);
                break L25;
              } else {
                dv discarded$37 = var5_ref.field_c;
                L26: {
                  L27: {
                    if (var5_ref.field_c == null) {
                      break L27;
                    } else {
                      if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                        break L27;
                      } else {
                        var4 = 1;
                        System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                        boa discarded$38 = var5_ref.field_a;
                        if (null != var5_ref.field_a) {
                          if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                            if (var4 != 0) {
                              System.out.println("This instance of SpecialOrderSubmessage has changed");
                              break L26;
                            } else {
                              return;
                            }
                          } else {
                            System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                            var4 = 1;
                            L28: {
                              if (var4 == 0) {
                                break L28;
                              } else {
                                System.out.println("This instance of SpecialOrderSubmessage has changed");
                                break L28;
                              }
                            }
                            return;
                          }
                        } else {
                          L29: {
                            if (var4 == 0) {
                              break L29;
                            } else {
                              System.out.println("This instance of SpecialOrderSubmessage has changed");
                              break L29;
                            }
                          }
                          return;
                        }
                      }
                    }
                  }
                  boa discarded$39 = var5_ref.field_a;
                  L30: {
                    if (null == var5_ref.field_a) {
                      break L30;
                    } else {
                      if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                        if (var4 == 0) {
                          break L26;
                        } else {
                          System.out.println("This instance of SpecialOrderSubmessage has changed");
                          break L26;
                        }
                      } else {
                        System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                        var4 = 1;
                        break L30;
                      }
                    }
                  }
                  if (var4 != 0) {
                    System.out.println("This instance of SpecialOrderSubmessage has changed");
                    return;
                  } else {
                    return;
                  }
                }
                return;
              }
            }
          }
          dv discarded$40 = var5_ref.field_c;
          L31: {
            if (var5_ref.field_c == null) {
              break L31;
            } else {
              if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                break L31;
              } else {
                var4 = 1;
                System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                boa discarded$41 = var5_ref.field_a;
                L32: {
                  if (null == var5_ref.field_a) {
                    break L32;
                  } else {
                    if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                      L33: {
                        if (var4 == 0) {
                          break L33;
                        } else {
                          System.out.println("This instance of SpecialOrderSubmessage has changed");
                          break L33;
                        }
                      }
                      return;
                    } else {
                      System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                      var4 = 1;
                      break L32;
                    }
                  }
                }
                if (var4 != 0) {
                  System.out.println("This instance of SpecialOrderSubmessage has changed");
                  return;
                } else {
                  return;
                }
              }
            }
          }
          boa discarded$42 = var5_ref.field_a;
          L34: {
            if (null == var5_ref.field_a) {
              break L34;
            } else {
              if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                L35: {
                  if (var4 == 0) {
                    break L35;
                  } else {
                    System.out.println("This instance of SpecialOrderSubmessage has changed");
                    break L35;
                  }
                }
                return;
              } else {
                System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                var4 = 1;
                break L34;
              }
            }
          }
          if (var4 != 0) {
            System.out.println("This instance of SpecialOrderSubmessage has changed");
            return;
          } else {
            return;
          }
        } else {
          ((tw) this).field_b = 9;
          twa discarded$43 = var5_ref.field_e;
          if (var5_ref.field_e != null) {
            L36: {
              if (!var5_ref.field_e.a((byte) -64, (tv) (Object) var5_ref.field_e)) {
                break L36;
              } else {
                var4 = 1;
                System.out.println("SpawnChoice spawnchoice has changed. before=" + var5_ref.field_e + ", now=" + var5_ref.field_e);
                break L36;
              }
            }
            dv discarded$44 = var5_ref.field_c;
            L37: {
              if (var5_ref.field_c == null) {
                break L37;
              } else {
                if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                  break L37;
                } else {
                  var4 = 1;
                  System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                  break L37;
                }
              }
            }
            boa discarded$45 = var5_ref.field_a;
            L38: {
              if (null == var5_ref.field_a) {
                break L38;
              } else {
                if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                  break L38;
                } else {
                  System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                  var4 = 1;
                  break L38;
                }
              }
            }
            L39: {
              if (var4 == 0) {
                break L39;
              } else {
                System.out.println("This instance of SpecialOrderSubmessage has changed");
                break L39;
              }
            }
            return;
          } else {
            dv discarded$46 = var5_ref.field_c;
            L40: {
              if (var5_ref.field_c == null) {
                break L40;
              } else {
                if (!var5_ref.field_c.a((byte) -42, (tv) (Object) var5_ref.field_c)) {
                  break L40;
                } else {
                  var4 = 1;
                  System.out.println("PlayerVote vote has changed. before=" + var5_ref.field_c + ", now=" + var5_ref.field_c);
                  break L40;
                }
              }
            }
            boa discarded$47 = var5_ref.field_a;
            L41: {
              if (null == var5_ref.field_a) {
                break L41;
              } else {
                if (!var5_ref.field_a.a((byte) -40, (tv) (Object) var5_ref.field_a)) {
                  break L41;
                } else {
                  System.out.println("ShipBlueprint blueprint has changed. before=" + var5_ref.field_a + ", now=" + var5_ref.field_a);
                  var4 = 1;
                  break L41;
                }
              }
            }
            L42: {
              if (var4 == 0) {
                break L42;
              } else {
                System.out.println("This instance of SpecialOrderSubmessage has changed");
                break L42;
              }
            }
            return;
          }
        }
    }

    final static void a(fm[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var6 = 0;
        fm var7 = null;
        fm var8 = null;
        var6 = VoidHunters.field_G;
        var2 = param0.length;
        if (param1 != 62) {
          tw.a(-111);
          var3 = 1;
          L0: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var7 = param0[var3];
              var5 = var3 + -1;
              L1: while (true) {
                L2: {
                  if ((var5 ^ -1) > -1) {
                    break L2;
                  } else {
                    if (!uk.a(param1 ^ -27562, param0[var5], var7)) {
                      break L2;
                    } else {
                      param0[1 + var5] = param0[var5];
                      var5--;
                      continue L1;
                    }
                  }
                }
                param0[var5 + 1] = var7;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          var3 = 1;
          L3: while (true) {
            if (var2 <= var3) {
              return;
            } else {
              var8 = param0[var3];
              var5 = var3 + -1;
              L4: while (true) {
                L5: {
                  if ((var5 ^ -1) > -1) {
                    break L5;
                  } else {
                    if (!uk.a(param1 ^ -27562, param0[var5], var8)) {
                      break L5;
                    } else {
                      param0[1 + var5] = param0[var5];
                      var5--;
                      continue L4;
                    }
                  }
                }
                param0[var5 + 1] = var8;
                var3++;
                continue L3;
              }
            }
          }
        }
    }

    public final void b(byte param0, tv param1) {
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        tw var6_ref = null;
        var6 = null;
        var4 = VoidHunters.field_G;
        var6_ref = (tw) (Object) param1;
        var6_ref.field_b = var6_ref.field_b;
        if (null == var6_ref.field_d) {
          L0: {
            var6_ref.field_d = null;
            if (null != var6_ref.field_e) {
              if (null != var6_ref.field_e) {
                var6_ref.field_e.b((byte) 111, (tv) (Object) var6_ref.field_e);
                break L0;
              } else {
                var6_ref.field_e = new twa();
                var6_ref.field_e.b((byte) 111, (tv) (Object) var6_ref.field_e);
                break L0;
              }
            } else {
              var6_ref.field_e = null;
              break L0;
            }
          }
          if (param0 <= 54) {
            L1: {
              var5 = null;
              tw.a((fm[]) null, (byte) -120);
              if (var6_ref.field_c != null) {
                L2: {
                  if (null == var6_ref.field_c) {
                    var6_ref.field_c = new dv();
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var6_ref.field_c.b((byte) 88, (tv) (Object) var6_ref.field_c);
                break L1;
              } else {
                var6_ref.field_c = null;
                break L1;
              }
            }
            if (var6_ref.field_a != null) {
              if (var6_ref.field_a != null) {
                var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
                return;
              } else {
                var6_ref.field_a = new boa();
                var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
                return;
              }
            } else {
              var6_ref.field_a = null;
              return;
            }
          } else {
            L3: {
              if (var6_ref.field_c != null) {
                L4: {
                  if (null == var6_ref.field_c) {
                    var6_ref.field_c = new dv();
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var6_ref.field_c.b((byte) 88, (tv) (Object) var6_ref.field_c);
                break L3;
              } else {
                var6_ref.field_c = null;
                break L3;
              }
            }
            if (var6_ref.field_a != null) {
              if (var6_ref.field_a != null) {
                var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
                return;
              } else {
                var6_ref.field_a = new boa();
                var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
                return;
              }
            } else {
              var6_ref.field_a = null;
              return;
            }
          }
        } else {
          L5: {
            if (null == var6_ref.field_d) {
              var6_ref.field_d = new so();
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var6_ref.field_d.b((byte) 64, (tv) (Object) var6_ref.field_d);
            if (null != var6_ref.field_e) {
              if (null != var6_ref.field_e) {
                var6_ref.field_e.b((byte) 111, (tv) (Object) var6_ref.field_e);
                if (param0 > 54) {
                  break L6;
                } else {
                  var5 = null;
                  tw.a((fm[]) null, (byte) -120);
                  break L6;
                }
              } else {
                var6_ref.field_e = new twa();
                var6_ref.field_e.b((byte) 111, (tv) (Object) var6_ref.field_e);
                if (param0 > 54) {
                  break L6;
                } else {
                  var5 = null;
                  tw.a((fm[]) null, (byte) -120);
                  break L6;
                }
              }
            } else {
              var6_ref.field_e = null;
              if (param0 > 54) {
                break L6;
              } else {
                var5 = null;
                tw.a((fm[]) null, (byte) -120);
                break L6;
              }
            }
          }
          L7: {
            if (var6_ref.field_c != null) {
              L8: {
                if (null == var6_ref.field_c) {
                  var6_ref.field_c = new dv();
                  break L8;
                } else {
                  break L8;
                }
              }
              var6_ref.field_c.b((byte) 88, (tv) (Object) var6_ref.field_c);
              break L7;
            } else {
              var6_ref.field_c = null;
              break L7;
            }
          }
          if (var6_ref.field_a != null) {
            if (var6_ref.field_a != null) {
              var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
              return;
            } else {
              var6_ref.field_a = new boa();
              var6_ref.field_a.b((byte) 86, (tv) (Object) var6_ref.field_a);
              return;
            }
          } else {
            var6_ref.field_a = null;
            return;
          }
        }
    }

    public tw() {
    }

    public static void a(int param0) {
        field_f = null;
        int var1 = -65 % ((-23 - param0) / 51);
    }

    public final boolean a(byte param0, tv param1) {
        int var3 = 0;
        Object var4 = null;
        tw var4_ref = null;
        int stackIn_13_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_92_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        var4 = null;
        var3 = 114 / ((22 - param0) / 59);
        var4_ref = (tw) (Object) param1;
        if (var4_ref.field_b == var4_ref.field_b) {
          so discarded$14 = var4_ref.field_d;
          if (var4_ref.field_d == null) {
            twa discarded$15 = var4_ref.field_e;
            if (var4_ref.field_e == null) {
              dv discarded$16 = var4_ref.field_c;
              if (var4_ref.field_c == null) {
                boa discarded$17 = var4_ref.field_a;
                if (var4_ref.field_a != null) {
                  if (var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (!var4_ref.field_c.a((byte) 110, (tv) (Object) var4_ref.field_c)) {
                  boa discarded$18 = var4_ref.field_a;
                  if (var4_ref.field_a != null) {
                    if (var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  stackOut_90_0 = 1;
                  stackIn_92_0 = stackOut_90_0;
                  return stackIn_92_0 != 0;
                }
              }
            } else {
              if (!var4_ref.field_e.a((byte) -38, (tv) (Object) var4_ref.field_e)) {
                dv discarded$19 = var4_ref.field_c;
                if (var4_ref.field_c == null) {
                  boa discarded$20 = var4_ref.field_a;
                  if (var4_ref.field_a != null) {
                    if (var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  if (!var4_ref.field_c.a((byte) 110, (tv) (Object) var4_ref.field_c)) {
                    boa discarded$21 = var4_ref.field_a;
                    if (var4_ref.field_a != null) {
                      if (var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                        return true;
                      } else {
                        return false;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_63_0 = 1;
                    stackIn_65_0 = stackOut_63_0;
                    return stackIn_65_0 != 0;
                  }
                }
              } else {
                stackOut_56_0 = 1;
                stackIn_58_0 = stackOut_56_0;
                return stackIn_58_0 != 0;
              }
            }
          } else {
            if (!var4_ref.field_d.a((byte) 123, (tv) (Object) var4_ref.field_d)) {
              twa discarded$22 = var4_ref.field_e;
              if (var4_ref.field_e == null) {
                dv discarded$23 = var4_ref.field_c;
                if (var4_ref.field_c == null) {
                  boa discarded$24 = var4_ref.field_a;
                  if (var4_ref.field_a != null) {
                    if (var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    return false;
                  }
                } else {
                  if (!var4_ref.field_c.a((byte) 110, (tv) (Object) var4_ref.field_c)) {
                    boa discarded$25 = var4_ref.field_a;
                    L0: {
                      L1: {
                        if (var4_ref.field_a == null) {
                          break L1;
                        } else {
                          if (!var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                            break L1;
                          } else {
                            stackOut_39_0 = 1;
                            stackIn_41_0 = stackOut_39_0;
                            break L0;
                          }
                        }
                      }
                      stackOut_40_0 = 0;
                      stackIn_41_0 = stackOut_40_0;
                      break L0;
                    }
                    return stackIn_41_0 != 0;
                  } else {
                    stackOut_31_0 = 1;
                    stackIn_33_0 = stackOut_31_0;
                    return stackIn_33_0 != 0;
                  }
                }
              } else {
                if (!var4_ref.field_e.a((byte) -38, (tv) (Object) var4_ref.field_e)) {
                  dv discarded$26 = var4_ref.field_c;
                  L2: {
                    L3: {
                      L4: {
                        if (var4_ref.field_c == null) {
                          break L4;
                        } else {
                          if (var4_ref.field_c.a((byte) 110, (tv) (Object) var4_ref.field_c)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      boa discarded$27 = var4_ref.field_a;
                      L5: {
                        if (var4_ref.field_a == null) {
                          break L5;
                        } else {
                          if (!var4_ref.field_a.a((byte) -118, (tv) (Object) var4_ref.field_a)) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      stackOut_25_0 = 0;
                      stackIn_26_0 = stackOut_25_0;
                      break L2;
                    }
                    stackOut_24_0 = 1;
                    stackIn_26_0 = stackOut_24_0;
                    break L2;
                  }
                  return stackIn_26_0 != 0;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  return stackIn_13_0 != 0;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    public final void b(faa param0, int param1) {
        faa stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        faa stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        faa stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        faa stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        faa stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        faa stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        faa stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        faa stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        faa stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        faa stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        faa stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        faa stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        faa stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        faa stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        faa stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        faa stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        faa stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        faa stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_40_2 = 0;
        faa stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        faa stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        faa stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        faa stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        faa stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        faa stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        faa stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        faa stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        faa stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        faa stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        faa stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        faa stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        faa stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        faa stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int stackOut_39_2 = 0;
        faa stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        faa stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        faa stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        faa stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        faa stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        faa stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        faa stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        faa stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        faa stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        faa stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        faa stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        faa stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        faa stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        faa stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        faa stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        faa stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        param0.a(-632, ((tw) this).field_b, 32);
        if (param1 < -109) {
          L0: {
            stackOut_2_0 = (faa) param0;
            stackOut_2_1 = 66;
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (null == ((tw) this).field_d) {
              stackOut_4_0 = (faa) (Object) stackIn_4_0;
              stackOut_4_1 = stackIn_4_1;
              stackOut_4_2 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (faa) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          L1: {
            if (vq.a(stackIn_5_0, stackIn_5_1, stackIn_5_2 != 0)) {
              ((tw) this).field_d.b(param0, -110);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (faa) param0;
            stackOut_8_1 = 80;
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (((tw) this).field_e == null) {
              stackOut_10_0 = (faa) (Object) stackIn_10_0;
              stackOut_10_1 = stackIn_10_1;
              stackOut_10_2 = 0;
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (faa) (Object) stackIn_9_0;
              stackOut_9_1 = stackIn_9_1;
              stackOut_9_2 = 1;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          if (vq.a(stackIn_11_0, stackIn_11_1, stackIn_11_2 == 0)) {
            L3: {
              stackOut_37_0 = (faa) param0;
              stackOut_37_1 = 117;
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              if (((tw) this).field_c == null) {
                stackOut_39_0 = (faa) (Object) stackIn_39_0;
                stackOut_39_1 = stackIn_39_1;
                stackOut_39_2 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                stackIn_40_2 = stackOut_39_2;
                break L3;
              } else {
                stackOut_38_0 = (faa) (Object) stackIn_38_0;
                stackOut_38_1 = stackIn_38_1;
                stackOut_38_2 = 1;
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_40_2 = stackOut_38_2;
                break L3;
              }
            }
            if (vq.a(stackIn_40_0, stackIn_40_1, stackIn_40_2 != 0)) {
              L4: {
                ((tw) this).field_c.b(param0, -126);
                stackOut_48_0 = (faa) param0;
                stackOut_48_1 = 122;
                stackIn_50_0 = stackOut_48_0;
                stackIn_50_1 = stackOut_48_1;
                stackIn_49_0 = stackOut_48_0;
                stackIn_49_1 = stackOut_48_1;
                if (null == ((tw) this).field_a) {
                  stackOut_50_0 = (faa) (Object) stackIn_50_0;
                  stackOut_50_1 = stackIn_50_1;
                  stackOut_50_2 = 0;
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  stackIn_51_2 = stackOut_50_2;
                  break L4;
                } else {
                  stackOut_49_0 = (faa) (Object) stackIn_49_0;
                  stackOut_49_1 = stackIn_49_1;
                  stackOut_49_2 = 1;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  stackIn_51_2 = stackOut_49_2;
                  break L4;
                }
              }
              L5: {
                if (vq.a(stackIn_51_0, stackIn_51_1, stackIn_51_2 != 0)) {
                  ((tw) this).field_a.b(param0, -113);
                  break L5;
                } else {
                  break L5;
                }
              }
              return;
            } else {
              L6: {
                stackOut_41_0 = (faa) param0;
                stackOut_41_1 = 122;
                stackIn_43_0 = stackOut_41_0;
                stackIn_43_1 = stackOut_41_1;
                stackIn_42_0 = stackOut_41_0;
                stackIn_42_1 = stackOut_41_1;
                if (null == ((tw) this).field_a) {
                  stackOut_43_0 = (faa) (Object) stackIn_43_0;
                  stackOut_43_1 = stackIn_43_1;
                  stackOut_43_2 = 0;
                  stackIn_44_0 = stackOut_43_0;
                  stackIn_44_1 = stackOut_43_1;
                  stackIn_44_2 = stackOut_43_2;
                  break L6;
                } else {
                  stackOut_42_0 = (faa) (Object) stackIn_42_0;
                  stackOut_42_1 = stackIn_42_1;
                  stackOut_42_2 = 1;
                  stackIn_44_0 = stackOut_42_0;
                  stackIn_44_1 = stackOut_42_1;
                  stackIn_44_2 = stackOut_42_2;
                  break L6;
                }
              }
              L7: {
                if (vq.a(stackIn_44_0, stackIn_44_1, stackIn_44_2 != 0)) {
                  ((tw) this).field_a.b(param0, -113);
                  break L7;
                } else {
                  break L7;
                }
              }
              return;
            }
          } else {
            L8: {
              ((tw) this).field_e.b(param0, -125);
              stackOut_12_0 = (faa) param0;
              stackOut_12_1 = 117;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              if (((tw) this).field_c == null) {
                stackOut_14_0 = (faa) (Object) stackIn_14_0;
                stackOut_14_1 = stackIn_14_1;
                stackOut_14_2 = 0;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                stackIn_15_2 = stackOut_14_2;
                break L8;
              } else {
                stackOut_13_0 = (faa) (Object) stackIn_13_0;
                stackOut_13_1 = stackIn_13_1;
                stackOut_13_2 = 1;
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_15_2 = stackOut_13_2;
                break L8;
              }
            }
            if (vq.a(stackIn_15_0, stackIn_15_1, stackIn_15_2 == 0)) {
              L9: {
                stackOut_23_0 = (faa) param0;
                stackOut_23_1 = 122;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (null == ((tw) this).field_a) {
                  stackOut_25_0 = (faa) (Object) stackIn_25_0;
                  stackOut_25_1 = stackIn_25_1;
                  stackOut_25_2 = 0;
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L9;
                } else {
                  stackOut_24_0 = (faa) (Object) stackIn_24_0;
                  stackOut_24_1 = stackIn_24_1;
                  stackOut_24_2 = 1;
                  stackIn_26_0 = stackOut_24_0;
                  stackIn_26_1 = stackOut_24_1;
                  stackIn_26_2 = stackOut_24_2;
                  break L9;
                }
              }
              L10: {
                if (vq.a(stackIn_26_0, stackIn_26_1, stackIn_26_2 != 0)) {
                  ((tw) this).field_a.b(param0, -113);
                  break L10;
                } else {
                  break L10;
                }
              }
              return;
            } else {
              L11: {
                ((tw) this).field_c.b(param0, -126);
                stackOut_16_0 = (faa) param0;
                stackOut_16_1 = 122;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (null == ((tw) this).field_a) {
                  stackOut_18_0 = (faa) (Object) stackIn_18_0;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = 0;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L11;
                } else {
                  stackOut_17_0 = (faa) (Object) stackIn_17_0;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = 1;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L11;
                }
              }
              L12: {
                if (vq.a(stackIn_19_0, stackIn_19_1, stackIn_19_2 != 0)) {
                  ((tw) this).field_a.b(param0, -113);
                  break L12;
                } else {
                  break L12;
                }
              }
              return;
            }
          }
        } else {
          return;
        }
    }

    tw(int param0) {
        ((tw) this).field_b = param0;
    }

    public final void a(faa param0, boolean param1) {
        int var4 = 0;
        L0: {
          var4 = VoidHunters.field_G;
          ((tw) this).field_b = param0.i(0, 32);
          if (kv.a(param1, param0)) {
            L1: {
              if (null == ((tw) this).field_d) {
                ((tw) this).field_d = new so();
                break L1;
              } else {
                break L1;
              }
            }
            ((tw) this).field_d.a(param0, false);
            break L0;
          } else {
            ((tw) this).field_d = null;
            break L0;
          }
        }
        if (!kv.a(false, param0)) {
          ((tw) this).field_e = null;
          if (!kv.a(false, param0)) {
            ((tw) this).field_c = null;
            if (kv.a(param1, param0)) {
              if (null != ((tw) this).field_a) {
                ((tw) this).field_a.a(param0, param1);
                return;
              } else {
                ((tw) this).field_a = new boa();
                ((tw) this).field_a.a(param0, param1);
                return;
              }
            } else {
              ((tw) this).field_a = null;
              return;
            }
          } else {
            if (((tw) this).field_c != null) {
              ((tw) this).field_c.a(param0, false);
              if (kv.a(param1, param0)) {
                if (null != ((tw) this).field_a) {
                  ((tw) this).field_a.a(param0, param1);
                  return;
                } else {
                  ((tw) this).field_a = new boa();
                  ((tw) this).field_a.a(param0, param1);
                  return;
                }
              } else {
                ((tw) this).field_a = null;
                return;
              }
            } else {
              ((tw) this).field_c = new dv();
              ((tw) this).field_c.a(param0, false);
              if (kv.a(param1, param0)) {
                if (null != ((tw) this).field_a) {
                  ((tw) this).field_a.a(param0, param1);
                  return;
                } else {
                  ((tw) this).field_a = new boa();
                  ((tw) this).field_a.a(param0, param1);
                  return;
                }
              } else {
                ((tw) this).field_a = null;
                return;
              }
            }
          }
        } else {
          L2: {
            if (null == ((tw) this).field_e) {
              ((tw) this).field_e = new twa();
              break L2;
            } else {
              break L2;
            }
          }
          ((tw) this).field_e.a(param0, false);
          if (!kv.a(false, param0)) {
            ((tw) this).field_c = null;
            if (kv.a(param1, param0)) {
              if (null != ((tw) this).field_a) {
                ((tw) this).field_a.a(param0, param1);
                return;
              } else {
                ((tw) this).field_a = new boa();
                ((tw) this).field_a.a(param0, param1);
                return;
              }
            } else {
              ((tw) this).field_a = null;
              return;
            }
          } else {
            if (((tw) this).field_c != null) {
              ((tw) this).field_c.a(param0, false);
              if (kv.a(param1, param0)) {
                if (null != ((tw) this).field_a) {
                  ((tw) this).field_a.a(param0, param1);
                  return;
                } else {
                  ((tw) this).field_a = new boa();
                  ((tw) this).field_a.a(param0, param1);
                  return;
                }
              } else {
                ((tw) this).field_a = null;
                return;
              }
            } else {
              ((tw) this).field_c = new dv();
              ((tw) this).field_c.a(param0, false);
              if (kv.a(param1, param0)) {
                if (null != ((tw) this).field_a) {
                  ((tw) this).field_a.a(param0, param1);
                  return;
                } else {
                  ((tw) this).field_a = new boa();
                  ((tw) this).field_a.a(param0, param1);
                  return;
                }
              } else {
                ((tw) this).field_a = null;
                return;
              }
            }
          }
        }
    }

    static {
    }
}
