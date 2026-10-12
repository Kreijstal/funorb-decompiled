/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc extends ClientUiComponent {
    private int field_Kb;
    static String[] field_Pb;
    static String field_Nb;
    private ClientUiComponent field_Lb;
    private StringBuilder field_Qb;
    private ClientUiComponent field_Mb;
    static String field_Ib;
    static String field_Jb;
    static String field_Ob;

    public static void k(int param0) {
        field_Jb = null;
        field_Pb = null;
        field_Ib = null;
        field_Nb = null;
        if (param0 == 0) {
          field_Ob = null;
          return;
        }
        field_Jb = (String) null;
        field_Ob = null;
    }

    final int b(boolean param0, boolean param1) {
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.updateInput(param0, param1);
        if (!param1) {
          this.field_Mb.text = this.field_Qb.toString();
          if (param1 &&
            0 != DeployEvent.pointerPressButton &&
            this.pressedButton == 0) {
            this.field_Kb = 1;
          }
          if (!param0) {
            this.b(false, true);
          }
          return this.field_Kb;
        }
        while (true) {
          if (!Unit.i((byte) -51)) {
            this.field_Mb.text = this.field_Qb.toString();
            if (param1 &&
              0 != DeployEvent.pointerPressButton &&
              this.pressedButton == 0) {
              this.field_Kb = 1;
              if (param0) {
                return this.field_Kb;
              }
              this.b(false, true);
              return this.field_Kb;
            }
            if (param0) {
              return this.field_Kb;
            }
            this.b(false, true);
            return this.field_Kb;
          }
          if (rs.field_q == 85 &&
            this.field_Qb.length() > 0) {
            PortalLossCondition.a(' ', -1 + this.field_Qb.length(), this.field_Qb, true);
          }
          if (kv.a(false, (CharSequence) ((Object) this.field_Qb), DualNodeDeque.field_i)) {
            discarded$1 = this.field_Qb.append(DualNodeDeque.field_i);
          } else {
            if (this.field_Qb.length() == 0 &&
              91 == DualNodeDeque.field_i) {
              discarded$2 = this.field_Qb.append(DualNodeDeque.field_i);
            } else {
              if (this.field_Qb.length() == 1 &&
                DualNodeDeque.field_i == 35) {
                discarded$3 = this.field_Qb.append(DualNodeDeque.field_i);
              } else {
                if (DualNodeDeque.field_i == 93) {
                  discarded$4 = this.field_Qb.append(DualNodeDeque.field_i);
                }
              }
            }
          }
          if (rs.field_q != 84) {
            if (rs.field_q != 13) {
              continue;
            }
            return 1;
          }
          break;
        }
        if (this.field_Qb.length() <= 0) {
          return 1;
        }
        this.text = this.field_Qb.toString();
        return 2;
    }

    final boolean d(byte param0) {
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        if (0 != this.field_Kb) {
          return false;
        }
        if (rs.field_q != 85) {
          if (this.field_Qb.length() >= 12) {
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 != -101) {
              return false;
            }
            return true;
          }
          var2 = Character.toLowerCase(DualNodeDeque.field_i);
          if (var2 == 32) {
            var2 = 95;
            if (var2 == 95 &&
              this.field_Qb.length() > 0) {
              discarded$8 = this.field_Qb.append((char) var2);
            }
          } else {
            if (var2 == 95 &&
              this.field_Qb.length() > 0) {
              discarded$9 = this.field_Qb.append((char) var2);
            }
          }
          if (MeshObject.a((byte) -125, (char) var2)) {
            discarded$10 = this.field_Qb.append((char) var2);
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 != -101) {
              return false;
            }
            return true;
          }
          if (!mu.a(28799, (char) var2)) {
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 != -101) {
              return false;
            }
            return true;
          }
          discarded$11 = this.field_Qb.append((char) var2);
          if (84 == rs.field_q) {
            if (this.field_Qb.length() <= 0) {
              this.field_Kb = 1;
            } else {
              this.text = this.field_Qb.toString();
              this.field_Kb = 2;
            }
          }
          if (rs.field_q == 13) {
            this.field_Kb = 1;
          }
          if (param0 != -101) {
            return false;
          }
          return true;
        }
        if (this.field_Qb.length() <= 0) {
          if (this.field_Qb.length() >= 12) {
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 == -101) {
              return true;
            }
            return false;
          }
          var2Lifetime1 = Character.toLowerCase(DualNodeDeque.field_i);
          if (var2Lifetime1 == 32) {
            var2Lifetime1 = 95;
            if (var2Lifetime1 == 95 &&
              this.field_Qb.length() > 0) {
              discarded$4 = this.field_Qb.append((char) var2Lifetime1);
            }
          } else {
            if (var2Lifetime1 == 95 &&
              this.field_Qb.length() > 0) {
              discarded$5 = this.field_Qb.append((char) var2Lifetime1);
            }
          }
          if (MeshObject.a((byte) -125, (char) var2Lifetime1)) {
            discarded$6 = this.field_Qb.append((char) var2Lifetime1);
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 != -101) {
              return false;
            }
            return true;
          }
          if (!mu.a(28799, (char) var2Lifetime1)) {
            if (84 == rs.field_q) {
              if (this.field_Qb.length() <= 0) {
                this.field_Kb = 1;
              } else {
                this.text = this.field_Qb.toString();
                this.field_Kb = 2;
              }
            }
            if (rs.field_q == 13) {
              this.field_Kb = 1;
            }
            if (param0 != -101) {
              return false;
            }
            return true;
          }
          discarded$7 = this.field_Qb.append((char) var2Lifetime1);
          if (84 == rs.field_q) {
            if (this.field_Qb.length() <= 0) {
              this.field_Kb = 1;
            } else {
              this.text = this.field_Qb.toString();
              this.field_Kb = 2;
            }
          }
          if (rs.field_q == 13) {
            this.field_Kb = 1;
          }
          if (param0 == -101) {
            return true;
          }
          return false;
        }
        PortalLossCondition.a(' ', this.field_Qb.length() - 1, this.field_Qb, true);
        if (this.field_Qb.length() >= 12) {
          if (84 == rs.field_q) {
            if (this.field_Qb.length() <= 0) {
              this.field_Kb = 1;
            } else {
              this.text = this.field_Qb.toString();
              this.field_Kb = 2;
            }
          }
          if (rs.field_q == 13) {
            this.field_Kb = 1;
          }
          if (param0 == -101) {
            return true;
          }
          return false;
        }
        var2Lifetime2 = Character.toLowerCase(DualNodeDeque.field_i);
        if (var2Lifetime2 == 32) {
          var2Lifetime2 = 95;
          if (var2Lifetime2 == 95 &&
            this.field_Qb.length() > 0) {
            discarded$0 = this.field_Qb.append((char) var2Lifetime2);
          }
        } else {
          if (var2Lifetime2 == 95 &&
            this.field_Qb.length() > 0) {
            discarded$1 = this.field_Qb.append((char) var2Lifetime2);
          }
        }
        if (MeshObject.a((byte) -125, (char) var2Lifetime2)) {
          discarded$2 = this.field_Qb.append((char) var2Lifetime2);
          if (84 == rs.field_q) {
            if (this.field_Qb.length() <= 0) {
              this.field_Kb = 1;
            } else {
              this.text = this.field_Qb.toString();
              this.field_Kb = 2;
            }
          }
          if (rs.field_q == 13) {
            this.field_Kb = 1;
          }
          if (param0 == -101) {
            return true;
          }
          return false;
        }
        if (!mu.a(28799, (char) var2Lifetime2)) {
          if (84 == rs.field_q) {
            if (this.field_Qb.length() <= 0) {
              this.field_Kb = 1;
            } else {
              this.text = this.field_Qb.toString();
              this.field_Kb = 2;
            }
          }
          if (rs.field_q == 13) {
            this.field_Kb = 1;
          }
          if (param0 == -101) {
            return true;
          }
          return false;
        }
        discarded$3 = this.field_Qb.append((char) var2Lifetime2);
        if (84 == rs.field_q) {
          if (this.field_Qb.length() <= 0) {
            this.field_Kb = 1;
          } else {
            this.text = this.field_Qb.toString();
            this.field_Kb = 2;
          }
        }
        if (rs.field_q == 13) {
          this.field_Kb = 1;
        }
        if (param0 == -101) {
          return true;
        }
        return false;
    }

    oc(int param0, int param1, int param2, int param3, String param4, ClientUiComponent param5, ClientUiComponent param6, ClientUiComponent param7) {
        super(0L, param5);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        this.field_Kb = 0;
        try {
          this.field_Lb = new ClientUiComponent(0L, param6, param4);
          this.addChild(this.field_Lb, 112);
          this.field_Mb = new ClientUiComponent(0L, param7);
          this.field_Mb.field_N = 16764006;
          this.addChild(this.field_Mb, 74);
          this.field_Mb.field_I = "|";
          this.field_Qb = new StringBuilder(12);
          var9_int = this.field_Lb.getPreferredWidth(122);
          this.field_Lb.setBounds(jn.field_d, -20500, var9_int, 3, 5);
          this.field_Mb.setBounds(jn.field_d, -20500, var9_int, 3 + jn.field_d, 5);
          var10 = var9_int + 5 + 5;
          var11 = 3 + (2 * jn.field_d + 3);
          var12 = jp.a(param0, param2, var10, -1);
          var13 = pd.a(var11, 0, param1, param3);
          this.setBounds(var11, -20500, var10, var13, var12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_5_0 = var9;
          stackIn_5_1 = new StringBuilder().append("oc.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param6 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param7 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    static {
        field_Nb = "<%0> has declined the invitation.";
        field_Jb = "Type your email address again to make sure it's correct";
        field_Ib = "<%0> must play <%1> more rated games before playing with the current options.";
        field_Pb = new String[]{"All scores", "My scores", "Best each"};
        field_Ob = "That name is not available";
    }
}
