/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kk extends ni {
    private final void a(ig param0, ht param1, ht param2, int param3, int param4, boolean[] param5, boolean param6, boolean param7, int param8, int[] param9) {
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        L0: {
          if (param2 == null) {
            break L0;
          } else {
            if (param3 != 0) {
              var34 = 0;
              var11 = var34;
              var35 = 0;
              var12 = var35;
              var36 = 0;
              var13 = var36;
              L1: while (true) {
                if (var36 >= param0.field_o) {
                  return;
                } else {
                  L2: {
                    var14 = 0;
                    if (var34 >= param1.field_d) {
                      break L2;
                    } else {
                      if (param1.field_a[var34] != var36) {
                        break L2;
                      } else {
                        var14 = 1;
                        break L2;
                      }
                    }
                  }
                  L3: {
                    var15 = 0;
                    if (var35 >= param2.field_d) {
                      break L3;
                    } else {
                      if (param2.field_a[var35] != var36) {
                        break L3;
                      } else {
                        var15 = 1;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (var14 != 0) {
                      break L4;
                    } else {
                      if (var15 != 0) {
                        break L4;
                      } else {
                        var36++;
                        continue L1;
                      }
                    }
                  }
                  L5: {
                    if (param5 == null) {
                      break L5;
                    } else {
                      if (!param5[var36]) {
                        break L5;
                      } else {
                        if (param0.field_p[var36] == 0) {
                          break L5;
                        } else {
                          L6: {
                            if (var14 == 0) {
                              break L6;
                            } else {
                              var34++;
                              break L6;
                            }
                          }
                          if (var15 != 0) {
                            var35++;
                            var36++;
                            continue L1;
                          } else {
                            var36++;
                            continue L1;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    var16 = 0;
                    var17 = param0.field_p[var36];
                    if (var17 != 3) {
                      break L7;
                    } else {
                      var16 = 128;
                      break L7;
                    }
                  }
                  L8: {
                    if (var14 == 0) {
                      var18 = var16;
                      var19 = var16;
                      var20 = var16;
                      var21 = -1;
                      var22 = 0;
                      break L8;
                    } else {
                      var18 = param1.field_l[var34];
                      var19 = param1.field_f[var34];
                      var20 = param1.field_h[var34];
                      var21 = param1.field_i[var34];
                      var22 = param1.field_m[var34];
                      var34++;
                      break L8;
                    }
                  }
                  L9: {
                    if (var15 == 0) {
                      var23 = var16;
                      var24 = var16;
                      var25 = var16;
                      var26 = -1;
                      var27 = 0;
                      break L9;
                    } else {
                      var23 = param2.field_l[var35];
                      var24 = param2.field_f[var35];
                      var25 = param2.field_h[var35];
                      var26 = param2.field_i[var35];
                      var27 = param2.field_m[var35];
                      var35++;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      if ((var22 & 2) != 0) {
                        break L11;
                      } else {
                        if ((var27 & 1) == 0) {
                          if (var17 != 2) {
                            if (var17 != 7) {
                              var28 = var18 + (var23 - var18) * param3 / param4;
                              var29 = var19 + (var24 - var19) * param3 / param4;
                              var30 = var20 + (var25 - var20) * param3 / param4;
                              break L10;
                            } else {
                              L12: {
                                var31 = var23 - var18 & 63;
                                if (var31 < 32) {
                                  break L12;
                                } else {
                                  var31 -= 64;
                                  break L12;
                                }
                              }
                              var28 = var18 + var31 * param3 / param4 & 63;
                              var29 = var19 + (var24 - var19) * param3 / param4;
                              var30 = var20 + (var25 - var20) * param3 / param4;
                              break L10;
                            }
                          } else {
                            L13: {
                              var31 = var23 - var18 & 2047;
                              var32 = var24 - var19 & 2047;
                              var33 = var25 - var20 & 2047;
                              if (var31 < 1024) {
                                break L13;
                              } else {
                                var31 -= 2048;
                                break L13;
                              }
                            }
                            L14: {
                              if (var32 < 1024) {
                                break L14;
                              } else {
                                var32 -= 2048;
                                break L14;
                              }
                            }
                            L15: {
                              if (var33 < 1024) {
                                break L15;
                              } else {
                                var33 -= 2048;
                                break L15;
                              }
                            }
                            var28 = var18 + var31 * param3 / param4 & 2047;
                            var29 = var19 + var32 * param3 / param4 & 2047;
                            var30 = var20 + var33 * param3 / param4 & 2047;
                            break L10;
                          }
                        } else {
                          break L11;
                        }
                      }
                    }
                    var28 = var18;
                    var29 = var19;
                    var30 = var20;
                    break L10;
                  }
                  L16: {
                    if (var21 == -1) {
                      if (var26 == -1) {
                        break L16;
                      } else {
                        var31 = 65535 & param0.field_s[var26];
                        if (var31 == 65535) {
                          ((kk) this).a(0, param0.field_l[var26], 0, 0, 0, param7);
                          break L16;
                        } else {
                          ((kk) this).a(0, param0.field_l[var26], 0, 0, 0, param7, var31, param9);
                          break L16;
                        }
                      }
                    } else {
                      var31 = 65535 & param0.field_s[var21];
                      if (var31 == 65535) {
                        ((kk) this).a(0, param0.field_l[var21], 0, 0, 0, param7);
                        break L16;
                      } else {
                        ((kk) this).a(0, param0.field_l[var21], 0, 0, 0, param7, var31, param9);
                        break L16;
                      }
                    }
                  }
                  var31 = 65535 & param0.field_s[var36];
                  if (var31 == 65535) {
                    ((kk) this).a(var17, param0.field_l[var36], var28, var29, var30, param7);
                    var36++;
                    continue L1;
                  } else {
                    ((kk) this).a(var17, param0.field_l[var36], var28, var29, var30, param7, var31, param9);
                    var36++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        var11 = 0;
        L17: while (true) {
          if (var11 >= param1.field_d) {
            return;
          } else {
            L18: {
              var12 = param1.field_a[var11];
              if (param5 == null) {
                break L18;
              } else {
                if (!param5[var12]) {
                  break L18;
                } else {
                  if (param0.field_p[var12] == 0) {
                    break L18;
                  } else {
                    var11++;
                    continue L17;
                  }
                }
              }
            }
            L19: {
              var13 = param1.field_i[var11];
              if (var13 == -1) {
                break L19;
              } else {
                var14 = 65535 & param0.field_s[var13];
                if (var14 == 65535) {
                  ((kk) this).a(0, param0.field_l[var13], 0, 0, 0, param7);
                  break L19;
                } else {
                  ((kk) this).a(0, param0.field_l[var13], 0, 0, 0, param7, var14, param9);
                  break L19;
                }
              }
            }
            var14 = 65535 & param0.field_s[var12];
            if (var14 == 65535) {
              ((kk) this).a(param0.field_p[var12], param0.field_l[var12], (int) param1.field_l[var11], (int) param1.field_f[var11], (int) param1.field_h[var11], param7);
              var11++;
              continue L17;
            } else {
              ((kk) this).a(param0.field_p[var12], param0.field_l[var12], (int) param1.field_l[var11], (int) param1.field_f[var11], (int) param1.field_h[var11], param7, var14, param9);
              var11++;
              continue L17;
            }
          }
        }
    }

    abstract boolean b();

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5);

    abstract void b(int param0, int param1, int param2);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, long param7);

    abstract kk a(boolean param0, boolean param1, boolean param2);

    abstract void a(int param0, int[] param1, int param2, int param3, int param4, boolean param5, int param6, int[] param7);

    final void a(wp param0, int param1, wp param2, int param3, int param4, int param5, boolean param6) {
        if (param1 == -1) {
            return;
        }
        if (!((kk) this).b()) {
            return;
        }
        ht var8 = param0.field_A[param1];
        ig var9 = var8.field_n;
        Object var10 = null;
        if (param2 != null) {
            var10 = (Object) (Object) param2.field_A[param3];
            if (((ht) var10).field_n != var9) {
                var10 = null;
            }
        }
        this.a(var9, var8, (ht) var10, param4, param5, (boolean[]) null, false, param6, 65535, (int[]) null);
        ((kk) this).a();
    }

    kk() {
    }

    abstract void a();
}
