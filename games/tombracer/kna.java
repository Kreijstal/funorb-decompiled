/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class kna extends csa {
    private fsa field_A;
    static String field_E;
    static String field_C;
    static String field_B;
    static String field_D;

    public static void y(int param0) {
        field_D = null;
        field_E = null;
        field_C = null;
        field_B = null;
        if (param0 != 0) {
            kna.y(74);
        }
    }

    kna(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    lj u(int param0) {
        if (param0 >= -60) {
            boolean discarded$0 = ((kna) this).z(-82);
            return (lj) (Object) ((kna) this).field_A;
        }
        return (lj) (Object) ((kna) this).field_A;
    }

    final void a(boolean param0, boolean param1, la param2, int param3, int param4, int param5, fsa param6) {
        int var9 = 0;
        csa var11 = null;
        int var12 = 0;
        fsa var13 = null;
        mka var14 = null;
        mka var15 = null;
        mka var16 = null;
        mka var17 = null;
        mka var17_ref = null;
        mka var18 = null;
        mka var19 = null;
        mka var20 = null;
        mka var24 = null;
        mka var25 = null;
        mka var26 = null;
        mka var27 = null;
        mka var38 = null;
        csa stackIn_10_0 = null;
        boolean stackIn_10_1 = false;
        int stackIn_10_2 = 0;
        la stackIn_10_3 = null;
        int stackIn_10_4 = 0;
        int stackIn_10_5 = 0;
        mka stackIn_10_6 = null;
        csa stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        int stackIn_11_2 = 0;
        la stackIn_11_3 = null;
        int stackIn_11_4 = 0;
        int stackIn_11_5 = 0;
        mka stackIn_11_6 = null;
        csa stackIn_12_0 = null;
        boolean stackIn_12_1 = false;
        int stackIn_12_2 = 0;
        la stackIn_12_3 = null;
        int stackIn_12_4 = 0;
        int stackIn_12_5 = 0;
        mka stackIn_12_6 = null;
        int stackIn_12_7 = 0;
        csa stackIn_33_0 = null;
        boolean stackIn_33_1 = false;
        int stackIn_33_2 = 0;
        la stackIn_33_3 = null;
        int stackIn_33_4 = 0;
        int stackIn_33_5 = 0;
        mka stackIn_33_6 = null;
        csa stackIn_34_0 = null;
        boolean stackIn_34_1 = false;
        int stackIn_34_2 = 0;
        la stackIn_34_3 = null;
        int stackIn_34_4 = 0;
        int stackIn_34_5 = 0;
        mka stackIn_34_6 = null;
        csa stackIn_35_0 = null;
        boolean stackIn_35_1 = false;
        int stackIn_35_2 = 0;
        la stackIn_35_3 = null;
        int stackIn_35_4 = 0;
        int stackIn_35_5 = 0;
        mka stackIn_35_6 = null;
        int stackIn_35_7 = 0;
        csa stackIn_57_0 = null;
        boolean stackIn_57_1 = false;
        int stackIn_57_2 = 0;
        la stackIn_57_3 = null;
        int stackIn_57_4 = 0;
        int stackIn_57_5 = 0;
        mka stackIn_57_6 = null;
        csa stackIn_58_0 = null;
        boolean stackIn_58_1 = false;
        int stackIn_58_2 = 0;
        la stackIn_58_3 = null;
        int stackIn_58_4 = 0;
        int stackIn_58_5 = 0;
        mka stackIn_58_6 = null;
        csa stackIn_59_0 = null;
        boolean stackIn_59_1 = false;
        int stackIn_59_2 = 0;
        la stackIn_59_3 = null;
        int stackIn_59_4 = 0;
        int stackIn_59_5 = 0;
        mka stackIn_59_6 = null;
        int stackIn_59_7 = 0;
        csa stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        int stackIn_89_2 = 0;
        la stackIn_89_3 = null;
        int stackIn_89_4 = 0;
        int stackIn_89_5 = 0;
        mka stackIn_89_6 = null;
        csa stackIn_90_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_90_2 = 0;
        la stackIn_90_3 = null;
        int stackIn_90_4 = 0;
        int stackIn_90_5 = 0;
        mka stackIn_90_6 = null;
        csa stackIn_91_0 = null;
        boolean stackIn_91_1 = false;
        int stackIn_91_2 = 0;
        la stackIn_91_3 = null;
        int stackIn_91_4 = 0;
        int stackIn_91_5 = 0;
        mka stackIn_91_6 = null;
        int stackIn_91_7 = 0;
        csa stackOut_88_0 = null;
        boolean stackOut_88_1 = false;
        int stackOut_88_2 = 0;
        la stackOut_88_3 = null;
        int stackOut_88_4 = 0;
        int stackOut_88_5 = 0;
        mka stackOut_88_6 = null;
        csa stackOut_90_0 = null;
        boolean stackOut_90_1 = false;
        int stackOut_90_2 = 0;
        la stackOut_90_3 = null;
        int stackOut_90_4 = 0;
        int stackOut_90_5 = 0;
        mka stackOut_90_6 = null;
        int stackOut_90_7 = 0;
        csa stackOut_89_0 = null;
        boolean stackOut_89_1 = false;
        int stackOut_89_2 = 0;
        la stackOut_89_3 = null;
        int stackOut_89_4 = 0;
        int stackOut_89_5 = 0;
        mka stackOut_89_6 = null;
        int stackOut_89_7 = 0;
        csa stackOut_56_0 = null;
        boolean stackOut_56_1 = false;
        int stackOut_56_2 = 0;
        la stackOut_56_3 = null;
        int stackOut_56_4 = 0;
        int stackOut_56_5 = 0;
        mka stackOut_56_6 = null;
        csa stackOut_58_0 = null;
        boolean stackOut_58_1 = false;
        int stackOut_58_2 = 0;
        la stackOut_58_3 = null;
        int stackOut_58_4 = 0;
        int stackOut_58_5 = 0;
        mka stackOut_58_6 = null;
        int stackOut_58_7 = 0;
        csa stackOut_57_0 = null;
        boolean stackOut_57_1 = false;
        int stackOut_57_2 = 0;
        la stackOut_57_3 = null;
        int stackOut_57_4 = 0;
        int stackOut_57_5 = 0;
        mka stackOut_57_6 = null;
        int stackOut_57_7 = 0;
        csa stackOut_32_0 = null;
        boolean stackOut_32_1 = false;
        int stackOut_32_2 = 0;
        la stackOut_32_3 = null;
        int stackOut_32_4 = 0;
        int stackOut_32_5 = 0;
        mka stackOut_32_6 = null;
        csa stackOut_34_0 = null;
        boolean stackOut_34_1 = false;
        int stackOut_34_2 = 0;
        la stackOut_34_3 = null;
        int stackOut_34_4 = 0;
        int stackOut_34_5 = 0;
        mka stackOut_34_6 = null;
        int stackOut_34_7 = 0;
        csa stackOut_33_0 = null;
        boolean stackOut_33_1 = false;
        int stackOut_33_2 = 0;
        la stackOut_33_3 = null;
        int stackOut_33_4 = 0;
        int stackOut_33_5 = 0;
        mka stackOut_33_6 = null;
        int stackOut_33_7 = 0;
        csa stackOut_9_0 = null;
        boolean stackOut_9_1 = false;
        int stackOut_9_2 = 0;
        la stackOut_9_3 = null;
        int stackOut_9_4 = 0;
        int stackOut_9_5 = 0;
        mka stackOut_9_6 = null;
        csa stackOut_11_0 = null;
        boolean stackOut_11_1 = false;
        int stackOut_11_2 = 0;
        la stackOut_11_3 = null;
        int stackOut_11_4 = 0;
        int stackOut_11_5 = 0;
        mka stackOut_11_6 = null;
        int stackOut_11_7 = 0;
        csa stackOut_10_0 = null;
        boolean stackOut_10_1 = false;
        int stackOut_10_2 = 0;
        la stackOut_10_3 = null;
        int stackOut_10_4 = 0;
        int stackOut_10_5 = 0;
        mka stackOut_10_6 = null;
        int stackOut_10_7 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        if (!((kna) this).field_z.a(param5, 14530)) {
          return;
        } else {
          var13 = ((kna) this).a(param0, 3, param2);
          if (param6 == null) {
            var13.a(((kna) this).field_z, (byte) 121);
            var13.m(1, ((kna) this).field_j);
            if (param1) {
              var13.c(((kna) this).field_p, -19879);
              var13.a(((kna) this).field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L0: while (true) {
                if (((kna) this).field_t.length <= var9) {
                  L1: {
                    if (param6 == null) {
                      if (!((kna) this).z(0)) {
                        param2.a(var13, (byte) 32);
                        break L1;
                      } else {
                        var13.c(437453352, true);
                        param2.a(var13, (byte) 32);
                        if (!((kna) this).a(6)) {
                          ((kna) this).field_A = var13;
                          return;
                        } else {
                          if (!((kna) this).field_x) {
                            var13.m(-82);
                            ((kna) this).field_A = var13;
                            return;
                          } else {
                            ((kna) this).field_A = var13;
                            return;
                          }
                        }
                      }
                    } else {
                      param6.a(-39, var13);
                      break L1;
                    }
                  }
                  if (!((kna) this).a(6)) {
                    ((kna) this).field_A = var13;
                    return;
                  } else {
                    if (!((kna) this).field_x) {
                      var13.m(-82);
                      ((kna) this).field_A = var13;
                      return;
                    } else {
                      ((kna) this).field_A = var13;
                      return;
                    }
                  }
                } else {
                  var38 = ((kna) this).field_t[var9];
                  var11 = var38.a(-89);
                  if (var11 != null) {
                    L2: {
                      stackOut_88_0 = (csa) var11;
                      stackOut_88_1 = param0;
                      stackOut_88_2 = 1;
                      stackOut_88_3 = (la) param2;
                      stackOut_88_4 = param3 - -var38.b((byte) -125);
                      stackOut_88_5 = param4;
                      stackOut_88_6 = (mka) var38;
                      stackIn_90_0 = stackOut_88_0;
                      stackIn_90_1 = stackOut_88_1;
                      stackIn_90_2 = stackOut_88_2;
                      stackIn_90_3 = stackOut_88_3;
                      stackIn_90_4 = stackOut_88_4;
                      stackIn_90_5 = stackOut_88_5;
                      stackIn_90_6 = stackOut_88_6;
                      stackIn_89_0 = stackOut_88_0;
                      stackIn_89_1 = stackOut_88_1;
                      stackIn_89_2 = stackOut_88_2;
                      stackIn_89_3 = stackOut_88_3;
                      stackIn_89_4 = stackOut_88_4;
                      stackIn_89_5 = stackOut_88_5;
                      stackIn_89_6 = stackOut_88_6;
                      if (param1) {
                        stackOut_90_0 = (csa) (Object) stackIn_90_0;
                        stackOut_90_1 = stackIn_90_1;
                        stackOut_90_2 = stackIn_90_2;
                        stackOut_90_3 = (la) (Object) stackIn_90_3;
                        stackOut_90_4 = stackIn_90_4;
                        stackOut_90_5 = stackIn_90_5;
                        stackOut_90_6 = (mka) (Object) stackIn_90_6;
                        stackOut_90_7 = 0;
                        stackIn_91_0 = stackOut_90_0;
                        stackIn_91_1 = stackOut_90_1;
                        stackIn_91_2 = stackOut_90_2;
                        stackIn_91_3 = stackOut_90_3;
                        stackIn_91_4 = stackOut_90_4;
                        stackIn_91_5 = stackOut_90_5;
                        stackIn_91_6 = stackOut_90_6;
                        stackIn_91_7 = stackOut_90_7;
                        break L2;
                      } else {
                        stackOut_89_0 = (csa) (Object) stackIn_89_0;
                        stackOut_89_1 = stackIn_89_1;
                        stackOut_89_2 = stackIn_89_2;
                        stackOut_89_3 = (la) (Object) stackIn_89_3;
                        stackOut_89_4 = stackIn_89_4;
                        stackOut_89_5 = stackIn_89_5;
                        stackOut_89_6 = (mka) (Object) stackIn_89_6;
                        stackOut_89_7 = 1;
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_91_1 = stackOut_89_1;
                        stackIn_91_2 = stackOut_89_2;
                        stackIn_91_3 = stackOut_89_3;
                        stackIn_91_4 = stackOut_89_4;
                        stackIn_91_5 = stackOut_89_5;
                        stackIn_91_6 = stackOut_89_6;
                        stackIn_91_7 = stackOut_89_7;
                        break L2;
                      }
                    }
                    ((csa) (Object) stackIn_91_0).a(stackIn_91_1, stackIn_91_2 != 0, stackIn_91_3, stackIn_91_4, stackIn_91_5 - -((mka) (Object) stackIn_91_6).a(stackIn_91_7 != 0), param5, var13);
                    var9++;
                    continue L0;
                  } else {
                    var9++;
                    continue L0;
                  }
                }
              }
            } else {
              ((kna) this).field_A = null;
              var13.c(((kna) this).field_p, -19879);
              var13.a(((kna) this).field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L3: while (true) {
                if (((kna) this).field_t.length <= var9) {
                  L4: {
                    if (param6 == null) {
                      if (!((kna) this).z(0)) {
                        param2.a(var13, (byte) 32);
                        break L4;
                      } else {
                        var13.c(437453352, true);
                        param2.a(var13, (byte) 32);
                        if (!((kna) this).a(6)) {
                          ((kna) this).field_A = var13;
                          return;
                        } else {
                          if (!((kna) this).field_x) {
                            var13.m(-82);
                            ((kna) this).field_A = var13;
                            return;
                          } else {
                            ((kna) this).field_A = var13;
                            return;
                          }
                        }
                      }
                    } else {
                      param6.a(-39, var13);
                      break L4;
                    }
                  }
                  if (!((kna) this).a(6)) {
                    ((kna) this).field_A = var13;
                    return;
                  } else {
                    if (!((kna) this).field_x) {
                      var13.m(-82);
                      ((kna) this).field_A = var13;
                      return;
                    } else {
                      ((kna) this).field_A = var13;
                      return;
                    }
                  }
                } else {
                  var24 = ((kna) this).field_t[var9];
                  var25 = var24;
                  var26 = var25;
                  var27 = var26;
                  var25 = var24;
                  var11 = var24.a(-89);
                  if (var11 != null) {
                    L5: {
                      stackOut_56_0 = (csa) var11;
                      stackOut_56_1 = param0;
                      stackOut_56_2 = 1;
                      stackOut_56_3 = (la) param2;
                      stackOut_56_4 = param3 - -var24.b((byte) -125);
                      stackOut_56_5 = param4;
                      stackOut_56_6 = (mka) var24;
                      stackIn_58_0 = stackOut_56_0;
                      stackIn_58_1 = stackOut_56_1;
                      stackIn_58_2 = stackOut_56_2;
                      stackIn_58_3 = stackOut_56_3;
                      stackIn_58_4 = stackOut_56_4;
                      stackIn_58_5 = stackOut_56_5;
                      stackIn_58_6 = stackOut_56_6;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      stackIn_57_2 = stackOut_56_2;
                      stackIn_57_3 = stackOut_56_3;
                      stackIn_57_4 = stackOut_56_4;
                      stackIn_57_5 = stackOut_56_5;
                      stackIn_57_6 = stackOut_56_6;
                      if (param1) {
                        stackOut_58_0 = (csa) (Object) stackIn_58_0;
                        stackOut_58_1 = stackIn_58_1;
                        stackOut_58_2 = stackIn_58_2;
                        stackOut_58_3 = (la) (Object) stackIn_58_3;
                        stackOut_58_4 = stackIn_58_4;
                        stackOut_58_5 = stackIn_58_5;
                        stackOut_58_6 = (mka) (Object) stackIn_58_6;
                        stackOut_58_7 = 0;
                        stackIn_59_0 = stackOut_58_0;
                        stackIn_59_1 = stackOut_58_1;
                        stackIn_59_2 = stackOut_58_2;
                        stackIn_59_3 = stackOut_58_3;
                        stackIn_59_4 = stackOut_58_4;
                        stackIn_59_5 = stackOut_58_5;
                        stackIn_59_6 = stackOut_58_6;
                        stackIn_59_7 = stackOut_58_7;
                        break L5;
                      } else {
                        stackOut_57_0 = (csa) (Object) stackIn_57_0;
                        stackOut_57_1 = stackIn_57_1;
                        stackOut_57_2 = stackIn_57_2;
                        stackOut_57_3 = (la) (Object) stackIn_57_3;
                        stackOut_57_4 = stackIn_57_4;
                        stackOut_57_5 = stackIn_57_5;
                        stackOut_57_6 = (mka) (Object) stackIn_57_6;
                        stackOut_57_7 = 1;
                        stackIn_59_0 = stackOut_57_0;
                        stackIn_59_1 = stackOut_57_1;
                        stackIn_59_2 = stackOut_57_2;
                        stackIn_59_3 = stackOut_57_3;
                        stackIn_59_4 = stackOut_57_4;
                        stackIn_59_5 = stackOut_57_5;
                        stackIn_59_6 = stackOut_57_6;
                        stackIn_59_7 = stackOut_57_7;
                        break L5;
                      }
                    }
                    ((csa) (Object) stackIn_59_0).a(stackIn_59_1, stackIn_59_2 != 0, stackIn_59_3, stackIn_59_4, stackIn_59_5 - -((mka) (Object) stackIn_59_6).a(stackIn_59_7 != 0), param5, var13);
                    var9++;
                    continue L3;
                  } else {
                    var9++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var13.b(true, 11468);
            var13.a(((kna) this).field_z, (byte) 121);
            var13.m(1, ((kna) this).field_j);
            if (!param1) {
              ((kna) this).field_A = null;
              var13.c(((kna) this).field_p, -19879);
              var13.a(((kna) this).field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L6: while (true) {
                if (((kna) this).field_t.length <= var9) {
                  L7: {
                    if (param6 == null) {
                      L8: {
                        if (!((kna) this).z(0)) {
                          break L8;
                        } else {
                          var13.c(437453352, true);
                          break L8;
                        }
                      }
                      param2.a(var13, (byte) 32);
                      break L7;
                    } else {
                      param6.a(-39, var13);
                      break L7;
                    }
                  }
                  if (!((kna) this).a(6)) {
                    ((kna) this).field_A = var13;
                    return;
                  } else {
                    if (!((kna) this).field_x) {
                      var13.m(-82);
                      ((kna) this).field_A = var13;
                      return;
                    } else {
                      ((kna) this).field_A = var13;
                      return;
                    }
                  }
                } else {
                  var17_ref = ((kna) this).field_t[var9];
                  var18 = var17_ref;
                  var19 = var18;
                  var20 = var19;
                  var18 = var17_ref;
                  var11 = var17_ref.a(-89);
                  if (var11 != null) {
                    L9: {
                      stackOut_32_0 = (csa) var11;
                      stackOut_32_1 = param0;
                      stackOut_32_2 = 1;
                      stackOut_32_3 = (la) param2;
                      stackOut_32_4 = param3 - -var17_ref.b((byte) -125);
                      stackOut_32_5 = param4;
                      stackOut_32_6 = (mka) var17_ref;
                      stackIn_34_0 = stackOut_32_0;
                      stackIn_34_1 = stackOut_32_1;
                      stackIn_34_2 = stackOut_32_2;
                      stackIn_34_3 = stackOut_32_3;
                      stackIn_34_4 = stackOut_32_4;
                      stackIn_34_5 = stackOut_32_5;
                      stackIn_34_6 = stackOut_32_6;
                      stackIn_33_0 = stackOut_32_0;
                      stackIn_33_1 = stackOut_32_1;
                      stackIn_33_2 = stackOut_32_2;
                      stackIn_33_3 = stackOut_32_3;
                      stackIn_33_4 = stackOut_32_4;
                      stackIn_33_5 = stackOut_32_5;
                      stackIn_33_6 = stackOut_32_6;
                      if (param1) {
                        stackOut_34_0 = (csa) (Object) stackIn_34_0;
                        stackOut_34_1 = stackIn_34_1;
                        stackOut_34_2 = stackIn_34_2;
                        stackOut_34_3 = (la) (Object) stackIn_34_3;
                        stackOut_34_4 = stackIn_34_4;
                        stackOut_34_5 = stackIn_34_5;
                        stackOut_34_6 = (mka) (Object) stackIn_34_6;
                        stackOut_34_7 = 0;
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        stackIn_35_3 = stackOut_34_3;
                        stackIn_35_4 = stackOut_34_4;
                        stackIn_35_5 = stackOut_34_5;
                        stackIn_35_6 = stackOut_34_6;
                        stackIn_35_7 = stackOut_34_7;
                        break L9;
                      } else {
                        stackOut_33_0 = (csa) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = stackIn_33_2;
                        stackOut_33_3 = (la) (Object) stackIn_33_3;
                        stackOut_33_4 = stackIn_33_4;
                        stackOut_33_5 = stackIn_33_5;
                        stackOut_33_6 = (mka) (Object) stackIn_33_6;
                        stackOut_33_7 = 1;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_35_1 = stackOut_33_1;
                        stackIn_35_2 = stackOut_33_2;
                        stackIn_35_3 = stackOut_33_3;
                        stackIn_35_4 = stackOut_33_4;
                        stackIn_35_5 = stackOut_33_5;
                        stackIn_35_6 = stackOut_33_6;
                        stackIn_35_7 = stackOut_33_7;
                        break L9;
                      }
                    }
                    ((csa) (Object) stackIn_35_0).a(stackIn_35_1, stackIn_35_2 != 0, stackIn_35_3, stackIn_35_4, stackIn_35_5 - -((mka) (Object) stackIn_35_6).a(stackIn_35_7 != 0), param5, var13);
                    var9++;
                    continue L6;
                  } else {
                    var9++;
                    continue L6;
                  }
                }
              }
            } else {
              var13.c(((kna) this).field_p, -19879);
              var13.a(((kna) this).field_r + param4, (byte) 110);
              var13.f(10, param3);
              var13.z(1);
              var9 = 0;
              L10: while (true) {
                if (((kna) this).field_t.length <= var9) {
                  L11: {
                    if (param6 == null) {
                      if (!((kna) this).z(0)) {
                        param2.a(var13, (byte) 32);
                        break L11;
                      } else {
                        var13.c(437453352, true);
                        param2.a(var13, (byte) 32);
                        break L11;
                      }
                    } else {
                      param6.a(-39, var13);
                      break L11;
                    }
                  }
                  L12: {
                    if (!((kna) this).a(6)) {
                      ((kna) this).field_A = var13;
                      break L12;
                    } else {
                      if (!((kna) this).field_x) {
                        var13.m(-82);
                        ((kna) this).field_A = var13;
                        break L12;
                      } else {
                        ((kna) this).field_A = var13;
                        break L12;
                      }
                    }
                  }
                  return;
                } else {
                  var14 = ((kna) this).field_t[var9];
                  var15 = var14;
                  var16 = var15;
                  var17 = var16;
                  var15 = var14;
                  var11 = var14.a(-89);
                  if (var11 != null) {
                    L13: {
                      stackOut_9_0 = (csa) var11;
                      stackOut_9_1 = param0;
                      stackOut_9_2 = 1;
                      stackOut_9_3 = (la) param2;
                      stackOut_9_4 = param3 - -var14.b((byte) -125);
                      stackOut_9_5 = param4;
                      stackOut_9_6 = (mka) var14;
                      stackIn_11_0 = stackOut_9_0;
                      stackIn_11_1 = stackOut_9_1;
                      stackIn_11_2 = stackOut_9_2;
                      stackIn_11_3 = stackOut_9_3;
                      stackIn_11_4 = stackOut_9_4;
                      stackIn_11_5 = stackOut_9_5;
                      stackIn_11_6 = stackOut_9_6;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      stackIn_10_2 = stackOut_9_2;
                      stackIn_10_3 = stackOut_9_3;
                      stackIn_10_4 = stackOut_9_4;
                      stackIn_10_5 = stackOut_9_5;
                      stackIn_10_6 = stackOut_9_6;
                      if (param1) {
                        stackOut_11_0 = (csa) (Object) stackIn_11_0;
                        stackOut_11_1 = stackIn_11_1;
                        stackOut_11_2 = stackIn_11_2;
                        stackOut_11_3 = (la) (Object) stackIn_11_3;
                        stackOut_11_4 = stackIn_11_4;
                        stackOut_11_5 = stackIn_11_5;
                        stackOut_11_6 = (mka) (Object) stackIn_11_6;
                        stackOut_11_7 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        stackIn_12_2 = stackOut_11_2;
                        stackIn_12_3 = stackOut_11_3;
                        stackIn_12_4 = stackOut_11_4;
                        stackIn_12_5 = stackOut_11_5;
                        stackIn_12_6 = stackOut_11_6;
                        stackIn_12_7 = stackOut_11_7;
                        break L13;
                      } else {
                        stackOut_10_0 = (csa) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = stackIn_10_2;
                        stackOut_10_3 = (la) (Object) stackIn_10_3;
                        stackOut_10_4 = stackIn_10_4;
                        stackOut_10_5 = stackIn_10_5;
                        stackOut_10_6 = (mka) (Object) stackIn_10_6;
                        stackOut_10_7 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        stackIn_12_1 = stackOut_10_1;
                        stackIn_12_2 = stackOut_10_2;
                        stackIn_12_3 = stackOut_10_3;
                        stackIn_12_4 = stackOut_10_4;
                        stackIn_12_5 = stackOut_10_5;
                        stackIn_12_6 = stackOut_10_6;
                        stackIn_12_7 = stackOut_10_7;
                        break L13;
                      }
                    }
                    ((csa) (Object) stackIn_12_0).a(stackIn_12_1, stackIn_12_2 != 0, stackIn_12_3, stackIn_12_4, stackIn_12_5 - -((mka) (Object) stackIn_12_6).a(stackIn_12_7 != 0), param5, var13);
                    var9++;
                    continue L10;
                  } else {
                    var9++;
                    continue L10;
                  }
                }
              }
            }
          }
        }
    }

    kna(la param0, int param1) {
        super(param0, param1);
    }

    boolean z(int param0) {
        if (param0 != 0) {
            field_C = null;
            return true;
        }
        return true;
    }

    abstract fsa a(boolean param0, int param1, la param2);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "<%0> cannot join; the game is full.";
        field_E = "Offer rematch";
        field_B = "Withdraw request to join <%0>'s game";
        field_D = "A fascinating scientific anomaly, these discs are kept in motion by a peculiar interaction of the temple's magnetic forces.";
    }
}
