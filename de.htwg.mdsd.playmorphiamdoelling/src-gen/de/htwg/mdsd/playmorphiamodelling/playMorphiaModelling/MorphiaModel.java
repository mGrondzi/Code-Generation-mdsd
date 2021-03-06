/**
 * generated by Xtext 2.10.0
 */
package de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Morphia Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.MorphiaModel#getImports <em>Imports</em>}</li>
 *   <li>{@link de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.MorphiaModel#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.PlayMorphiaModellingPackage#getMorphiaModel()
 * @model
 * @generated
 */
public interface MorphiaModel extends Type
{
  /**
   * Returns the value of the '<em><b>Imports</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.Import}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imports</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imports</em>' containment reference list.
   * @see de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.PlayMorphiaModellingPackage#getMorphiaModel_Imports()
   * @model containment="true"
   * @generated
   */
  EList<Import> getImports();

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
   * The list contents are of type {@link de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference list.
   * @see de.htwg.mdsd.playmorphiamodelling.playMorphiaModelling.PlayMorphiaModellingPackage#getMorphiaModel_Attributes()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttributes();

} // MorphiaModel
