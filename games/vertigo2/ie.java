/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends cr {
    static String field_Rb;
    static fe field_Hb;
    private cr field_Mb;
    static String field_Sb;
    private cr field_Ib;
    private cr field_Lb;
    static int field_Kb;
    private cr field_Ob;
    static long field_Nb;
    private cr field_Qb;
    private cr field_Pb;
    private int field_Jb;

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        ((ie) this).field_Fb = param1;
        ((ie) this).field_db = param0;
        ((ie) this).field_N = param2;
        if (param3 < 99) {
          ((ie) this).field_Lb = null;
          ((ie) this).field_wb = param6;
          ((ie) this).a(param5, param4, (byte) -52, param7);
          return;
        } else {
          ((ie) this).field_wb = param6;
          ((ie) this).a(param5, param4, (byte) -52, param7);
          return;
        }
    }

    ie(long param0, ie param1) {
        this(param0, param1.field_Lb, param1.field_Qb, param1.field_Ib, param1.field_Pb);
    }

    public static void o(int param0) {
        field_Hb = null;
        if (param0 > -14) {
            return;
        }
        field_Sb = null;
        field_Rb = null;
    }

    final boolean p(int param0) {
        if (((ie) this).field_Lb.field_tb == 0) {
          if (0 != ((ie) this).field_Lb.field_xb) {
            L0: {
              if (0 < ((ie) this).field_Jb) {
                ((ie) this).field_Jb = ((ie) this).field_Jb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (0 != ((ie) this).field_Jb) {
              if (param0 >= -42) {
                boolean discarded$4 = ((ie) this).m(13);
                return false;
              } else {
                return false;
              }
            } else {
              ((ie) this).field_Jb = 3;
              return true;
            }
          } else {
            if (param0 >= -42) {
              boolean discarded$5 = ((ie) this).m(13);
              return false;
            } else {
              return false;
            }
          }
        } else {
          ((ie) this).field_Jb = 20;
          return true;
        }
    }

    final boolean k(int param0) {
        if (param0 != 0) {
            return false;
        }
        return ((ie) this).field_Pb.field_xb != 0 ? true : false;
    }

    final int a(int param0, boolean param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = -((ie) this).field_Pb.field_db + ((ie) this).field_Mb.field_db;
          if (var6 <= 0) {
            break L0;
          } else {
            var7 = ((ie) this).field_Pb.field_N;
            var8 = -param3 + param0;
            var5 = (var7 * var8 - -(var6 / 2)) / var6;
            break L0;
          }
        }
        if (param2) {
          L1: {
            if (var5 < 0) {
              var5 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param0 + -param3 >= var5) {
              break L2;
            } else {
              var5 = param0 - param3;
              break L2;
            }
          }
          if (!param1) {
            field_Sb = null;
            return var5;
          } else {
            return var5;
          }
        } else {
          L3: {
            if (var5 <= param0 + -param3) {
              break L3;
            } else {
              var5 = param0 - param3;
              break L3;
            }
          }
          if (var5 < 0) {
            var5 = 0;
            if (param1) {
              return var5;
            } else {
              field_Sb = null;
              return var5;
            }
          } else {
            if (!param1) {
              field_Sb = null;
              return var5;
            } else {
              return var5;
            }
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cr var14 = null;
        cr var15 = null;
        cr var16 = null;
        cr var17 = null;
        cr var18 = null;
        cr var19 = null;
        cr stackIn_14_0 = null;
        cr stackIn_14_1 = null;
        cr stackIn_14_2 = null;
        cr stackIn_15_0 = null;
        cr stackIn_15_1 = null;
        cr stackIn_15_2 = null;
        cr stackIn_16_0 = null;
        cr stackIn_16_1 = null;
        cr stackIn_16_2 = null;
        int stackIn_16_3 = 0;
        cr stackIn_21_0 = null;
        cr stackIn_21_1 = null;
        cr stackIn_21_2 = null;
        cr stackIn_22_0 = null;
        cr stackIn_22_1 = null;
        cr stackIn_22_2 = null;
        cr stackIn_23_0 = null;
        cr stackIn_23_1 = null;
        cr stackIn_23_2 = null;
        int stackIn_23_3 = 0;
        cr stackIn_30_0 = null;
        cr stackIn_30_1 = null;
        cr stackIn_30_2 = null;
        cr stackIn_31_0 = null;
        cr stackIn_31_1 = null;
        cr stackIn_31_2 = null;
        cr stackIn_32_0 = null;
        cr stackIn_32_1 = null;
        cr stackIn_32_2 = null;
        int stackIn_32_3 = 0;
        cr stackIn_36_0 = null;
        cr stackIn_36_1 = null;
        cr stackIn_36_2 = null;
        cr stackIn_37_0 = null;
        cr stackIn_37_1 = null;
        cr stackIn_37_2 = null;
        cr stackIn_38_0 = null;
        cr stackIn_38_1 = null;
        cr stackIn_38_2 = null;
        int stackIn_38_3 = 0;
        cr stackOut_35_0 = null;
        cr stackOut_35_1 = null;
        cr stackOut_35_2 = null;
        cr stackOut_37_0 = null;
        cr stackOut_37_1 = null;
        cr stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        cr stackOut_36_0 = null;
        cr stackOut_36_1 = null;
        cr stackOut_36_2 = null;
        int stackOut_36_3 = 0;
        cr stackOut_29_0 = null;
        cr stackOut_29_1 = null;
        cr stackOut_29_2 = null;
        cr stackOut_31_0 = null;
        cr stackOut_31_1 = null;
        cr stackOut_31_2 = null;
        int stackOut_31_3 = 0;
        cr stackOut_30_0 = null;
        cr stackOut_30_1 = null;
        cr stackOut_30_2 = null;
        int stackOut_30_3 = 0;
        cr stackOut_20_0 = null;
        cr stackOut_20_1 = null;
        cr stackOut_20_2 = null;
        cr stackOut_22_0 = null;
        cr stackOut_22_1 = null;
        cr stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        cr stackOut_21_0 = null;
        cr stackOut_21_1 = null;
        cr stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        cr stackOut_13_0 = null;
        cr stackOut_13_1 = null;
        cr stackOut_13_2 = null;
        cr stackOut_15_0 = null;
        cr stackOut_15_1 = null;
        cr stackOut_15_2 = null;
        int stackOut_15_3 = 0;
        cr stackOut_14_0 = null;
        cr stackOut_14_1 = null;
        cr stackOut_14_2 = null;
        int stackOut_14_3 = 0;
        L0: {
          if (((ie) this).field_db >= ((ie) this).field_Fb * 2) {
            var5 = ((ie) this).field_Fb;
            var6 = ((ie) this).field_db + -((ie) this).field_Fb;
            break L0;
          } else {
            var6 = ((ie) this).field_db / 2;
            var5 = ((ie) this).field_db / 2;
            break L0;
          }
        }
        var7 = var6 + -var5;
        if (param2 < -43) {
          var8 = var7;
          if (0 < param0) {
            L1: {
              var8 = var8 * param3 / param0;
              if (var8 >= ((ie) this).field_Fb) {
                break L1;
              } else {
                var8 = ((ie) this).field_Fb;
                break L1;
              }
            }
            if (var8 > var7) {
              L2: {
                var8 = var7;
                var9 = param0 - param3;
                var10 = -var8 + var7;
                var11 = 0;
                if (var9 <= 0) {
                  break L2;
                } else {
                  var11 = (param1 * var10 + var9 / 2) / var9;
                  break L2;
                }
              }
              L3: {
                var12 = var11 + var8 / 2;
                var14 = ((ie) this).field_Lb;
                var14.field_N = 0;
                var14.field_wb = 0;
                var14.field_Fb = ((ie) this).field_Fb;
                var14.field_db = var5;
                var15 = ((ie) this).field_Qb;
                var15.field_wb = 0;
                var15.field_db = -var6 + ((ie) this).field_db;
                var15.field_Fb = ((ie) this).field_Fb;
                var15.field_N = var6;
                var16 = ((ie) this).field_Mb;
                var16.field_wb = 0;
                var16.field_N = var5;
                var16.field_Fb = ((ie) this).field_Fb;
                var16.field_db = var7;
                var17 = ((ie) this).field_Ib;
                var17.field_Fb = ((ie) this).field_Fb;
                var17.field_wb = 0;
                var17.field_db = var12;
                var17.field_N = 0;
                var18 = ((ie) this).field_Ob;
                var18.field_N = var12;
                var18.field_Fb = ((ie) this).field_Fb;
                var18.field_db = var7 + -var12;
                var18.field_wb = 0;
                var19 = ((ie) this).field_Pb;
                var19.field_db = var8;
                var19.field_Fb = ((ie) this).field_Fb;
                var19.field_N = var11;
                stackOut_35_0 = ((ie) this).field_Lb;
                stackOut_35_1 = ((ie) this).field_Qb;
                stackOut_35_2 = ((ie) this).field_Mb;
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_37_2 = stackOut_35_2;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                stackIn_36_2 = stackOut_35_2;
                if (param0 <= param3) {
                  stackOut_37_0 = (cr) (Object) stackIn_37_0;
                  stackOut_37_1 = (cr) (Object) stackIn_37_1;
                  stackOut_37_2 = (cr) (Object) stackIn_37_2;
                  stackOut_37_3 = 0;
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  stackIn_38_3 = stackOut_37_3;
                  break L3;
                } else {
                  stackOut_36_0 = (cr) (Object) stackIn_36_0;
                  stackOut_36_1 = (cr) (Object) stackIn_36_1;
                  stackOut_36_2 = (cr) (Object) stackIn_36_2;
                  stackOut_36_3 = 1;
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  stackIn_38_3 = stackOut_36_3;
                  break L3;
                }
              }
              stackIn_38_2.field_lb = stackIn_38_3 != 0;
              stackIn_38_1.field_lb = stackIn_38_3 != 0;
              stackIn_38_0.field_lb = stackIn_38_3 != 0;
              var19.field_wb = 0;
              return;
            } else {
              L4: {
                var9 = param0 - param3;
                var10 = -var8 + var7;
                var11 = 0;
                if (var9 <= 0) {
                  break L4;
                } else {
                  var11 = (param1 * var10 + var9 / 2) / var9;
                  break L4;
                }
              }
              L5: {
                var12 = var11 + var8 / 2;
                var14 = ((ie) this).field_Lb;
                var14.field_N = 0;
                var14.field_wb = 0;
                var14.field_Fb = ((ie) this).field_Fb;
                var14.field_db = var5;
                var15 = ((ie) this).field_Qb;
                var15.field_wb = 0;
                var15.field_db = -var6 + ((ie) this).field_db;
                var15.field_Fb = ((ie) this).field_Fb;
                var15.field_N = var6;
                var16 = ((ie) this).field_Mb;
                var16.field_wb = 0;
                var16.field_N = var5;
                var16.field_Fb = ((ie) this).field_Fb;
                var16.field_db = var7;
                var17 = ((ie) this).field_Ib;
                var17.field_Fb = ((ie) this).field_Fb;
                var17.field_wb = 0;
                var17.field_db = var12;
                var17.field_N = 0;
                var18 = ((ie) this).field_Ob;
                var18.field_N = var12;
                var18.field_Fb = ((ie) this).field_Fb;
                var18.field_db = var7 + -var12;
                var18.field_wb = 0;
                var19 = ((ie) this).field_Pb;
                var19.field_db = var8;
                var19.field_Fb = ((ie) this).field_Fb;
                var19.field_N = var11;
                stackOut_29_0 = ((ie) this).field_Lb;
                stackOut_29_1 = ((ie) this).field_Qb;
                stackOut_29_2 = ((ie) this).field_Mb;
                stackIn_31_0 = stackOut_29_0;
                stackIn_31_1 = stackOut_29_1;
                stackIn_31_2 = stackOut_29_2;
                stackIn_30_0 = stackOut_29_0;
                stackIn_30_1 = stackOut_29_1;
                stackIn_30_2 = stackOut_29_2;
                if (param0 <= param3) {
                  stackOut_31_0 = (cr) (Object) stackIn_31_0;
                  stackOut_31_1 = (cr) (Object) stackIn_31_1;
                  stackOut_31_2 = (cr) (Object) stackIn_31_2;
                  stackOut_31_3 = 0;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  stackIn_32_2 = stackOut_31_2;
                  stackIn_32_3 = stackOut_31_3;
                  break L5;
                } else {
                  stackOut_30_0 = (cr) (Object) stackIn_30_0;
                  stackOut_30_1 = (cr) (Object) stackIn_30_1;
                  stackOut_30_2 = (cr) (Object) stackIn_30_2;
                  stackOut_30_3 = 1;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_32_1 = stackOut_30_1;
                  stackIn_32_2 = stackOut_30_2;
                  stackIn_32_3 = stackOut_30_3;
                  break L5;
                }
              }
              stackIn_32_2.field_lb = stackIn_32_3 != 0;
              stackIn_32_1.field_lb = stackIn_32_3 != 0;
              stackIn_32_0.field_lb = stackIn_32_3 != 0;
              var19.field_wb = 0;
              return;
            }
          } else {
            L6: {
              var9 = param0 - param3;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 <= 0) {
                break L6;
              } else {
                var11 = (param1 * var10 + var9 / 2) / var9;
                break L6;
              }
            }
            L7: {
              var12 = var11 + var8 / 2;
              var14 = ((ie) this).field_Lb;
              var14.field_N = 0;
              var14.field_wb = 0;
              var14.field_Fb = ((ie) this).field_Fb;
              var14.field_db = var5;
              var15 = ((ie) this).field_Qb;
              var15.field_wb = 0;
              var15.field_db = -var6 + ((ie) this).field_db;
              var15.field_Fb = ((ie) this).field_Fb;
              var15.field_N = var6;
              var16 = ((ie) this).field_Mb;
              var16.field_wb = 0;
              var16.field_N = var5;
              var16.field_Fb = ((ie) this).field_Fb;
              var16.field_db = var7;
              var17 = ((ie) this).field_Ib;
              var17.field_Fb = ((ie) this).field_Fb;
              var17.field_wb = 0;
              var17.field_db = var12;
              var17.field_N = 0;
              var18 = ((ie) this).field_Ob;
              var18.field_N = var12;
              var18.field_Fb = ((ie) this).field_Fb;
              var18.field_db = var7 + -var12;
              var18.field_wb = 0;
              var19 = ((ie) this).field_Pb;
              var19.field_db = var8;
              var19.field_Fb = ((ie) this).field_Fb;
              var19.field_N = var11;
              stackOut_20_0 = ((ie) this).field_Lb;
              stackOut_20_1 = ((ie) this).field_Qb;
              stackOut_20_2 = ((ie) this).field_Mb;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              if (param0 <= param3) {
                stackOut_22_0 = (cr) (Object) stackIn_22_0;
                stackOut_22_1 = (cr) (Object) stackIn_22_1;
                stackOut_22_2 = (cr) (Object) stackIn_22_2;
                stackOut_22_3 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                stackIn_23_2 = stackOut_22_2;
                stackIn_23_3 = stackOut_22_3;
                break L7;
              } else {
                stackOut_21_0 = (cr) (Object) stackIn_21_0;
                stackOut_21_1 = (cr) (Object) stackIn_21_1;
                stackOut_21_2 = (cr) (Object) stackIn_21_2;
                stackOut_21_3 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_23_2 = stackOut_21_2;
                stackIn_23_3 = stackOut_21_3;
                break L7;
              }
            }
            stackIn_23_2.field_lb = stackIn_23_3 != 0;
            stackIn_23_1.field_lb = stackIn_23_3 != 0;
            stackIn_23_0.field_lb = stackIn_23_3 != 0;
            var19.field_wb = 0;
            return;
          }
        } else {
          L8: {
            boolean discarded$1 = ((ie) this).l(109);
            var8 = var7;
            if (0 < param0) {
              L9: {
                var8 = var8 * param3 / param0;
                if (var8 >= ((ie) this).field_Fb) {
                  break L9;
                } else {
                  var8 = ((ie) this).field_Fb;
                  break L9;
                }
              }
              if (var8 > var7) {
                var8 = var7;
                break L8;
              } else {
                break L8;
              }
            } else {
              break L8;
            }
          }
          L10: {
            var9 = param0 - param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 <= 0) {
              break L10;
            } else {
              var11 = (param1 * var10 + var9 / 2) / var9;
              break L10;
            }
          }
          L11: {
            var12 = var11 + var8 / 2;
            var14 = ((ie) this).field_Lb;
            var14.field_N = 0;
            var14.field_wb = 0;
            var14.field_Fb = ((ie) this).field_Fb;
            var14.field_db = var5;
            var15 = ((ie) this).field_Qb;
            var15.field_wb = 0;
            var15.field_db = -var6 + ((ie) this).field_db;
            var15.field_Fb = ((ie) this).field_Fb;
            var15.field_N = var6;
            var16 = ((ie) this).field_Mb;
            var16.field_wb = 0;
            var16.field_N = var5;
            var16.field_Fb = ((ie) this).field_Fb;
            var16.field_db = var7;
            var17 = ((ie) this).field_Ib;
            var17.field_Fb = ((ie) this).field_Fb;
            var17.field_wb = 0;
            var17.field_db = var12;
            var17.field_N = 0;
            var18 = ((ie) this).field_Ob;
            var18.field_N = var12;
            var18.field_Fb = ((ie) this).field_Fb;
            var18.field_db = var7 + -var12;
            var18.field_wb = 0;
            var19 = ((ie) this).field_Pb;
            var19.field_db = var8;
            var19.field_Fb = ((ie) this).field_Fb;
            var19.field_N = var11;
            stackOut_13_0 = ((ie) this).field_Lb;
            stackOut_13_1 = ((ie) this).field_Qb;
            stackOut_13_2 = ((ie) this).field_Mb;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_15_2 = stackOut_13_2;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            stackIn_14_2 = stackOut_13_2;
            if (param0 <= param3) {
              stackOut_15_0 = (cr) (Object) stackIn_15_0;
              stackOut_15_1 = (cr) (Object) stackIn_15_1;
              stackOut_15_2 = (cr) (Object) stackIn_15_2;
              stackOut_15_3 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              stackIn_16_3 = stackOut_15_3;
              break L11;
            } else {
              stackOut_14_0 = (cr) (Object) stackIn_14_0;
              stackOut_14_1 = (cr) (Object) stackIn_14_1;
              stackOut_14_2 = (cr) (Object) stackIn_14_2;
              stackOut_14_3 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              stackIn_16_3 = stackOut_14_3;
              break L11;
            }
          }
          stackIn_16_2.field_lb = stackIn_16_3 != 0;
          stackIn_16_1.field_lb = stackIn_16_3 != 0;
          stackIn_16_0.field_lb = stackIn_16_3 != 0;
          var19.field_wb = 0;
          return;
        }
    }

    final static qj q(int param0) {
        if (param0 != 20) {
          ie.o(-87);
          int discarded$8 = -1;
          int discarded$9 = 132199140;
          return new qj(eb.a(), ln.c());
        } else {
          int discarded$10 = -1;
          int discarded$11 = 132199140;
          return new qj(eb.a(), ln.c());
        }
    }

    final static void b(int param0, boolean param1) {
        int discarded$6 = -128;
        e.a(param1);
        if (!(null == ko.field_S)) {
            int discarded$7 = 0;
            oh.a(ko.field_S);
        }
    }

    final boolean m(int param0) {
        if (!(0 == ((ie) this).field_Qb.field_tb)) {
            ((ie) this).field_Jb = 20;
            return true;
        }
        if (((ie) this).field_Qb.field_xb != 0) {
            if (((ie) this).field_Jb > 0) {
                ((ie) this).field_Jb = ((ie) this).field_Jb - 1;
                if (!(((ie) this).field_Jb != 0)) {
                    ((ie) this).field_Jb = 3;
                    return true;
                }
                if (param0 >= 20) {
                    return false;
                }
                boolean discarded$0 = ((ie) this).l(30);
                return false;
            }
            if (((ie) this).field_Jb != 0) {
                if (param0 >= 20) {
                    return false;
                }
                boolean discarded$1 = ((ie) this).l(30);
                return false;
            }
            ((ie) this).field_Jb = 3;
            return true;
        }
        if (param0 < 20) {
            boolean discarded$2 = ((ie) this).l(30);
            return false;
        }
        return false;
    }

    ie(long param0, cr param1, cr param2, cr param3, cr param4) {
        super(param0, (cr) null);
        RuntimeException var7 = null;
        cr var9 = null;
        cr var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((ie) this).field_Lb = new cr(0L, param1);
            ((ie) this).field_Qb = new cr(0L, param2);
            ((ie) this).b(((ie) this).field_Lb, 126);
            ((ie) this).b(((ie) this).field_Qb, 125);
            ((ie) this).field_Mb = new cr(0L, (cr) null);
            ((ie) this).b(((ie) this).field_Mb, 125);
            ((ie) this).field_Ib = new cr(0L, param3);
            ((ie) this).field_Ob = new cr(0L, param3);
            var9 = ((ie) this).field_Ib;
            var10 = var9;
            ((ie) this).field_Ob.field_jb = true;
            var10.field_jb = true;
            ((ie) this).field_Mb.b(((ie) this).field_Ib, 123);
            ((ie) this).field_Mb.b(((ie) this).field_Ob, 118);
            ((ie) this).field_Pb = new cr(0L, param4);
            ((ie) this).field_Pb.field_X = true;
            ((ie) this).field_Mb.b(((ie) this).field_Pb, 122);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("ie.<init>(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final boolean n(int param0) {
        if (param0 == -22155) {
          if (((ie) this).field_Ob.field_tb != 0) {
            ((ie) this).field_Jb = 20;
            return true;
          } else {
            if (((ie) this).field_Ob.field_xb != 0) {
              if (((ie) this).field_Jb <= 0) {
                if (0 == ((ie) this).field_Jb) {
                  if (gb.field_d < ((ie) this).field_Pb.field_kb + (((ie) this).field_Pb.field_db + ((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C)) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((ie) this).field_Jb = ((ie) this).field_Jb - 1;
                if (0 == ((ie) this).field_Jb) {
                  if (gb.field_d < ((ie) this).field_Pb.field_kb + (((ie) this).field_Pb.field_db + ((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C)) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          qj discarded$1 = ie.q(-71);
          if (((ie) this).field_Ob.field_tb != 0) {
            ((ie) this).field_Jb = 20;
            return true;
          } else {
            if (((ie) this).field_Ob.field_xb != 0) {
              if (((ie) this).field_Jb > 0) {
                ((ie) this).field_Jb = ((ie) this).field_Jb - 1;
                if (0 == ((ie) this).field_Jb) {
                  if (gb.field_d < ((ie) this).field_Pb.field_kb + (((ie) this).field_Pb.field_db + ((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C)) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (0 == ((ie) this).field_Jb) {
                  if (gb.field_d < ((ie) this).field_Pb.field_kb + (((ie) this).field_Pb.field_db + ((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C)) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final boolean l(int param0) {
        if (((ie) this).field_Ib.field_tb == 0) {
          if (param0 < -59) {
            if (((ie) this).field_Ib.field_xb != 0) {
              if (((ie) this).field_Jb <= 0) {
                if (((ie) this).field_Jb == 0) {
                  if (((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C <= gb.field_d) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((ie) this).field_Jb = ((ie) this).field_Jb - 1;
                if (((ie) this).field_Jb == 0) {
                  if (((ie) this).field_Pb.field_L + ((ie) this).field_Pb.field_C <= gb.field_d) {
                    return false;
                  } else {
                    ((ie) this).field_Jb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((ie) this).field_Jb = 20;
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Rb = "<%0>'s game";
        field_Sb = "Advertising websites";
        field_Kb = 0;
    }
}
